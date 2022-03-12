package br.com.cod3r.factory.apple.halfSimple.factory;

import br.com.cod3r.factory.apple.halfSimple.model.IPhone;

public abstract class IPhoneFactory {

	public IPhone orderIPhone(String level){

        IPhone device = null;

        device = createIPhone(level);

        device.getHardware();
        device.assemble();
        device.certificates();
        device.pack();

        return device;

    }

    // M�todo que deve ser obrigatoriamente implementado por todas as classes que herdam de IPhoneFactory
    public abstract IPhone createIPhone(String level);

}
