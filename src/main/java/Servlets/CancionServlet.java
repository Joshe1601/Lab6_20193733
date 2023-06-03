package Servlets;

import Beans.Reproduccion;
import Daos.CancionDao;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;

@WebServlet(name = "CancionServlet",urlPatterns = {"/listaCanciones"})
public class CancionServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action") == null ? "listaCanciones" : request.getParameter("action");
        CancionDao cancionDao = new CancionDao();
        RequestDispatcher view;

        switch (action){
            case "listaCanciones":
                ArrayList<Reproduccion> listaCanciones = cancionDao.obtenerListaCanciones();
                request.setAttribute("listaCanciones",listaCanciones);

                view =request.getRequestDispatcher("listaCanciones.jsp");
                view.forward(request,response);
                break;

            case "total":
                ArrayList<Reproduccion> listaCancionesCompletas = cancionDao.obtenerListaCancionesCompletas();
                request.setAttribute("listaCanciones",listaCancionesCompletas);

                view =request.getRequestDispatcher("listaCanciones.jsp");
                view.forward(request,response);
                break;

        }

    }
}
