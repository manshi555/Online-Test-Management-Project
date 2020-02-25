package QuestionModule;

import java.util.Scanner;

public class Question_operation_perform {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	questionMethod qm=new questionMethod();
	qm.Question();
	qm.displayQuestion();
	System.out.println("Enter your choice : ");
	int choice=sc.nextInt();
	switch(choice)
	{
	case 1:
		qm.addQuestion();//If user want to add question
	case 2:
		qm.updateQuestion();//update in list of questions
	case 3: 
		qm.CalculatetotalMarks();//Calculate total marks 
	default : 
		 System.out.println("There is no method : ");
	}
  }

}
