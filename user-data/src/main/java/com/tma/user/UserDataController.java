package com.tma.user;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
//@RequestMapping("/data")
public class UserDataController {
	
private Logger logger = LoggerFactory.getLogger(this.getClass());
	
	@Autowired
	private Environment environment;
	
	@Autowired
	private UserDataRepository userDataRepo;

	@GetMapping("/all-users")
	public List<UserData> getAllUsers() {		
		//UserService userService = (UserService) userRepository.findAll();		
		//userService.setPort(Integer.parseInt(environment.getProperty("local.server.port")));
		//logger.info("{}", userService);
		//return userService;
		//userServ.findAll();
		return userDataRepo.findAll();
	}


}
