import java.io.Serializable;

public class Produit implements Serializable {

  private static final long serialVersionUID = 1L;
  private Long id;
  private Long id_Cat;
  private double prix;
  private String description;
  private int qte;
  private String designation;

  public Produit(
    Long id,
    Long id_Cat,
    String description,
    int qte,
    String designation,
    double prix
  ) {
    this.id = id;
    this.id_Cat = id_Cat;
    this.prix = prix;
    this.description = description;
    this.qte = qte;
    this.designation = designation;
  }

  public Long getId() {
    return this.id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getDescription() {
    return this.description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public int getQte() {
    return this.qte;
  }

  public void setQte(int qte) {
    this.qte = qte;
  }

  public String getDesignation() {
    return this.designation;
  }

  public void setDesignation(String designation) {
    this.designation = designation;
  }

  public Long getId_Cat() {
    return this.id_Cat;
  }

  public void setId_Cat(Long id_Cat) {
    this.id_Cat = id_Cat;
  }

  public double getPrix() {
    return this.prix;
  }

  public void setPrix(double prix) {
    this.prix = prix;
  }
}
