package com.learn.LearnSpringBoot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.stereotype.Controller;

@Controller
public class SpringConcepts {
    /*
     * Object of this class created when the application starts and will share the
     * same object (Singleton) across spring framework
     */
    SpringConcepts() {
        System.out.println("SpringConcepts: Object created");
    }

    public void run(ConfigurableApplicationContext applicationContext) {
        TestBean testBean = applicationContext.getBean(TestBean.class);
        testBean.showTestMessage();
    }
}

/*
 * Controller annotation makes TestBean as a Singleton Class Object of this
 * class is created when the application is initialized We can access that
 * object by calling getBean method of application context
 */
@Controller
class TestBean {
    /*
     * Singleton Object is not created because NotAController is not a Spring
     * Controller
     */
    public NotAController controller1;

    /*
     * This member automatically assigned with singleton object which is created for
     * AController class To make this happen we have to use @Autowired annotation
     */
    @Autowired
    public AController controller2;

    TestBean() {
        System.out.println("TestBean: Object created");
    }

    public void showTestMessage() {
        System.out.println("TestBean: Test message");
        System.out.println(controller1); // Prints null
        System.out.println(controller2); // Prints com.learn.LearnSpringBoot.AController@5279dcc1
    }
}

class NotAController {
    NotAController() {
        System.out.println("NotAController: Object created");
    }
}

@Controller
class AController {
    AController() {
        System.out.println("AController: Object created");
    }
}