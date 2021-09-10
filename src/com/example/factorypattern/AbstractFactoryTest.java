package com.example.factorypattern;

import java.util.ArrayList;
import java.util.List;


public class AbstractFactoryTest {

	public static void main(String[] args) {   
    VacuumCleanerBuilder bvc= new VacuumCleanerBuilder();
    bvc.Dirt();
    bvc.Carpet();
    bvc.Water();
    
 }    
}
