package composition;

public abstract class Employee {

	private String name;
	private double salary;
	private Account account;
	
	
	public Employee(String name, double salary, Account account)
	{
		this.setName(name);
		this.setSalary(salary);
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


	public Account getAccount() {
		return account;
	}


	public void setAccount(Account account) {
		this.account = account;
	}

	abstract double earnings();
}
