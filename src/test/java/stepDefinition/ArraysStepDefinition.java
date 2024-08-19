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
   
	 List<String> pythonCodes = ExcelUtils.readPythonCodeFromExcel("src/test/resources/testdatas.xlsx",0);
	 arraypage.clearTryeditorAndExecuteCode(pythonCodes.get(1));
     

 }


@Then("User is able to see the output in console of Arrays practice page")
public void user_is_able_to_see_the_output_in_console_of_arrays_practice_page() {
	
	arraypage.outputconsole();
	//LoggerLoad.info("user validated valid code in Tree page");
   
} 
	   //  Scenario: Verify if user able to see the output in console


	   //  Scenario: Verify if user to see the error msg in pop up window


@When("The user writes invalid python code in array practice page page")
public void the_user_writes_invalid_python_code_in_array_practice_page_page() throws IOException {

	 List<String> pythonCodes = ExcelUtils.readPythonCodeFromExcel("src/test/resources/testdatas.xlsx", 1);
	 arraypage.clearTryeditorAndExecuteCode(pythonCodes.get(1));
     

}

@When("Click the Run button in array page")
public void click_the_run_button_in_array_page() {
    arraypage.runButton();
}

@Then("User is able to see the error msg in Arrays practice page pop up window")
public void user_is_able_to_see_the_error_msg_in_arrays_practice_page_pop_up_window() {

	arraypage.output();
	
}

@When("Click the Submit button in array page")
public void click_the_submit_button_in_array_page() {
  arraypage.submit();
}
@Then("User is able to see the error msg in console")
public void user_is_able_to_see_the_error_msg_in_console() {
	arraypage.output();
}

//  Scenario: Verify if user able to select "Max Consecutive Ones"in Array Practice page  and redirect to  tryEditor page  with a Run button to test

@When("The user clicks Max Consecutive Ones link") 
public void the_user_clicks_Max_Consecutive_Ones_link() {
	
	arraypage.selectmaxConsecutive();
	
}

@When ("The User writes Valid python code in Max Consecutive Ones array practice page")
public void The_user_writes_valid_python_code_in_max_consecutive_ones_array_practice_page() throws IOException {
	 List<String> pythonCodes = ExcelUtils.readPythonCodeFromExcel("src/test/resources/testdatas.xlsx",0);
	 arraypage.clearTryeditorAndExecuteCode(pythonCodes.get(2));
	
}

@When ("The user writes Invalid python code in Max Consecutive Ones array practice page")
public void The_user_writes_Invalid_python_code_in_Max_Consecutive_Ones_array_practice_page() throws IOException {

	 List<String> pythonCodes = ExcelUtils.readPythonCodeFromExcel("src/test/resources/testdatas.xlsx", 1);
	 arraypage.clearTryeditorAndExecuteCode(pythonCodes.get(2));
}




//  Scenario: Verify if user able to select "Find Numbers with Even Number of Digits" in Array Practice page  and redirect to  tryEditor page  with a Run button to test

@When("The user clicks Find Numbers with Even Number of Digits link") 
public void The_user_clicks_Find_Numbers_with_Even_Number_of_Digits_link() {
	arraypage.selectfindNumbers();
	
}

@When ("The User writes Valid python code in Find Numbers with Even Number array practice page")
public void The_user_writes_valid_python_code_in_Find_Numbers_with_Even_Number_array_practice_page() throws IOException {
	 List<String> pythonCodes = ExcelUtils.readPythonCodeFromExcel("src/test/resources/testdatas.xlsx",0);
	 arraypage.clearTryeditorAndExecuteCode(pythonCodes.get(3));
	
}


@When ("The user writes Invalid python code in Find Numbers with Even Number array practice page")
public void The_user_writes_Invalid_python_code_in_Find_Numbers_with_Even_Number_array_practice_page() throws IOException {
	 List<String> pythonCodes = ExcelUtils.readPythonCodeFromExcel("src/test/resources/testdatas.xlsx", 1);
	 arraypage.clearTryeditorAndExecuteCode(pythonCodes.get(3));
}

//    Scenario: Verify if user able to select "Squares of  a Sorted Array" in Array Practice page  and redirect to  tryEditor page  with a Run button to test


@When("The user clicks Squares of  a Sorted Array link") 
public void The_user_clicks_Squares_of_a_Sorted_Array_of_Digits_link() {
	arraypage.selectsquaresOf();
}

@When ("The User writes Valid python code in Squares of  a Sorted Array array practice page")
public void The_user_writes_valid_python_code_in_Squares_of_a_Sorted_Array_array_practice_page() throws IOException {
	List<String> pythonCodes = ExcelUtils.readPythonCodeFromExcel("src/test/resources/testdatas.xlsx",0);
	 arraypage.clearTryeditorAndExecuteCode(pythonCodes.get(4));
	
}

@When ("The user writes Invalid python code in Squares of  a Sorted Array array practice page")
public void The_user_writes_Invalid_python_code_in_Squares_of_a_Sorted_Array_array_practice_page() throws IOException {
	List<String> pythonCodes = ExcelUtils.readPythonCodeFromExcel("src/test/resources/testdatas.xlsx", 1);
	 arraypage.clearTryeditorAndExecuteCode(pythonCodes.get(4));
}
	

	//      #Practice Question: Arrays Using List
	   
	  
   
   //Scenario: Verify if user able to redirect to Practice page
   
  @When ("The user clicks Arrays Using List in Topics covered section") 
  public void The_user_clicks_Arrays_Using_List_in_Topics_covered_section() {
	   arraypage.verifyArraysUsingListPage();

  }
   @Then ("The user should be directed to Arrays Using List Page")
   public void The_user_should_be_directed_to_Arrays_Using_List_Page() {
	   System.out.println(driver.getTitle());
		String actual = driver.findElement(By.xpath("//p[normalize-space()='Arrays Using List']")).getText();
		Assert.assertEquals(actual, "Arrays Using List");
		//LoggerLoad.info("user redirected to Overview of Trees page"); 
   }
  
   
   //  #Practice Question: Basic Operations in Lists
   
   
 //  Scenario: Verify if user able to redirect to Practice page
   @When ("The user clicks Basic Operations in Lists in Topics covered section")
   public void The_user_clicks_Basic_Operations_in_Lists_in_Topics_covered_section() {
	   arraypage.verifyBasicOperationsInListsPage();
   }
   @Then ("The user should be directed to Basic Operations in Lists Page")
   public void _The_user_should_be_directed_to_Basic_Operations_in_Lists_Page()
   {
	   System.out.println(driver.getTitle());
		String actual = driver.findElement(By.xpath("//p[normalize-space()='Basic Operations in Lists']")).getText();
		Assert.assertEquals(actual, "Basic Operations in Lists");
		//LoggerLoad.info("user redirected to Overview of Trees page");   
   }
  
  
   //     #Practice Question: Applications of Array
   
   
 //  Scenario: Verify if user able to redirect to Practice page
  
   @When ("The user clicks Applications of Array in Topics covered section")
   public void The_user_clicks_Applications_of_Array_in_Topics_covered_section() {
	   
	   arraypage.verifyApplicationsOfArrayPage();
   }
   @Then ("The user should be directed to Applications of Array Page")
   public void The_user_should_be_directed_to_Applications_of_Array_Page() {
	   System.out.println(driver.getTitle());
		String actual = driver.findElement(By.xpath("//p[normalize-space()='Applications of Array']")).getText();
		Assert.assertEquals(actual, "Applications of Array");
		//LoggerLoad.info("user redirected to Overview of Trees page");  
   }
   
   
   
}