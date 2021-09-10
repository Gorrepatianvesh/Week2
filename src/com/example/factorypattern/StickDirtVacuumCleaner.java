package com.example.factorypattern;

public class StickDirtVacuumCleaner implements DirtVacuumCleaner {

	public StickDirtVacuumCleaner()
	{
		System.out.println("Creating Stick Vacuum Cleaner");
	}
	@Override
	public void cleanDirt() 
	{
		System.out.println("Stick Vacuum Cleaner cleans the Dirt");
	}
}
