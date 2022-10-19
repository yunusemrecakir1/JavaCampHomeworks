package homework3.dataAccess;

import homework3.entities.Instructor;

public class NHInstructorDao implements IInstructorDao{

	@Override
	public void add(Instructor entity) {
		System.out.println("Instructor added with NH.");

	}

	@Override
	public void delete(Instructor entity) {
		System.out.println("Instructor deleted with NH.");

	}

	@Override
	public void update(Instructor entity) {
		System.out.println("Instructor updated with Nh.");

	}

	@Override
	public Instructor getById(int id) {
		System.out.println("Instructor gotten with NH.");
		return null;

	}
	
	public Instructor getByName(String name) {
		System.out.println("Instructor gotten with NH.");
		return null;
	}

}