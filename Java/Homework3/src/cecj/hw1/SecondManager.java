package cecj.hw1;

public class SecondManager extends Employee {
	public SecondManager(String name, char gender, String leaveDate, int tel, String address,
			             double baseSalary, int overtimeHour) {
		super(name, gender, leaveDate, tel, address, baseSalary, overtimeHour);
	}
	
	public double getSalary() {
		if (this.overtimeHour == 0)    // 未加班
			return baseSalary + getSecondManagerBonus();
		else
			return baseSalary + getSecondManagerBonus() + super.getOvertimePay(this.overtimeHour);
	}
	
	private double getSecondManagerBonus() {
		return Bonus.FOOD_ALLOWANCE + Bonus.SECONDMANAGER_DUTY_ALLOWANCE;
	}
	
	public void getInformation() {
		System.out.print("Second Manager: ");
		super.getInformation();
	}
	


}
