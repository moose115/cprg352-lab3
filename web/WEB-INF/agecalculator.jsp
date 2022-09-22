<%-- 
    Document   : agecalculator
    Created on : 2022-09-22, 13:56:11
    Author     : musta
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Age Calculator</title>
    </head>
    <body>
        <h1>Age Calculator</h1>
        <form action="age" method="POST">
            <div>
                <label>Enter your age: </label>
                <input type="text" name="age" value="0" min="0" />
            </div>
            <div>
                <button type="submit">Age next birthday</button>
            </div>
            <p>${msg}</p>
            <div>
                <a href="arithmetic">Arithmetic Calculator</a>
            </div>
        </form>
    </body>
</html>
