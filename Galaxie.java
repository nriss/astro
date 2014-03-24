package packAstro;

import Gestionnaire.Univers;

import java.util.ArrayList; 

// <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
// #[regen=yes,id=DCE.74CF5448-D76E-6A08-B021-272428E9BE9E]
// </editor-fold> 
public class Galaxie {

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.63D594EA-41C9-F06D-5C7A-9C2A60CC1BD8]
    // </editor-fold> 
    private ArrayList<Etoile> mEtoile;

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.1BDC431A-B6A6-52F6-671B-8E8269227E99]
    // </editor-fold> 
    private String nom;

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.1F58FB25-407C-2439-AF9F-C6793D690F9F]
    // </editor-fold> 
    private String type;

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.059AD1E2-DF64-9EAD-E381-EC6C7C627D36]
    // </editor-fold> 
    private int eloignement;

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.9724679A-56A4-F46F-AA33-51E765911DA7]
    // </editor-fold> 
    public Galaxie (String nom, String type, int eloignement) {
        this.nom = nom;
        this.type = type;
        this.eloignement = eloignement;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.06EEFD39-C3ED-8A84-E038-D2AF7DD7FD4F]
    // </editor-fold> 
    public ArrayList<Etoile> ListeEtoiles () {
        return null;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.44A6CBD5-BF02-EC4D-3128-F45B18D5720D]
    // </editor-fold> 
    public ArrayList<Etoile> getEtoile () {
        return mEtoile;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.51EAA614-C4CC-2DB5-8A56-82C5BFC7E25B]
    // </editor-fold> 
    public void setEtoile (ArrayList<Etoile> val) {
        this.mEtoile = val;
    }

}

