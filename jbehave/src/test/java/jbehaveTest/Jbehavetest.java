package jbehaveTest;
import org.apache.commons.digester.plugins.strategies.LoaderFromClass;
import org.jbehave.core.configuration.Configuration;
import org.jbehave.core.configuration.MostUsefulConfiguration;
import org.jbehave.core.io.CodeLocations;
import org.jbehave.core.io.LoadFromClasspath;
import org.jbehave.core.reporters.Format;
//import org.jbehave.core.junit.JUnitStories;
//import org.jbehave.core.reporters.Format;
import org.jbehave.core.reporters.StoryReporterBuilder;
import org.jbehave.core.steps.InjectableStepsFactory;
import org.jbehave.core.steps.InstanceStepsFactory;
//import org.junit.runner.RunWith;
//import org.junit.runner.RunWith;
import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.List;

import net.serenitybdd.jbehave.SerenityStories;
import stepdef.Definationclass;
//import net.serenitybdd.junit.runners.SerenityRunner;


//@RunWith(SerenityReportingRunner.class) 

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
        		.useStoryLoader(new LoadFromClasspath(this.getClass()))
                .useStoryReporterBuilder(new StoryReporterBuilder()
                        // Post the report to the console
                		//.withCodeLocation(codeLocationFromClass(this.getClass()))
                        .withFormats(Format.CONSOLE,Format.TXT,Format.XML,Format.HTML));
                		//.withDefaultFormats().withFormats(Format.CONSOLE));
    }

    // Specify a feature file
    @Test
    public List<String> storyPaths() {
        return Arrays.asList("./res/jbehave.story");
    }

	 
	
}
