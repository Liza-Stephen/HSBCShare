package inheritanceproject;

public class Main {

	public static void main(String[] args) {

		Student s1 = new Student();

		s1.display();

		System.out.println("+++++++++++++++++");
		s1 = new BoarderStudent();

		s1.display();

	}

}
