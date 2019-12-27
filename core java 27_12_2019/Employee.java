public class Employee implements Comparable{
	private int id;
	private String name;
	private String designation;
	
	
	public Employee(int id, String name, String designation) {
		this.id = id;
		this.name = name;
		this.designation = designation;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	@Override
	public int compareTo(Object o) {
		Employee e=(Employee)o;
		String designation1=e.getDesignation();
		String designation2=this.getDesignation();
		
		return designation2.compareTo(designation1);
	}
	@Override
	public String toString() {
		return "Employee [Id=" + id + ", name=" + name + ", Designation="
				+ designation + "]\n";
	}
	
}