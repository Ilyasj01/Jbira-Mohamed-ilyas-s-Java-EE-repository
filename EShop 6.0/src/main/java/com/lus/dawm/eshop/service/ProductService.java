package com.lus.dawm.eshop.service;

import com.lus.dawm.eshop.model.Produit;
import com.lus.dawm.eshop.repository.ProduitRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService {
    private final ProduitRepository productRepository;

    public ProductService(ProduitRepository productRepository) {
        this.productRepository = productRepository;
    }

    public List<Produit> getAllProducts() {
        return this.productRepository.findAll();
    }

    public void createProduct(Produit product) {
        this.productRepository.save(product);
    }

    public void deleteProduct(Long id) {
        this.productRepository.deleteById(id);
    }

    public Optional<Produit> updateProduct(long id, Produit produit) {
        Produit NoSuchFieldException = null;
        Produit prod = this.productRepository.findById(id).orElse(NoSuchFieldException);
        prod.setCategorie(produit.getCategorie());
        prod.setDesignation(produit.getDesignation());
        prod.setDescription(produit.getDescription());
        prod.setQte(produit.getQte());
        this.productRepository.save(prod);
        return this.productRepository.findById(id);
    }
}
