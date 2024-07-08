package com.course.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.course.entity.CousreDto;

@Repository
public interface Courserepo extends JpaRepository<CousreDto, Integer> {

    public CousreDto findByName(String name);
	
	

}
