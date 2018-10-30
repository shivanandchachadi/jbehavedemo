package jbehaveTest;
import org.jbehave.core.configuration.Configuration;
import org.jbehave.core.configuration.MostUsefulConfiguration;
import org.jbehave.core.reporters.Format;
//import org.jbehave.core.junit.JUnitStories;
//import org.jbehave.core.reporters.Format;
import org.jbehave.core.reporters.StoryReporterBuilder;
import org.jbehave.core.steps.InjectableStepsFactory;
import org.jbehave.core.steps.InstanceStepsFactory;
//import org.junit.runner.RunWith;

import java.util.Arrays;
import java.util.List;

import net.serenitybdd.jbehave.SerenityStories;
//import net.serenitybdd.junit.runners.SerenityRunner;


//@RunWith(SerenityRunner.class) 
public class Jbehavetest extends SerenityStories {

	
	@Override
    public InjectableStepsFactory stepsFactory() {
        return new InstanceStepsFactory(configuration(), new Definationclass());
    }

    // Configure the test runner
    @Override
    public Configuration configuration() {
        return new MostUsefulConfiguration()
                // Configure the story report
                .useStoryReporterBuilder(new StoryReporterBuilder()
                        // Post the report to the console
                        .withFormats(Format.STATS));
    }

    // Specify a feature file
    public List<String> storyPaths() {
        return Arrays.asList("./res/jbehave.story");
    }

	

	 
	
}
