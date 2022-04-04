package learning;

public class Personne {

	private String cin;
	private String nom;
	private float salaire;
	private int age;
	
//	constructeurs:
	public Personne() {
		super();
	}
	public Personne(String cin, String nom, float salaire, int age) {
		super();
		this.cin = cin;
		this.nom = nom;
		this.salaire = salaire;
		this.age = age;
	}
//	Getters and setters
	public String getCin() {
		return cin;
	}
	public void setCin(String cin) {
		this.cin = cin;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public double getSalaire() {
		return salaire;
	}
	public void setSalaire(float salaire) {
		this.salaire = salaire;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
//	ttoString methode:
	@Override
	public String toString() {
		return "Personne [cin=" + cin + ", nom=" + nom + ", salaire=" + salaire + ", age=" + age + "]";
	}
	
}
