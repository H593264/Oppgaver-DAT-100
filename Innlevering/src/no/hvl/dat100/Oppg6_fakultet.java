package no.hvl.dat100;

//Lag et program som leser inn et heltall n > 0, beregner verdien n! (n fakultet) 
//og skriver verdien til n! der n! = 1\*2\*3\*…\*(n-1)\*n

import static java.lang.Integer.*;
import static javax.swing.JOptionPane.*;

public class Oppg6_fakultet {

		public static void main (String[] args) {
			
			String tallTxt = showInputDialog ("Skriv inn et heltall: ");
			
			int nummer = parseInt(tallTxt);
			int fakultet = 1;
			if(nummer > 0) {
				for (int i=1; i<= nummer; i++) {
					fakultet = fakultet * i;
				
				}
				showMessageDialog (null, "Fakultet " + nummer + " er " + fakultet);
			}
		}
		
	}
