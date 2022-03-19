package com.springboot.backend.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.backend.repo.SoftwareRepo;
import com.springboot.backend.exception.ResourceNotFoundException;
import com.springboot.backend.model.*;

@CrossOrigin(origins = "http://localhost:3000")
@RestController //this is like routes in nodejs
@RequestMapping("/api/v1/")	//base url
public class SoftwareController {

	@Autowired
	private SoftwareRepo SoftwareRepo;
	
	//get all soft
	@GetMapping("/software")	//custom
	public List<SoftBuild> getAllSoft(){
		return SoftwareRepo.findAll();	//this api return list of softBuilds
	}
	
	//insert new software api
	@PostMapping("/software")
	public SoftBuild createSoftBuild(@RequestBody SoftBuild softBuild) {
		return SoftwareRepo.save(softBuild);
	}
	
	
//	@GetMapping("/software/{id}")
//	public SoftBuild getSoftById(@PathVariable Long id) {
//		SoftBuild softBuild = SoftwareRepo.findById(id)
//				.orElseThrow(() -> new ResourceNotFoundException("SoftBuild Not Exist"));
//	return ResponseEntity.ok(softBuild);
//	}
		
	
	@PutMapping("/software/{id}")
	public ResponseEntity<SoftBuild> updateSoft(@PathVariable Long id, @RequestBody SoftBuild softdetails)
	{
		SoftBuild softBuild=SoftwareRepo.findById(id).orElseThrow(()->new ResourceNotFoundException("") )
	}
	
}
