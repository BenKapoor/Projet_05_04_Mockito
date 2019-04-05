package eu.ensup.resacrenau.dao;

import java.sql.ResultSet;
import java.util.ArrayList;

import eu.ensup.resacrenau.domaine.Creneau;
import eu.ensup.resacrenau.domaine.Reservation;
import eu.ensup.resacrenau.exception.DAOException;

public class DaoReservation {
	Connexion conn = new Connexion();
	/**
	 * @param conn
	 * @return
	 * Cette méthode permet de lister les reservations
	 */
	public ArrayList<Reservation> listeReservation(Connexion conn) {
		DaoUtilisateur utilisateur = new DaoUtilisateur();

		Reservation reservation = new Reservation(null, null, 0, null, null, null);

		try {

			ResultSet res = conn.getConnection().executeQuery("SELECT u.Nom, u.Prenom, r.Date, c.HeureDebut, c.HeureFin"
					+ " FROM Reservation r, Utilisateur u, Creneau c" + "Where r.Id = c.Id" + "r.iD = u.ID;");

			while (res.next()) {
				Reservation resa = new Reservation(null, null, 0, null, null, null);
				resa.setNom(res.getString("Nom"));
				resa.setPrenom(res.getString("Prenom"));
				resa.setDate(res.getString("Date"));
				resa.setHeureDebut(res.getString("HeureDebut"));
				resa.setHeureFin(res.getString("HeureFin"));
			}

		}

		catch (Exception e) {
			String message = "Erreur lors de la requête de recherhce des reservation : <br/>" + e.getMessage();
		}

		return listeReservation(conn);

	}
	
	// penser a remettre en void
	public boolean ajouterReservation(Reservation reservation) throws DAOException {
		try {
			conn.getConnection().executeUpdate("INSERT INTO reservation(parametre) values"
					+ "('"+ reservation.getNom() +"','"+ reservation.getPrenom() +"');");	
			// incolplet

		} catch (Exception e) {
			new DAOException();
		}
		return false;
	}

	public void supprimerReservation(int id) throws DAOException {
		// TODO Auto-generated method stub	
		try {
			conn.getConnection().executeUpdate("DELETE FROM `reservation` WHERE `id`='"+ id +"';");		

		} catch (Exception e) {
			// TODO: handle exception
			new DAOException();
		}
	}

	public void editerReservation(Reservation reservation, int id) throws DAOException {
		// TODO Auto-generated method stub	
		try {
			conn.getConnection().executeUpdate("UPDATE reservation SET  = '"
					+ "" + reservation.getNom() + ""
					+ "';");	

		} catch (Exception e) {
			// TODO: handle exception
			new DAOException();
		}
	}

	public ArrayList<Reservation> listUneReservation(int id) throws DAOException {
		ArrayList<Reservation> arrayListUneReservation = new ArrayList();
		try {

			ResultSet res = conn.getConnection().executeQuery("SELECT parametres "
					+ "FROM reservation WHERE `id`='"+ id +"';");

			while (res.next()) {
				Reservation reservationList = new Reservation(0, null, null);
				reservationList.setNom(res.getString("nom"));
				
				arrayListUneReservation.add(reservationList);
			}

		}

		catch (Exception e) {
			new DAOException();
		}

		return arrayListUneReservation;
	}
}
