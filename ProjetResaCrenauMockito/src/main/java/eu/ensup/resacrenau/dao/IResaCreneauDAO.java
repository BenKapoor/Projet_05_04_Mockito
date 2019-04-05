package eu.ensup.resacrenau.dao;

import java.util.ArrayList;

import eu.ensup.resacrenau.domaine.Creneau;
import eu.ensup.resacrenau.exception.DAOException;


public interface IResaCreneauDAO {
	public ArrayList<Creneau> listCreneau(Creneau creneau) throws DAOException;
	public void ajouterCreneau(Creneau cvenger) throws DAOException;
	public void supprimerCreneau(int id) throws DAOException;
	public void editerCreneau(Creneau creneau, int id) throws DAOException;
	public ArrayList<Creneau> listUnCreneau(Creneau creneau, int id) throws DAOException;
}
