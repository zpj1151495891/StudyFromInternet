package com.suray.springStudy.JDBC.Base;

public class Column {
	
	private String columnName;
	private String dataType;
	private String isNull;
	private String limit;
	
	public Column(String columnName,String dataType) {
		this.columnName=columnName;
		this.dataType=dataType;
		this.isNull="";
		this.limit="";
	}
	
	public void setColumnName(String columnName) {
		this.columnName=columnName;
	}
	public String getColumnName() {
		return columnName;
	}
	
	public void setDataType(String dataType) {
		this.dataType=dataType;
	}
	public String getDataType() {
		return dataType;
	}
	
	public void setIsNull(String isNull) {
		this.isNull=isNull;
	}
	public String getIsNull() {
		return isNull;
	}
	
	public void setLimit(String limit) {
		this.limit=limit;
	}
	public String getaLimit() {
		return limit;
	}
	
}
