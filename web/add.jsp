<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Add A New Team</title>
        <link rel="stylesheet" href="style.css" type="text/css"/>
    </head>
    <body>
        <h1>Add A New Team</h1>  
        
        <div class="entireSalaryForm">
        <form name="addForm" action="addTeam" method="get">
            <br>
            <br>
            
            <label>Team Name:</label>
            <input type ="text" name="teamName" value="" />
            <br>
            <br>
            <label>Team State:</label>
            <input type="text" name="teamState" value="" />
            <br>
            <br>

            <label>Championships Won:</label>
            <input type="text" name="champions" value="" />
            <br>
            <br>

            <label>League:</label>
            <input type="text" name="league" value="" />
            <br>
            <br>
            <br>
            <input  type="submit" name="submit" Value="Submit"/>
            
        </form>
        
        </div>
        
        
        
        
        
        
    </body>
</html>
