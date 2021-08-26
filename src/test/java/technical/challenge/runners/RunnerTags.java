package technical.challenge.runners;
import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/technicalChallenge.feature",
        tags = "@stories",
        glue = "technical.challenge.stepsdefinitions",
        snippets = SnippetType.CAMELCASE)

public class RunnerTags {
}
