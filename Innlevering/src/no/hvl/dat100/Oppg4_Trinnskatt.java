package no.hvl.dat100;
import static javax.swing.JOptionPane.*;


//En trinnskatt (tidligere toppskatt) er en progressiv skatt på brutto lønn som beregnes når inntekten er høyere enn 164 100kr.
		//Lag et program som leser inn bruttoinntekt, beregner og skriver ut trinnskatten.
		//https://www.skatteetaten.no/satser/trinnskatt/?year=2020#rateShowYear

public class Oppg4_Trinnskatt {
		
		public static void main(String[] args) {
			double brutto = Double.parseDouble(showInputDialog("Hva er din brutto lønn?"));
			
			double prosent;
			if (brutto < 180800) prosent = 0; else
			if (brutto <= 254500) prosent = 0.019; else
			if (brutto <= 639750) prosent = 0.042; else
			if (brutto <= 999550) prosent = 0.132; else
				prosent = 0.162;
			
			double trinnskatt = brutto * prosent;
			
			showMessageDialog(null, "Din trinnskatt er: " + trinnskatt);
			
			
			

		

	}

	
}
