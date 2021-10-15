/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;
import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import modelo.PersonaDAO;
import modelo.PersonaDTO;

/**
 *
 * @author USER
 */

// Esto es un servlet
@WebServlet(name = "PersonaControlador", urlPatterns = {"/PersonaControlador"})
public class PersonaControlador extends HttpServlet {
    
    
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
            
        PersonaDAO personaDAO = new PersonaDAO();
        String accion;
        RequestDispatcher dispatcher = null;
        
        accion = request.getParameter("accion");
        
        if(accion == null || accion.isEmpty()){
            dispatcher = request.getRequestDispatcher("Persona/index.jsp");
            List <PersonaDTO> listaPersona = personaDAO.listarPersonas();
            request.setAttribute("lista", listaPersona);
        }else if("nuevo".equals(accion)){
            dispatcher = request.getRequestDispatcher("Persona/nuevo.jsp");
        }
        else if("insertar".equals(accion)){
            
            String nombre = request.getParameter("nombre");
            String apellido = request.getParameter("apellido");
            int edad = Integer.parseInt(request.getParameter("edad"));
            
            PersonaDTO persona = new PersonaDTO(0, nombre, apellido, edad);
            
            personaDAO.insertar(persona);
            dispatcher = request.getRequestDispatcher("Persona/index.jsp");
            List <PersonaDTO> listaPersona = personaDAO.listarPersonas();
            request.setAttribute("lista", listaPersona);
        }else if("modificar".equals(accion)){
            dispatcher = request.getRequestDispatcher("Persona/modificar.jsp");
            int id = Integer.parseInt(request.getParameter("id"));
            
            PersonaDTO persona = personaDAO.mostrarPersonas(id);
            request.setAttribute("persona", persona);
        }
        else if("actualizar".equals(accion)){
            
            int id = Integer.parseInt(request.getParameter("id"));
            String nombre = request.getParameter("nombre");
            String apellido = request.getParameter("apellido");
            int edad = Integer.parseInt(request.getParameter("edad"));
            
            PersonaDTO persona = new PersonaDTO(id, nombre, apellido, edad);
            
            personaDAO.actualizar(persona);
            dispatcher = request.getRequestDispatcher("Persona/index.jsp");
            List <PersonaDTO> listaPersona = personaDAO.listarPersonas();
            request.setAttribute("lista", listaPersona);
        }
        else if("eliminar".equals(accion)){
            
            int id = Integer.parseInt(request.getParameter("id"));
            
            personaDAO.eliminar(id);
            dispatcher = request.getRequestDispatcher("Persona/index.jsp");
            List <PersonaDTO> listaPersona = personaDAO.listarPersonas();
            request.setAttribute("lista", listaPersona);
        } else{
            dispatcher = request.getRequestDispatcher("Persona/index.jsp");
            List <PersonaDTO> listaPersona = personaDAO.listarPersonas();
            request.setAttribute("lista", listaPersona);
        }
        
        dispatcher.forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
            doGet(request,response);
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
