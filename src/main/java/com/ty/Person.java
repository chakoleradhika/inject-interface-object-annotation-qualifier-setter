package com.ty;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Person 
{
	private Mobile mobile;

	public Mobile getMobile() {
		return mobile;
	}

	@Autowired
	@Qualifier(value="moto")
	public void setMobile(Mobile mobile) {
		this.mobile = mobile;
	}
	
	public void use()
	{
		System.out.println("person is using phone");
		mobile.call();
	}

}
