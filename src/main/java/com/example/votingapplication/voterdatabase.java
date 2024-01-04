package com.example.votingapplication;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Component
@Repository
public interface voterdatabase  extends JpaRepository<voterdetails , Integer>{

	}


