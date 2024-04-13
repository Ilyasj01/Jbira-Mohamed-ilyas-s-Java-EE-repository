package com.lus.dawm.EShop.service;
import com.lus.dawm.EShop.model.Utilisateur;
import com.lus.dawm.EShop.repository.UtilisateurRepository;
import org.springframework.stereotype.Service;
import javax.swing.*;
import java.util.List;

@Service
public class UtilisateurService {
    private final UtilisateurRepository utilisateurRepository;

    public UtilisateurService(UtilisateurRepository utilisateurRepositoryy) {
        this.utilisateurRepository = utilisateurRepositoryy;
    }

    public List<Utilisateur> getAllUsers() {
        return this.utilisateurRepository.findAll();
    }

    public void createUser(Utilisateur utilisateur) {
        this.utilisateurRepository.save(utilisateur);
    }

    public void deleteUser(Long id) {
        this.utilisateurRepository.delete(id);
    }

    public Utilisateur getOne(long id){
        return (Utilisateur) this.utilisateurRepository.findOne(id);
    }

    public  Utilisateur updateUser(long id, Utilisateur utilisateur) {
        Utilisateur user = (Utilisateur) this.utilisateurRepository.findOne(id);
        user.setNom(utilisateur.getNom());
        user.setPrenom(utilisateur.getPrenom());
        user.setUsername(utilisateur.getUsername());
        user.setPwd(utilisateur.getPwd());
        this.utilisateurRepository.save(user);
        return (Utilisateur) this.utilisateurRepository.findOne(id);
    }
}
