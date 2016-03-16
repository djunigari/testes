import org.testng.annotations.*;

public abstract class BaseApplicationTest {
    @BeforeSuite
    public void beforeSuite(){
        System.out.println("BeforeSuite");
    }

    @BeforeTest
    public void beforeTest(){
        System.out.println("\tBeforeTest");
    }

    @BeforeClass
    public void beforeClass(){
        System.out.println("\t\tBeforeClass");
    }

    @BeforeMethod
    public void beforeMethod(){
        System.out.println("\t\t\tBeforeMethod");
    }

    @AfterMethod
    public void afterMethod(){
        System.out.println("\t\t\tAfterMethod");
    }

    @AfterClass
    public void afterClass(){
        System.out.println("\t\tAfterClass");
    }

    @AfterTest
    public void afterTest(){
        System.out.println("\tAfterTest");
    }

    @AfterSuite
    public void afterSuite(){
        System.out.println("AfterSuite");
    }

}
