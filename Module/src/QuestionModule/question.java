package QuestionModule;

public class question {
int questionId;
String questionTitle;
int questionAnswer;
double questionMarks;
int chosenAnswer;
double markScored;
String [] questionOptions;
public int getQuestionId() {
	return questionId;
}
public void setQuestionId(int questionId) {
	this.questionId = questionId;
}
public String getQuestionTitle() {
	return questionTitle;
}
public void setQuestionTitle(String questionTitle) {
	this.questionTitle = questionTitle;
}
public int getQuestionAnswer() {
	return questionAnswer;
}
public void setQuestionAnswer(int questionAnswer) {
	this.questionAnswer = questionAnswer;
}
public double getQuestionMarks() {
	return questionMarks;
}
public void setQuestionMarks(double questionMarks) {
	this.questionMarks = questionMarks;
}
public int getChosenAnswer() {
	return chosenAnswer;
}
public void setChosenAnswer(int chosenAnswer) {
	this.chosenAnswer = chosenAnswer;
}
public double getMarkScored() {
	return markScored;
}
public void setMarkScored(double markScored) {
	this.markScored = markScored;
}
public String[] getQuestionOptions() {
	return questionOptions;
}
public void setQuestionOptions(String[] questionOptions) {
	this.questionOptions = questionOptions;
}

}
