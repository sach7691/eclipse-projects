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
 * Servlet implementation class CustomerRegistrationServlet
 */
@WebServlet("/CustomerRegistration")
public class CustomerRegistrationServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CustomerRegistrationServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
          
		//write a code to retrieve customer 
		
		String firstName = request.getParameter("firstName");
		String lastName = request.getParameter("lastName");
		String customerEmail = request.getParameter("customerEmail");
		String customerpassword = request.getParameter("customerpassword");
		
		//create a model object
		
		Customer cus = new Customer(firstName, lastName, customerEmail, customerpassword);
		
		CustomerDAO dao = new CustomerDatabaseDAOImpl();
		
		CustomerService customerService = new CustomerServiceImpl(dao);
		
		Customer registeredCustomer = customerService.registerCustomers(cus);
		
		if(registeredCustomer != null) {
			
			response.sendRedirect("register_success.jsp");
			
		}else {
			
			response.sendRedirect("register_failed.jsp");
		}

		
		
		
	}

}
