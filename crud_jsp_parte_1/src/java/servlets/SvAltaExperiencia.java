
package servlets;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import logica.ControladoraLogica;
import logica.Experiencia;


@WebServlet(name = "SvAltaExperiencia", urlPatterns = {"/SvAltaExperiencia"})
public class SvAltaExperiencia extends HttpServlet {

    ControladoraLogica controlLogica = new ControladoraLogica();
            
            
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
      
    }

   
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
        
        String empresa = request.getParameter("empresa");
        String puesto = request.getParameter("puesto");
        String anio_ingreso = request.getParameter("anio_ingreso");
        String anio_egreso = request.getParameter("anio_egreso");
        
        Experiencia exp = new Experiencia(0,empresa, puesto, anio_ingreso, anio_egreso);
        controlLogica.crearExperiencia(exp);
    
    }

    
    @Override
    public String getServletInfo() {
        return "Short description";
    }

}
