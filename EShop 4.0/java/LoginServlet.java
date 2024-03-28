import java.io.IOException;
import java.sql.SQLException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class LoginServlet extends HttpServlet {

  private static final long serialVersionUID = 1L;

  public LoginServlet() {}

  protected void doPost(HttpServletRequest request,HttpServletResponse response) throws ServletException, IOException {
    String username = request.getParameter("username");
    String password = request.getParameter("password");
    try {
      MySqlDB db = new MySqlDB();
      User user = db.findUser(username, password);
      if (user != null) {
        HttpSession session = request.getSession();
        session.setAttribute("user", user);
        response.sendRedirect("admin/produit/lister.jsp");
      } else {
        response.sendRedirect("login.jsp?error=1");
      }
    } catch (ClassNotFoundException | SQLException var8) {
      response.sendRedirect("error.jsp?message=Erreur%20interne");
    }
  }
}
