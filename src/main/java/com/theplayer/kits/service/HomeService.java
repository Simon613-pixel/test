package com.theplayer.kits.service;

import java.util.List;


import com.theplayer.kits.entity.HomeEntity;


public interface HomeService {
	
	  List<HomeEntity> getAllUser(); 
	  
	  void saveUser(HomeEntity user);  

	  void deleteUser(int id);  

	  HomeEntity findUserById(int id);   
	  
	  List<HomeEntity> deleteAll();

	  void deleteById(Integer id);
	  
	  void Update(HomeEntity homeEntity);




	  
	  
}
