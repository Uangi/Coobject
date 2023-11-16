package controller;

import model.Bus;
import model.Student;
import view.BusView;

public class BusController {

	private Student student;
	private Bus bus;
	private BusView busview;
	
	public BusController(Bus bus, BusView busview) {
		this.bus = bus;
		this.busview =  busview;
	}
}
