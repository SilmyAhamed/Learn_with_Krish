package main;

public class Application {

	public static void main(String[] args) {

		Employee employee01 = new Employee();
		employee01.setId(100);
		employee01.setCode("V100");
		employee01.setNic("962743269v");
		employee01.setAddress("Ampara");
		System.out.println("Employee ID : " + employee01.getId());
		System.out.println("Employee CODE :" + employee01.getCode());
		System.out.println("Employee NIC : " + employee01.getNic());
		System.out.println("Employee ADDRESS : " + employee01.getAddress());
		
		System.out.println("-------------------------------------------------");
		
		Employee employee02 = new Employee();
		employee02.setId(200);
		employee02.setCode("V200");
		employee02.setNic("952743269v");
		employee02.setAddress("Galle");
		System.out.println("Employee ID : " + employee02.getId());
		System.out.println("Employee CODE :" + employee02.getCode());
		System.out.println("Employee NIC : " + employee02.getNic());
		System.out.println("Employee ADDRESS : " + employee02.getAddress());
		
		System.out.println("-------------------------------------------------");
		
		System.out.println(employee01.getCode() == employee02.getCode());
		System.out.println(employee01.equals(employee02.getCode()));
		
		System.out.println("-------------------------------------------------");
		System.out.println("\n\n\n");
		
		Employee employee03 = new Employee();
		employee03.setId(100);
		employee03.setCode("V100");
		employee03.setNic("962743269v");
		employee03.setAddress("Ampara");
		System.out.println("Employee ID : " + employee03.getId());
		System.out.println("Employee CODE :" + employee03.getCode());
		System.out.println("Employee NIC : " + employee03.getNic());
		System.out.println("Employee ADDRESS : " + employee03.getAddress());
		
		System.out.println("-------------------------------------------------");
		
		System.out.println(employee01.getCode() == employee03.getCode());
		System.out.println(employee01.equals(employee03.getCode()));
		
		System.out.println("-------------------------------------------------");

	}
}
