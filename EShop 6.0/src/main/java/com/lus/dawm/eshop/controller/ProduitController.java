    package com.lus.dawm.eshop.controller;
    import com.lus.dawm.eshop.model.Produit;
    import com.lus.dawm.eshop.service.ProductService;
    import org.springframework.stereotype.Controller;
    import org.springframework.ui.Model;
    import org.springframework.web.bind.annotation.*;

    import java.util.List;

    @Controller
    @RequestMapping("/admin/produit/")
    public class ProduitController {
        private final ProductService ProductService;

        public ProduitController(ProductService productService) {

            this.ProductService = productService;
        }

        @GetMapping("ajouter")
        public String create(Model model) {
            model.addAttribute("product", new Produit());
            return "redirect:admin/produit/ajouter";
        }

        @PostMapping("add")
        public String add(@ModelAttribute Produit product) {
            this.ProductService.createProduct(product);
            return "redirect:admin/produit/lister";
        }

        @GetMapping("lister")
        public String show(@ModelAttribute Produit product, Model model) {
            List<Produit> prod = this.ProductService.getAllProducts();
            model.addAttribute(prod.toString(),"products");
            return "redirect:admin/produit/lister";
        }

        @GetMapping("suprimer")
        public String delete(@RequestParam long id) {
            this.ProductService.deleteProduct(id);
            return "redirect:admin/produit/suprimer";
        }

        @GetMapping("modifier")
        public String modifier(@RequestParam long id, @ModelAttribute Produit product) {
            this.ProductService.updateProduct(id, product);
            return "redirect:admin/produit/lister";
        }
    }

