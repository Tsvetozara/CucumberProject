package tests.hooks;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class MyHooks {

    @Before("@search")
    public void setup() {
        System.out.println("Browser got opened");
    }

    @After("@search")
    public void tearDown() {
        System.out.println("Browser got closed");
    }
}
