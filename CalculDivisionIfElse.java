public class CalculDivisionIfElse {

	public static void main(String [] args){
		
		int op1 ;
		int op2 ;
		int resultat ;
		
		System.out.print("Saisir le dividende : ") ;
		op1 = Clavier.lireEntier() ;
		
		System.out.print("Saisir le diviseur : ") ;
		op2 = Clavier.lireEntier() ;
		
		if(op2 != 0){
			resultat = op1 / op2 ;
			System.out.println("Résultat de la division : " + resultat) ;
		}
		else {
			System.out.println("Division par 0 impossible.") ;
		}
		
	}

}
