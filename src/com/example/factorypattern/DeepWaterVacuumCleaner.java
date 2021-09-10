package com.example.factorypattern;

public class DeepWaterVacuumCleaner implements WaterVacuumCleaner {

	public DeepWaterVacuumCleaner()
	{
		System.out.println("Creating Deep Cleaner");
	}
	@Override
	public void cleanWater() 
	{
		System.out.println("Deep Cleaner cleans the Water");
	}
}
