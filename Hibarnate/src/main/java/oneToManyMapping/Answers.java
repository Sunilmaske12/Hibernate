package oneToManyMapping;

import javax.persistence.Entity;

import javax.persistence.Id;

@Entity(name="myAnswers")
public class Answers {
	
	@Id
	int aId;
	String answer;
	String answerType;
	
	public Answers() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Answers(int id, String answer, String answerType) {
		super();
		this.aId=id;
		this.answer = answer;
		this.answerType = answerType;
	}
	
	
}
