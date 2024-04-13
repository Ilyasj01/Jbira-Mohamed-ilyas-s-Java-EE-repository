package com.lus.dawm.EShop.mapper;


import com.lus.dawm.EShop.dto.UtilisateurDTO;
import com.lus.dawm.EShop.model.Utilisateur;

public class UtilisateurMapper {
public UtilisateurDTO userTOdto(Utilisateur utilisateur){
    UtilisateurDTO user= new UtilisateurDTO();
    user.setId(utilisateur.getId());

    user.setPrenom(utilisateur.getPrenom());
    user.setNom(utilisateur.getNom());
    user.setUsername(utilisateur.getUsername());
    user.setPwd(utilisateur.getPwd());
    return user;
}
public static Utilisateur dtoTOuser (UtilisateurDTO utilisateurDTO){
    Utilisateur user= new Utilisateur();
        user.setId(utilisateurDTO.getId());

    user.setPrenom(utilisateurDTO.getPrenom());
    user.setNom(utilisateurDTO.getNom());
        user.setUsername(utilisateurDTO.getUsername());
        user.setPwd(utilisateurDTO.getPwd());
        return user;
}
}
