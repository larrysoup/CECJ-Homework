package cecj.hw1;

public class FirstManager extends Employee {
	public FirstManager(String name, char gender, String leaveDate, int tel, String address,
			            double baseSalary, int overtimeHour) {
		super(name, gender, leaveDate, tel, address, baseSalary, overtimeHour);
	}
	
	public double getSalary() {
		if (this.overtimeHour == 0)    // 未加班
			return baseSalary + getFirstManagerBonus();
		else
			return baseSalary + getFirstManagerBonus() + super.getOvertimePay(this.overtimeHour);
	}
	
	private double getFirstManagerBonus() {
		return Bonus.FOOD_ALLOWANCE + Bonus.TRANSPORT_ALLOWANCE + Bonus.FIRSTMANAGER_DUTY_ALLOWANCE;
	}
	
	public void getInformation() {
		System.out.print("First Manager: ");
		super.getInformation();
	}
}
