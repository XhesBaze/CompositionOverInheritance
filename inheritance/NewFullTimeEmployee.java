package inheritance;

public class NewFullTimeEmployee extends NewEmployee{
	
private double overtimeQuota;
	
	public NewFullTimeEmployee(String name, double salary, double overtimeQuota, Boolean isActive)
	{
		super(name,salary,isActive);
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
