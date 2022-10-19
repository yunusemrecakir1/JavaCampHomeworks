package homework3.dataAccess;

import homework3.entities.Instructor;

public class JdbcInstructorDao implements IInstructorDao {

	@Override
	public void add(Instructor entity) {
		System.out.println("Instructor added with JDBC.");

	}

	@Override
	public void delete(Instructor entity) {
		System.out.println("Instructor deleted with JDBC.");

	}

	@Override
	public void update(Instructor entity) {
		System.out.println("Instructor updated with JDBC.");

	}

	@Override
	public Instructor getById(int id) {
		System.out.println("Instructor gotten with JDBC.");
		return null;

	}
	
	public Instructor getByName(String name) {
		System.out.println("Instructor gotten with JDBC.");
		return null;
	}
}