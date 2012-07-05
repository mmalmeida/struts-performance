<%@ taglib uri="/struts-tags" prefix="s"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
</head>

<body>
<!-- start header -->
<div id="header">
		<tiles:insertAttribute name="topMenu"></tiles:insertAttribute>
</div>
	<div id="logo">
	<h1><a href="#">TEST</a></h1>
	</div>
<!-- end header -->
<hr />
<!-- start page -->
<div id="page">
	<!-- start content -->

	<div id="<tiles:insertAttribute  name="content"/>">
		<tiles:insertAttribute name="body"></tiles:insertAttribute>
	</div>
	<!-- end content -->
	<!-- start sidebar two -->
	<div id="sidebar2" class="sidebar">
		<tiles:insertAttribute  name="sidebar2"></tiles:insertAttribute>
		
	</div>
	<!-- end sidebar two -->
	<div style="clear: both;">&nbsp;</div>
</div>
<!-- end page -->
<hr />
<!-- start footer -->
<div id="footer">
FOOTER	
	
</div>
<!-- end footer -->
</body>
</html>


