package com.example.votingapplication;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import java.util.*;

@Repository
public interface voterlogindatajpa  extends CrudRepository<voterlogindetails , Integer>{

	List<voterlogindetails> findByUsername(String username);
}
