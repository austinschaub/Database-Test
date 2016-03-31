<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Sports Teams Page</title>
        <link rel="stylesheet" href="style.css" type="text/css"/>
    </head>

    <% String table = (String) request.getAttribute("table");%>

    <body>

        <div class = "wrap">

            <%@ include file="includes/header.jsp" %>

            <%@ include file="includes/menu.jsp" %>


            <div class = "main">

                <h1>Sport Teams</h1>
                <br><br>



                <%= table%>


                <br><br>

                <a href ="add"> Add A New Team</a>
                <br><br>
                <a href="search.jsp">Search Teams</a>

            </div> <!--close main -->
            <%@ include file="includes/footer.jsp" %>            
        </div> <!--close the wrap div -->


    </body>
</html>