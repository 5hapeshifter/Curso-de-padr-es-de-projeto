package br.com.cod3r.abstractfactory.apple;

import br.com.cod3r.abstractfactory.apple.factory.IPhone11Factory;
import br.com.cod3r.abstractfactory.apple.factory.IPhoneFactory;
import br.com.cod3r.abstractfactory.apple.factory.IPhoneXFactory;
import br.com.cod3r.abstractfactory.apple.factory.abstractFactory.BrazilianRulesAbstractFactory;
import br.com.cod3r.abstractfactory.apple.factory.abstractFactory.CountryRulesAbstractFactory;
import br.com.cod3r.abstractfactory.apple.factory.abstractFactory.USRulesAbstractFactory;
import br.com.cod3r.abstractfactory.apple.model.iphone.IPhone;

public class Client {
	
	public static void main(String[] args) {

		CountryRulesAbstractFactory brazilianRulesAbstractFactory = new BrazilianRulesAbstractFactory();
		CountryRulesAbstractFactory usRulesAbstractFactory = new USRulesAbstractFactory();

		IPhoneFactory genXFactory = new IPhoneXFactory(brazilianRulesAbstractFactory);
		IPhoneFactory gen11Factory = new IPhone11Factory(usRulesAbstractFactory);

		System.out.println("######### Ordering an iPhone X");
		IPhone iphone1 = genXFactory.orderIPhone("standard");
		System.out.println(iphone1);

		System.out.println("######### Ordering an iPhone X");
		IPhone iphone2 = gen11Factory.orderIPhone("highEnd");
		System.out.println(iphone2);

	}
}
