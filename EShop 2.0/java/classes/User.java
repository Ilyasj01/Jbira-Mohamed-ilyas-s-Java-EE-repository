import java.io.Serializable;

public class User implements Serializable{

	private long id;
	private String name ;
	private String password;
	private String email;
	private String prenom;
	
	public User(){}

	long idGet() {
		return this.id;
	}
	String passwordGet() {
		return this.password;
	}
	String emailGet() {
		return this.email;
	}
	String prenomGet() {
		return this.prenom;
	}
	String nameGet() {
		return this.name;
	}
	
	void idSet(long id) {
		 this.id=id;
	}
	void passwordSet(String password) {
		 this.password=password;
	}
	void emailSet(String email) {
		 this.email=email;
	}
	void prenomSet(String prenom) {
		 this.prenom=prenom;
	}
	void nameSet(String name) {
		 this.name=name;
	}
	
}