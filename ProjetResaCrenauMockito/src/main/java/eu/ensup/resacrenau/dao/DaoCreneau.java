package eu.ensup.resacrenau.dao;

import eu.ensup.resacrenau.domaine.Reservation;

public class DaoCreneau {
	Connexion conn = new Connexion();
	Reservation reservation = new Reservation(0, null, null);
	
	public void listeCreneaux() {
		try {

			conn.getConnection().executeQuery("SELECT * FROM Creneau;");

		}

		catch (Exception e) {
			String message = "Erreur lors de la requête de recherche des creneaux : <br/>" + e.getMessage();
		}
	}
}
