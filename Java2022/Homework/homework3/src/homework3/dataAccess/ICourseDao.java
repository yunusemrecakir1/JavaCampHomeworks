package homework3.dataAccess;

import homework3.entities.Course;

public interface ICourseDao extends IEntityDao<Course> {
	
	
		 Course getByCategoryId(int categoryId);
		 Course getByInstructorId(int instructorId);
	
	
}