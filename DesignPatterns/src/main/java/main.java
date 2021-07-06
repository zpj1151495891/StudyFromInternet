import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.UnsupportedEncodingException;
import java.text.SimpleDateFormat;
import java.util.Date;



public  class main {
	  public static void main(String[] args) throws IOException {
	        /*File file = new File("E://Hell.oWor.ld.java");
	        String fileName = file.getName();
	        String suffix = fileName.substring(fileName.lastIndexOf(".") + 1);
	        String str=fileName.substring(0, fileName.lastIndexOf("."));
	        System.out.println(suffix);
	        System.out.println(str);
	        */
		 /* Date data=new Date();
		  SimpleDateFormat date=new SimpleDateFormat("yyyy-MM-dd");
		  System.out.println(date.format(data));
		  */
		  main main=new main();
		 // System.out.println(System.getProperty("user.dir"));
		  System.out.println("50*36*31*8\n61*38*28*2\n35*31*22*1");
	  }
	  public  String rx() {
		  return this.getClass().getClassLoader().getResource("").toString();
	  }
}
