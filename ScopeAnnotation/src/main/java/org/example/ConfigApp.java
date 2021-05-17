package org.example;
import org.springframework.context.annotation.*;

@Configuration
@ComponentScan("org.example")
public class ConfigApp {
    @Bean
    public FortuneService fortuneService1(){
        return new FortuneService();
    }

    @Lazy
    @Bean
    public Coach cricketCoach1(){
        return new CricketCoach(fortuneService1());
    }

    @Lazy
    @Bean
    public CricketCoach cricketCoach2(){
        return new CricketCoach(fortuneService1());
    }
}
