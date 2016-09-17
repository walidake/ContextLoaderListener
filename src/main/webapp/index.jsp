<%@ page language="java" import="java.util.*" pageEncoding="UTF-8" isELIgnored="false"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<body>
<c:forEach items="${list}" var="item">
	<p>${item.name}</p>
</c:forEach>
</body>
</html>
