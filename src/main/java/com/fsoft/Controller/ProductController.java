package com.fsoft.Controller;

import com.fsoft.Model.Product.Product;
import com.fsoft.Model.Product.ProductNotFoundException;
import com.fsoft.Model.Product.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
public class ProductController {
    @Autowired
    private ProductService service;

    @GetMapping("/products/add")
    public String showFormProduct(Model model, HttpSession session, RedirectAttributes ra) {
        int tou =0;
        if(session.getAttribute("tou")!=null){

            tou=(int) session.getAttribute("tou");
        }
        if (tou == 1) {
            String idu = "admin";
            model.addAttribute("product", new Product());
            model.addAttribute("idu", idu);
            return "addproducts";
        } else {
            ra.addFlashAttribute("message", "This is Admin Page");
            return "redirect:/products/show";
        }


    }
    @PostMapping("/products/add")
    public String addNewProduct(Model model,Product product){
        service.save(product);
        String idu = "admin";
        model.addAttribute("product", new Product());
        model.addAttribute("idu", idu);
        return "addproducts";

    }

    @GetMapping("/products/show")
    public String showProduct(Model model, HttpSession session) {
        int tou =0;
        if(session.getAttribute("tou")!=null){

            tou=(int) session.getAttribute("tou");
        }

        if (tou == 1) {
            String idu = "admin";
            model.addAttribute("idu", idu);
            return "addproducts";
        } else {
            if (session.getAttribute("username") != null) {
                String idu = session.getAttribute("username").toString();
                model.addAttribute("idu", idu);
            }
            List<Product> listProducts = service.listAll();
            model.addAttribute("listProducts", listProducts);
            return "showproducts";
        }

    }

    @GetMapping("/products/show/{id}")
    public String showDetails(@PathVariable("id") Long id, Model model, HttpSession session) {
        try {
            int tou =0;
            if(session.getAttribute("tou")!=null){

                tou=(int) session.getAttribute("tou");
            }
            if (tou == 1) {
                String idu = "admin";
                model.addAttribute("idu", idu);
                return "addproducts";
            } else {
                Product product = service.get(id);
                model.addAttribute("products", product);
                return "detailproduct";
            }
        } catch (ProductNotFoundException e) {
            e.printStackTrace();
        }
        return "index";
    }
}

