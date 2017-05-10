package com.gesoft.managerproject.exceptions;

import javax.servlet.http.*;
import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.ModelAndView;

public class GlobalExceptionHandler implements HandlerExceptionResolver {

	@Override
	public ModelAndView resolveException(HttpServletRequest request, HttpServletResponse response, Object handler,
			Exception exception) {
		ModelAndView model = new ModelAndView();
		model.setViewName("error-exeption");
		return model;
	}

}
