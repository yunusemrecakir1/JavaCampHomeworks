package homework3.busines;

import homework3.entities.Instructor;

public interface IInstructorService {
	void add(Instructor intructor);
	void delete(Instructor instructr);
	void update(Instructor instructor);
	Instructor getById(int id);
	Instructor getByName(String name);
}