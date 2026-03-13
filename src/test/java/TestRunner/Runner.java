package TestRunner;
import io.cucumber.testng.CucumberOptions;
import io.cucumber.testng.CucumberOptions.SnippetType;
import io.cucumber.testng.AbstractTestNGCucumberTests;

@CucumberOptions(
		  features={"src/test/resources/features"},
		  dryRun=!true,
	       glue="steps",
	       monochrome=true,
	       snippets=SnippetType.CAMELCASE
	      
	)

	public class  Runner extends AbstractTestNGCucumberTests {

		
}
	