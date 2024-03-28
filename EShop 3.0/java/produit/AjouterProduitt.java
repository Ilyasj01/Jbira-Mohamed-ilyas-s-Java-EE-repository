package produit;

import classes.BD;
import classes.Produit;
import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class AjouterProduitt extends HttpServlet {

  private static final long serialVersionUID = 1L;

  public AjouterProduitt() {}

  protected void doPost(
    HttpServletRequest request,
    HttpServletResponse response
  ) throws ServletException, IOException {
    String quantite = request.getParameter("qte");
    String description = request.getParameter("desc");
    String designation = request.getParameter("desi");
    BD.addProduit(
      new Produit(description, Integer.valueOf(quantite), designation)
    );
    RequestDispatcher dispatch = request.getRequestDispatcher("lister.jsp");
    dispatch.forward(request, response);
  }
}
