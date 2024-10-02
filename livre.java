package TP2;

class Livre {
    private String titre, auteur;
    private float nbPages;

    public Livre(String auteur, String titre) { 
        this.auteur = auteur;
        this.titre = titre;
    }
    public Livre(){
    	this.nbPages=0;
    }
    public Livre(String titre ,float nbPages) {
    	this.titre=titre;
    	this.nbPages=nbPages;
    }
    public Livre(String auteur, String titre ,float nbPages) { 
        this.auteur = auteur;
        this.titre = titre;
        this.nbPages =nbPages ;
    }
   

    public String getAuteur() { 
        return this.auteur; 
    }
    public String gettitre() {
    	return this.titre ;
    }
    public float getnbPages() {
    	return this.nbPages;
    }
    public void setNbPages(float nb) { 
    	if (nb>20) {
        nbPages = nb;
        }
    	else
    	{System.out.println("les nombre de page n est pas suffisant <20");}
    }
    public void  setauteur(String auteur) {
    	this.auteur = auteur ;  
    }
    public void settitre(String titre) {
    	this.titre=titre;
    }
    public String toString()
    {
    	return("livre intitulé "+titre+"de" +auteur+", contenant" +nbPages+"pages");
    }
    public void decrire()
    {
    	System.out.println(this.toString());
   }
    
    
}
