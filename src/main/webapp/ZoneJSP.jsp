<%@ page import="java.util.List" %>
<%@ page import="com.atrachel.model.Zone" %><%--
  Created by IntelliJ IDEA.
  User: hd48552
  Date: 2018/5/8
  Time: 17:14
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

    <table border="1" cellpadding="10" cellspacing="0">
        <tr>
            <th>id</th>
            <th>zonename</th>
            <th>zonearea</th>
        </tr>

<%
    List<Zone> allzone = (List<Zone>) request.getAttribute("allZone");
    for(Zone zone:allzone){
%>

    <tr>
        <td><%=zone.getId()%>  </td>
        <td><%=zone.getZoneName()%></td>
        <td><%=zone.getZoneArea()%></td>
        <td><a href="/deletebyid?id=<%=zone.getId()%>" >DELETE</a> </td>
    </tr>


 <%
    }
%>
    </table>
</body>
</html>
