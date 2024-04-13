package com.lus.dawm.EShop.repository;

import org.springframework.data.repository.Repository;

import javax.swing.*;
import java.io.Serializable;
import java.util.List;

public interface UtilisateurRepository<T, ID extends Serializable> extends Repository<T, ID> {
<S extends T> void save (S entity);
T findOne (ID primaryKey);
List<T> findAll();
Long count();
void delete (T entity);
boolean exists (ID primaryKey);
}