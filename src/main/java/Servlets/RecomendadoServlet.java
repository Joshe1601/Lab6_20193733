package Servlets;

import Beans.Reproduccion;
import Daos.CancionDao;
import Daos.RecomendadoDao;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;

@WebServlet(name = "RecomendadoServlet",urlPatterns = {"/listaRecomendados"})
public class RecomendadoServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        RecomendadoDao recomendadoDao = new RecomendadoDao();
        ArrayList<Reproduccion> listaRecomendados = recomendadoDao.obtenerListaReproducciones();

        request.setAttribute("listaRecomendados",listaRecomendados);

        RequestDispatcher view =request.getRequestDispatcher("listaRecomendados.jsp");
        view.forward(request,response);
    }
}
