package aaniTallenneTest;

import java.sql.SQLException;
import java.util.ArrayList;

import model.AaniTallenne;
import model.dao.AanitkDAO;


public class TallenneDAOtest {

public static void main(String[] args) throws SQLException {
		
		// dao-luokan olion luonti
		AanitkDAO dao = new AanitkDAO();
		
		//aanitallenteen luonti
		AaniTallenne aaniTallenne = new AaniTallenne("Ehjä", "Apulanta", "CD", "SUOMI", "Levy-yhtiö", 1996);
		
		//lisäys tietoihin
		dao.addAaniTallenne(aaniTallenne);
		
		//listan luonti ja olion findAll metodin kutsu
		ArrayList<AaniTallenne> lista = dao.findAll();
		
		//lista palautetaan testinä konsoliin
		System.out.println(lista);
		
	}

}

