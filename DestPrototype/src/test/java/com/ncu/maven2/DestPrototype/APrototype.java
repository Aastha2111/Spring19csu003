package com.ncu.maven2.DestPrototype;

import java.util.concurrent.atomic.AtomicLong;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class APrototype implements DisposableBean{

	
	public static final AtomicLong counter = new AtomicLong(1000);

    private final long id;

    public APrototype() {
        this.id = counter.incrementAndGet();
        System.out.println("A-PrototypeBean(id="+id+") created");
    }

    @PostConstruct
    private void heavyInit() {
        System.out.println("A-PrototypeBean(id="+id+"):  init method");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("A-PrototypeBean(id="+id+"): destroy");
    }
}
