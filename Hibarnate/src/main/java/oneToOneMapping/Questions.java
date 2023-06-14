package oneToOneMapping;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Questions {
	
	@Id
	private int QId;
	
	@Column(name="Question", length=30)
	private String question;

	@Column(name="QuestionType", length=20)
	private String questionType;
	
	@OneToOne
	private Answers answers;
	
	public Questions(int id, String question, String questionType, Answers answers) {
		super();
		this.QId=id;
		this.question = question;
		this.questionType = questionType;
		this.answers = answers;
	}
	public Questions() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
