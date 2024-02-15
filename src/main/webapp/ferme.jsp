<%-- 
    Document   : ferme
    Created on : Aug 15, 2023, 12:45:57 PM
    Author     : isi
--%>
<%@page import="ferme.*"%>
<%@page import="java.util.ArrayList"%>

<%
  ArrayList<Ferme> fermes=(ArrayList<Ferme>)request.getAttribute("fermes");  
%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Liste des Fermes</title>
        <link rel="stylesheet" href="css/newcss.css">
    </head>
    <body>
        <h1>Filtre Ferme</h1>
        <div id="filterPays">
            <form action="" method="Post" >
                <h2>Filtre par pays</h2>
                <select name="pays">
                    <%
                        for (Ferme ferme : fermes) {
                    %>
                    <option value="<%= ferme.getPays() %>"><%= ferme.getPays() %></option>
                    <%}%>
                </select>
                <input type="submit" value="Afficher">
            </form>
        </div>
        
        <div id="filterFermier">
            <form action="" method="Post" >
                    <h2>Filtre par fermier</h2>
                <select name="fermier">
                    <%
                        for (Ferme ferme : fermes) {
                    %>
                    <option value="<%= ferme.getName() %>"><%= ferme.getName() %></option>
                    <%}%>
                </select>
                <input type="submit" value="Afficher">
            </form>
        </div>

        <h1>Liste des Fermes</h1>
        <table border="1">
            <tr>
                <th>Nom Ferme</th>
                <th>Pays</th>
                <th>Nom Fermier</th>
                <th>Animaux</th>
            </tr>
        <%
            for (Ferme ferme : fermes) {
        %>
            <tr>
                <td><%= ferme.getNom_ferme() %></td>
                <td><%= ferme.getPays() %></td>
                <td><%= ferme.getName() %></td>
                <td><a href="AnimalControler?id=<%= ferme.getId_ferme()%>">Afficher animaux </a></td>
            </tr>
        <%
            }
        %>
        </table>

    </body>
</html>
