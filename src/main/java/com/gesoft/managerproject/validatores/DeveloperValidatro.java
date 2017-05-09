package com.gesoft.managerproject.validatores;

import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import com.gesoft.managerproject.model.Developer;

public class DeveloperValidatro implements Validator {

	@Override
	public boolean supports(Class clazz) {
        return Developer.class.equals(clazz);
    }

	@Override
	public void validate(Object obj, Errors error) {
		Developer dev = (Developer) obj;
		if(dev.getSkills().size() < 3){
			System.out.println("is not valid developer");
			error.reject("skills", "developer not qualify");
			
		}

	}

}
