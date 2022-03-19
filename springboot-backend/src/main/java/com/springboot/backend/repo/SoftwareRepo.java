package com.springboot.backend.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springboot.backend.model.SoftBuild;

@Repository
public interface SoftwareRepo extends JpaRepository<SoftBuild,Long> {

}
