package model.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import model.AaniTallenne;

public class AanitkDAO extends DataAccessObject {

	
	public ArrayList<AaniTallenne> findAll() {	
		Connection conn = null;
		PreparedStatement stmt = null;
		ResultSet rs = null;
		ArrayList<AaniTallenne> aaniTallenteet = new ArrayList<AaniTallenne>();
		AaniTallenne aaniTallenne = null; 
		try {
			// Luodaan yhteys
			conn = getConnection();
			// Luodaan komento: haetaan kaikki rivit aaniTallenne-taulusta
			String sqlSelect = "SELECT id, name, artist, recordtype, land, producer, year FROM aaniTallenne;";
			// Valmistellaan komento:
			stmt = conn.prepareStatement(sqlSelect);
			// L‰hetet‰‰n komento:
			rs = stmt.executeQuery();
			// K‰yd‰‰n tulostaulun rivit l‰pi ja luetaan readAaniTallenne()-metodilla:
			while (rs.next()) {
				aaniTallenne = readAaniTallenne(rs);
				// lis‰t‰‰n aaniTallenne listaan
				aaniTallenteet.add(aaniTallenne);
			}
		} catch (SQLException e) {
			throw new RuntimeException(e);
		} finally {
			close(rs, stmt, conn); // Suljetaan
		}
	
		return aaniTallenteet;
	}
	
	/**
	 * Lukee tietokannasta taulusta yhden tietorivin (tallenteen tiedot). Luo ja palauttaa tietojen perusteella AaniTallenne-tyyppisen olion
	 * 
	 * @param rs
	 *            tietokannasta kyselyll‰ haettu tulostaulu
	 * @return AaniTallenne aanitallenne-olio
	 */
	private AaniTallenne readAaniTallenne(ResultSet rs) {	
		try {
			// Haetaan yhden aaniTallenne tiedot kyselyn tulostaulun (ResultSet-tyyppinen rs-olion) aktiiviselta tietorivilt‰
			int id = rs.getInt("id");
			String name = rs.getString("name");
			String artist = rs.getString("artist");
			String recordtype = rs.getString("recordtype");
			String land = rs.getString("land");
			String producer = rs.getString("producer");
			int year = rs.getInt("year");
			
			//  Luodaan ja palautetaan uusi aaniTallenne
			return new AaniTallenne(id, name, artist, recordtype, land, producer, year);
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}
	
	/**
	 * lis‰‰ AaniTallenteen tiedot tietokantaan
	 * 
	 * @param aaniTallenne
	 *            AaniTallenne-luokan olio
	 * @throws SQLException 
	 */
	public void addAaniTallenne(AaniTallenne aaniTallenne) throws SQLException {
		Connection connection = null;
		PreparedStatement stmtInsert = null;
	

		try {
			// Luodaan yhteys
			connection = getConnection();
			//Luodaan uusi tallenne tietokantaan:
			String sqlInsert = "INSERT INTO aaniTallenne(id, name, artist, recordtype, land, producer, year) VALUES (?, ?, ?, ?, ?, ?, ?)";
			stmtInsert = connection.prepareStatement(sqlInsert);
			stmtInsert.setInt(1, aaniTallenne.getId());
			stmtInsert.setString(2, aaniTallenne.getName());
			stmtInsert.setString(3, aaniTallenne.getArtist());
			stmtInsert.setString(4, aaniTallenne.getRecordtype());
			stmtInsert.setString(5, aaniTallenne.getLand());
			stmtInsert.setString(6, aaniTallenne.getProducer());
			stmtInsert.setInt(7, aaniTallenne.getYear());
			stmtInsert.executeUpdate();
			
		} catch (SQLException e) {
			throw new RuntimeException(e);
		} finally {
			close(stmtInsert, connection); // Suljetaan statement ja yhteys
		}
	}
	
	public void removeAaniTallenne(int aanitallenneId) throws SQLException {
		Connection connection = null;
		PreparedStatement stmtDelete = null;
		
		try {
			connection = getConnection();
			String sqlInsert = "DELETE FROM aaniTallenne WHERE id = ?";
			stmtDelete = connection.prepareStatement(sqlInsert);
			stmtDelete.setInt(1, aanitallenneId);
			stmtDelete.executeUpdate();
			
		}catch (SQLException e) {
			throw new RuntimeException(e);
		}finally {
			close(stmtDelete, connection);
		}
	}
	
	public ArrayList<AaniTallenne> findAll(String hakusana) {	
		Connection conn = null;
		PreparedStatement stmt = null;
		ResultSet rs = null;
		ArrayList<AaniTallenne> aaniTallenteet = new ArrayList<AaniTallenne>();
		AaniTallenne aaniTallenne = null; 
		try {
			// Luodaan yhteys
			conn = getConnection();
			// Luodaan komento: haetaan kaikki rivit aaniTallenne-taulusta
			String sqlSelect = "SELECT * FROM aaniTallenne WHERE id LIKE ? or name LIKE ? or artist LIKE ? or recordtype LIKE ? "
					+ "or land LIKE ? or producer LIKE ? or year LIKE ?";
			// Valmistellaan komento:
			stmt = conn.prepareStatement(sqlSelect);
			stmt.setString(1, "%" + hakusana + "%");
			stmt.setString(2, "%" + hakusana + "%");   
			stmt.setString(3, "%" + hakusana + "%");
			stmt.setString(4, "%" + hakusana + "%"); 
			stmt.setString(5, "%" + hakusana + "%"); 
			stmt.setString(6, "%" + hakusana + "%");
			stmt.setString(7, "%" + hakusana + "%"); 
			// L‰hetet‰‰n komento:
			rs = stmt.executeQuery();
			// K‰yd‰‰n tulostaulun rivit l‰pi ja luetaan readAaniTallenne()-metodilla:
			while (rs.next()) {
				aaniTallenne = readAaniTallenne(rs);
				aaniTallenne.setId(rs.getInt(1));
				aaniTallenne.setName(rs.getString(2));
				aaniTallenne.setArtist(rs.getString(3));
				aaniTallenne.setRecordtype(rs.getString(4));
				aaniTallenne.setLand(rs.getString(5));	
				aaniTallenne.setProducer(rs.getString(6));
				aaniTallenne.setYear(rs.getInt(7));
				
				// lis‰t‰‰n aaniTallenne listaan
				aaniTallenteet.add(aaniTallenne);
			}
		} catch (SQLException e) {
			throw new RuntimeException(e);
		} finally {
			close(rs, stmt, conn); // Suljetaan
		}
	
		return aaniTallenteet;
	}
	public boolean changeAaniTallenne(AaniTallenne aaniTallenne, int id){
		boolean paluuArvo=true;
		Connection conn = null;
		PreparedStatement stmt = null;
		String sqlSelect="UPDATE aaniTallenne SET name=?, artist=?, recordtype=?, "
				+ "land =?, producer=?, year=? WHERE id=?";					  
		try {
			conn = getConnection();
			stmt=conn.prepareStatement(sqlSelect); 
			stmt.setString(1, aaniTallenne.getName());
			stmt.setString(2, aaniTallenne.getArtist());
			stmt.setString(3, aaniTallenne.getRecordtype());
			stmt.setString(4, aaniTallenne.getLand());
			stmt.setString(5, aaniTallenne.getProducer());
			stmt.setInt(6, aaniTallenne.getYear());
			stmt.executeUpdate();
	        conn.close();
		} catch (SQLException e) {				
			e.printStackTrace();
			paluuArvo=false;
		}				
		return paluuArvo;
	}
}
