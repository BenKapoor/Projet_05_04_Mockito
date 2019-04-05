package eu.ensup.resacrenau.domaine;

import java.util.ArrayList;
import java.util.Date;

/**
 * @author benja
 * classe Reservation
 */
public class Reservation extends Creneau {

	private int id;
	private String date;
	private String nom;
	private String prenom;

	
	
	
	public Reservation(String heureDebut, String heureFin) {
		super(heureDebut, heureFin);
		// TODO Auto-generated constructor stub
	}


	/**
	 * @param id
	 * @param heureDebut
	 * @param heureFin
	 * @param id2
	 * @param date
	 * @param nom
	 * @param prenom
	 */
	public Reservation(int id, String heureDebut, String heureFin, int id2, String date, String nom, String prenom) {
		super(id, heureDebut, heureFin);
		id = id2;
		this.date = date;
		this.nom = nom;
		this.prenom = prenom;
	}

	
	/**
	 * @param id
	 * @param heureDebut
	 * @param heureFin
	 * @param nom
	 */
	public Reservation(int id, String heureDebut, String heureFin, String nom) {
		super(id, heureDebut, heureFin);
		this.nom = nom;
	}


	/**
	 * @param heureDebut
	 * @param heureFin
	 * @param id2
	 * @param date
	 * @param nom
	 * @param prenom
	 */
	public Reservation(String heureDebut, String heureFin, int id2, String date, String nom, String prenom) {
		super(heureDebut, heureFin);
		id = id2;
		this.date = date;
		this.nom = nom;
		this.prenom = prenom;
	}

	
	
	/**
	 * @param heureDebut
	 * @param heureFin
	 * @param date
	 * @param nom
	 * @param prenom
	 */
	public Reservation(String heureDebut, String heureFin, String date, String nom, String prenom) {
		super(heureDebut, heureFin);
		this.date = date;
		this.nom = nom;
		this.prenom = prenom;
	}

	/**
	 * @param id
	 * @param heureDebut
	 * @param heureFin
	 */
	public Reservation(int id, String heureDebut, String heureFin) {
		super(id, heureDebut, heureFin);
	}

	@Override
	public String toString() {
		return "Reservation [id=" + id + ", date=" + date + ", nom=" + nom + ", prenom=" + prenom + ", HeureDebut="
				+ HeureDebut + ", HeureFin=" + HeureFin + "]";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

}
