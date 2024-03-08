package eu.ase.lab3;

import java.util.HashMap;

public class Main {

	public static void main(String[] args) {
		
		Aircraft airplane = new Airplane(80, 4, 925, 11000);
		Aircraft helicopter = new Helicopter(4, 2, 240, 6000);
		
		System.out.println(airplane.toString());
		airplane.takeOff();
		airplane.navigate();
		airplane.land();
		
		System.out.println("-------------------");
		
		System.out.println(helicopter.toString());
		helicopter.takeOff();
		helicopter.navigate();
		helicopter.land();
		
		System.out.println("-------------------");
		
		System.out.println(airplane instanceof Aircraft);
		System.out.println(airplane instanceof Airplane);
		System.out.println(helicopter instanceof Aircraft);
		System.out.println(helicopter instanceof Helicopter);

		System.out.println("-------------------");
		
		System.out.println(airplane.speedPerEngine());
		System.out.println(helicopter.speedPerEngine());
		
		System.out.println("-------------------");

//		System.out.println(Operable.a);
//		
//		Operable.engineWorking();
		
		Airplane airplane2 = new Airplane(60, 2, 880, 10000);
		Helicopter helicopter2 = new Helicopter(4, 1, 160, 4000);
		
		airplane2.startEngine();
		airplane2.stopEngine();
		System.out.println("-------------------");
		helicopter2.startEngine();
		helicopter2.stopEngine();
		
		System.out.println("-------------------");
		
		airplane.startEngine();
		airplane.stopEngine();

		helicopter.startEngine();
		helicopter.stopEngine();
		
		System.out.println("-------------------");
		
		Aircraft[] hangar = new Aircraft[2];
		hangar[0] = airplane;
		hangar[1] = helicopter;
		
		for (Aircraft aircraft : hangar) {
			System.out.println(aircraft.toString());
			aircraft.takeOff();
		}
		
		System.out.println("-------------------");

		
		Operable operable = new Airplane(60, 2, 880, 10000);
		operable.startEngine();
		operable.stopEngine();
		
	}

}
