package stepDefinition;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.ArrayPage;
import pageObjects.HomePage;
import pageObjects.LoginPage;
import pageObjects.QueuePage;

import utilities.ConfigReader;
import utilities.DriverManager;
import utilities.ExcelUtils;

public class ArraysStepDefinition {

	 ConfigReader configReader = new ConfigReader();
		QueuePage queuePage;
	    HomePage homePage;
	    WebDriver driver;
	    LoginPage loginPage;	  
	    WebDriverWait wait;
	    ArrayPage arraypage;
	    
	public ArraysStepDefinition() {
		 driver = DriverManager.getDriver();
	        
		   loginPage = new LoginPage(driver);
	        homePage = new HomePage(driver);
	        arraypage = new ArrayPage(driver);
	        loginPage= PageFactory.initElements(driver, LoginPage.class);

	    }

//	/Practice Question: Arrays in Python link
	
	 //  Scenario: Verify if user able to redirect to Practice page
		@Given("The user is in the Array page after logged in")
		public void the_user_is_in_the_array_page_after_logged_in() {
			homePage.selectArray();
		}

		@When("The user clicks Arrays in Python link in Topics covered section")
		public void the_user_clicks_arrays_in_python_link_in_topics_covered_section() {
			arraypage.verifyArraysInPythonPage();

		}

		@Then("The user should be directed to Arrays in Python Page")
		public void the_user_should_be_directed_to_arrays_in_python_page() {
			System.out.println(driver.getTitle());
			String actual = driver.findElement(By.xpath("//p[normalize-space()='Arrays in Python']")).getText();
			Assert.assertEquals(actual, "Arrays in Python");
			//LoggerLoad.info("user redirected to Overview of Trees page");
		}

		@When("The user clicks Practice Questions link")
		public void the_user_clicks_practice_questions_link() {
			arraypage.selectArraysinpythonPracticeQues();
			
		}

		@Then("The user should be redirected to Practice page")
		public void the_user_should_be_redirected_to_practice_page() {
			System.out.println(driver.getTitle());
			//LoggerLoad.info("user redirected to Overview of Trees page");

		}
	
	//   Scenario: Verify if user able to select "Search the Array"in Array Practice page and redirect to  tryEditor page  with a Run button to test


@Given("The user is in the  Array Practice page")
public void the_user_is_in_the_array_practice_page() {
	homePage.selectArray();
	arraypage.verifyArraysInPythonPage();
	arraypage.selectArraysinpythonPracticeQues();

}
@When("The user clicks Search the Array link")
public void the_user_clicks_search_the_array_link() {
    
	arraypage.selectsearchArrayprac();
	
}
@Then("The user should be redirected to array practice page having program question with tryEditor and a Run button to test")
public void the_user_should_be_redirected_to_array_practice_page_having_program_question_with_try_editor_and_a_run_button_to_test() {
   
	System.out.println(driver.getTitle());
	
	//LoggerLoad.info("user redirected to Overview of Trees page");
}

	  // Scenario: Verify if user able to see the output in console
@Given("The user is on the Arrays practice page tryEditor page")
public void the_user_is_on_the_arrays_practice_page_try_editor_page() {
	homePage.selectArray();
	arraypage.verifyArraysInPythonPage();
	arraypage.selectArraysinpythonPracticeQues();
	arraypage.selectsearchArrayprac();

}
@When("The User writes Valid python code in array practice page page")
public void the_user_writes_valid_python_code_in_array_practice_page_page() throws IOException {
   
	arraypage.clearTryeditor();
	 List<String> pythonCodes = ExcelUtils.readPythonCodeFromExcel("src/test/resources/testdatas.xlsx");
     
     for (String code : pythonCodes) {
         // Assuming you have a method to execute Python code
        arraypage.executePythonCode(code);
     }
 }


@Then("User is able to see the output in console of Arrays practice page")
public void user_is_able_to_see_the_output_in_console_of_arrays_practice_page() {
	
	arraypage.outputconsole();
	//LoggerLoad.info("user validated valid code in Tree page");
   
}

	   
	   //  Scenario: Verify if user able to see the output in console


	   //  Scenario: Verify if user to see the error msg in pop up window


@When("The user writes invalid python code in array practice page page")
public void the_user_writes_invalid_python_code_in_array_practice_page_page() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}
@When("Click the Run button in array page")
public void click_the_run_button_in_array_page() {
    arraypage.runButton();
}
@Then("User is able to see the error msg in Arrays practice page pop up window")
public void user_is_able_to_see_the_error_msg_in_arrays_practice_page_pop_up_window() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}
//	     Scenario: Verify if user to see the error msg in console


@When("Click the Submit button in array page")
public void click_the_submit_button_in_array_page() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}
@Then("User is able to see the error msg in console")
public void user_is_able_to_see_the_error_msg_in_console() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}


	
	 //  Scenario: Verify if user able to select "Max Consecutive Ones"in Array Practice page  and redirect to  tryEditor page  with a Run button to test

	//    Scenario: Verify if user able to select "Find Numbers with Even Number of Digits" in Array Practice page  and redirect to  tryEditor page  with a Run button to test
//    Scenario: Verify if user able to select "Squares of  a Sorted Array" in Array Practice page  and redirect to  tryEditor page  with a Run button to test

	
	
	
	//      #Practice Question: Arrays Using List
	   
	   
	 //  Scenario: Verify if user able to redirect to Practice page


/*Pending Feature- scenarioos
 
 
 Scenario: Verify if user able to select "Max Consecutive Ones"in Array Practice page  and redirect to  tryEditor page  with a Run button to test
   
   Given The user is in the  Array Practice page 
   When The user clicks Max Consecutive Ones link 
   Then The user should be redirected to array practice page having program question with tryEditor and a Run button to test
   
  
  Scenario: Verify if user able to see the output in console
   Given The user is on the Arrays practice page tryEditor page
   When The User writes Valid python code in array practice page page
   And  Click the Run button in array page
   Then User is able to see the output in console of Arrays practice page
   
     Scenario: Verify if user able to see the output in console
   Given The user is on the Arrays practice page tryEditor page
   When The User writes Valid python code in array practice page page
   And  Click the Submit button in array page
   Then User is able to see the output in console of Arrays practice page
  
   Scenario: Verify if user to see the error msg in pop up window
   Given The user is on the Arrays practice page tryEditor page
   When The user writes invalid python code in array practice page page
   And  Click the Run button in array page
   Then User is able to see the error msg in Arrays practice page pop up window 
   
     Scenario: Verify if user to see the error msg in console
   Given The user is on the Arrays practice page tryEditor page
   When The user writes invalid python code in array practice page page
   And  Click the Submit button in array page
   Then User is able to see the error msg in console
   
   
   
   
    Scenario: Verify if user able to select "Find Numbers with Even Number of Digits" in Array Practice page  and redirect to  tryEditor page  with a Run button to test
   
   Given The user is in the  Array Practice page 
   When The user clicks Find Numbers with Even Number of Digits link 
   Then The user should be redirected to array practice page having program question with tryEditor and a Run button to test
   
  
  Scenario: Verify if user able to see the output in console
   Given The user is on the Arrays practice page tryEditor page
   When The User writes Valid python code in array practice page page
   And  Click the Run button in array page
   Then User is able to see the output in console of Arrays practice page
   
     Scenario: Verify if user able to see the output in console
   Given The user is on the Arrays practice page tryEditor page
   When The User writes Valid python code in array practice page page
   And  Click the Submit button in array page
   Then User is able to see the output in console of Arrays practice page
  
   Scenario: Verify if user to see the error msg in pop up window
   Given The user is on the Arrays practice page tryEditor page
   When The user writes invalid python code in array practice page page
   And  Click the Run button in array page
   Then User is able to see the error msg in Arrays practice page pop up window 
   
     Scenario: Verify if user to see the error msg in console
   Given The user is on the Arrays practice page tryEditor page
   When The user writes invalid python code in array practice page page
   And  Click the Submit button in array page
   Then User is able to see the error msg in console
  
    Scenario: Verify if user able to select "Squares of  a Sorted Array" in Array Practice page  and redirect to  tryEditor page  with a Run button to test
   
   Given The user is in the  Array Practice page 
   When The user clicks Squares of  a Sorted Array link 
   Then The user should be redirected to array practice page having program question with tryEditor and a Run button to test
   
  
  Scenario: Verify if user able to see the output in console
   Given The user is on the Arrays practice page tryEditor page
   When The User writes Valid python code in array practice page page
   And  Click the Run button in array page
   Then User is able to see the output in console of Arrays practice page
   
     Scenario: Verify if user able to see the output in console
   Given The user is on the Arrays practice page tryEditor page
   When The User writes Valid python code in array practice page page
   And  Click the Submit button in array page
   Then User is able to see the output in console of Arrays practice page
  
   Scenario: Verify if user to see the error msg in pop up window
   Given The user is on the Arrays practice page tryEditor page
   When The user writes invalid python code in array practice page page
   And  Click the Run button in array page
   Then User is able to see the error msg in Arrays practice page pop up window 
   
     Scenario: Verify if user to see the error msg in console
   Given The user is on the Arrays practice page tryEditor page
   When The user writes invalid python code in array practice page page
   And  Click the Submit button in array page
   Then User is able to see the error msg in console
  
      #Practice Question: Arrays Using List
   
   
   Scenario: Verify if user able to redirect to Practice page
   Given The user is in the Array page after logged in 
   When The user clicks Arrays Using List in Topics covered section 
   Then  The user should be directed to Arrays in Python Page
   When  The user clicks Practice Questions link
   Then The user should be redirected to Practice page
   
   
   Scenario: Verify if user able to select "Search the Array"in Array Practice page and redirect to  tryEditor page  with a Run button to test
   
   Given The user is in the  Array Practice page 
   When The user clicks Search the Array link 
   Then The user should be redirected to array practice page having program question with tryEditor and a Run button to test
   
  
   Scenario: Verify if user able to see the output in console
   Given The user is on the Arrays practice page tryEditor page
   When The User writes Valid python code in array practice page page
   And  Click the Run button in array page
   Then User is able to see the output in console of Arrays practice page
   
     Scenario: Verify if user able to see the output in console
   Given The user is on the Arrays practice page tryEditor page
   When The User writes Valid python code in array practice page page
   And  Click the Submit button in array page
   Then User is able to see the output in console of Arrays practice page
  
   Scenario: Verify if user to see the error msg in pop up window
   Given The user is on the Arrays practice page tryEditor page
   When The user writes invalid python code in array practice page page
   And  Click the Run button in array page
   Then User is able to see the error msg in Arrays practice page pop up window 
   
     Scenario: Verify if user to see the error msg in console
   Given The user is on the Arrays practice page tryEditor page
   When The user writes invalid python code in array practice page page
   And  Click the Submit button in array page
   Then User is able to see the error msg in console
   
   Scenario: Verify if user able to select "Max Consecutive Ones"in Array Practice page  and redirect to  tryEditor page  with a Run button to test
   
   Given The user is in the  Array Practice page 
   When The user clicks Max Consecutive Ones link 
   Then The user should be redirected to array practice page having program question with tryEditor and a Run button to test
   
  
  Scenario: Verify if user able to see the output in console
   Given The user is on the Arrays practice page tryEditor page
   When The User writes Valid python code in array practice page page
   And  Click the Run button in array page
   Then User is able to see the output in console of Arrays practice page
   
     Scenario: Verify if user able to see the output in console
   Given The user is on the Arrays practice page tryEditor page
   When The User writes Valid python code in array practice page page
   And  Click the Submit button in array page
   Then User is able to see the output in console of Arrays practice page
  
   Scenario: Verify if user to see the error msg in pop up window
   Given The user is on the Arrays practice page tryEditor page
   When The user writes invalid python code in array practice page page
   And  Click the Run button in array page
   Then User is able to see the error msg in Arrays practice page pop up window 
   
     Scenario: Verify if user to see the error msg in console
   Given The user is on the Arrays practice page tryEditor page
   When The user writes invalid python code in array practice page page
   And  Click the Submit button in array page
   Then User is able to see the error msg in console
   
   
   
   
    Scenario: Verify if user able to select "Find Numbers with Even Number of Digits" in Array Practice page  and redirect to  tryEditor page  with a Run button to test
   
   Given The user is in the  Array Practice page 
   When The user clicks Find Numbers with Even Number of Digits link 
   Then The user should be redirected to array practice page having program question with tryEditor and a Run button to test
   
  
  Scenario: Verify if user able to see the output in console
   Given The user is on the Arrays practice page tryEditor page
   When The User writes Valid python code in array practice page page
   And  Click the Run button in array page
   Then User is able to see the output in console of Arrays practice page
   
     Scenario: Verify if user able to see the output in console
   Given The user is on the Arrays practice page tryEditor page
   When The User writes Valid python code in array practice page page
   And  Click the Submit button in array page
   Then User is able to see the output in console of Arrays practice page
  
   Scenario: Verify if user to see the error msg in pop up window
   Given The user is on the Arrays practice page tryEditor page
   When The user writes invalid python code in array practice page page
   And  Click the Run button in array page
   Then User is able to see the error msg in Arrays practice page pop up window 
   
     Scenario: Verify if user to see the error msg in console
   Given The user is on the Arrays practice page tryEditor page
   When The user writes invalid python code in array practice page page
   And  Click the Submit button in array page
   Then User is able to see the error msg in console
  
    Scenario: Verify if user able to select "Squares of  a Sorted Array" in Array Practice page  and redirect to  tryEditor page  with a Run button to test
   
   Given The user is in the  Array Practice page 
   When The user clicks Squares of  a Sorted Array link 
   Then The user should be redirected to array practice page having program question with tryEditor and a Run button to test
   
  
  Scenario: Verify if user able to see the output in console
   Given The user is on the Arrays practice page tryEditor page
   When The User writes Valid python code in array practice page page
   And  Click the Run button in array page
   Then User is able to see the output in console of Arrays practice page
   
     Scenario: Verify if user able to see the output in console
   Given The user is on the Arrays practice page tryEditor page
   When The User writes Valid python code in array practice page page
   And  Click the Submit button in array page
   Then User is able to see the output in console of Arrays practice page
  
   Scenario: Verify if user to see the error msg in pop up window
   Given The user is on the Arrays practice page tryEditor page
   When The user writes invalid python code in array practice page page
   And  Click the Run button in array page
   Then User is able to see the error msg in Arrays practice page pop up window 
   
     Scenario: Verify if user to see the error msg in console
   Given The user is on the Arrays practice page tryEditor page
   When The user writes invalid python code in array practice page page
   And  Click the Submit button in array page
   Then User is able to see the error msg in console
   
   
    #Practice Question: Basic Operations in Lists
   
   
   Scenario: Verify if user able to redirect to Practice page
   Given The user is in the Array page after logged in 
   When The user clicks Basic Operations in Lists in Topics covered section 
   Then  The user should be directed to Arrays in Python Page
   When  The user clicks Practice Questions link
   Then The user should be redirected to Practice page
   
  
    Scenario: Verify if user able to select "Search the Array"in Array Practice page and redirect to  tryEditor page  with a Run button to test
   
   Given The user is in the  Array Practice page 
   When The user clicks Search the Array link 
   Then The user should be redirected to array practice page having program question with tryEditor and a Run button to test
   
  
   Scenario: Verify if user able to see the output in console
   Given The user is on the Arrays practice page tryEditor page
   When The User writes Valid python code in array practice page page
   And  Click the Run button in array page
   Then User is able to see the output in console of Arrays practice page
   
     Scenario: Verify if user able to see the output in console
   Given The user is on the Arrays practice page tryEditor page
   When The User writes Valid python code in array practice page page
   And  Click the Submit button in array page
   Then User is able to see the output in console of Arrays practice page
  
   Scenario: Verify if user to see the error msg in pop up window
   Given The user is on the Arrays practice page tryEditor page
   When The user writes invalid python code in array practice page page
   And  Click the Run button in array page
   Then User is able to see the error msg in Arrays practice page pop up window 
   
     Scenario: Verify if user to see the error msg in console
   Given The user is on the Arrays practice page tryEditor page
   When The user writes invalid python code in array practice page page
   And  Click the Submit button in array page
   Then User is able to see the error msg in console
   
   Scenario: Verify if user able to select "Max Consecutive Ones"in Array Practice page  and redirect to  tryEditor page  with a Run button to test
   
   Given The user is in the  Array Practice page 
   When The user clicks Max Consecutive Ones link 
   Then The user should be redirected to array practice page having program question with tryEditor and a Run button to test
   
  
  Scenario: Verify if user able to see the output in console
   Given The user is on the Arrays practice page tryEditor page
   When The User writes Valid python code in array practice page page
   And  Click the Run button in array page
   Then User is able to see the output in console of Arrays practice page
   
     Scenario: Verify if user able to see the output in console
   Given The user is on the Arrays practice page tryEditor page
   When The User writes Valid python code in array practice page page
   And  Click the Submit button in array page
   Then User is able to see the output in console of Arrays practice page
  
   Scenario: Verify if user to see the error msg in pop up window
   Given The user is on the Arrays practice page tryEditor page
   When The user writes invalid python code in array practice page page
   And  Click the Run button in array page
   Then User is able to see the error msg in Arrays practice page pop up window 
   
     Scenario: Verify if user to see the error msg in console
   Given The user is on the Arrays practice page tryEditor page
   When The user writes invalid python code in array practice page page
   And  Click the Submit button in array page
   Then User is able to see the error msg in console
   
   
   
   
    Scenario: Verify if user able to select "Find Numbers with Even Number of Digits" in Array Practice page  and redirect to  tryEditor page  with a Run button to test
   
   Given The user is in the  Array Practice page 
   When The user clicks Find Numbers with Even Number of Digits link 
   Then The user should be redirected to array practice page having program question with tryEditor and a Run button to test
   
  
  Scenario: Verify if user able to see the output in console
   Given The user is on the Arrays practice page tryEditor page
   When The User writes Valid python code in array practice page page
   And  Click the Run button in array page
   Then User is able to see the output in console of Arrays practice page
   
     Scenario: Verify if user able to see the output in console
   Given The user is on the Arrays practice page tryEditor page
   When The User writes Valid python code in array practice page page
   And  Click the Submit button in array page
   Then User is able to see the output in console of Arrays practice page
  
   Scenario: Verify if user to see the error msg in pop up window
   Given The user is on the Arrays practice page tryEditor page
   When The user writes invalid python code in array practice page page
   And  Click the Run button in array page
   Then User is able to see the error msg in Arrays practice page pop up window 
   
     Scenario: Verify if user to see the error msg in console
   Given The user is on the Arrays practice page tryEditor page
   When The user writes invalid python code in array practice page page
   And  Click the Submit button in array page
   Then User is able to see the error msg in console
  
    Scenario: Verify if user able to select "Squares of  a Sorted Array" in Array Practice page  and redirect to  tryEditor page  with a Run button to test
   
   Given The user is in the  Array Practice page 
   When The user clicks Squares of  a Sorted Array link 
   Then The user should be redirected to array practice page having program question with tryEditor and a Run button to test
   
  
  Scenario: Verify if user able to see the output in console
   Given The user is on the Arrays practice page tryEditor page
   When The User writes Valid python code in array practice page page
   And  Click the Run button in array page
   Then User is able to see the output in console of Arrays practice page
   
     Scenario: Verify if user able to see the output in console
   Given The user is on the Arrays practice page tryEditor page
   When The User writes Valid python code in array practice page page
   And  Click the Submit button in array page
   Then User is able to see the output in console of Arrays practice page
  
   Scenario: Verify if user to see the error msg in pop up window
   Given The user is on the Arrays practice page tryEditor page
   When The user writes invalid python code in array practice page page
   And  Click the Run button in array page
   Then User is able to see the error msg in Arrays practice page pop up window 
   
     Scenario: Verify if user to see the error msg in console
   Given The user is on the Arrays practice page tryEditor page
   When The user writes invalid python code in array practice page page
   And  Click the Submit button in array page
   Then User is able to see the error msg in console
  

     #Practice Question: Applications of Array
   
   
   Scenario: Verify if user able to redirect to Practice page
   Given The user is in the Array page after logged in 
   When The user clicks Applications of Array in Topics covered section 
   Then  The user should be directed to Arrays in Python Page
   When  The user clicks Practice Questions link
   Then The user should be redirected to Practice page
   
   
   
    Scenario: Verify if user able to select "Search the Array"in Array Practice page and redirect to  tryEditor page  with a Run button to test
   
   Given The user is in the  Array Practice page 
   When The user clicks Search the Array link 
   Then The user should be redirected to array practice page having program question with tryEditor and a Run button to test
   
  
   Scenario: Verify if user able to see the output in console
   Given The user is on the Arrays practice page tryEditor page
   When The User writes Valid python code in array practice page page
   And  Click the Run button in array page
   Then User is able to see the output in console of Arrays practice page
   
     Scenario: Verify if user able to see the output in console
   Given The user is on the Arrays practice page tryEditor page
   When The User writes Valid python code in array practice page page
   And  Click the Submit button in array page
   Then User is able to see the output in console of Arrays practice page
  
   Scenario: Verify if user to see the error msg in pop up window
   Given The user is on the Arrays practice page tryEditor page
   When The user writes invalid python code in array practice page page
   And  Click the Run button in array page
   Then User is able to see the error msg in Arrays practice page pop up window 
   
     Scenario: Verify if user to see the error msg in console
   Given The user is on the Arrays practice page tryEditor page
   When The user writes invalid python code in array practice page page
   And  Click the Submit button in array page
   Then User is able to see the error msg in console
   
   Scenario: Verify if user able to select "Max Consecutive Ones"in Array Practice page  and redirect to  tryEditor page  with a Run button to test
   
   Given The user is in the  Array Practice page 
   When The user clicks Max Consecutive Ones link 
   Then The user should be redirected to array practice page having program question with tryEditor and a Run button to test
   
  
  Scenario: Verify if user able to see the output in console
   Given The user is on the Arrays practice page tryEditor page
   When The User writes Valid python code in array practice page page
   And  Click the Run button in array page
   Then User is able to see the output in console of Arrays practice page
   
     Scenario: Verify if user able to see the output in console
   Given The user is on the Arrays practice page tryEditor page
   When The User writes Valid python code in array practice page page
   And  Click the Submit button in array page
   Then User is able to see the output in console of Arrays practice page
  
   Scenario: Verify if user to see the error msg in pop up window
   Given The user is on the Arrays practice page tryEditor page
   When The user writes invalid python code in array practice page page
   And  Click the Run button in array page
   Then User is able to see the error msg in Arrays practice page pop up window 
   
     Scenario: Verify if user to see the error msg in console
   Given The user is on the Arrays practice page tryEditor page
   When The user writes invalid python code in array practice page page
   And  Click the Submit button in array page
   Then User is able to see the error msg in console
   
   
   
   
    Scenario: Verify if user able to select "Find Numbers with Even Number of Digits" in Array Practice page  and redirect to  tryEditor page  with a Run button to test
   
   Given The user is in the  Array Practice page 
   When The user clicks Find Numbers with Even Number of Digits link 
   Then The user should be redirected to array practice page having program question with tryEditor and a Run button to test
   
  
  Scenario: Verify if user able to see the output in console
   Given The user is on the Arrays practice page tryEditor page
   When The User writes Valid python code in array practice page page
   And  Click the Run button in array page
   Then User is able to see the output in console of Arrays practice page
   
     Scenario: Verify if user able to see the output in console
   Given The user is on the Arrays practice page tryEditor page
   When The User writes Valid python code in array practice page page
   And  Click the Submit button in array page
   Then User is able to see the output in console of Arrays practice page
  
   Scenario: Verify if user to see the error msg in pop up window
   Given The user is on the Arrays practice page tryEditor page
   When The user writes invalid python code in array practice page page
   And  Click the Run button in array page
   Then User is able to see the error msg in Arrays practice page pop up window 
   
     Scenario: Verify if user to see the error msg in console
   Given The user is on the Arrays practice page tryEditor page
   When The user writes invalid python code in array practice page page
   And  Click the Submit button in array page
   Then User is able to see the error msg in console
  
    Scenario: Verify if user able to select "Squares of  a Sorted Array" in Array Practice page  and redirect to  tryEditor page  with a Run button to test
   
   Given The user is in the  Array Practice page 
   When The user clicks Squares of  a Sorted Array link 
   Then The user should be redirected to array practice page having program question with tryEditor and a Run button to test
   
  
  Scenario: Verify if user able to see the output in console
   Given The user is on the Arrays practice page tryEditor page
   When The User writes Valid python code in array practice page page
   And  Click the Run button in array page
   Then User is able to see the output in console of Arrays practice page
   
     Scenario: Verify if user able to see the output in console
   Given The user is on the Arrays practice page tryEditor page
   When The User writes Valid python code in array practice page page
   And  Click the Submit button in array page
   Then User is able to see the output in console of Arrays practice page
  
   Scenario: Verify if user to see the error msg in pop up window
   Given The user is on the Arrays practice page tryEditor page
   When The user writes invalid python code in array practice page page
   And  Click the Run button in array page
   Then User is able to see the error msg in Arrays practice page pop up window 
   
     Scenario: Verify if user to see the error msg in console
   Given The user is on the Arrays practice page tryEditor page
   When The user writes invalid python code in array practice page page
   And  Click the Submit button in array page
   Then User is able to see the error msg in console
  
    
 
*/	
}
