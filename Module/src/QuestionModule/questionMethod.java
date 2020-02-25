package QuestionModule;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Iterator;
import java.util.Scanner;
import java.util.*;

public class questionMethod {
	public String str[]=new String[4];
	ArrayList<question> ap =new ArrayList<question>();
	Scanner sc=new Scanner(System.in);
public void Question()
{
	question q=new question();
	q.setQuestionId(1);
	q.setQuestionTitle(" What would be the behaviour if this() and super() used in a method?");
	String [] st=new String[] {"1) Runtime error\n" + 
			"2) Throws exception\r\n" + 
			"3) compile time error\r\n" + 
			"4) Runs successfully"};
	q.setQuestionOptions(st);
	q.setQuestionAnswer(3);
	q.setQuestionMarks(1.0);
	question q1=new question();
	q1.setQuestionId(2);
	q1.setQuestionTitle("What would be the behaviour if one parameterized constructor is explicitly defined?");
	String [] st1=new String[] {"1) Compilation error\r\n" + 
			"2) Compilation succeeds\r\n" + 
			"3) Runtime error\r\n" + 
			"4) Compilation succeeds but at the time of creating object using default constructor, it throws compilation error"};
	q1.setQuestionOptions(st1);
	q1.setQuestionAnswer(4);
	q1.setQuestionMarks(1.0);
	question q2=new question();
	q2.setQuestionId(3);
	q2.setQuestionTitle(" What would be behaviour if the constructor has a return type?");
	String [] st2=new String[] {"1) Compilation error\r\n" + 
			"2) Runtime error\r\n" + 
			"3) Compilation and runs successfully\r\n" + 
			"4) Only String return type is allowed"};
	q2.setQuestionOptions(st2);
	q2.setQuestionAnswer(1);
	q2.setQuestionMarks(1.0);
	question q3=new question();
	q3.setQuestionId(4);
	q3.setQuestionTitle(" Which of these method of String class is used to obtain character at specified index?");
	String [] st3=new String[] {"1) char()\r\n" + 
			"2) Charat()\r\n" + 
			"3) charat()\r\n" + 
			"4) charAt()"};
	q3.setQuestionOptions(st3);
	q3.setQuestionAnswer(4);
	q3.setQuestionMarks(1.0);
	question q4=new question();
	q4.setQuestionId(5);
	q4.setQuestionTitle("Which of these method of String class can be used to test to strings for equality?");
	String [] st4=new String[] {"1) isequal()\r\n" + 
			"2) isequals()\r\n" + 
			"3) equal()\r\n" + 
			"4) equals()"};
	q4.setQuestionOptions(st4);
	q4.setQuestionAnswer(4);
	q4.setQuestionMarks(1.0);
	question q5=new question();
	q5.setQuestionId(6);
	q5.setQuestionTitle("Which of these is a super class of all exceptional type classes?");
	String [] st5=new String[] {"1) String\r\n" + 
			"2) RuntimeExceptions\r\n" + 
			"3) Throwable\r\n" + 
			"4) Cacheable"};
	q5.setQuestionOptions(st5);
	q5.setQuestionAnswer(3);
	q5.setQuestionMarks(1.0);
	question q6=new question();
	q6.setQuestionId(7);
	q6.setQuestionTitle("Which of these is correct way of calling a constructor having no parameters, of superclass A by subclass B?");
	String [] st6=new String[] {"1) super(void);\r\n" + 
			"2) superclass.();\r\n" + 
			"3) super.A();\r\n" + 
			"4) super();"};
	q6.setQuestionOptions(st6);
	q6.setQuestionAnswer(4);
	q6.setQuestionMarks(1.0);
	question q7=new question();
	q7.setQuestionId(8);
	q7.setQuestionTitle(" Which of these keywords can be used to prevent Method overriding?");
	String [] st7=new String[] {"1) static\r\n" + 
			"2) constant\r\n" + 
			"3) protected\r\n" + 
			"4) final"};
	q7.setQuestionOptions(st7);
	q7.setQuestionAnswer(4);
	q7.setQuestionMarks(1.0);
	question q8=new question();
	q8.setQuestionId(9);
	q8.setQuestionTitle(" Which of these is not abstract?");
	String [] st8=new String[] {"1) Thread\r\n" + 
			"2) AbstractList\r\n" + 
			"3) List\r\n" + 
			"4) None of the Mentioned"};
	q8.setQuestionOptions(st8);
	q8.setQuestionAnswer(1);
	q8.setQuestionMarks(1.0);
	question q9=new question();
	q9.setQuestionId(10);
	q9.setQuestionTitle("Which of these packages contains abstract keyword?");
	String [] st9=new String[] {"1) java.lang\r\n" + 
			"2) java.util\r\n" + 
			"3) java.io\r\n" + 
			"4) java.system"};
	q9.setQuestionOptions(st9);
	q9.setQuestionAnswer(1);
	q9.setQuestionMarks(1.0);
	ap.add(q);
	ap.add(q1);
	ap.add(q2);
	ap.add(q3);
	ap.add(q4);
	ap.add(q5);
	ap.add(q6);
	ap.add(q7);
	ap.add(q8);
	ap.add(q9);
}
public void displayQuestion()
{
	
	    updateQuestion();
	try
	{
		System.out.println("                ONLINE TEST MANAGEMENT PROJECT                 \n");
		Iterator itr=ap.iterator();
		
		while(itr.hasNext())
		{
			question qu=(question)itr.next();
			System.out.println(qu.getQuestionId()+") "+qu.getQuestionTitle()+"\n\n"+Arrays.toString(qu.getQuestionOptions())+"\n");
		      
		}
	}
		catch(Exception e1)
	{
			System.out.println(e1);
		}
	  }

  public ArrayList<question> addQuestion()
   {
	  ArrayList<question> testquestion=new ArrayList<question>();
	  try
	  {
		  int i=0;
		System.out.println("Enter the number of question you want to add...");  
		int n=sc.nextInt();
		while(i<n)
		{
			question ques=new question();
			System.out.println("Enter question id");
			int questionId=sc.nextInt();
			System.out.println("Enter Question Title : ");
			String questionTitle=sc.nextLine();
			System.out.println("Enter Question marks : ");
			double questionMarks=sc.nextDouble();
			System.out.println("Enter question option : ");
			for(int j=0;j<4;j++)
			{
				str[j]=sc.nextLine();
				ques.setQuestionOptions(str);
			}
			   
			System.out.println("Enter correct Answer : ");
			int questionAnswer=sc.nextInt();
			i++;
			if(ques.getQuestionId()==0)  //Exception question id cannot be null
			  {
				throw new NullException("Question Id cannot be null....");
			  }
		}
		
	  }
	  
	  catch(NumberFormatException e)
	  {
		  System.out.println(e);
	  }
	  catch(NullException e)// creating UserDefined Exception
		{
			 System.out.println(e);
		}
	  catch(InputMismatchException e1)
		{
		   System.out.println(e1);
		}
	return testquestion;
   }
  public void updateQuestion()
  {
	  ap.addAll(addQuestion());
  }
  public void CalculatetotalMarks()
  {
	  double sum=0;
	  try
	  {
		  Iterator itr=ap.iterator();
			while(itr.hasNext())
			{
				question qu=(question)itr.next();
				System.out.println("Enter your answer : ");
				int ans=sc.nextInt();
				System.out.print("\n");
			    qu.setChosenAnswer(ans);
				if(qu.getQuestionAnswer()==qu.getChosenAnswer())
				{
				   System.out.println("Correct.");
				   System.out.print("\n");
					 sum=sum+qu.getMarkScored();
					 sum++;
				}
				else
				{
					System.out.println("Not Correct.");
					System.out.println("Correct answer is : "+qu.getQuestionAnswer()+"\n");
				}
			}
			System.out.println("Total marks : "+sum+" out of 10.0");
			
			
	  }
	  catch(InputMismatchException e1)
		{
		   System.out.println(e1);
		}
	  
  }
}





