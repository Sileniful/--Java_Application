package users;

import java.util.ArrayList;
import java.util.List;

public class Branch {
	private String address;
	private List< Employee > employeesList = new ArrayList< Employee >();
	private Manager manager;
//
	public Branch( String address, List< Employee > employeesList, Manager manager ) {
		super();
		this.address = address;
		this.employeesList = employeesList;
		this.manager = manager;
	}
	public Branch( String address, List< Employee > employeesList ) {
		super();
		this.address = address;
		this.employeesList = employeesList;
		this.manager = null;
	}
//
	public String getAddress() {
		return address;
	}
	public void setAddress( String address ) {
		this.address = address;
	}
//
	public List< Employee > getEmployeesList() {
		return employeesList;
	}
	public void setEmployeesList( List< Employee > employeesList) {
		this.employeesList = employeesList;
	}
//
	public Manager getManager() {
		return manager;
	}
	public void setManager( Manager manager ) {
		this.manager = manager;
	}
//
}
