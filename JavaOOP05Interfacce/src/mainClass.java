
public class mainClass {

	public static void main(String[] args) {

    Atleti[] elenco = {new Atleti(1, 19, 12),
    		           new Atleti(2, 19, 13),
    		           new Atleti(3, 29, 14)};
    Ordinatore o = new Ordinatore(elenco);
    Atleti[] classifica = (Atleti[]) o.selectionSortA_Z();
    
    System.out.println("Classifica");
    for (int i=0; i<classifica.length; i++)
    	System.out.println("Pettorale: " + classifica[i].pettorale +
    			" " + (classifica[i].prestazione - Atleti.coefficienteEta*classifica[i].eta));
	
	
		}
}


/* TEST ...
 System.out.println("------------------------------------");
	 for (int i=0; i<classifica.length; i++)
	    	System.out.println("Pettorale: " + elenco[i].pettorale +
	    			" " + (elenco[i].prestazione - Atleti.coefficienteEta*elenco[i].eta));


*/