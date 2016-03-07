<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Sports Teams Page</title>
    </head>
    
    <% String table = (String) request.getAttribute("table"); %>
    
    <body>
        <h1>Sport Teams</h1>
        <%= table %>
        
        <br><br>
        
        <a href ="add"> Add A New Friend</a>
        
    </body>
</html>