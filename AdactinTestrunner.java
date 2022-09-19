package org.testrunner;

import org.basecalss.Base_Class;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.jvm.Jvmreport;
import org.openqa.selenium.WebDriver;

import com.github.dockerjava.api.model.Driver;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(     features = "src\\test\\java\\Feature\\Adactinpro.feature"   ,


                      glue = "org.StepdefinitionAdactin" , 


                           dryRun=false   ,

                          
                      monochrome=true ,
                      
                  tags= "@smoke_001 or @sc_002 or  @sc_003 or @sc_004",
                   //   tags="@sc_002",
                      
                      plugin={ "pretty" ,
                    		  
                    		  "json:C:\\Users\\tgt593\\eclipse-workspace1\\CyclosProject\\jsonReport\\Adactinpro.json",
                    		  
                    		  "html:C:\\Users\\tgt593\\eclipse-workspace1\\CyclosProject\\htmlReport\\Adactinpro1.html"
                    		  
                }
                      
                     )

public class AdactinTestrunner {

	public static WebDriver driver;

	@BeforeClass

	public static void setup() {

		driver=Base_Class.browser_configuration("chrome");

	}
	@AfterClass
	public static void teardown() {
		//driver.close();
		
		Jvmreport.CreatejvmReport("C:\\Users\\tgt593\\eclipse-workspace1\\CyclosProject\\jsonreport\\Adactinpro.json");
		
		
	}

}
