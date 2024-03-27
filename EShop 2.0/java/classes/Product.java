import java.io.Serializable;


public class Product implements Serializable {
    private Long id;
    private int qte;
    private String designation;


   public Product() {}


    public Long getId() {
        return id;
    }


   public void setId(Long id) {
        this.id = id;
    }


   public int getQte() {
        return qte;
    }


   public void setQte(int qte) {
        this.qte = qte;
    }


   public String getDesignation() {
        return designation;
    }


   public void setDesignation(String designation) {
        this.designation = designation;
    }
}