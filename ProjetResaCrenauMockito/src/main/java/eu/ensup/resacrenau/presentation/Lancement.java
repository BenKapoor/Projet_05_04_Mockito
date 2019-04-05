package eu.ensup.resacrenau.presentation;

import java.lang.reflect.Array;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

import eu.ensup.resacrenau.dao.Connexion;
import eu.ensup.resacrenau.domaine.Creneau;
import eu.ensup.resacrenau.domaine.Reservation;
import eu.ensup.resacrenau.service.ResaCrenauService;

public class Lancement {
	public static void main(String[] args) throws Exception{
	//ReseService ReservationService = new ReservationService();
	Connexion conn = new Connexion();
	Reservation reservation = new Reservation(0, null, null);
	ResaCrenauService resaCrenauService = new ResaCrenauService(null, null, null, null, null);
	
	System.out.println("1 - Lister les réservations");
	System.out.println("2 - Ajouter une réservation");
	System.out.println("3 - Modifier une réservation");
	System.out.println("4 - Supprimer une réservation");
	System.out.println("5 - Afficher les informations d'une réservation");
	
	System.out.println("Veuillez entrer votre choix : ");
	Scanner sc = new Scanner(System.in);
	int str = sc.nextInt();

	switch (str) {
	case 1:
		/**
		 * Instenciation du tableau listAven
		 */
		ArrayList<Reservation> listReservation = new ArrayList<Reservation>();
		/**
		 * Récupération du service et stockage dans listAven
		 */
		listReservation = resaCrenauService.listeReservationCreneau(null);
		
		System.out.println(listReservation);
		
		break;

	case 2:
		Reservation ReservationAjout = new Reservation(0, null, null);
		
		System.out.println("Nom : ");
		Scanner scEtuAjoutNom = new Scanner(System.in);
		String nom = scEtuAjoutNom.nextLine();
		ReservationAjout.setNom(nom);
		// Methode absente
		// String testReservation = resaCrenauService.controlleReservation(ReservationAjout);
		// if(testReservation.equals("1")) {
		// break;
		// }
		
		System.out.println("Costume : ");
		Scanner scEtuAjoutCostume = new Scanner(System.in);
		String Costume = scEtuAjoutCostume.nextLine();
		// ReservationAjout.setCostume(Costume);
		// Methode absente
		System.out.println("Age : ");
		Scanner scEtuAjoutAge = new Scanner(System.in);
		int Age = scEtuAjoutAge.nextInt();
		// ReservationAjout.setAge(Age);
		// Methode absente
		System.out.println("Pouvoir : ");
		Scanner scEtuAjoutPouvoir = new Scanner(System.in);
		String Pouvoir = scEtuAjoutPouvoir.nextLine();
		// ReservationAjout.setPouvoir(Pouvoir);
		
		//ReservationService.ajouterReservation(ReservationAjout);
		
		break;
		
	case 3:
		System.out.println("Selectionnez un étudiant : ");
		Scanner scReservationSelc = new Scanner(System.in);
		int id = scReservationSelc.nextInt();
		
		
		System.out.println("Nom : ");
		Scanner scModifEtuNom = new Scanner(System.in);
		String modifNom = scModifEtuNom.nextLine();
		// Reservation.setNom(modifNom);
		
		System.out.println("Costume : ");
		Scanner scModifEtuCostume = new Scanner(System.in);
		String modifCostume = scModifEtuNom.nextLine();
		// Reservation.setCostume(modifCostume);
		
		System.out.println("Age : ");
		Scanner scModifEtuAge = new Scanner(System.in);
		int modifAge = scModifEtuAge.nextInt();
		// Reservation.setAge(modifAge);
		
		System.out.println("Pouvoir");
		Scanner scModifEtuPouvoir = new Scanner(System.in);
		String modifPouvoir = scModifEtuPouvoir.nextLine();
		// Reservation.setPouvoir(modifPouvoir);
		
		// ReservationService.editerReservation(Reservation, id);
		break;
		
	case 4:
		System.out.println("Entrer l'identifiant de l'étudiant à supprimer : ");
		Scanner scReservationSupp = new Scanner(System.in);
		int idSupp = scReservationSupp.nextInt();
		// gestion des exceptions au niveau du services à faire
		// ReservationService.supprimerReservation(idSupp);
		System.out.println("L'étudiant est bien supprimé");
		scReservationSupp.close();
		break;
		
	case 5:
		System.out.println("Entrer l'identifiant de l'étudiant : ");
		Scanner scUnReservation = new Scanner(System.in);
		int idUnEtu = scUnReservation.nextInt();
		ArrayList<Reservation> listUnReservation = new ArrayList<Reservation>();
		// listUnReservation = ReservationService.listUnReservation(Reservation, idUnEtu);
		
		System.out.println(listUnReservation);
		scUnReservation.close();
		break;
	}
	
	List<Creneau> creneaux = creerCreneaux();
	
	List<String> listeCreneaux;
//	listeCreneaux = creneaux.stream()
//			.filter(cren -> cren.getHeureDebut() != "03H")
//			.map(cren -> cren.getHeureDebut())
//			.collect(Collectors.toList());
	
}

	private static List<Creneau> creerCreneaux() {
		return Arrays.asList(
				new Creneau("12H", "13H"),
				new Creneau("13H", "14H"),
				new Creneau("03H", "04H")
				);
	}

}
