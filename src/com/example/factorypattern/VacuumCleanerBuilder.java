package com.example.factorypattern;

public class VacuumCleanerBuilder{

	 CarpetVacuumCleaner carpetVC;
	 DirtVacuumCleaner  dirtVC;
	 
	 public void Dirt()
	 {
     dirtVC =  new StickDirtVacuumCleaner();
	 dirtVC.cleanDirt();
     dirtVC =	 new UprightDirtVacuumCleaner();
	 dirtVC.cleanDirt();
	 
	 }
	 
	 public void Carpet()
	 {
     carpetVC =  new CanisterCarpetVacuumCleaner();
	 carpetVC.cleanCarpet();
     carpetVC =	 new HandheldCarpetVacuumCleaner();
	 carpetVC.cleanCarpet();
	 
	 }
     public void Water()
     {
    	 WaterVacuumCleaner waterVC = new DeepWaterVacuumCleaner();
    	 waterVC.cleanWater();
     }
     
     
}
