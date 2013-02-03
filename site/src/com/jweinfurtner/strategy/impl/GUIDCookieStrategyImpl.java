/**
 * 
 */
package com.jweinfurtner.strategy.impl;

import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.codec.binary.Hex;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.util.CookieGenerator;

import com.jweinfurtner.strategy.GUIDCookieStrategy;

/**
 * @author Jared Weinfurtner <jared.weinfurtner@dmc.de>
 * 
 */
public class GUIDCookieStrategyImpl implements GUIDCookieStrategy {

	private SecureRandom random;
	private MessageDigest sha;

	@Autowired
	private CookieGenerator cookieGenerator;

	public GUIDCookieStrategyImpl() throws NoSuchAlgorithmException {
		random = SecureRandom.getInstance("SHA2PRNG");
		sha = MessageDigest.getInstance("SHA-2");
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.jweinfurtner.strategy.GUIDCookieStrategy#setCookie(javax.servlet.
	 * http.HttpServletRequest, javax.servlet.http.HttpServletResponse)
	 */
	@Override
	public void setCookie(HttpServletRequest request,
			HttpServletResponse response) {

		if (!request.isSecure()) {
			throw new IllegalStateException(
					"Cannot set GUIDCookie on an insecure request!");
		}

		try {
			final String guid = createGUID();
			cookieGenerator.addCookie(response, guid);
			request.getSession().setAttribute(
					GUIDCookieStrategy.SECURE_GUID_SESSION_KEY, guid);

		} catch (final UnsupportedEncodingException e) {
			// nothing yet
		}

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.jweinfurtner.strategy.GUIDCookieStrategy#deleteCookie(javax.servlet
	 * .http.HttpServletRequest, javax.servlet.http.HttpServletResponse)
	 */
	@Override
	public void deleteCookie(HttpServletRequest request,
			HttpServletResponse response) {
		if (!request.isSecure()) {
			// LOG.error("Cannot remove secure GUIDCookie during an insecure request. I should have been called from a secure page.");
		} else {
			// Its a secure page, we can delete the cookie
			cookieGenerator.removeCookie(response);
		}

	}

	protected String createGUID() throws UnsupportedEncodingException {
		final String randomNum = String.valueOf(random.nextInt());
		final byte[] result = sha.digest(randomNum.getBytes("UTF-8"));
		return String.valueOf(Hex.encodeHex(result));
	}

}
