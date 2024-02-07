package stepDefinitions;

import io.cucumber.java.After;
import utilities.DriverClass;

public class Hooks {
    
    
    @After // Runs after every scenario
    public void afterScenario(){
//        System.out.println("Scenario is ended");
        DriverClass.quitDriver();
    }
//    public static final org.apache.logging.log4j.Logger logger4j = LogManager.getLogger();
    
 /*   public static WebDriver driver;
    public static WebDriverWait wait;
    
    @Before
    public void setUpProcess() {
        Logger logger = Logger.getLogger("");
        logger.setLevel(Level.SEVERE);
        
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }
    
    @After
    public void tearDownProcess() {
        waiting(5);
        driver.quit();
    }
    
    @BeforeStep
    public void beforeMethod() {
        driver.get("https://demo.nopcommerce.com/");
//        logger4j.info("Test method started");
//        logger4j.warn("Warning message test started");
    }*/
    
//    @AfterStep
//    public void afterMethod(ITestResult result) {
//        logger4j.info(result.getName() + " Test method finished " + (result.getStatus() == 1 ? " Passed " : "Fail"));
//        logger4j.warn("Warning message test finished");
//    }
}
