<%-- 
    Document   : gráfica
    Created on : 19 jun 2023, 16:19:24
    Author     : gonza
--%>

<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <title>Gráfica de Votos</title>
    <script src="https://cdn.jsdelivr.net/npm/chart.js"></script>
</head>
<body>
    <h1>Gráfica de Votos</h1>
    
    <%
        // Obtener los datos del formulario
        int votosPP = Integer.parseInt(request.getParameter("votosPP"));
        int votosPACMA = Integer.parseInt(request.getParameter("votosPACMA"));
        int votosPSOE = Integer.parseInt(request.getParameter("votosPSOE"));
        int votosCiudadanos = Integer.parseInt(request.getParameter("votosCiudadanos"));
        int votosVOX = Integer.parseInt(request.getParameter("votosVOX"));
        int votosPodemos = Integer.parseInt(request.getParameter("votosPodemos"));
        
        // Configurar los datos y opciones de la gráfica
        String[] partidos = {"PP", "PACMA", "PSOE", "Ciudadanos", "VOX", "Podemos"};
        int[] votos = {votosPP, votosPACMA, votosPSOE, votosCiudadanos, votosVOX, votosPodemos};
        String[] colores = {"#FF6384", "#36A2EB", "#FFCE56", "#4BC0C0", "#9966FF", "#FF9F40"};
        
        // Generar la configuración de la gráfica
        StringBuilder data = new StringBuilder();
        StringBuilder colors = new StringBuilder();
        for (int i = 0; i < partidos.length; i++) {
            data.append(votos[i]).append(",");
            colors.append("'").append(colores[i]).append("',");
        }
        data.deleteCharAt(data.length() - 1);
        colors.deleteCharAt(colors.length() - 1);
        
        // Generar la gráfica circular
        %>
        <canvas id="myChart"></canvas>
        <script>
            var ctx = document.getElementById('myChart').getContext('2d');
            var myChart = new Chart(ctx, {
                type: 'pie',
                data: {
                    labels: <%= Arrays.toString(partidos) %>,
                    datasets: [{
                        data: [<%= data %>],
                        backgroundColor: [<%= colors %>]
                    }]
                }
            });
        </script>
    <%
    %>
</body>
</html>
