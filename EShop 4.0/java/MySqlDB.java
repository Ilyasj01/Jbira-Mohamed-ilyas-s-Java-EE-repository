import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MySqlDB {

  private static final long serialVersionUID = 1L;
  private Connection cn;
  static User user = null;
  static ArrayList<Produit> produits = new ArrayList();

  public MySqlDB() throws ClassNotFoundException, SQLException {
    Class.forName("com.mysql.jdbc.Driver");
    this.cn =
      DriverManager.getConnection(
        "jdbc:mysql://localhost:3306/eshop",
        "root",
        ""
      );
    System.out.print("Connected!");
  }

  public User findUser(String username, String Pwd) throws SQLException {
    PreparedStatement statement =
      this.cn.prepareStatement(
          "SELECT * FROM utilisateur WHERE username=? AND password=?"
        );
    ResultSet resultSet = statement.executeQuery();
    user =
      new User(
        resultSet.getInt("id"),
        resultSet.getString("username"),
        resultSet.getString("password"),
        resultSet.getString("lastname"),
        resultSet.getString("firstname")
      );
    return user;
  }

  public ArrayList<Produit> findAllProduit(
    String username,
    String Pwd,
    HttpServletRequest req,
    HttpServletResponse res
  ) throws SQLException, ServletException, IOException {
    PreparedStatement statement =
      this.cn.prepareStatement("SELECT * FROM produit");
    ResultSet resultSet = statement.executeQuery();
    while (resultSet.next()) {
      Long id = resultSet.getLong("id");
      Long id_Cat = resultSet.getLong("id_categorie");
      double price = resultSet.getDouble("prix");
      String designation = resultSet.getString("designation");
      String description = resultSet.getString("description");
      int qte = resultSet.getInt("qte");
      produits.add(
        new Produit(id, id_Cat, description, qte, designation, price)
      );
    }
    RequestDispatcher dispatch = req.getRequestDispatcher(
      "admin/produit/lister.jsp"
    );
    req.setAttribute("products", produits);
    dispatch.forward(req, res);
    return null;
  }

  public static long getSerialversionuid() {
    return 1L;
  }
}
