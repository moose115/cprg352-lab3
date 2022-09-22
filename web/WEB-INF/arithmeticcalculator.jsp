<%-- 
    Document   : arithmeticcalculator
    Created on : 2022-09-22, 14:13:44
    Author     : musta
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Arithmetic Calculator</title>
    </head>
    <body>
        <h1>Arithmetic Calculator</h1>
        <form action="arithmetic" method="POST">
            <div>
                <label>First: </label>
                <input type="text" name="first" value="${first}" />
            </div>
            <div>
                <label>Second: </label>
                <input type="text" name="second" value="${second}" />
            </div>
            <div>
                <input type="submit" name="operation" value="+" />
                <input type="submit" name="operation" value="-" />
                <input type="submit" name="operation" value="*" />
                <input type="submit" name="operation" value="%" />
            </div>
            <div>${result}</div>
            <div>
                <a href="/age">Age Calculator</a>
            </div>
        </form>
    </body>
</html>
