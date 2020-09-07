package no.hvl.dat100;

//Lag et program som leser inn en poengsum (heltall) som en student har oppnådd på en prøve, 
//og finn og skriv ut den karakteren A-F dette tilsvarer. 

import static javax.swing.JOptionPane.*;

public class Oppg5_Karakter {
	
		public static void main(String[] args) {
			
		for (int i = 0; i < 10; i++) 
			Karakter();	
		}

		public static void Karakter() {
			int poengsum;
			do {
				 poengsum = Integer.parseInt(showInputDialog("Hva er din poengsum? "));
				 if (poengsum >= 0 && poengsum <= 100) break;
				 showMessageDialog(null, "Poengsum må være mellom 0 og 100");
			} 
			while (true);
			String karakter;
			if (poengsum < 40) karakter = "F"; else
			if (poengsum < 50) karakter = "E"; else
			if (poengsum < 60) karakter = "D"; else
			if (poengsum < 80) karakter = "C"; else
			if (poengsum < 90) karakter = "B"; else
			karakter = "A"; 
			
			showMessageDialog(null,("Du fikk karakteren: " + karakter));

			
		}
		
	}

	

