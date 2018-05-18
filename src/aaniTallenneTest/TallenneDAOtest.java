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
		AaniTallenne aaniTallenne = new AaniTallenne("Ehj�", "Apulanta", "CD", "SUOMI", "Levy-yhti�", 1996);
		
		//lis�ys tietoihin
		dao.addAaniTallenne(aaniTallenne);
		
		//listan luonti ja olion findAll metodin kutsu
		ArrayList<AaniTallenne> lista = dao.findAll();
		
		//lista palautetaan testin� konsoliin
		System.out.println(lista);
		
	}

}

