/**
 *
 */
package com.vito16.shop.controller;

import com.vito16.shop.common.Page;
import com.vito16.shop.model.Product;
import com.vito16.shop.service.ProductService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;

/**
 * @author 周欣文
 * @version 2018/10/16
 */
@Controller
@RequestMapping(value = "/product")
public class ProductController {

    private static final Logger logger = LoggerFactory.getLogger(ProductController.class);

    @Autowired
    ProductService productService;

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public ModelAndView listProduct(ModelAndView model, HttpServletRequest request) {
        Page<Product> page = new Page<Product>(request);
        productService.findProducts(page);
        model.addObject("page", page);
        model.setViewName("product/productList");
        return model;
    }

    @RequestMapping(value = "/{id}")
    public String showInfo(@PathVariable Integer id, Model model) {
        Product product = productService.findById(id);
        model.addAttribute("product", product);
        return "product/productView";
    }


}
