package homework3.busines;

import homework3.core.logging.ILogger;
import homework3.dataAccess.ICourseDao;
import homework3.entities.Course;

public class CourseManager implements ICourseService {
	private ICourseDao _courseDao;
	private ILogger _logger;
	public CourseManager(ICourseDao courseDao, ILogger logger) {
		_courseDao = courseDao;
		_logger=logger;
	}
	
	
	@Override
	public void add(Course course) {
		String courseName = "PHP";
		int coursePrice=5;

		if (course.getName() == courseName) {
			System.out.println("Course already added to database");
			return;
		}
		if (course.get_price()== coursePrice) {
			System.out.println("Prices has to greater than 0");
		}	
		else _courseDao.add(course);
		_logger.log();
		
	}

	@Override
	public void delete(Course course) {
		_courseDao.delete(course);
		_logger.log();
	}

	@Override
	public void update(Course course) {
		_courseDao.update(course);
		_logger.log();
	}

	@Override
	public Course getById(int id) {
		Course course = _courseDao.getById(id);
		_logger.log();
		return course;
		
	}

	@Override
	public Course getByCategoryId(int categoryId) {
		Course course = _courseDao.getByCategoryId(categoryId);
		_logger.log();
		return course;
	}

	@Override
	public Course getByInstructorId(int instructorId) {
		Course course = _courseDao.getByInstructorId(instructorId);
		_logger.log();
		return course;
	}

}