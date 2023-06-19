<%-- 
    Document   : cuenta
    Created on : 19 jun 2023, 16:34:08
    Author     : gonza
--%>

<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Menú</title>
    </head>
    <body>
 
          <%
        
        int quinoa = Integer.parseInt(request.getParameter("quinoa"));
        int pizza = Integer.parseInt(request.getParameter("pizza"));
        int pasta = Integer.parseInt(request.getParameter("pasta"));
        int hamburguesa = Integer.parseInt(request.getParameter("hamburguesa"));
        int agua = Integer.parseInt(request.getParameter("agua"));
        int cerveza = Integer.parseInt(request.getParameter("cerveza"));
        int refresco = Integer.parseInt(request.getParameter("refresco"));
        
        
        int precioQuinoa = 6,95;
        int precioPizza = 5,50;
        int precioPasta = 4,90;
        int precioHamburguesa = 6,20;
        int precioAgua = 1;
        int precioCerveza = 4;
        int precioRefresco = 3;
        
        // Calcular el costo total
        int costoTotal = (quinoa * precioQuinoa) + (pizza * precioPizza) + (pasta * precioPasta) +
                         (hamburguesa * precioHamburguesa) + (agua * precioAgua) +
                         (cerveza * precioCerveza) + (refresco * precioRefresco);
        
        // Mostrar el desglose del costo y el total
    %>
    <table>
        <tr>
            <th>Elemento del Menú</th>
            <th>Precio Unitario</th>
            <th>Cantidad</th>
            <th>Subtotal</th>
        </tr>
        <tr>
            <td>Quinoa con Verdura</td>
            <td><%= precioQuinoa %></td>
            <td><%= quinoa %></td>
            <td><%= quinoa * precioQuinoa %></td>
        </tr>
        <tr>
            <td>Pizza Caprese</td>
            <td><%= precioPizza %></td>
            <td><%= pizza %></td>
            <td><%= pizza * precioPizza %></td>
        </tr>
        <tr>
            <td>Pasta al Pesto</td>
            <td><%= precioPasta %></td>
            <td><%= pasta %></td>
            <td><%= pasta * precioPasta %></td>
        </tr>
        <tr>
            <td>Hamburguesa Vegetariana</td>
            <td><%= precioHamburguesa %></td>
            <td><%= hamburguesa %></td>
            <td><%= hamburguesa * precioHamburguesa %></td>
        </tr>
        <tr>
            <td>Agua</td>
            <td><%= precioAgua %></td>
            <td><%= agua %></td>
            <td><%= agua * precioAgua %></td>
        </tr>
        <tr>
            <td>Cerveza</td>
            <td><%= precioCerveza %></td>
            <td><%= cerveza %></td>
            <td><%= cerveza * precioCerveza %></td>
        </tr>
        <tr>
            <td>Refresco</td>
            <td><%= precioRefresco %></td>
            <td><%= refresco %></td>
            <td><%= refresco * precioRefresco %></td>
        </tr>
        <tr>
            <td colspan="3">Total:</td>
            <td><%= costoTotal %></td>
        </tr>
    </table>
    </body>
</html>
