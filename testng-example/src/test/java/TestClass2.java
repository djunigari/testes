import org.testng.annotations.Test;

import javax.annotation.PostConstruct;

public class TestClass2 extends BaseApplicationTest{
    public TestClass2(){
        System.out.println("TestClass2()");
    }

    @PostConstruct
    public void postConstructTestClass2(){
        System.out.println("postConstructTestClass2");
    }

    @Test
    public void testMethod3(){
        System.out.println("\t\t\t\ttestMethod3");
    }

    @Test
    public void testMethod4(){
        System.out.println("\t\t\t\ttestMethod4");
    }
}
