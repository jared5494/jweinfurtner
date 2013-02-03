/**
 * 
 */
package com.jweinfurtner.entity;

import com.amazonaws.services.dynamodb.datamodeling.DynamoDBHashKey;
import com.amazonaws.services.dynamodb.datamodeling.DynamoDBTable;

/**
 * @author Jared Weinfurtner <jweinfurtner@gmail.com>
 * 
 */
@DynamoDBTable(tableName = "users")
public class User {
	private String email;
	private String password;
	private String name;

	@DynamoDBHashKey
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
