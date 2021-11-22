package Falabella.runners;

import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src/test/resources/features/compraProductoFalabella.feature",
        tags = "@compraFalabella",
        glue = "Falabella.stepdefinitions",
        snippets = SnippetType.CAMELCASE )

public class RunnerTags {
}