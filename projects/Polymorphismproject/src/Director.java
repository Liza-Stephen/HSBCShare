
public class Director  extends Manager{

	
	private String client;

	
	public Director(String name, float salary, String project, String client) {
		super(name, salary, project);
		this.client = client;
	}

	public String getClient() {
		return client;
	}

	public void setClient(String client) {
		this.client = client;
	}
	public int getBonusPercent() {
		return 20;
	}
	
}
