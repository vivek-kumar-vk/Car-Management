package com.smngpg.carManProj;

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

@WebServlet("/deleteCar")
public class DeleteCarServlet extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		int carId=Integer.parseInt(req.getParameter("carId"));
		
		Session session= new Configuration().configure().addAnnotatedClass(Car.class).buildSessionFactory().openSession();
		Transaction begin = session.beginTransaction();
		//Search data
		Car car=session.get(Car.class, carId);
		//Delete data
		session.delete(car);
		//Fetch data
		Query<Car> query=session.createQuery("From Car");
		List<Car> cars=query.list();
		begin.commit();
		session.close();
		
		req.setAttribute("carList", cars);
		RequestDispatcher requestDispatcher = req.getRequestDispatcher("DisplayAllCars.jsp");
		requestDispatcher.forward(req, resp);
	}
}