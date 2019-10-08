<%-- 
    Document   : index
    Created on : Oct 3, 2019, 10:28:06 PM
    Author     : Admin
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
    <center>
        <table>
            <tr>
                <td>Login</td>
                <td>Registration</td>
            </tr>
            <tr>
                <td>
                    <table bgcolor="yellow">
                        <form method="post" action="<%=request.getContextPath()%>/Login">
                        <tr>
                            <td>User Name </td>
                            <td><input type="text" name="un"></td>
                        </tr>
                         <tr>
                            <td>Password </td>
                            <td><input type="text" name="pw"></td>
                        </tr>
                         <tr>
                            <td></td>
                            <td><input type="submit" value="login"></td>
                        </tr>
                         </form>
                    </table>
                </td>
                <td>
                     <table bgcolor="red">
                        <form method="post" action="<%=request.getContextPath()%>/Register">
                        <tr>
                            <td>User Name </td>
                            <td><input type="text" name="un"></td>
                        </tr>
                         <tr>
                            <td>Password </td>
                            <td><input type="text" name="pw"></td>
                        </tr>
                         <tr>
                            <td></td>
                            <td><input type="submit" value="Register"></td>
                        </tr>
                         </form>
                    </table>
                </td>
            </tr>
        </table>
    </center>      
    </body>
</html>
