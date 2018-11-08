package com.gigroup.servlets;

import java.io.IOException;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.gigroup.domain.Detail;
import com.gigroup.domain.User;
import com.gigroup.services.DetailRepository;
import com.gigroup.services.Repository;
import com.gigroup.services.Repository2;
import com.gigroup.services.RepositoryImpl;
import com.gigroup.services.UserRepository;
import com.google.gson.Gson;

/**
 * Servlet implementation class MainServlet
 */
@WebServlet(urlPatterns = {"/MainServlet"})
public class MainServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	Repository2<User> userRepo = new RepositoryImpl<User>();
	Repository2<Detail> detailRepo = new RepositoryImpl<Detail>();

    /**
     * Default constructor. 
     */
    public MainServlet() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Servlet#init(ServletConfig)
	 */
	public void init(ServletConfig config) throws ServletException {
		// Eseguito solo una volta
		userRepo.insertOne(new User("mario", "rossi"));
		userRepo.insertOne(new User("giuseppe", "verdi"));
		userRepo.insertOne(new User("carlo", "bianchi"));
		userRepo.insertOne(new User("alberto", "primo"));
		
		detailRepo.insertOne(new Detail("address 1"));
		
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// tipi di response
		// restituire un json
		// conversioni
		
		// Creo un utente
		User u = new User("mario","rossi");
		u.setCity("Catania");
		
		request.setAttribute("user", u); // dove va a finire?
		
		request.getRequestDispatcher("/pages/result.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("doPost performed");
		
	}

}
