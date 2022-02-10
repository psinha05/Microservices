
  package com.tma.authentication;
  
  import java.util.List;

import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;  
import com.tma.authentication.UserAuthentication;
  
//@FeignClient(name="user-data", url="localhost:8000") //feign for calling the other services(user-data,at port:8100)
//@FeignClient(name="user-data")
@FeignClient(name="netflix-zuul-api-gateway-server")
@RibbonClient(name="user-data")
  public interface UserServiceProxy {
  
  
  @GetMapping("/all-users")
  public List<UserAuthentication> getAllUsers();
  
  }
 