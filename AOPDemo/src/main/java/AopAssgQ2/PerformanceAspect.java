package AopAssgQ2;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;

@Aspect
@Component
@EnableAspectJAutoProxy
public class PerformanceAspect {

	Long startTime,endTime;

    @Pointcut("execution(* logic(..))")
    public void myPointCut(){}

    @Before("myPointCut()")
    public void beforeLogic(){
        System.out.println("Before logic");
        startTime = System.currentTimeMillis();
    }

    @After("myPointCut()")
    public void afterLogic(){
        endTime = System.currentTimeMillis();
        System.out.println("Time taken is: "+(endTime-startTime)+"ms");
        System.out.println("After Logic");
    }
}
