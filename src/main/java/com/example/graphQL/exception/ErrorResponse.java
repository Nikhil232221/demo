package com.example.graphQL.exception;

import java.time.LocalDateTime;

public class ErrorResponse {

	private String details;
	private LocalDateTime timestamp;
	private String message;

	public ErrorResponse(String message, String details) {
		this.message = message;
		this.details = details;
		this.timestamp = LocalDateTime.now();
	}

	public String getDetails() {
		return details;
	}

	public void setDetails(String details) {
		this.details = details;
	}

	public LocalDateTime getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(LocalDateTime timestamp) {
		this.timestamp = timestamp;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	
}
