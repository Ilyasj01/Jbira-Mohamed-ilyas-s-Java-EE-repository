import java.io.Serializable;

public class LigneCommande implements Serializable {
    private Double prix;
    private int qte;

    public LigneCommande() {
    }

    public Double getPrix() {
        return prix;
    }

    public void setPrix(Double prix) {
        this.prix = prix;
    }

    public int getQte() {
        return qte;
    }

    public void setQte(int qte) {
        this.qte = qte;
    }
}
