package org.stepdefinition;

import org.base.BaseClass;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks extends BaseClass {

	@Before
	public void bef() {

		System.out.println("Bef Scenario------------------");
		launchBrowser();
		loadUrl("https://www.facebook.com/");
		maxiBrowser();

	}

	@Before(order = 20)
	public void befSce1() {
		System.out.println("bef sce 1");
	}

	@Before(order = 50)
	public void befSce2() {
		System.out.println("bef sce 2");
	}

	@Before(order = 80)
	public void befSce3() {
		System.out.println("bef sce 3");
	}

	@After
	public void aft() {

		System.out.println("Aft Scenario-----------------");
		toQuit();
	}

	@After(order = 80)
	public void aftSce1() {
		System.out.println("aft sce 3");

	}

	@After(order = 50)
	public void aftSce2() {
		System.out.println("aft sce 2");

	}

	@After(order = 20)
	public void aftSce3() {
		System.out.println("aft sce 1");

	}

}
