package br.com.cod3r.abstractfactory.app.service;

import br.com.cod3r.abstractfactory.app.service.factory.EJBAbstractFactory;
import br.com.cod3r.abstractfactory.app.service.factory.RestAbstractFactory;
import br.com.cod3r.abstractfactory.app.service.factory.ServicesAbstractFactory;
import br.com.cod3r.abstractfactory.app.service.services.CarService;
import br.com.cod3r.abstractfactory.app.service.services.UserService;

public class Client {

	public static void main(String[] args) {

		ServicesAbstractFactory factory1 = new EJBAbstractFactory();
		ServicesAbstractFactory factory2 = new RestAbstractFactory();

		UserService userService = factory1.getUserService();
		userService.save("Jhon");
		userService.delete(5);

		CarService carService = factory1.getCarService();
		carService.save("Prius");
		carService.update("Tesla X");

		UserService userService2 = factory2.getUserService();
		userService2.save("Martin");
		userService2.delete(5);

		CarService carService2 = factory2.getCarService();
		carService2.save("Fusca");
		carService2.update("Fuscão preto");
	}
}
