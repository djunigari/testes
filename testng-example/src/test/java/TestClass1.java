import org.testng.annotations.Test;

import javax.annotation.PostConstruct;

public class TestClass1 extends  BaseApplicationTest{
    public TestClass1(){
         System.out.println("TestClass1()");
    }

    @PostConstruct
    public void postConstructTestClass1(){
        System.out.println("postConstructTestClass1");
    }

    @Test
    public void testMethod1(){
        System.out.println("\t\t\t\ttestMethod1");
    }

    @Test
    public void testMethod2(){
        System.out.println("\t\t\t\ttestMethod2");
    }
}
