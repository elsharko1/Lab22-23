<%--
  Created by IntelliJ IDEA.
  User: Mark
  Date: 7/31/2017
  Time: 6:05 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Output Page</title>
    <style>
        body {
            background-image: url("https://media.giphy.com/media/vP4ci3sz5YZHi/giphy.gif");
            background-repeat: no-repeat;
            background-size: 100%;
        }
        h1{
            color:white;
            text-align: center;
        }
        div{
            color:white;
            text-align: center;
        }
    </style>
</head>
<body>
<h1>Hello: ${userFirstName} ${userLastName}</h1>
<br>
<div>
    <p>Your email Address is: ${userEmailAddress}</p>
    <br>
    <p>Your phone number is: ${userPhoneNumber}</p>
    <br>
    <p>Your new password is: ${userPassword}</p>
</div>
<br>
<br>
<br>
<h1>I AM GOING TO STEAL YOUR PASSWORD!</h1>
</body>
</html>