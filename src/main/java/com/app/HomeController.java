package com.app;

import java.util.ArrayList;

import org.apache.tomcat.jni.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.dao.CustomerDaoImpl;
import com.dao.ProductDAO;
import com.dao.ProductDaoImpl;
import com.dao.UserDAO;
import com.model.Customer;
import com.model.Product;

@Controller
public class HomeController {

	public HomeController() {
		System.out.println("----HOmeController loaded-----");
	}

	@RequestMapping("/")
	public String showIndex() {
		System.out.println("----inside showIndex-----");
		return "index";/// WEB-INF/views/index.jsp

	}

	@RequestMapping("/login")
	public String showLogin() {

		System.out.println("------inside showLogin------");
		return "login";

	}
//	@RequestMapping("/register")
//	public String showRegister() {
//
//		System.out.println("------inside showRegister------");
//		return "register";
//
//	}

	CustomerDaoImpl custDao = new CustomerDaoImpl();

	@PostMapping("/chklogin")
	public String checkCustomerLogin(@RequestParam("txtusername") String username, @RequestParam("txtpwd") String pwd,ModelMap map) {
		// get user name
		// get pwd
		System.out.println("UserNAme:" + username + "    " + pwd);
		// BL----->model

		Customer cust = custDao.validateCustomer(username, pwd);
		if (cust != null) {
			System.out.println(cust);
			map.addAttribute("customer",cust);
			//get all prds
			//add prds in map 
			ProductDaoImpl prdDao=new ProductDaoImpl();
			ArrayList<Product> list=prdDao.getAllProducts();
			map.addAttribute("prds", list);
			return "shopping";

		} else {
			return "login";
		}
	}
	
//    @Autowired
//    private UserDAO userDAO;
// 
//    @PostMapping("/register")
//    public String processRegistrationForm(@ModelAttribute("user") User user) {
//        userDAO.saveUser(user);
//        return "redirect:/login";
//    
//       }
}
	
	
	
//	@Controller
//	public class UserController {
	 
//	    @GetMapping("/register")
//	    public String showRegistrationForm(Model model) {
//	        model.addAttribute("user", new User());
//	        return "registration";
//	    }
//	 
//	    @PostMapping("/register")
//	    public String processRegistrationForm(@ModelAttribute("user") User user) {
//	        // Save the user to the database
//	        return "redirect:/login";
//	    }
//	    
	    
	   
	     

	     
	    
//
//	 
//	
	

