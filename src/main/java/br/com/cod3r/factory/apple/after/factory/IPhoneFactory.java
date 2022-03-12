package br.com.cod3r.factory.apple.after.factory;

import br.com.cod3r.factory.apple.after.model.IPhone;

public abstract class IPhoneFactory {

	public IPhone orderIPhone(){

        IPhone device = null;

        device = createIPhone();

        device.getHardware();
        device.assemble();
        device.certificates();
        device.pack();

        return device;

    }

    // Método que deve ser obrigatoriamente implementado por todas as classes que herdam de IPhoneFactory
    public abstract IPhone createIPhone();

}
