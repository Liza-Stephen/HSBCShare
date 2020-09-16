
public class Manager extends Employee {
	
	String project;

	public Manager(String name, float salary, String project) {
		super(name, salary);
		this.project = project;
	}

	public String getProject() {
		return project;
	}

	public void setProject(String project) {
		this.project = project;
	}
	public int getBonusPercent() {
		return 15;
	}
	

}
