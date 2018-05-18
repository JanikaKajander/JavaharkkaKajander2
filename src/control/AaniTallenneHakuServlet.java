package control;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.AaniTallenne;
import model.dao.AanitkDAO;


@WebServlet("/hae-tallenne")
public class AaniTallenneHakuServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
  
    public AaniTallenneHakuServlet() {
        super();
        System.out.println("AaniTallenneHakuServlet.AaniTallenneHakuServlet()");
    }
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		System.out.println("AaniTallenneHakuServlet.doGet()");
		AanitkDAO dao = new AanitkDAO();
		ArrayList<AaniTallenne> aaniTallenteet = dao.findAll();
		request.setAttribute("aaniTallenteet", aaniTallenteet);		
		String jsp = "/view/aanitallennehaku.jsp"; 
		RequestDispatcher dispatcher = getServletContext().getRequestDispatcher(jsp);
		dispatcher.forward(request, response);
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		System.out.println("AaniTallenneHakuServlet.doPost()");
		String hakusana = request.getParameter("hakusana");
		AanitkDAO dao = new AanitkDAO();
		ArrayList<AaniTallenne> aaniTallenteet = dao.findAll(hakusana);
		request.setAttribute("aaniTallenteet", aaniTallenteet);
		String jsp = "/view/aanitallennehaku.jsp"; 
		RequestDispatcher dispatcher = getServletContext().getRequestDispatcher(jsp);
		dispatcher.forward(request, response);
	}

}