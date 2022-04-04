package learning;

public class Cadre extends Personne{
	
	private String fonction;

//	constructeur:
	public Cadre(String cin, String nom, float salaire, int age, String fonction) {
		super(cin, nom, salaire, age);
		this.fonction = fonction;
	}

//	toString methode:
	@Override
	public String toString() {
		return "Cadre [nom=" +this.getNom()+", fonction="+fonction +", age="+this.getAge()+ "]";
	}
	
//	increment methode:
	public void increment() {
		this.setAge((this.getAge())+1);
	}
	

}
