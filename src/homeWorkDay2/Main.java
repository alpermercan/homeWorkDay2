package homeWorkDay2;

public class Main {

	public static void main(String[] args) {
		
		
		Course course1 = new Course(
				"Programlamaya Giri� ��in Temel Kurs",
				"Engin Demiro�",
				0 ,
				1			
				);
		
		Course course2 = new Course(
				"Yaz�l�m Geli�tirici Yeti�tirme Kamp� (C# + Angular)",
				"Engin Demiro�",
				0 ,
				2			
				);
		
		Course course3 = new Course(
				"Yaz�l�m Geli�tirici Yeti�tirme Kamp� (Java + React)",
				"Engin Demiro�",
				0 ,
				3 			
				);
		
		
		Course[] courses = {course1, course2, course3};
		
		System.out.println(courses.length + " adet kurs listelendi:");
		
		
		 
		
		
		for(Course course : courses){
			
					System.out.println(course.courseName);
			
			
		}
			
			
		Register register = new Register();
		register.register(course3);
			
		
			
}
		
		
			
		
		
		
		
		
		
		
				

}

