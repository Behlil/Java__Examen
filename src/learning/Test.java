package learning;

public class Test {

	public static void main(String[] args) {
		
		Entreprise entreprise = new Entreprise();
		entreprise.ajouterCadre("RB64532", "Ouassim", 22000, 25, "proprietaire");
		entreprise.ajouterCadre("KA53409", "Mehdi",13000 , 31, "directeur");
		entreprise.ajouterCadre("U763256", "Ouissal", 7000, 22, "secritaire");
		entreprise.ajouterCadre("RB53462", "Khadija", 40000, 33, "Leader");
		
		entreprise.lister();
		
		System.out.println("_________________________________________________");


		Entreprise.trierAge(entreprise.getCadres());
		entreprise.lister();
		System.out.println("_________________________________________________");
		entreprise.supprimerCadre("KA53409");
		entreprise.supprimerCadre("RB53462");
		
		
		entreprise.lister();
		
	
	}
}
