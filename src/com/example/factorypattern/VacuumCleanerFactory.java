package com.example.factorypattern;

public interface VacuumCleanerFactory {

	public CarpetVacuumCleaner[] createCarpetVC();
	public DirtVacuumCleaner[] createDirtVC();
	public WaterVacuumCleaner createWaterVC();
	
}
