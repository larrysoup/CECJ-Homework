package cecj.hw1;

public class EmployeeMain {
	public static void main(String[] args) {
		Employee[] emp = {
		    new Staff("Jack", 'M', "1991-12-11", 1535555555, "dfdfdfdf", 30000, 0),
		    new Staff("Jacko", 'M', "1991-12-11", 1535555555, "dfdfdfdf", 30000, 10),
		    new FirstManager("Mary", 'F', "1991-12-10", 1465465, "sdfaasd", 50000, 0),
			new FirstManager("Maryo", 'F', "1991-12-10", 1465465, "sdfaasd", 50000, 10),
			new SecondManager("kelly", 'F', "1991-12-10", 1465465, "sdfaasd", 40000, 0),
			new SecondManager("kellyo", 'F', "1991-12-10", 1465465, "sdfaasd", 40000, 10)
		};
		
		for (Employee people : emp)
			people.getInformation();
	}
}
