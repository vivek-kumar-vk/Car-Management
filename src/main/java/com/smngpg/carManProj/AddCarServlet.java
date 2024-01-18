package com.smngpg.carManProj;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

@WebServlet("/addNewCarDet")
public class AddCarServlet extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		int carId=Integer.parseInt(req.getParameter("carId"));
		String carModel=req.getParameter("carModel");
		String carBrand=req.getParameter("carBrand");
		int carPrice=Integer.parseInt(req.getParameter("carPrice"));
		Car c=new Car();
		c.setCarId(carId);
		c.setCarModel(carModel);
		c.setCarBrand(carBrand);
		c.setCarPrice(carPrice);
		
		Configuration cfg=new Configuration().configure().addAnnotatedClass(Car.class);
		SessionFactory sf=cfg.buildSessionFactory();
		Session s=sf.openSession();
		Transaction t=s.beginTransaction();
		s.save(c);
		t.commit();
		s.close();
		
		resp.sendRedirect("index.jsp");
		
		
	}
}
