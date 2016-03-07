<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Add A New Team</title>
    </head>
    <body>
        <h1>Add A New Team</h1>
        
        <form name="addForm" action="addTeam" method="get">
            
            <label>Team Name:</label>
            <input type ="text" name="teamName" value="" />
            <br>
            
            <label>Team State:</label>
            <input type="text" name="teamState" value="" />
            <br>
            
            <label>Championships Won:</label>
            <input type="text" name="champions" value="" />
            <br>
            
            <label>League:</label>
            <input type="text" name="league" value="" />
            <br>
            
            <input  type="submit" name="submit" Value="Submit"/>
            
        </form>
        
        
        
        
        
        
        
        
    </body>
</html>
