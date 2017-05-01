package com.aisino.rest.impl;

import javax.jws.WebService;
import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.springframework.stereotype.Service;

import com.aisino.domain.User;
import com.aisino.rest.IApiRestService;
//@Path("api")
@WebService
//@Produces({MediaType.APPLICATION_JSON})
//@Consumes({MediaType.APPLICATION_JSON})
@Service("apiRestService")
public class ApiRestServiceImpl implements IApiRestService {

//	@Path("method")
//	@POST
	@Override
	public User method(User arg0) {
		arg0.setId(2);
		arg0.setName("wangzhan");
		return arg0;
	}
}
