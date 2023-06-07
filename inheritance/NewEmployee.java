package inheritance;

//due to needed changes
public abstract class NewEmployee {
	
	private boolean isActive;
	private String name;
	private double salary;
	private int accountNumber;
	
	public NewEmployee(String name, double salary, boolean isActive, int accountNumber)
	{
		this.setName(name);
		this.setSalary(salary);
		this.setIsActive(isActive);
		this.setAccountNumber(isActive);
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


	public Boolean getIsActive() {
		return isActive;
	}
	
	public int getAccountNumber(){
		return accountNumber;
	}
	
	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}	

	public void setIsActive(boolean isActive) {
		this.isActive = isActive;
	}

}
