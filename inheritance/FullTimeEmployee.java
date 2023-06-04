package inheritance;

public class FullTimeEmployee extends Employee{
	
	private double overtimeQuota;
	
	public FullTimeEmployee(String name, double salary,int accountnumber, double overtimeQuota)
	{
		super(name,salary,accountnumber);
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
