package springmvc.service;

import java.util.List;
import springmvc.model.UserProfile;


public interface UserProfileService{
	
	UserProfile findById(int id);
	UserProfile findByType(String type);
	List<UserProfile> findAll();	
}
