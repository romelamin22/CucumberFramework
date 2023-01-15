package tags.hooks;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class hooks {

    @Before("@SmokeTest")
    public void doBefore(){

        System.out.println("________Before One_______");

    }

    @Before(order = 0)
    public void doBeforeTwo(){

        System.out.println("________Before Two_______");

    }

    @After(order = 1)
    public void doAfter(){

        System.out.println("________After One_______");

    }

    @After(order = 0)
    public void doAfterTwo(){

        System.out.println("________After Two_______");

    }



}
