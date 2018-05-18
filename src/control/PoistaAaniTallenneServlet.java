package control;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.dao.AanitkDAO;


@WebServlet("/poista-aaniTallenne")
public class PoistaAaniTallenneServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * Vastaanottaa selaimelta tulleen tallenteen poistopyynnön
	 * 
	 * @param request
	 *            pyyntö
	 * @param response
	 *            vastaus
	 */

	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		try {
			// Haetaan lomakkeella syötetyn tallenteen tiedot request-oliolta
			String idStr = request.getParameter("id");
			int aanitallenneId = new Integer(idStr);
			// Luodaan aanitallenneDAO
			AanitkDAO aanitkDAO = new AanitkDAO();
			aanitkDAO.removeAaniTallenne(aanitallenneId);
			
		} catch (SQLException e) {
		
			System.out.println("Poisto epäonnistui sillä: " + e.getMessage());
		}

		// uudelleenohjataan selain henkilolista-sivulle
		response.sendRedirect("listaa-tallenteet");
	}

}
