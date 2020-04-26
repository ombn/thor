<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>IPL Team Registration</h1>
<form action="iplRegister.odc" method="post">
<pre>
Team Name       <input type="text" name="teamName"/>
Franchise Owner <input type="text" name="owner"/>
Team Captain   <input type="text" name="teamCaptain"/>
Place         <select name="place">
<option>BLR</option>
<option>HYD</option>
<option>DLH</option>
</select>
New entry <input type="radio" name="entry" value="new"/>NEW <input type="radio" name="entry" value="old"/> OLD
<input type="submit" value="Register"/>
</pre>
</form>
</body>
</html>