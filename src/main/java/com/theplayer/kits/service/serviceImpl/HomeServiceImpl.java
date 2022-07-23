package com.theplayer.kits.service.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.theplayer.kits.entity.HomeEntity;
import com.theplayer.kits.repository.HomeRepository;
import com.theplayer.kits.service.HomeService;

@Service
public class HomeServiceImpl implements HomeService{
	
	@Autowired
	HomeRepository homeRepository;

	@Override
	public List<HomeEntity> getAllUser() {
		return (List<HomeEntity>) homeRepository.findAll();  
	}

	@Override
	public void saveUser(HomeEntity user) {
		homeRepository.save(user);
		
	}

	@Override
	public void deleteUser(int id) {
		homeRepository.deleteById(id);
		
	}

	@Override
	public HomeEntity findUserById(int id) {
		return homeRepository.findById(id).get(); 
	}

	@Override
	public List<HomeEntity> deleteAll() {
		homeRepository.deleteAll(getAllUser());
		return null;
	}

	@Override
	public void deleteById(Integer id) {
		homeRepository.deleteById(id);
	}

	@Override
	public void Update(HomeEntity homeEntity) {
		
	}
}
