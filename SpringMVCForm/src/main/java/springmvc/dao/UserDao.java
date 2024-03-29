package springmvc.dao;

import java.util.List;

import springmvc.model.User;


public interface UserDao{

	User findById(int id);
	User findBySSO(String sso);
	void save(User user);
	void deleteBySSO(String sso);
	List<User> findAllUsers();
}

