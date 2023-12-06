package assignment2;

public class Student {
	String studentName ="S.Valliammai";
	int roll=202311953;
	String collegeName="Manonmanium Sundaranar University";
	int markScored=500;
	float cgpa=90.5f;
	protected void studentDeatails() {
		String studentName ="S.Valliammai";
		System.out.println("StudentName="+studentName);

	}
	public static void main(String[] args) {
		Student details =new Student();
		//global variable
		System.out.println(details.roll);
		System.out.println(details.collegeName);
		
	}

}
