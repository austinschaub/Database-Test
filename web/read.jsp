<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Sports Teams Page</title>
        <link rel="stylesheet" href="style.css" type="text/css"/>
    </head>
         
    
    
    <% String table = (String) request.getAttribute("table"); %>
    
    <body>
        <h1>Sport Teams</h1>
        <br><br>
        
    <table id = "tableResults">
        <tr>
            <th width = 7%>Team ID</th> 
            <th width = 28%>Team Name</th>
            <th width = 27%>State Location</th>
            <th width = 5%>Championships won</th>
            <th width = 14%>League</th>
            <th>Modify Record</th>
        </tr>

        <tr> <%= table %> </tr>
    </table>
        
        <br><br>
        
        <a href ="add"> Add A New Friend</a>
        
    </body>
</html>