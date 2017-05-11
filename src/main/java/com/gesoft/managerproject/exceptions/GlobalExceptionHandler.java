package com.gesoft.managerproject.exceptions;

import javax.servlet.http.*;

import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.ModelAndView;

@Component
public class GlobalExceptionHandler implements HandlerExceptionResolver {

	@Override
	public ModelAndView resolveException(HttpServletRequest request, HttpServletResponse response, Object handler,
			Exception exception) {
		ModelAndView model = new ModelAndView();
		model.setViewName("errror-exception");
		return model;
	}

}
