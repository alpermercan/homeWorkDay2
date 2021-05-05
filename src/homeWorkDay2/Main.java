package homeWorkDay2;

public class Main {

	public static void main(String[] args) {
		
		
		Course course1 = new Course(
				"Programlamaya Giriþ Ýçin Temel Kurs",
				"Engin Demiroð",
				0 ,
				1			
				);
		
		Course course2 = new Course(
				"Yazýlým Geliþtirici Yetiþtirme Kampý (C# + Angular)",
				"Engin Demiroð",
				0 ,
				2			
				);
		
		Course course3 = new Course(
				"Yazýlým Geliþtirici Yetiþtirme Kampý (Java + React)",
				"Engin Demiroð",
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

