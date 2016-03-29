
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="model.Teams"%>
<% Teams team = (Teams) request.getAttribute("team");%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Update A New Team</title>
        <link rel="stylesheet" href="style.css" type="text/css"/>
    </head>
    
    
    <body>
        <h1>Update A Team Record</h1>  
        
        <div class="entireSalaryForm">
        <form name="updateForm" action="updateTeam" method="get">
            
            <br><br>
            <label>Team ID:</label>
            <input type="text" name="trackID" value="<%= team.getTrackID()%>" readonly/>
            <br><br>
            
            
            <label>Team Name:</label>
            <input type ="text" name="teamName" value="<%= team.getTeamName()%>" />
            <br><br>
            
            <label>Team State:</label>
            <input type="text" name="teamState" value="<%= team.getTrackID()%>" />
            <br><br>
          

            <label>Championships Won:</label>
            <input type="text" name="champions" value="<%= team.getChampions()%>" />
            <br><br>

            <label>League:</label>
            <input type="text" name="league" value="<%= team.getLeague()%>" />
            <br><br>
       
            
            
            <input  type="submit" name="submit" Value="Update"/>
            
        </form>
        </div>
     
    </body>
</html>
