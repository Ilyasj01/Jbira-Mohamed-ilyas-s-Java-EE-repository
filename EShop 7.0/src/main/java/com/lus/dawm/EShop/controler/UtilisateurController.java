package com.lus.dawm.EShop.controler;
import com.lus.dawm.EShop.dto.UtilisateurDTO;
import com.lus.dawm.EShop.mapper.UtilisateurMapper;
import com.lus.dawm.EShop.model.Utilisateur;
import com.lus.dawm.EShop.service.UtilisateurService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.swing.*;
import java.util.List;
import java.util.stream.Collectors;


@Controller
@RequestMapping("/users")
public class UtilisateurController {
    private final UtilisateurService utilisateurService;
    private final UtilisateurMapper utilisateurMapper;

    public UtilisateurController(UtilisateurService utilisateurService, UtilisateurMapper utilisateurMapper) {
        this.utilisateurService = utilisateurService;
        this.utilisateurMapper = utilisateurMapper;
    }

    @GetMapping("/add")
    public String add(Model model) {
        model.addAttribute("utilisateur", new Utilisateur());
        return "admin/user/ajouter";
    }

    @PostMapping("/create")
    public String create(@ModelAttribute Utilisateur utilisateur) {
        this.utilisateurService.createUser(utilisateur);
        return "redirect:/users/show";
    }

    @GetMapping("/show")
    public String show(Model model) {
        List<Utilisateur> utilisateurs = this.utilisateurService.getAllUsers();
        List<UtilisateurDTO> utilisateurDTOs = utilisateurs.stream()
                .map(utilisateurMapper::userTOdto)
                .collect(Collectors.toList());
        model.addAttribute("users", utilisateurDTOs);
        return "admin/user/lister";
    }

    @GetMapping("/showone/{id}")
    public String showOne(Model model, @PathVariable long id) {
        Utilisateur utilisateur = this.utilisateurService.getOne(id);
        UtilisateurDTO utilisateurDTO = utilisateurMapper.userTOdto(utilisateur);
        model.addAttribute("user", utilisateurDTO);
        return "admin/user/singleUser";
    }

    @GetMapping("/delete/{id}")
    public String delete(@PathVariable long id) {
        this.utilisateurService.deleteUser(id);
        return "redirect:/users/show";
    }

    @GetMapping("/update/{id}")
    public String update(@PathVariable long id, Model model) {
        Utilisateur user = this.utilisateurService.getOne(id);
        model.addAttribute("user", user);
        return "admin/user/modifier";
    }

    @PostMapping("/updatee/{id}")
    public String update(@PathVariable long id, @ModelAttribute Utilisateur utilisateur) {
        Utilisateur user = this.utilisateurService.getOne(id);
        user.setNom(utilisateur.getNom());
        user.setPrenom(utilisateur.getPrenom());
        user.setUsername(utilisateur.getUsername());
        user.setPwd(utilisateur.getPwd());
        this.utilisateurService.updateUser(id,user);
        return "redirect:/users/show";
    }
}
