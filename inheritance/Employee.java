package inheritance;

public abstract class Employee {
	
	private String name;
	private double salary;
	private int accountnumber;
	
	
	public Employee(String name, double salary, int accountnumber )
	{
		this.setName(name);
		this.setSalary(salary);
		this.setAccountnumber(accountnumber);
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public double getSalary() {
		return salary;
	}


	public void setSalary(double salary) {
		this.salary = salary;
	}

	abstract double earnings();


	public int getAccountnumber() {
		return accountnumber;
	}


	public void setAccountnumber(int accountnumber) {
		this.accountnumber = accountnumber;
	}
}
