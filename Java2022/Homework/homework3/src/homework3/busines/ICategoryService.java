package homework3.busines;

import homework3.entities.Category;

public interface ICategoryService {
	void add(Category category);
	void delete(Category category);
	void update(Category category);
	Category getById(int id);
}
