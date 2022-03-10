
package servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import logica.ControladoraLogica;
import persistencia.exceptions.NonexistentEntityException;


@WebServlet(name = "SvBajaExperiencia", urlPatterns = {"/SvBajaExperiencia"})
public class SvBajaExperiencia extends HttpServlet {

    ControladoraLogica control = new ControladoraLogica();
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
        
        int id = Integer.parseInt(request.getParameter("id"));
        try {
            control.bajaExperiencia(id);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(SvBajaExperiencia.class.getName()).log(Level.SEVERE, null, ex);
        }
               
    }

    
    @Override
    public String getServletInfo() {
        return "Short description";
    }

}
