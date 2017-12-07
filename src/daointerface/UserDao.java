package daointerface;

import pojo.Employee;

public interface UserDao {
	Employee getEmployee(String id,String password);
	Integer insert(Employee e);

}
