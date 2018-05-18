package control;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.AaniTallenne;
import model.dao.AanitkDAO;


@WebServlet("/lisaa-tallenne")
public class LisaaUusiTallenneServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		String jsp = "/view/aanitallennelomake.jsp";
		RequestDispatcher dispather = getServletContext().getRequestDispatcher(jsp);
		dispather.forward(request, response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		try{
			
			String name = request.getParameter("name"); //tallenteen nimi
			String artist = request.getParameter("artist"); //tallenteen esittäjä
			String recordtype = request.getParameter("recordtype"); //tallenteen muoto, esim cd
			String land = request.getParameter("land"); //valmistumaa
			String producer = request.getParameter("producer"); //tuotantoyhtiö
			String yearStr = request.getParameter("year"); //julkaisuvuosi
			int year = new Integer(yearStr);
			
			AaniTallenne aaniTallenne = new AaniTallenne(name, artist, recordtype, land, producer, year);
		
			AanitkDAO aanitkdao = new AanitkDAO();
			
			aanitkdao.addAaniTallenne(aaniTallenne);
		
		} catch (SQLException e){
			
			System.out.println("Tietosi eivät tallentuneet virheen " + e.getMessage() + " vuoksi");
			
		}
		
		// uudelleenohjataan selain aanitallennelista-sivulle
				response.sendRedirect("listaa-tallenteet");
	}

}