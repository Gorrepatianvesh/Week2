package com.example.factorypattern;

public class HandheldCarpetVacuumCleaner implements CarpetVacuumCleaner{

	public HandheldCarpetVacuumCleaner()
	{
		System.out.println("Creating Handheld Vacuum Cleaner...");
	}
	
	@Override
	public void cleanCarpet() 
	{
		System.out.println("Handheld Vacuum Cleaner cleans the carpet");
	}
}
