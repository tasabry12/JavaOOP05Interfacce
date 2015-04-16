public class Atleti implements Ordinabile {
    
	int pettorale=0;
	int eta=0, prestazione=0; //in secondi
	public final static double coefficienteEta=0.4;
	
	public Atleti(int _pettorale, int _eta, int _prestazione)
	{ pettorale=_pettorale; eta=_eta; prestazione=_prestazione;}
    
	public boolean minoreDi(Object altroAtleta)
	{
		if(altroAtleta==null || !(altroAtleta instanceof Atleti))
			return false;
		else
		{
			double indicePrestazioneQuestoAtleta = 
				prestazione - coefficienteEta*eta;
		
		    double indicePrestazioneAltro = 
				((Atleti)altroAtleta).prestazione - 
				  coefficienteEta*((Atleti)altroAtleta).eta;
		
		    return indicePrestazioneQuestoAtleta <
			   indicePrestazioneAltro; 	
		}
	}

	public boolean maggioreDi(Object altroAtleta)
	{
		return ! minoreDi(altroAtleta);
	}
}
