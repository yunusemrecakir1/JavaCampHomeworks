package homework3.dataAccess;

public interface IEntityDao<T> {
	 void add(T entity);
	 void delete(T entity);
	 void update(T entity);
	 T getById(int id);
	
}