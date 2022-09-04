
public class Pangolin {
	protected String nom;
    private int nbEcailles;

	public Pangolin(String nom, int nbEcailles) {
        this.nom = nom;
        this.setNbEcailles(nbEcailles);
    }
    

    public String getNom() {
		return nom;
	}


	public void setNom(String nom) {
		this.nom = nom;
	}


	public int getNbEcailles() {
        return nbEcailles;
    }

    public void setNbEcailles(int nb) {
        if (nb <= 0) {
            throw new IllegalArgumentException("Le nombre d'écailles doit être strictement positif !");
        }
        this.nbEcailles = nb;
    }





	@Override
	public String toString() {
		return "Pangolin [nom=" + nom + ", nbEcailles=" + nbEcailles + "]";
	}


	public void crier() {
        System.out.println("Gwwark Rhââgn Bwwikk"); // Cri du pangolin
    }
}
