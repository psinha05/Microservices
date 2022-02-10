
package com.tma.authentication;

//import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.http.CacheControl;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tma.authentication.UserAuthentication;

@RestController

@RequestMapping("/auth")
public class UserAuthenticationController {

	private Logger logger = LoggerFactory.getLogger(this.getClass());

	@Autowired
	private UserServiceProxy proxy;	
		
	@Autowired
	private Environment environment;
	

	@GetMapping("/test")
	public String getData() {
		logger.info("***within the getData() methods*****");
		return "Hello Test";

	}
	
	
	
	@GetMapping("/test-feign")
	public ResponseEntity<List<UserAuthentication>> getAllCustomer() {
		List<UserAuthentication> response = new ArrayList<UserAuthentication>();
		      response = proxy.getAllUsers();		      
		      System.out.println("Test the RESPPPPoooooNNNSSEEEEEE" + response);		         

		logger.info("{}", response);
		     // Object[] objArray = response.toArray();
		      
		     // for(int i=0; i<objArray.length; i++) 
		    	  //System.out.println(objArray[i]);
		   //int port =  userAuth.getPort(); 
		   //System.out.println("#########TO PRINT PORT:########" + environment.getProperty("local.server.port"));
		
              String portLocation = environment.getProperty("local.server.port");
		
		      logger.info("{}", portLocation);
		      
		   return ResponseEntity.ok().cacheControl(CacheControl.noCache()).body(response);  

		//return new UserAuthentication(auth.getId(), auth.getName());

	}

	/*
	 * @GetMapping("/test-feign") public UserAuthentication getAllCustomer() {
	 * UserAuthentication response = new UserAuthentication(); response =
	 * (UserAuthentication) proxy.getAllCustomer();
	 * 
	 * logger.info("{}", response);
	 * 
	 * return new UserAuthentication(response.getId(), response.getName());
	 * 
	 * }
	 */

}
