package oneToManyMapping;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity(name="myQuestions")
public class Questions {
	
	@Id
	private int QId;
	
	@Column(name="Question", length=30)
	private String question;

	@Column(name="QuestionType", length=20)
	private String questionType;
	
	@OneToMany
	private List<Answers> answers;
	
	
	public Questions(int qId, String question, String questionType, List<Answers> answers) {
		super();
		QId = qId;
		this.question = question;
		this.questionType = questionType;
		this.answers = answers;
	}


	public Questions() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
