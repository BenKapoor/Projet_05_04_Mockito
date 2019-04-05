package eu.ensup.resacrenau.domaine;

public class Creneau {

	protected int Id;
	protected String HeureDebut;
	protected String HeureFin;

	/**
	 * @param id
	 * @param heureDebut
	 * @param heureFin
	 * Classe creneau
	 */
	public Creneau(int id, String heureDebut, String heureFin) {
		super();
		Id = id;
		HeureDebut = heureDebut;
		HeureFin = heureFin;
	}

	@Override
	public String toString() {
		return "Creneau [Id=" + Id + ", HeureDebut=" + HeureDebut + ", HeureFin=" + HeureFin + "]";
	}

	/**
	 * @param heureDebut
	 * @param heureFin
	 */
	public Creneau(String heureDebut, String heureFin) {
		super();
		HeureDebut = heureDebut;
		HeureFin = heureFin;
	}

	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
	}

	public String getHeureDebut() {
		return HeureDebut;
	}

	public void setHeureDebut(String heureDebut) {
		HeureDebut = heureDebut;
	}

	public String getHeureFin() {
		return HeureFin;
	}

	public void setHeureFin(String heureFin) {
		HeureFin = heureFin;
	}
}
