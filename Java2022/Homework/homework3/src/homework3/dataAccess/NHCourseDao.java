package homework3.dataAccess;

import homework3.entities.Course;

public class NHCourseDao implements ICourseDao {

	@Override
	public void add(Course entity) {
		System.out.println("Course with added NH");
		
	}

	@Override
	public void delete(Course entity) {
		System.out.println("Course with deleted NH");
		
	}

	@Override
	public void update(Course entity) {
		System.out.println("Course with update NH");
		
	}

	@Override
	public Course getById(int id) {
		System.out.println("Course gotten with NH");
		return null;
	}

	@Override
	public Course getByCategoryId(int categoryId) {
		System.out.println("Course gotten with NH.");
		return null;
	}

	@Override
	public Course getByInstructorId(int instructorId) {
		System.out.println("Course gotten with NH.");
		return null;
	}

}
