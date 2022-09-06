package main;

public class Employee {

	int id;
	String code;
	String nic;
	String address;

	public Employee(int id, String code, String nic, String address) {
		super();
		this.id = id;
		this.code = code;
		this.nic = nic;
		this.address = address;
	}

	public Employee() {

	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getNic() {
		return nic;
	}

	public void setNic(String nic) {
		this.nic = nic;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
}
