package metier;

public class ClientEntreprise {
	private Long id;
	private String nom;
	private int code;
	private final String type = "Entreprise";
	//..  Constructors  ..//
	public ClientEntreprise() {

	}

	public ClientEntreprise(Long id, String nom, int code) {
		super();
		this.id = id;
		this.nom = nom;
		this.code = code;
	}

	public ClientEntreprise(String nom, int code) {
		super();
		this.nom = nom;
		this.code = code;
	}
	//...
	// getters and setters
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}


}
