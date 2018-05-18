package aaniTallenneTest;

import java.sql.SQLException;
import java.util.List;

import org.junit.Test;

import junit.framework.Assert;
import model.AaniTallenne;
import model.dao.AanitkDAO;

public class TallenneTest {

	@SuppressWarnings("deprecation")
	@Test
	public void testAddAaniTallenne() throws SQLException {
		
		AanitkDAO dao = new AanitkDAO();
		AaniTallenne aaniTallenne = new AaniTallenne(0, "Testinimi", "Testiartisti", "CD", "Testimaa", "Testiyhtiö", 2018);
		dao.addAaniTallenne(aaniTallenne);
		
		List<AaniTallenne> aaniTallenteet = dao.findAll();
		Assert.assertEquals(aaniTallenne.getName(), aaniTallenteet.get(0).getName());
	}

}
