package oopIntroHomework;

public class CoursesManager {
	
	//Kurs ekleme
	public void addCourse(Courses courses) {
		System.out.println(courses.id +" Id'li " +courses.courseName + " Kursu Eklendi...");
	}
	
	//Kurs güncelleme
	public void updateCourse(Courses courses) {
		System.out.println(courses.id +" Id'li " +courses.courseName + " Kursu Guncellendi...");
	}
	
	//Kurs silme
	public void deleteCourse(Courses courses) {
		System.out.println(courses.id +" Id'li " +courses.courseName + " Kursu Silindi...");
	}
}



//BaþakAHLAT