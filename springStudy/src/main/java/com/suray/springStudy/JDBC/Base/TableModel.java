package com.suray.springStudy.JDBC.Base;

import java.util.List;

public class TableModel {
	private String tableName;
	private String id;
	private List<Column> columnList;
	private String limit;
	
	public TableModel(String tableName) {
		this.tableName=tableName;
		this.id="ID";
	}
	public void setTaleName(String tableName) {
		this.tableName=tableName;
	}
	public String getTableName() {
		return tableName;
	}
	
	public void setId(String id) {
		this.id=id;
	}
	public String getId() {
		return id;
	}
	
	public void setColumnList(List<Column> columnList) {
		this.columnList=columnList;
	}
	public List<Column> getColumnList(){
		return columnList;
	}
	
	public void setLimit(String limit) {
		this.limit=limit;
	}
	public String getLimit() {
		return limit;
	}

}
