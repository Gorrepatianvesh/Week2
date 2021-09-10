package com.example.factorypattern;

public class UprightDirtVacuumCleaner implements DirtVacuumCleaner {

	public UprightDirtVacuumCleaner()
	{
		System.out.println("Creating Upright Vacuum Cleaner");
	}
	@Override
	public void cleanDirt() 
	{
		System.out.println("Upright Vacuum Cleaner cleans the Dirt");
	}
}
