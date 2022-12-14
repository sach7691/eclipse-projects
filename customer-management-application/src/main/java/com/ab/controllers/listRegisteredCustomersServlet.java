package com.ab.controllers;
import java.io.IOException;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import com.ab.daos.CustomerDAO;
import com.ab.daos.CustomerDatabaseDAOImpl;
import com.ab.models.Customer;
import com.ab.services.CustomerService;
import com.ab.services.CustomerServiceImpl;

/**
 * Servlet implementation class listRegisteredCustomersServlet
 */
@WebServlet("/listRegisteredCustomersServlet")
public class listRegisteredCustomersServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public listRegisteredCustomersServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		CustomerDAO dao = new CustomerDatabaseDAOImpl();
		
		CustomerService customerService = new CustomerServiceImpl(dao);
		
		List<Customer> customerList = customerService.listRegisteredCustomers();
		
		
		
		//Create a session object ==> the result would be available until session is active
		
		HttpSession session = request.getSession(true); //true because if session is not created it permits to create again
		
		//now we can store list of customers in session
		
		session.setAttribute("cList", customerList);
		
		response.sendRedirect("dashboard.jsp");
		
	}


}
