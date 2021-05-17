package org.example;

public class CricketCoach implements Coach {

    private FortuneService fortuneService;

    CricketCoach(FortuneService fortuneService){
        this.fortuneService = fortuneService;
        System.out.println(fortuneService.getFortune());
    }

    @Override
    public String getWorkout() {
        return "Practise straight drive for 1 hr";
    }

    public String getAdvice(){
        return "Keep your head straight";
    }
}
