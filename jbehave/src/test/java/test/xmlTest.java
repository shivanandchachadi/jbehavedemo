package test;

import org.testng.annotations.Test;

import jbehaveTest.Jbehavetest;
import stepdef.Definationclass;

public class xmlTest extends Jbehavetest {
	Definationclass n=new Definationclass();
	
	@Test
	public void test()
	{
		storyPaths();
		n.precondition();
		n.method();
		n.action();
		
	}

}
