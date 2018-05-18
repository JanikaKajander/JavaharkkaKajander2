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


@WebServlet("/listaa-tallenteet")
public class ListaaTallenteetServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
  
    public ListaaTallenteetServlet() {
        super();
       
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		AanitkDAO aanidao = new AanitkDAO();
		ArrayList<AaniTallenne> aaniTallenteet = aanidao.findAll();
		request.setAttribute("aaniTallenteet", aaniTallenteet);
		String jsp = "/view/aanitallennelista.jsp";
		RequestDispatcher dispather = getServletContext().getRequestDispatcher(
				jsp);
		dispather.forward(request, response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		doGet(request, response);
	}

}
