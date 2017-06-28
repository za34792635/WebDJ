<%@page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>加法计算器</title>
</head>
<body>
<s:property value="result"/>
<s:form action="calc">
<s:textfield lable="操作数1" name="operand1"/>
<s:textfield lable="操作数2" name="operand2"/>
<s:submit value="计算"></s:submit>
</s:form>
</body>
</html>