package com.example.factorypattern;

public class CanisterCarpetVacuumCleaner implements CarpetVacuumCleaner{

	public CanisterCarpetVacuumCleaner()
	{
		System.out.println("Creating Canister Vacuum Cleaner...");
	}
	
	@Override
	public void cleanCarpet() 
	{
		System.out.println("Canister Vacuum Cleaner cleans the Carpet");
	}
}
