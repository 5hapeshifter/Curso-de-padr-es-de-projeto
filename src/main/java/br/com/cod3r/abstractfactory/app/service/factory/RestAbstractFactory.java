package br.com.cod3r.abstractfactory.app.service.factory;

import br.com.cod3r.abstractfactory.app.service.services.*;

public class RestAbstractFactory implements ServicesAbstractFactory {

    @Override
    public UserService getUserService() {
        return new UserRestApiService();
    }

    @Override
    public CarService getCarService() {
        return new CarRestApiService();
    }
}
