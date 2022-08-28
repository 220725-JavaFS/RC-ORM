package com.revature.VehicleDAO;

import java.util.List;

import com.revature.models.Vehicle;

public interface VehicleDAO {
	
	public abstract Vehicle parkVehicle(Vehicle vehicle, int id);
	
	public abstract Vehicle getVehicleByParkingPosition(int parkingPosition);
	
	public abstract Vehicle updateVehicleParkingPosition(int parkingPosition);
	
	public abstract boolean deleteVehicle(int parkingPosition);
	
	List<Vehicle> getAllVehicles();

	List<Vehicle> getAllClientVehicles(List<Vehicle> lot, int id);
	
	
	

}
