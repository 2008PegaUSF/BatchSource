package com.example.filters;

import javax.servlet.http.HttpServletRequest;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import com.netflix.zuul.exception.ZuulException;

public class MyPreFilter extends ZuulFilter{

	@Override
	public boolean shouldFilter() {
		
		/*
		 * The methods boolean return value determines whether the filter will apply 
		 * 
		 * Advanced Logic here to decide...
		 * 
		 * true means that it will filter. 
		 */
		return true;
	}

	@Override
	public Object run() throws ZuulException {

		/*
		 * This is the actula filter's logic.
		 */
		
		RequestContext context = RequestContext.getCurrentContext();
		HttpServletRequest myRequest = context.getRequest();
		
		System.out.println("this method: " + myRequest.getMethod());
		System.out.println("also, here's the URI: " + myRequest.getRequestURI());
		
		return null;
	}

	@Override
	public String filterType() {

		/*
		 * Returns a String of "pre", "route", "post", or "error"
		 * 
		 * Zuul will parse the String to figure out what type of filter the class should represent. 
		 * 
		 * pre: executres BEFORE the request is routed to the proper service 
		 * route: doctors the URL/routing information/destination
		 * post: executes AFTER the request had gone and comes back with a response. 
		 * error: executes when somethign goes wrong. (e.g. like a 500 error)
		 */
		
		//This creates a pre-filter.
		return "pre";
	}

	@Override
	public int filterOrder() {


		/*
		 * if you have MANY filters of the same type, then you can set a precedence order to them.
		 * 
		 * Numeric order will be the orer that the filer triggers. 
		 */
		return 0;
	}
	

}
