<%@ page language="java" import="java.util.*" pageEncoding="gbk"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'top.jsp' starting page</title>

  </head>
  
  <body>
  <div align="center">
  <table width="100%" border="0" cellspacing="0" cellpadding="0" >
    <tr>
      <td align="right">
      <h3><br><br>����:<%=session.getAttribute("truename") %>
      |<a href="UserAction?method=returnIndex" target="_parent">������ҳ</a>
      |<a href="OrderAction?method=orderList" target="_parent">����ԤԼ��Ϣ</a>
      |<a href="UserAction?method=exit" target="_parent">�˳���¼</a></h3></td>
    </tr>
  </table>
     <table width="100%"  height="60%" border="0" cellspacing="0" cellpadding="0">
    <tr>
      <td align="center"><img src="picture/321.jpg"></td>
    </tr>
  </table>
  </div>
  </body>
</html>