package com.vivek.carManagementProject;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

@WebServlet("/displayAllCars")
public class DisplayAllCarsServlet extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		Session session= new Configuration().configure().addAnnotatedClass(Car.class).buildSessionFactory().openSession();
		Transaction begin = session.beginTransaction();
		
		Query<Car> query=session.createQuery("From Car");
		List<Car> cars=query.list();
		begin.commit();
		session.close();
		
		req.setAttribute("carList", cars);
		RequestDispatcher requestDispatcher = req.getRequestDispatcher("DisplayAllCars.jsp");
		requestDispatcher.forward(req, resp);
	}
}
