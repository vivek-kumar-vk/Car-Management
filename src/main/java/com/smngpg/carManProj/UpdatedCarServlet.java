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

@WebServlet("/updateData")
public class UpdatedCarServlet extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		int carId=Integer.parseInt(req.getParameter("carId"));
		String carModel=req.getParameter("carModel");
		String carBrand=req.getParameter("carBrand");
		int carPrice=Integer.parseInt(req.getParameter("carPrice"));
		Car c=new Car();
		c.setCarId(carId);
		c.setCarModel(carModel);
		c.setCarBrand(carBrand);
		c.setCarPrice(carPrice);
		
		Session session= new Configuration().configure().addAnnotatedClass(Car.class).buildSessionFactory().openSession();
		Transaction begin = session.beginTransaction();
		
		session.update(c);
		Query<Car> query=session.createQuery("From Car");
		List<Car> cars=query.list();
		begin.commit();
		session.close();
		
		req.setAttribute("carList", cars);
		RequestDispatcher requestDispatcher = req.getRequestDispatcher("DisplayAllCars.jsp");
		requestDispatcher.forward(req, resp);
	}
}