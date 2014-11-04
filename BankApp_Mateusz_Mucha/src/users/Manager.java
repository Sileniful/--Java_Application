package users;

public class Manager extends Employee {
	private Branch branch;
//
	public Manager( Branch branch, int salary, int payrollId, String firstName, String lastName, String dateOfB, int id, String address) {
		super( salary, payrollId, firstName, lastName, dateOfB, id, address );
		this.branch = branch;
	}
//
	public Branch getBranch() {
		return branch;
	}
	public void setBranch( Branch branch ) {
		this.branch = branch;
	}
//
}