package com.revature.VehicleDAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.LinkedList;
import java.util.List;


import com.revature.models.Vehicle;
import com.revature.utils.ConnectionUtil;


public class VehicleDAOImpl implements VehicleDAO {

	@Override
	public Vehicle parkVehicle(Vehicle vehicle, int id) {
		try(Connection conn = ConnectionUtil.getConnection()){
			String sql = "INSERT INTO vehicles(parkingPosition, make, model, color, id) VALUES"
					+ "(?, ?,?, ?, " + id + ");";
			PreparedStatement statement = conn.prepareStatement(sql);
		
			int count =0;
			statement.setInt(++count,vehicle.getParkingPosition());
			statement.setString(++count,vehicle.getMake());
			statement.setString(++count,vehicle.getModel());
			statement.setString(++count,vehicle.getColor());
			
			statement.execute();
				return vehicle;
					
			
		}catch(SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public Vehicle getVehicleByParkingPosition(int parkingPosition) {
		try(Connection conn = ConnectionUtil.getConnection()){
			String sql = "SELECT * FROM vehicles WHERE parkingposition =" + parkingPosition +");";
			Statement statement = conn.createStatement();
			ResultSet result = statement.executeQuery(sql);
			
			if(result.next()) { 
				Vehicle vehicle = new Vehicle(
						result.getString("make"),
						result.getString("model"),
						result.getInt(parkingPosition),
						result.getString("color"));
						return vehicle;
							}
		
		}catch(SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public Vehicle updateVehicleParkingPosition(int parkingPosition) {
		// UPDATE vehicles SET parkingposition = parkingPosition WHERE parkingposition = 003;
		try(Connection conn = ConnectionUtil.getConnection()){
			String sql = "UPDATE vehicles SET parkingposition = " + parkingPosition + " WHERE parkingposition = " + parkingPosition + " );";
			Statement statement = conn.createStatement();
			ResultSet result = statement.executeQuery(sql);
			result.close();
		}catch(SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public boolean deleteVehicle(int parkingPosition) {
		
		try(Connection conn = ConnectionUtil.getConnection()){
			String sql = "DELETE FROM vehicles WHERE parkingposition =" + parkingPosition +");";
			Statement statement = conn.createStatement();
			ResultSet result = statement.executeQuery(sql);
			result.close();
		}catch(SQLException e) {
			e.printStackTrace();
		}
			return true;
	}

	@Override
	public List<Vehicle> getAllClientVehicles(List<Vehicle> lot, int id) {
		// List<Vehicle> result = lot.stream().filter((vehicle)->{
		//			return (vehicle.getId() == id);
			//		}).toList();
		return null;
	}

	@Override
	public List<Vehicle> getAllVehicles() {
		try(Connection conn = ConnectionUtil.getConnection()){
			String sql = "SELECT * FROM vehicles;";
			Statement statement = conn.createStatement();
			ResultSet result = statement.executeQuery(sql);
			
			List<Vehicle> lotList = new LinkedList<Vehicle>();
			
			while(result.next()) { 
				Vehicle vehicle = new Vehicle(
						result.getString("make"),
						result.getString("model"),
						result.getInt("parkingPosition"),
						result.getString("color"),
						result.getInt("id"));
				
				lotList.add(vehicle);
			}
			
			return lotList;
			
		}catch(SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

}
