import java.io.Serializable;

public class User implements Serializable {

  private static final long serialVersionUID = 1L;
  private int id;
  private String username;
  private String pwd;
  private String lastname;
  private String firstname;

  public User() {}

  public User(int id,String username,String pwd,String lastname,String firstname) {
    this.id = id;
    this.username = username;
    this.pwd = pwd;
    this.lastname = lastname;
    this.firstname = firstname;
  }

  public int getId() {
    return this.id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getNom() {
    return this.username;
  }

  public void setNom(String nom) {
    this.username = nom;
  }

  public String getPwd() {
    return this.pwd;
  }

  public void setPwd(String pwd) {
    this.pwd = pwd;
  }

  public String getLastname() {
    return this.lastname;
  }

  public void setLastname(String lastname) {
    this.lastname = lastname;
  }

  public String getFirstname() {
    return this.firstname;
  }

  public String getUsername() {
    return this.username;
  }

  public void setUsername(String username) {
    this.username = username;
  }

  public void setFirstname(String firstname) {
    this.firstname = firstname;
  }
}
