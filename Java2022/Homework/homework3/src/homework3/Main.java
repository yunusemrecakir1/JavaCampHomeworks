package homework3;

import homework3.busines.CategoryManager;
import homework3.busines.CourseManager;
import homework3.busines.InstructorManager;
import homework3.core.logging.DatabaseLogger;
import homework3.core.logging.FileLogger;
import homework3.core.logging.MailLogger;
import homework3.dataAccess.JdbcCategoryDao;
import homework3.dataAccess.JdbcInstructorDao;
import homework3.dataAccess.NHCourseDao;
import homework3.entities.Category;
import homework3.entities.Course;
import homework3.entities.Instructor;

public class Main {

	public static void main(String[] args) {
		Instructor instructor = new Instructor();
		instructor.setId(1);
		instructor.setFirstName("Yunus");
		instructor.setLastName("Emre");
		instructor.setBiography("Helo");
		instructor.setImageUrl("image.jpg");
		
		Course course = new Course();
		course.setId(1);
		course.setCategoryId(1);
		course.setCompletePercent(25);
		course.setInstructorId(1);
		course.setName("Porromlama");
		
		Category category = new Category();
		category.setId(1);
		category.setName("Nyayz");
		
		CategoryManager categoryManager=new CategoryManager(new JdbcCategoryDao(),new MailLogger());
		categoryManager.update(category);
		
		
		
		CourseManager courseManager=new CourseManager(new NHCourseDao(), new DatabaseLogger());
		courseManager.delete(course);
		
		
		
		
		InstructorManager instructorManager= new InstructorManager(new JdbcInstructorDao(), new FileLogger());
		instructorManager.add(instructor);
		
		
		
		
		
		
	}
}