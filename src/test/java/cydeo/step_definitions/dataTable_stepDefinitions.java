package cydeo.step_definitions;

import io.cucumber.java.en.Then;

import java.util.List;

public class dataTable_stepDefinitions {
    @Then("user should see fruits I like")
    public void user_should_see_fruits_I_like(List<String> fruits) {
        // Write code here that turns the phrase above into concrete actions
        // For automatic transformation, change DataTable to one of
        // E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
        // Map<K, List<V>>. E,K,V must be a String, Integer, Float,
        // Double, Byte, Short, Long, BigInteger or BigDecimal.
        //
        // For other transformations you can register a DataTableType.

        System.out.println(fruits);
        // System.out.println(fruits.get(2));
    }
}
