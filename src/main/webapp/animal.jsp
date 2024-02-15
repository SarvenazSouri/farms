<%-- 
    Document   : animal
    Created on : Aug 15, 2023, 12:46:36 PM
    Author     : isi
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.util.ArrayList"%>
<%@page import="ferme.*"%>

 

<%
    ArrayList<Animal> animals = (ArrayList<Animal>) request.getAttribute("animals");
%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Liste des Animaux de la Ferme </title>
    </head>
    <body>
        <h1>Liste des Animaux</h1>
        
        <table border="1">
            <tr>
                <th> Animal Id</th>
                <th> Animal Nom</th>
                <th> Animal Prix</th>
                <th> Animal Espece</th>
            </tr>
            <% 
                for(Animal animal : animals){
            %>
            <tr>
                <td> <%= animal.getAnimal_id()%></td>
                <td> <%= animal.getNom() %></td>
                <td> <%= animal.getPrix() %></td>
                <td> <%= animal.getType() %></td>
            </tr>
            <% 
                }
            %>
        </table>
        <a href="FermeControler">Afficher les fermes</a>
    </body>
</html>
