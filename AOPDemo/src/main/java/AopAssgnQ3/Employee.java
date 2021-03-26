package AopAssgnQ3;

import org.springframework.stereotype.Component;

@Component

public class Employee {
	String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
