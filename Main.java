package oopIntroHomework;

public class Main {

	public static void main(String[] args) {
		Courses course1 = new Courses(0001, 0, 0.0,
				"Yazilim Gelistirici Kampi (Java + React)",
				"Engin Demirog",
				"Java + React",
				"2 ay surecek yazilim gelistirici yetistirme kampi duyurulari burada olacak",
				"Java kurs görseli");

		Courses course2 = new Courses(0010, 0, 0.0,
				"Yazilim Gelistirici Yetiþtirme Kampi (C# + Angular)",
				"Engin Demirog",
				"C# + Angular", 
				"2 ay surecek yazilim gelistirici yetistirme kampi duyurulari burada olacak",
				"C# kurs görseli");

		Courses course3 = new Courses(0011, 0, 0.0,
				"Programlamaya Giris Icin Temel Kurs",
				"Engin Demirog",
				"C# ,Java , Python", 
				"2 ay surecek yazilim gelistirici yetistirme kampi duyurulari burada olacak",
				"kurs görseli");
		
		Courses[] courses = {course1, course2, course3};
		
		System.out.println("***");
		
		//Sadece kurs adlarýný ekrana yazdýrdýk
		for (Courses course : courses) {
			System.out.println(course.courseName);
		} //for sonu
		
		Banners banner1= new Banners(1, "Profile","https://sso.teachable.com/secure/499959/current_user/profile" );
		Banners banner2= new Banners(2, "HomePage","https://www.kodlama.io/" );
		Banners banner3 = new Banners(3, "Kurslarim","https://www.kodlama.io/courses/enrolled" );
		Banners banner4 = new Banners(4, "Tum Kurslar","https://www.kodlama.io/courses" );
		Banners banner5 = new Banners(5, "Kampa Hazirlik","https://www.kodlama.io/p/kampa-hazirlik" );
		Banners banner6 = new Banners(6, "SSS","https://www.kodlama.io/p/sorular" );
		
		Banners[] banners = {banner1,banner2,banner3,banner4,banner5,banner6};
		
		System.out.println("***");
		
		//Sadece adlarýný ekrana yazdýrdýk
		for (Banners banner : banners) {
			System.out.println(banner.name);
		}
		
		System.out.println("***");
		
		CoursesManager courseManager= new CoursesManager();
		
		courseManager.addCourse(course1);
		courseManager.updateCourse(course1);
		courseManager.deleteCourse(course1);
		
		System.out.println("***");
		
		courseManager.addCourse(course2);
		courseManager.updateCourse(course2);
		courseManager.deleteCourse(course2);
		
		System.out.println("***");
		
		courseManager.addCourse(course3);
		courseManager.updateCourse(course3);
		courseManager.deleteCourse(course3);

	}

}
