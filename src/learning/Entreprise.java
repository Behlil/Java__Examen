package learning;

public class Entreprise {

	private Cadre[] cadres = new Cadre[1000];
	private int nbrCadres=0;
//	Constructeur:
	public Entreprise(Cadre[] cadres, int nbrCadres) {
		super();
		this.cadres = cadres;
		this.nbrCadres = nbrCadres;
	}
	public Entreprise() {
		super();
		// TODO Auto-generated constructor stub
	}
	//	Getters and setters:
	public Cadre[] getCadres() {
		return cadres;
	}
	public void setCadres(Cadre[] cadres) {
		this.cadres = cadres;
	}
	public int getNbrCadres() {
		return nbrCadres;
	}
	public void setNbrCadres(int nbrCadres) {
		this.nbrCadres = nbrCadres;
	}
	
//	Creer nouveau cadre methode:
	public Cadre creerCadre(String cin, String nom, float salaire, int age, String fct) {
		
		Cadre newCadre = new  Cadre(cin, nom, salaire, age, fct);
		
		return newCadre;
		
	}
	
//	ajouter un cadre a la liste des cadres:
	public void ajouterCadre(String cin, String nom, float salaire, int age, String fct) {
		
		Cadre cad = creerCadre(cin, nom, salaire, age, fct);
		cadres[nbrCadres]= cad;
		nbrCadres++;
	}
	
//	Afficher la liste des cadres:
	public void lister() {
		for(int i = 0;i<nbrCadres;i++) {
			if(cadres[i] != null) {
				System.out.println(cadres[i].toString());
			}

		}
		
	}
	
//	trier le tableau des cadres du plus petit au plus grand(croissance):
	public static void trierAge(Cadre t[]) {
		
		if(t.length >= 2) {
			
			for(int i = 0; i<t.length;i++) {
				for(int j = i+1; j<t.length; j++) {
				
					if(t[i]!=null && t[j]!= null && t[i].getAge()>t[j].getAge()) {
						
						
						 Cadre cadtemp = t[i];
						 t[i]=t[j];
						 t[j]=cadtemp;
						 
					}
				}
			}
			}
				
	}
	
//	Chercher un cadre par son CIN:
	public boolean chercherCadre(String cin) {
		
		for(int i=0; i<nbrCadres;i++) {
			if(cadres[i].getCin().equals(cin)) return true;
		}
		
		return false;
	}
	
//	supprimer un cadre de la liste des cadres par son CIN:
	public void supprimerCadre(String cin) {
		if(chercherCadre(cin)) {
			Cadre[] listCadres = new Cadre[1000];
			int newNbrCadres=0;
			
			for(int i=0; i<nbrCadres;i++) {
				if(cadres[i]!=null && !(this.cadres[i].getCin().equals(cin))) {
					listCadres[newNbrCadres] = cadres[i];
					newNbrCadres++;
				}
			}
			cadres = listCadres;
		}else System.out.println("Cadre n existe pas!");
	}
	
//	renvoyer le taleau des cadres:
	public Cadre[] getCadre() {
		return cadres;
	}
}













