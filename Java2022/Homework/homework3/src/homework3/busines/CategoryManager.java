package homework3.busines;

import homework3.core.logging.ILogger;
import homework3.dataAccess.ICategoryDao;
import homework3.entities.Category;

public class CategoryManager implements ICategoryService {

	private ICategoryDao _categoryDao;
	private ILogger _logger;

	public CategoryManager(ICategoryDao categoryDao, ILogger logger) {
		_categoryDao = categoryDao;
		_logger= logger;
	}

	@Override
	public void add(Category category) {
		
		String categoryName = "PHP";

		if (category.getName() == categoryName) {
			System.out.println("Category already added to database");
		}
		else _categoryDao.add(category);
		_logger.log();
	
	}

	@Override
	public void delete(Category category) {
		_categoryDao.delete(category);
		_logger.log();
	}

	@Override
	public void update(Category category) {
		_categoryDao.update(category);
		_logger.log();
	}

	@Override
	public Category getById(int id) {
		Category category = _categoryDao.getById(id);
		_logger.log();
		return category;
		
	}

}
