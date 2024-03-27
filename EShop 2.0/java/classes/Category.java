import java.io.Serializable;


public class Category implements Serializable {
    private Long id;
    private String designation;
    private String description;


   public Category() {
    }


   public Long getId() {
        return id;
    }


   public void setId(Long id) {
        this.id = id;
    }


   public String getDesignation() {
        return designation;
    }


   public void setDesignation(String designation) {
        this.designation = designation;
    }


   public String getDescription() {
        return description;
    }


   public void setDescription(String description) {
        this.description = description;
    }
}