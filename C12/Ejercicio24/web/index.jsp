<%-- 
    Document   : Start
    Created on : 19 jun 2023, 15:59:48
    Author     : gonza
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Resultados electorales </title>
    </head>
    <body>
        <h1>Introduzca el número de votos de los partidos políticos.</h1>
         <form action="resultados.jsp" method="post">
        <label for="pp">PP</label>
        <input type="number" id="pp" name="pp" min="0" required><br>
        
        <label for="pacma">PACMA:</label>
        <input type="number" id="pacma" name="pacma" min="0" required><br>
        
        <label for="psoe">PSOE</label>
        <input type="number" id="psoe" name="psoe" min="0" required><br>
        
        <label for="ciudadanos">Ciudadanos</label>
        <input type="number" id="ciudadanos" name="ciudadanos" min="0" required><br>
        
        <label for="vox">VOX:</label>
        <input type="number" id="vox" name="vox" min="0" required><br>
        
        <label for="podemos">Podemos</label>
        <input type="number" id="podemos" name="podemos" min="0" required><br>
        
        <input type="submit" value="Enviar">
    </form>
    </body>
</html>
