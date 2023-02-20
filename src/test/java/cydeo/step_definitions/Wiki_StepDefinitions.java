package cydeo.step_definitions;

import cydeo.pages.WikiSearchPage;
import cydeo.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class Wiki_StepDefinitions {

    WikiSearchPage wikiSearchPage = new WikiSearchPage();

    @Given("User is on Wikipedia home page")
    public void user_is_on_wikipedia_home_page() {
        Driver.getDriver().get("https://www.wikipedia.org");

    }

    @When("User types {string} in the wiki search box")
    public void user_types_steve_jobs_in_the_wiki_search_box(String string) {
        // Write code here that turns the phrase above into concrete actions
        wikiSearchPage.searchBox.sendKeys(string);
    }

    @When("User clicks wiki search button")
    public void user_clicks_wiki_search_button() {
        // Write code here that turns the phrase above into concrete actions
        wikiSearchPage.searchButton.click();

    }

    @Then("User sees {string} is in the wiki title")
    public void user_sees_steve_jobs_is_in_the_wiki_title(String string) {
        // Write code here that turns the phrase above into concrete actions
        Assert.assertTrue(Driver.getDriver().getTitle().contains(string));

    }

    @Then("User sees {string} is in the main header")
    public void userSeesSteveJobsIsInTheMainHeader(String string) {
        Assert.assertTrue(wikiSearchPage.mainHeader.isDisplayed());
        Assert.assertTrue(wikiSearchPage.mainHeader.getText().equals(string));

    }
}
