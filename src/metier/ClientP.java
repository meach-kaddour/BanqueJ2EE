package metier;

public class ClientP {
	private Long id;
	private String nom;
	private String prenom;
	private int code;
	private String type ;
	
	
	//..  Constructors  ..//
	public ClientP() {

	}

	public ClientP(Long id, String nom, String prenom, int code) {
		super();
		this.id = id;
		this.nom = nom;
		this.prenom = prenom;
		this.code = code;
	}

	public ClientP(String nom, String prenom, int code,String type) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.code = code;
		this.type=type;
	}
	//...
	// getters and setters	
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}

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

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	@Override
	public String toString() {
		return "ClientP [id=" + id + ", nom=" + nom + ", prenom=" + prenom + ", code=" + code + ", type=" + type + "]";
	}

}
