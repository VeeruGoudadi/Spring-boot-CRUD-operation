package com.course.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.course.entity.CousreDto;
import com.course.service.Courseservice;

import java.util.List;

@RestController
public class CourseController {
	
	@Autowired
	Courseservice courseservice;
	
	@PostMapping("/add")
	public ResponseEntity<CousreDto> add(@RequestBody CousreDto dto)
	{
		CousreDto dto2=courseservice.saveCourse(dto);
		return ResponseEntity.ok(dto2);
	}

	@GetMapping("/fetch")
	public ResponseEntity<CousreDto> get(@RequestParam int id)
	{
		CousreDto dto=courseservice.getdetails(id);
		return  ResponseEntity.ok(dto);
	}


	@GetMapping("/getbyname")
	public  ResponseEntity<CousreDto > getbyname(@RequestParam String name)
	{
		CousreDto dto=courseservice.fetching(name);
		return ResponseEntity.ok(dto);
	}

	@PutMapping("/updating")
	public ResponseEntity<CousreDto> update(@RequestBody CousreDto dto)
	{
		CousreDto dto1 =courseservice.update(dto);
		return  ResponseEntity.ok(dto1);
	}

	@DeleteMapping("/deletebyId")
	public ResponseEntity<CousreDto> delete(@RequestParam int id)
	{
		courseservice.deletebyId(id);
		return ResponseEntity.ok().build();
	}

	@GetMapping("/fetchAll")
	public ResponseEntity<List<CousreDto>> fetchall()
	{
		List<CousreDto> dto=courseservice.fetchall();
		return ResponseEntity.ok(dto);
	}
}
