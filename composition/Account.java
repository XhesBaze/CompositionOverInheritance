package composition;

public class Account {
	
	private int number;
	private boolean isActive;
	
	public Account(int number, boolean isActive)
	{
		this.setNumber(number);
		this.setIsActive(isActive);
	}
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public Boolean getIsActive() {
		return isActive;
	}
	public void setIsActive(boolean isActive) {
		this.isActive = isActive;
	}

}
