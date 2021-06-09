package com.Ebanking.classes;


import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;



@FeignClient (name = "CUSTOMER-SERVICE")
public interface CustomerService {

    @RequestMapping(value = "/api/CustomerIdByEmail/{email}", method = RequestMethod.GET)
    public Long getCustomerIdByEmail(@RequestHeader("Authorization") String jwt, @PathVariable(name = "email") String username);

    @RequestMapping(value = "/api/CustomerAgencyIdById/{id}", method = RequestMethod.GET)
    public Long getCustomerAgencyIdById(@RequestHeader("Authorization") String jwt, @PathVariable( name = "id") Long id);

    @RequestMapping(value = "/api/CustomerAgencyIdByEmail/{email}", method = RequestMethod.GET)
    public Long getCustomerAgencyIdByEmail(@RequestHeader("Authorization") String jwt, @PathVariable(name = "email") String username);

}
