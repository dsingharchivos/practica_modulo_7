<%@page import="logica.Experiencia"%>
<%@page import="java.util.List"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Listado Experiencia Laboral</title>
    </head>
    <body>
        <h1>Listado Experiencia Laboral</h1>
        
        <%
           List<Experiencia> listadoExperiencia = (List) request.getSession().getAttribute("listado");
           
           for(Experiencia exp: listadoExperiencia)
           {
                      
        %>
         <p>Empresa: <%=exp.getEmpresa()%></p>
         <p>Puesto: <%=exp.getPuesto() %></p>
         <p>Año Ingreso <%=exp.getAnio_ingreso() %></p>
         <p>Año Egreso: <%=exp.getAnio_egreso() %></p>
          
         <hr>
         
        <%
            }
        %>
        
    </body>
</html>