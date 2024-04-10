package start;


import java.nio.charset.StandardCharsets;
import java.util.List;

import utility.DatiUtenti;
import utility.FileUtility;
import utility.StringUtility;
import utility.Utente;


public class Main {

	public static void main(String[] args) {
		
		byte[] file = FileUtility.getFileFromInternalResources("user.json");
		String jsonString = new String(file, StandardCharsets.UTF_8);
		DatiUtenti datauser = StringUtility.jsonToObject(jsonString, DatiUtenti.class);
		List<Utente> utenti = datauser.getUtenti();
		for (Utente utente : utenti) {
			if(utente.getNome().equals("Luigi")){
				/*System.out.println("Nome: " + utente.getNome());
		        System.out.println("Cognome: " + utente.getCognome());
		        System.out.println("Sesso: " + utente.getSesso());
		        System.out.println();
		        */
		        String jsonfile= StringUtility.objectToJson(utente);
		        System.out.println(jsonfile);
		        System.out.println();
		        utente.setEta(26);
				String xmlfile = StringUtility.objectToXML(utente);
				System.out.println(xmlfile);
				
				
			}
	        
	    }

             
	}

}
