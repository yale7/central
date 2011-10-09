<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h3>Hello World!</h4>

        <form action="rest/restentity/create" method="get">
            <input name="param1" />
            <button type="submit" >Send GET</button>
        </form>
        <form action="rest/restentity/create" method="post">
            <input name="param1" />
            <button type="submit" >Send POST</button>
        </form>
    </body>
</html>