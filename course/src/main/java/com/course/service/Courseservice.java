package com.course.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.course.entity.CousreDto;
import com.course.repository.Courserepo;

import java.util.List;

@Service
@Component
public class Courseservice {
	
	
	@Autowired
	Courserepo courserepo;

	public CousreDto saveCourse(CousreDto dto) {
		// TODO Auto-generated method stub
		return courserepo.save(dto);
	}


    public CousreDto getdetails(int id) {

        return courserepo.findById(id).get();
    }

	public CousreDto fetching(String name) {

		return courserepo.findByName(name);
	}

	public CousreDto update(CousreDto dto)
	{
		CousreDto dto1=courserepo.findById(dto.getId()).get();
		dto1.setName(dto.getName());
		dto1.setLoc(dto.getLoc());
		return courserepo.save(dto1);

	}

	public void deletebyId(int id) {
		   courserepo.deleteById(id);
	}

	public List<CousreDto> fetchall() {
		return courserepo.findAll();
	}
}
