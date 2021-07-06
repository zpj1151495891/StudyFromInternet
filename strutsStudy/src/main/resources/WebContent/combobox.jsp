<%@ page language="java" contentType="text/html; charset=GBK"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
</head>

<body>
<h1>Struts 2 combobox example</h1>

<s:form action="resultAction" namespace="/">

<h2>
	<s:combobox label="What's your favor fruit" 
		headerKey="-1" 
		list="fruits" 
		name="yourFruits" />
</h2>

<h2>
	<s:combobox label="Select a month" 
		headerKey="-1" 
		list="{'1':'Jan', '2':'Feb', '3':'Mar', '4':'Apr'}"
		name="yourMonth" />
</h2> 

<s:submit value="submit" name="submit" />
	
</s:form>

</body>
</html>
