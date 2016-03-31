 
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Pro Teams</title>
        <link rel="stylesheet" href="style.css" type="text/css"/>
    </head>
    <body>

        <div class = "wrap">

            <%@ include file="includes/header.jsp" %>

            <%@ include file="includes/menu.jsp" %>


            <div class = "main">
                <h1>Teams Database</h1>

                <a href="read">View All Teams</a>
                <br><br>
                <a href="search.jsp">Search Teams</a>

            </div> <!--close main -->

            <%@ include file="includes/footer.jsp" %>            


        </div> <!--close the wrap div -->
    </body>


</html>
