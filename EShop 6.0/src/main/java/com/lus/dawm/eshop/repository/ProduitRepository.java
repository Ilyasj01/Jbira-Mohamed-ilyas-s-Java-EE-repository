package com.lus.dawm.eshop.repository;

import com.lus.dawm.eshop.model.Produit;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProduitRepository extends JpaRepository<Produit, Long> {
}
