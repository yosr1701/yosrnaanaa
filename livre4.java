package TP2;

class livre4{
private String titre, auteur;
private float nbPages;
private double prix;
private boolean prixFixe=true;
public livre4 (String  auteur,String titre,double prix,float nbPages) {
	this.auteur = auteur;
	this.titre = titre;
	this.prix=this.prix+(prix*0.18);
	this.nbPages=nbPages;
	}
	public livre4 (String  auteur,String titre) {
	this.auteur = auteur;
	this.titre = titre;
	}
	public livre4 ()
	{
		this.nbPages=0;
	}
	public livre4 (float nbPages,String titre) {
		this.nbPages = nbPages;
		this.titre = titre;
		}
	public livre4 (float nbPages,String titre,String auteur) {
		this.nbPages = nbPages;
		this.titre = titre;
		this.auteur=auteur;
		}
	public String getAuteur() {
	return auteur;
	}
	public void setNbPages (float nb) {
		if (nb>20)
		{
			this.nbPages = nb;
		}
		else
			System.out.println("les nombre de page n est pas suffisant car <20.");
		this.nbPages = nb;
}
	public String getTitre()
	{
		return this.titre;
	}
	public float getnbP()
	{
		return this.nbPages;
	}
	public void setAuteur(String ch)
	{
		this.auteur=ch;
	}
	public void setTitre(String ch)
	{
		this.titre=ch;
	}
	public String toString() {
	    return ("Livre intitulé : " + this.titre + " contenant " + this.nbPages + " pages.\n");
	}
	public void decrire()
	{
		System.out.print(this.toString());
	}
	public void setPrix(double x)
	{
		this.prix=this.prix+(prix*0.18);
		this.prixFixe=false;
	}
	public double getPrix()
	{
		return this.prix;
	}
	public boolean testPrix()
	{
		if (this.prix!=0)
			return true;
		else
			return false;
	}
}
