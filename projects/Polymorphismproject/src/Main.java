
public class Main {

	public static void main(String[] args) {

		Employee e=new Employee("Emp1",4000);
		calcBonus(e);

		Manager m = new Manager("Mnagaer1", 6000, "Prj1");

		calcBonus(m);

		Director d = new Director("Dir1", 8000, "Prj1", "Apple");

		calcBonus(d);

		Employee e1 = new Director("", 3, "", "");

	}

	static void calcBonus(Employee e) {
		System.out.println(e.getSalary() * e.getBonusPercent() / 100);

		Manager m = (Manager) e;

		System.out.println(m.getProject());
	}

}
