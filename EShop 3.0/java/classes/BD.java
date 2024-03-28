package classes;

import java.util.ArrayList;
import java.util.List;

public class BD {
    public static List<Produit> produit = new ArrayList();

    public BD() {
    }

    public static void addProduit(Produit produit) {
        BD.produit.add(produit);
    }
}
