package modele;

import java.util.ArrayList;

public class Mois {

	protected String mois;
	protected String annee;
	protected ArrayList<Jour> lesJours;
	protected ArrayList<Temperature> lesTemperatures;
	
	public Mois() {
		super();
	}

	public String getMois() {
		return mois;
	}
	public void setMois(String mois) {
		this.mois = mois;
	}
	public String getAnnee() {
		return annee;
	}

	public void setAnnee(String annee) {
		this.annee = annee;
	}
	
	
	public ArrayList<Jour> getLesJours() {
		return lesJours;
	}

	public void setLesJours(ArrayList<Jour> lesJours) {
		this.lesJours = lesJours;
	}

	public void addUnJour(Jour unJour){
        if (lesJours == null){
            lesJours = new ArrayList<Jour>();
        }
        lesJours.add(unJour);
    }
	
	public ArrayList<Temperature> getLesTemperatures() {
		return lesTemperatures;
	}
	public void setLesTemperatures(ArrayList<Temperature> lesTemperatures) {
		this.lesTemperatures = lesTemperatures;
	}
	public void addUneTemperature(Temperature uneTemperature){
        if (lesTemperatures == null){
            lesTemperatures = new ArrayList<Temperature>();
        }
        lesTemperatures.add(uneTemperature);
    }
}
