package AopAssgnQ3;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Aspect
@Component
@EnableAspectJAutoProxy
@Order(2)
public class MyLoggingDemoAspect {

	@Before("execution(* getName(..))")
    public void BeforeSetName(){
        System.out.println("Inside---- Before "+this.getClass().getName());

    }

    @After("execution(* getName(..))")
    public void AfterSetName(){
        System.out.println("Inside ---- After "+this.getClass().getName());
    }
}
