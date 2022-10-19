package homework3.busines;

import homework3.core.logging.ILogger;
import homework3.dataAccess.IInstructorDao;
import homework3.entities.Instructor;

public class InstructorManager implements IInstructorService {

	private IInstructorDao _instructorDao;
	private ILogger _logger;
	public InstructorManager(IInstructorDao instructorDao, ILogger logger){
		 _instructorDao = instructorDao;
		 _logger=logger;
	}
	
	
	@Override
	public void add(Instructor intructor) {
		_instructorDao.add(intructor);
		_logger.log();
		
	}

	@Override
	public void delete(Instructor instructr) {

		_instructorDao.delete(instructr);
		_logger.log();
		
	}

	@Override
	public void update(Instructor instructor) {
		_instructorDao.update(instructor);
		_logger.log();
		
	}

	@Override
	public Instructor getById(int id) {
		
		Instructor instructor=_instructorDao.getById(id);
		_logger.log();
		return instructor;
	}

	@Override
	public Instructor getByName(String name) {
		Instructor intructor=_instructorDao.getByName(name);
		_logger.log();
		return intructor;
	}
	

}
