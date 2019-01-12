package com.projects.humanbodytest.models;

public class Question {
	
	private int number;
	private String answer;
	
	public Question(int number, String answer) {
		this.number = number;
		this.answer = answer;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public String getAnswer() {
		return answer;
	}

	public void setAnswer(String answer) {
		this.answer = answer;
	}
	

}
