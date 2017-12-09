package com.example;

import org.gradle.api.*;
import org.gradle.api.tasks.TaskAction;

public abstract class AbstractTask extends DefaultTask {
	@TaskAction
	public void printGreeting() {
		System.out.println("### " + getGreeting());
	}
	
	public abstract String getGreeting();
}