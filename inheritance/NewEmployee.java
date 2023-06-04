package inheritance;

//due to needed changes
public abstract class NewEmployee {
	
	private Boolean isActive;
	private String name;
	private double salary;
	
	
	public NewEmployee(String name, double salary, Boolean isActive )
	{
		this.setName(name);
		this.setSalary(salary);
		this.setIsActive(isActive);
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


	public void setIsActive(Boolean isActive) {
		this.isActive = isActive;
	}

}
