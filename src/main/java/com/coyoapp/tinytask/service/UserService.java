package com.coyoapp.tinytask.service;

import java.util.List;

import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.coyoapp.tinytask.domain.User;

public interface UserService {



	Logger log = LoggerFactory.getLogger(UserService.class);


	List<User> getAllUsers();


	User signIn(@Valid User user);



}
