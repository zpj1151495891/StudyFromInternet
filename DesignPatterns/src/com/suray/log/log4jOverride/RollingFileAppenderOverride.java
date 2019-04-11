package com.suray.log.log4jOverride;

import java.io.File;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.io.Writer;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.log4j.FileAppender;
import org.apache.log4j.Layout;
import org.apache.log4j.RollingFileAppender;
import org.apache.log4j.helpers.CountingQuietWriter;
import org.apache.log4j.helpers.LogLog;
import org.apache.log4j.helpers.OptionConverter;
import org.apache.log4j.spi.LoggingEvent;

public class RollingFileAppenderOverride extends RollingFileAppender{
	 public RollingFileAppenderOverride()
	    {
	        maxFileSize = 10485760L;
	        maxBackupIndex = 1;
	        nextRollover = 0L;
	    }

	    public RollingFileAppenderOverride(Layout layout, String filename, boolean append)
	        throws IOException
	    {
	        super(layout, filename, append);
	        maxFileSize = 10485760L;
	        maxBackupIndex = 1;
	        nextRollover = 0L;
	    }

	    public RollingFileAppenderOverride(Layout layout, String filename)
	        throws IOException
	    {
	        super(layout, filename);
	        maxFileSize = 10485760L;
	        maxBackupIndex = 1;
	        nextRollover = 0L;
	    }

	    public int getMaxBackupIndex()
	    {
	        return maxBackupIndex;
	    }

	    public long getMaximumFileSize()
	    {
	        return maxFileSize;
	    }

	    public void rollOver()
	    {
	        if(qw != null)
	        {
	            long size = ((CountingQuietWriter)qw).getCount();
	            LogLog.debug("rolling over count=" + size);
	            nextRollover = size + maxFileSize;
	        }
	        LogLog.debug("maxBackupIndex=" + maxBackupIndex);
	        boolean renameSucceeded = true;
	        if(maxBackupIndex > 0)
	        {	
	        	String suffix = fileName.substring(fileName.lastIndexOf(".") + 1);
	            File file = new File(fileName.substring(0, fileName.lastIndexOf(".")) + '-' + maxBackupIndex+"."+suffix);
	            if(file.exists())
	                renameSucceeded = file.delete();
	            for(int i = maxBackupIndex - 1; i >= 1 && renameSucceeded; i--)
	            {
	                file = new File(fileName.substring(0, fileName.lastIndexOf(".")) + "-" + i+"."+suffix);
	                if(file.exists())
	                {
	                    File target = new File(fileName.substring(0, fileName.lastIndexOf(".")) + '-' + (i + 1)+"."+suffix);
	                    LogLog.debug("Renaming file " + file + " to " + target);
	                    renameSucceeded = file.renameTo(target);
	                }
	            }

	            if(renameSucceeded)
	            {
	                File target = new File(fileName.substring(0, fileName.lastIndexOf(".")) + "-" + 1+"."+suffix);
	                closeFile();
	                file = new File(fileName);
	                LogLog.debug("Renaming file " + file + " to " + target);
	                renameSucceeded = file.renameTo(target);
	                if(!renameSucceeded)
	                    try
	                    {
	                        setFile(fileName, true, bufferedIO, bufferSize);
	                    }
	                    catch(IOException e)
	                    {
	                        if(e instanceof InterruptedIOException)
	                            Thread.currentThread().interrupt();
	                        LogLog.error("setFile(" + fileName + ", true) call failed.", e);
	                    }
	            }
	        }
	        if(renameSucceeded)
	            try
	            {
	                setFile(fileName, false, bufferedIO, bufferSize);
	                nextRollover = 0L;
	            }
	            catch(IOException e)
	            {
	                if(e instanceof InterruptedIOException)
	                    Thread.currentThread().interrupt();
	                LogLog.error("setFile(" + fileName + ", false) call failed.", e);
	            }
	    }
	    @Override
	    public void setFile(String file) {
	    	fileName=file.trim();
	    	String preStr=fileName.substring(0,fileName.lastIndexOf("."));
	    	String suffix=fileName.substring(fileName.lastIndexOf(".")+1);
	    	fileName=preStr+"-"+new SimpleDateFormat("yyyy-MM-dd").format(new Date())+"."+suffix;
	    }

	    public synchronized void setFile(String fileName, boolean append, boolean bufferedIO, int bufferSize)
	        throws IOException
	    {
	        super.setFile(fileName, append, this.bufferedIO, this.bufferSize);
	        if(append)
	        {
	            File f = new File(fileName);
	            ((CountingQuietWriter)qw).setCount(f.length());
	        }
	    }

	    public void setMaxBackupIndex(int maxBackups)
	    {
	        maxBackupIndex = maxBackups;
	    }

	    public void setMaximumFileSize(long maxFileSize)
	    {
	        this.maxFileSize = maxFileSize;
	    }

	    public void setMaxFileSize(String value)
	    {
	        maxFileSize = OptionConverter.toFileSize(value, maxFileSize + 1L);
	    }

	    protected void setQWForFiles(Writer writer)
	    {
	        qw = new CountingQuietWriter(writer, errorHandler);
	    }

	    protected void subAppend(LoggingEvent event)
	    {
	        super.subAppend(event);
	        if(fileName != null && qw != null)
	        {
	            long size = ((CountingQuietWriter)qw).getCount();
	            if(size >= maxFileSize && size >= nextRollover)
	                rollOver();
	        }
	    }

	    protected long maxFileSize;
	    protected int maxBackupIndex;
	    private long nextRollover;
}
