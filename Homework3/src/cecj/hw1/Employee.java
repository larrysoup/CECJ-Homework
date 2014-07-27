package cecj.hw1;

public abstract class Employee {
	protected String name;
	protected char gender;
	protected String leaveDate;
	protected int tel;
	protected String address;
	protected double baseSalary;
	protected int overtimeHour;
	public Employee(String name, char gender, String leaveDate, int tel, String address, 
			        double baseSalary, int overtimeHour) {
		this.name = name;
		this.gender = gender;
		this.leaveDate = leaveDate;
		this.tel = tel;
		this.address = address;
		this.baseSalary = baseSalary;
		this.overtimeHour = overtimeHour;
	}
	
	public double getOvertimePay (int overtimeHour) {
		return ((this.baseSalary / Bonus.OVERTIME_DIVISOR) * Bonus.OVERTIME_RATE) * overtimeHour;
	}
	
	public abstract double getSalary ();
	
	public void getInformation() {
		System.out.println(name + ", " + gender + ", " + leaveDate + ", " + 
	                       tel + ", " + address + "," + getSalary());
	}
}
