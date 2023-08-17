//package game.racers;
//import java.util.Hashtable;
//import game.racers.air.*;
//import game.racers.*;
//import game.racers.naval.*;
//import game.racers.land.*;
//
//
//
//public class RacerCache {
//	private static Hashtable<Integer,Racer> RacerMap = new Hashtable<Integer,Racer>();
//	
//	public static Racer getRacer(int Serialnum) {
//		Racer cachedRacer = RacerMap.get(Serialnum);
//		return (Racer) cachedRacer.clone();
//	}
//	
//	public static void loadCache() {
//		Airplane airplane = new Airplane();
//		RacerMap.put((airplane.getSerialNumber()),airplane);
//		
//		Helicopter helicopter = new Helicopter();
//		RacerMap.put((helicopter.getSerialNumber()),helicopter);
//	}
//
//	
//}
