package br.com.cod3r.factory.apple.after;

import br.com.cod3r.factory.apple.after.factory.*;
import br.com.cod3r.factory.apple.after.model.IPhone;

public class Client {
	
	public static void main(String[] args) {

		IPhoneFactory iphone11Factory = new IPhone11Factory();
		IPhoneFactory iphone11ProFactory = new IPhone11ProFactory();
		IPhoneFactory iphoneXFactory = new IPhoneXFactory();
		IPhoneFactory iphoneXSMaxFactory = new IPhoneXSMaxFactory();


		System.out.println("### Ordering an iphone 11");
		IPhone iphone1 = iphone11Factory.orderIPhone();
		System.out.println(iphone1);

		System.out.println("### Ordering an iphone 11 pro");
		IPhone iphone2 = iphone11ProFactory.orderIPhone();
		System.out.println(iphone2);

		System.out.println("### Ordering an iphone x");
		IPhone iphone3 = iphoneXFactory.orderIPhone();
		System.out.println(iphone3);

		System.out.println("### Ordering an iphone xs max");
		IPhone iphone4 = iphoneXSMaxFactory.orderIPhone();
		System.out.println(iphone4);
	}
}
