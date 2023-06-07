package inheritance;

public class NewFullTimeEmployee extends NewEmployee{
	
private double overtimeQuota;
	
	public NewFullTimeEmployee(String name, double salary, int accountNumber, double overtimeQuota, boolean isActive)
	{
		super(name,salary, accountNumber, isActive);
		this.setOvertimeQuota(overtimeQuota);
	}
	

	@Override
	double earnings() {
		return getSalary() + getOvertimeQuota();
	}


	public double getOvertimeQuota() {
		return overtimeQuota;
	}


	public void setOvertimeQuota(double overtimeQuota) {
		this.overtimeQuota = overtimeQuota;
	}


}
