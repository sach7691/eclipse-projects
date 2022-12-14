package com.ab.controllers;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ab.daos.CustomerDAO;
import com.ab.daos.CustomerDatabaseDAOImpl;
import com.ab.models.Customer;
import com.ab.services.CustomerService;
import com.ab.services.CustomerServiceImpl;

/**
 * Servlet implementation class LoginCustomerServlet
 */
@WebServlet("/LoginCustomerServlet")
public class LoginCustomerServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginCustomerServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

			String customerEmail = request.getParameter("customerEmail");
			String customerpassword = request.getParameter("customerpassword");
			
			Customer cus = new Customer(customerEmail, customerpassword);
			
			CustomerDAO dao = new CustomerDatabaseDAOImpl();
			
			CustomerService customerService = new CustomerServiceImpl(dao);
			
			String loggedInCustomer = customerService.loginCustomers(cus);
			
			if(loggedInCustomer.equals("Successful")) {
				
				response.sendRedirect("dashboard.jsp");
				
			}else {
				
				response.sendRedirect("login.jsp");
				
			}
	}

}
