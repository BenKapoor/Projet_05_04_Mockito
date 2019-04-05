package eu.ensup.resacrenau.domaine;

/**
 * @author benja
 * classe utilisateur
 */
public class Utilisateur {

	private int ID;
	private String nom;
	private String prenom;
	private String motDePasse;
	
	
	/**
	 * @param iD
	 * @param nom
	 * @param prenom
	 * @param motDePasse
	 */
	public Utilisateur(int iD, String nom, String prenom, String motDePasse) 
	{
		super();
		ID = iD;
		this.nom = nom;
		this.prenom = prenom;
		this.motDePasse = motDePasse;
	}

	public Utilisateur(String nom) {
		super();
		this.nom = nom;
	}

	/**
	 * 
	 */
	public Utilisateur() {
		
	}

	@Override
	public String toString() 
	{
		return "Utilisateur [ID=" + ID + ", nom=" + nom + ", prenom=" + prenom + ", motDePasse=" + motDePasse + "]";
	}
	
	public int getID() 
	{
		return ID;
	}
	
	public void setID(int iD) 
	{
		ID = iD;
	}
	
	public String getNom() 
	{
		return nom;
	}
	
	public void setNom(String nom) 
	{
		this.nom = nom;
	}
	
	public String getPrenom() 
	{
		return prenom;
	}
	
	public void setPrenom(String prenom) 
	{
		this.prenom = prenom;
	}
	
	public String getMotDePasse() 
	{
		return motDePasse;
	}
	
	public void setMotDePasse(String motDePasse) 
	{
		this.motDePasse = motDePasse;
	}
}
