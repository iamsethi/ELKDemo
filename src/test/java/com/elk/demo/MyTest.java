package com.elk.demo;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

public class MyTest {

	@Test(description = "login")
	public void login() {

	}

	@Test(description = "search for policy", dependsOnMethods = "login")
	public void search() {

	}

	@Test(description = "select policy", dependsOnMethods = "search")
	public void select() {

	}

	@Test(description = "create policy", dependsOnMethods = "select")
	public void create() {
		assertTrue(false);

	}

	@Test(description = "logout", dependsOnMethods = "create")
	public void logout() {

	}
}
