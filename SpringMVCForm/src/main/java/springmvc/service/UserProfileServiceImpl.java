package springmvc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import springmvc.dao.UserProfileDao;
import springmvc.model.UserProfile;


@Service("userProfileService")
@Transactional
public class UserProfileServiceImpl implements UserProfileService{
	
	@Autowired
	UserProfileDao dao;
	
	public UserProfile findById(int id) {
	      return dao.findById(id);
	}

	public UserProfile findByType(String type){
	      return dao.findByType(type);
	}

	public List<UserProfile> findAll() {
	      return dao.findAll();
	}
}
