package com.shacheru.primesservice.repository;

import java.io.IOException;

import com.shacheru.primesservice.model.Customer;

public interface IAuthenticationRepository {

	boolean save(Customer customer) throws IOException;
	
	Customer findByUsername(String username) throws IOException;
}
