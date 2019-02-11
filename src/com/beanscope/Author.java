package com.beanscope;

public class Author {
	
	private String authId, authorName;

	public Author(){
		
	}
	
	public Author(String authId, String authorName) {
		super();
		this.authId = authId;
		this.authorName = authorName;
	}

	public String getAuthId() {
		return authId;
	}

	public void setAuthId(String authId) {
		this.authId = authId;
	}

	public String getAuthorName() {
		return authorName;
	}

	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}
	

}
