package homework3.dataAccess;

import homework3.entities.Instructor;

public interface IInstructorDao extends IEntityDao<Instructor> {
	 Instructor getByName(String name);
}