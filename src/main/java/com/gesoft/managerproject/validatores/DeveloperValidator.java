package com.gesoft.managerproject.validatores;

import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import com.gesoft.managerproject.model.Developer;

public class DeveloperValidator implements Validator {

	@Override
	public boolean supports(Class<?> clazz) {
        return Developer.class.equals(clazz);
    }

	@Override
	public void validate(Object obj, Errors error) {
		Developer dev = new Developer(); 
			dev = (Developer) obj;
		if(dev.getName().length() < 3){
			error.rejectValue("name", "developer.name", "The developer must have a correct name");
			
		}

	}

}
