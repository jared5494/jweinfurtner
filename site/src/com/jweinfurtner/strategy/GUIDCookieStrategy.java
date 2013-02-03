package com.jweinfurtner.strategy;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public interface GUIDCookieStrategy {

	public static final String SECURE_GUID_SESSION_KEY = "jweinfurtner";

	/**
	 * Generates a UID and stores it as Cookie and session attribute
	 * 
	 * @param request
	 * @param response
	 */
	void setCookie(HttpServletRequest request, HttpServletResponse response);

	/**
	 * Removes the GUID cookie
	 * 
	 * @param request
	 * @param response
	 */
	void deleteCookie(HttpServletRequest request, HttpServletResponse response);
}
