package com.theplayer.kits.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.theplayer.kits.entity.HomeEntity;

@Repository
public interface HomeRepository extends JpaRepository<HomeEntity, Integer>{
	Page<HomeEntity> findAll(Pageable pageable);
}
