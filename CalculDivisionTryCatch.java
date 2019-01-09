public class CalculDivisionTryCatch {

	public static void main(String [] args){
		
		int op1 ;
		int op2 ;
		int resultat ;
		
		System.out.print("Saisir le dividende : ") ;
		op1 = Clavier.lireEntier() ;
		
		System.out.print("Saisir le diviseur : ") ;
		op2 = Clavier.lireEntier() ;
		
		try{
			resultat = op1 / op2 ;
			System.out.println("Résultat de la division : " + resultat) ;
		}
		catch(ArithmeticException e){
			System.out.println("Division par 0 impossible.") ;
		}
		
	}

}
