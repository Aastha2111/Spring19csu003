package com.ncu.maven2.DestPrototype;

import java.util.concurrent.atomic.AtomicLong;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class BPrototype implements DisposableBean  {
	 public static final AtomicLong counter = new AtomicLong(100);

	    private final long id;

	    public BPrototype() {
	        this.id = counter.incrementAndGet();
	        System.out.println("B-PrototypeBean(id="+id+") created");
	    }

	    @PostConstruct
	    private void heavyInit() {
	        System.out.println("B-PrototypeBean(id="+id+"):  init");
	    }

	    @Override
	    public void destroy() throws Exception {
	        System.out.println("B-PrototypeBean(id="+id+"): destroy");
	    }
}
