package homework3.busines;

import homework3.entities.Course;

public interface ICourseService {
	void add(Course course);
	void delete(Course course);
	void update(Course course);
	Course getById(int id);
	Course getByCategoryId(int categoryId);
	Course getByInstructorId(int instructorId);
	
}