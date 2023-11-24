package pre2;

public class rideController {
	
	
	public static void busGo(busTest2 bt2) {
		bt2.busStart(bt2);
	}
	
	public static void takeBus(busTest2 bt) {
		bt.getBusPassenger();
	}
	
	public static void taxiGo(taxiTest2 tt2) {
		tt2.taxiStart(tt2);
	}
	
	public static void takeTaxi(taxiTest2 tt) {
		tt.getTaxiPassenger();
	}
	
	
}
