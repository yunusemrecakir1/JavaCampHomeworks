package homework3.dataAccess;

import homework3.entities.Category;

public class JdbcCategoryDao implements ICategoryDao{

	@Override
	public void add(Category entity) {
		System.out.println("Category added with JDBC");
		
	}

	@Override
	public void delete(Category entity) {
		System.out.println("Category deleted with JDBC");
		
	}

	@Override
	public void update(Category entity) {
		System.out.println("Category updated with JDBC");
		
	}

	@Override
	public Category getById(int id) {
		System.out.println("Category gotten with JDBC");
		return null;
	}

}
