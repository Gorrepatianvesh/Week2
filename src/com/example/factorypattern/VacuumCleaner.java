package com.example.factorypattern;

public class VacuumCleaner implements VacuumCleanerFactory{

	@Override
	public CarpetVacuumCleaner[] createCarpetVC()
	{
		 CarpetVacuumCleaner cvc[] = {
				 new CanisterCarpetVacuumCleaner(), 
				 new HandheldCarpetVacuumCleaner()
		 };
		 
		 return cvc;
		 
	}
	@Override
	public DirtVacuumCleaner[] createDirtVC()
	{
		DirtVacuumCleaner dvc[] = {
				 new UprightDirtVacuumCleaner(), 
				 new StickDirtVacuumCleaner()
		 };
		 return dvc;
	}
	@Override
	public WaterVacuumCleaner createWaterVC()
	{
		return new DeepWaterVacuumCleaner();
	}
	
}
