package main;

import java.io.IOException;
import java.util.Scanner;

import donnees.Magasin;
import XML.ChargeurMagasin;

/**
 * permet de charger un magasin de test
 */
public class MainChargeurMagasin {

	/**
	 * methode principale
	 * 
	 * @param args
	 *            inutilise
	 * @throws IOException
	 *             en cas de probleme de lecture entree/sortie
	 */
	public static void main(String args[]) throws IOException {
		
		String repertoire = "./src/musicbrainzSimple/";
		ChargeurMagasin charge = new ChargeurMagasin(repertoire);
		Magasin resultat = charge.chargerMagasin();
		System.out.println(resultat);

		Scanner sc = new Scanner(System.in);
		sc.nextLine();
		sc.close();
		// tri par artiste
		System.out.println("\nTRI PAR ARTISTE :\n");
		resultat.trierArtiste();
		System.out.println(resultat);
		// tri par album
		System.out.println("\nTRI PAR ALBUM :\n");
		resultat.trierAlbum();
		System.out.println(resultat);

	}

}
