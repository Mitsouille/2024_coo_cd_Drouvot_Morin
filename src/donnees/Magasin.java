package donnees;

import java.util.ArrayList;

/**
 * La classe Magasin represente un magasin qui vend des CDs.</p>
 * <p>
 * cette classe est caracterisee par un ensemble de CDs correspondant aux CDS
 * vendus dans ce magasin.
 */
public class Magasin {

    /**
     * la liste des CDs disponibles en magasin
     */
    private ArrayList<CD> listeCds;

    /**
     * construit un magasin par defaut qui ne contient pas de CD
     */
    public Magasin() {
        listeCds = new ArrayList<CD>();
    }

    /**
     * ajoute un cd au magasin
     *
     * @param cdAAjouter le cd a ajouter
     */
    public void ajouteCd(CD cdAAjouter) {
        listeCds.add(cdAAjouter);
    }

    @Override
    /**
     * affiche le contenu du magasin
     */
    public String toString() {
        String chaineResultat = "";
        //parcours des Cds
        for (int i = 0; i < listeCds.size(); i++) {
            chaineResultat += listeCds.get(i);
        }
        chaineResultat += "nb Cds: " + listeCds.size();
        return (chaineResultat);

    }

    /**
     * @return le nombre de Cds du magasin
     */
    public int getNombreCds() {
        return listeCds.size();
    }

    /**
     * permet d'acceder à un CD
     *
     * @return le cd a l'indice i ou null si indice est non valide
     */
    public CD getCd(int i) {
        CD res = null;
        if ((i >= 0) && (i < this.listeCds.size()))
            res = this.listeCds.get(i);
        return (res);
    }

    /**
     * tri le magasin par album
     */
    public void trierAlbum() {
        int taille = listeCds.size();
        for (int i = 0; i < taille; i++) {
            CD cd = listeCds.get(i);
            CD cdSelectionne = cd;
            int indice = i;
            for (int j = i + 1; j < taille; j++) {
                CD cd2 = listeCds.get(j);
                boolean estAvant = cd2.etreAvantAlbum(cd.getNomCD());
                if (estAvant) {
                    indice = j;
                    cdSelectionne = cd2;
                }
            }
            listeCds.set(indice, cd);
            listeCds.set(i, cdSelectionne);
        }
    }

    public void trierArtiste() {
        ArrayList<CD> artisteTrier = new ArrayList<CD>();
        int caseEnCours = 0;
        for(int i = 0; i < listeCds.size(); i++){
            if(listeCds.get(caseEnCours).getNomArtiste().compareToIgnoreCase(listeCds.get(i).getNomArtiste()) > 0){

            }
        }
    }
}
