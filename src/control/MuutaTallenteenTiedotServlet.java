package control;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.AaniTallenne;
import model.dao.AanitkDAO;

@WebServlet("/muuta-tiedot")
public class MuutaTallenteenTiedotServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public MuutaTallenteenTiedotServlet() {
        super();
        System.out.println("MuutaTallenteenTiedotServlet.MuutaTallenteenTiedotServlet()");
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		System.out.println("MuutaTallenteenTiedotServlet.doGet()");
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("MuutaTallenteenTiedotServlet.doPost()");
		int id = Integer.parseInt(request.getParameter("id"));
		int idNew = Integer.parseInt(request.getParameter("idNew"));
		String name = request.getParameter("name"); //tallenteen nimi
		String artist = request.getParameter("artist"); //tallenteen esittäjä
		String recordtype = request.getParameter("recordtype"); //tallenteen muoto, esim cd
		String land = request.getParameter("land"); //valmistumaa
		String producer = request.getParameter("producer"); //tuotantoyhtiö
		int year = Integer.parseInt(request.getParameter("year")); //julkaisuvuosi
		AaniTallenne aaniTallenne = new AaniTallenne(idNew, name, artist, recordtype, land, producer, year);
		AanitkDAO dao = new AanitkDAO();
		dao.changeAaniTallenne(aaniTallenne, id);
		response.sendRedirect("listaa-tallenteet");
		
	}

}
