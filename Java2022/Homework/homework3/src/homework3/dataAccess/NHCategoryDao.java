package homework3.dataAccess;

import homework3.entities.Category;

public class NHCategoryDao implements ICategoryDao {

	@Override
	public void add(Category entity) {
		System.out.println("Category added with NH");
		
	}

	@Override
	public void delete(Category entity) {
		System.out.println("Category deleted with NH");
		
	}

	@Override
	public void update(Category entity) {
		System.out.println("Category deleted with NH");
		
	}

	@Override
	public Category getById(int id) {
		System.out.println("Category gotten with NH");
		return null;
	}

}
