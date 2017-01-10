


<%@ page language="java" contentType="Text/html;charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="com.mysql.jdbc.Driver" %>
<%@ page import="java.io.*,java.util.*,java.sql.*"%>


<!DOCTYPE html>
<html>
  <head>
    <meta charset="utf-8">
    <title></title>
  </head>
  <body>
    <%
           String driverName ="com.mysql.jdbc.Driver";
           String URL = "jdbc:mysql://localhost:3306/boss";
           String User = "root";
           String PASSWORD ="123445";

          String msg="";

             try{
                Class.forName("com.mysql.jdbc.Driver").newInstance();
                String strname = request.getParameter("name");
                String strPassword = request.getParameter("passwd");

                  Connection conn = DriverManager.getConnection(URL, User,PASSWORD);
                  // Connection conn = getConn();


                    String sql= "select * from b_user where name=? and password=?";

                  	PreparedStatement stm = conn.prepareStatement(sql);


                  stm.setString(1, strname);
                  stm.setString(2,  strPassword);
                  ResultSet rs= stm.executeQuery();
                  out.println("");
                  if(rs.next()){
                    //  msg="欢迎登陆";

                         msg="欢迎登陆";
                      // response.sendRedirect("test3.jsp");
                      //  out.println("welcome");

                     	}else{
                          response.sendRedirect("test3.jsp");

                      }


              rs.close();
              stm.close();
              conn.close();
            } catch (ClassNotFoundException e) {
          e.printStackTrace();
          out.println("ClassNotFoundException");
        } catch (SQLException e) {
          e.printStackTrace();
          out.println("SQLException");
        }


    %>
    <div class="">
      <%=msg%>
</div>
  </body>
</html>
