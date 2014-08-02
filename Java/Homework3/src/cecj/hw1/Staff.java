package cecj.hw1;

public class Staff extends Employee {
	Staff(String name, char gender, String leaveDate, int tel, String address,
		                                              double baseSalary, int overtimeHour) {
		super(name, gender, leaveDate, tel, address, baseSalary, overtimeHour);
	}
	
	public double getSalary() {
		if (this.overtimeHour == 0)    // 未加班
			return baseSalary;
		else
			return baseSalary + super.getOvertimePay(this.overtimeHour);
	}
	
	public void getInformation() {
		System.out.print("Staff: ");
		super.getInformation();
	}
}
