import java.util.*;

public class Quiz
{
    private final ArrayList <Question> questions;

    public Quiz()
    {
        questions = new ArrayList<>();

        questions.add(new TrueFalse("Houston is the capital of Texas.","F"));
        questions.add(new MultipleChoice("The capital of Texas is",
                "Houston",
                "San Antonio",
                "Austin",
                "Dallas",
                "Austin"));
        questions.add(new MultipleChoice("The largest city in Texas is",
                "Houston",
                "San Antonio",
                "Austin",
                "Dallas",
                "Houston"));
        questions.add(new TrueFalse("The tallest mountain in Texas is Guadalupe Peak.", "T"));

        displayTest();
    }

    // prints the entire quiz numbering the questions from 1 to question.size()
    public void displayTest()
    {
        for(int i = 0; i < questions.size(); i++)
        {
            if(questions.get(i) instanceof MultipleChoice)
            {
                System.out.println(i + 1 + ". " + questions.get(i).getQuestion());
                System.out.println("a. " + ((MultipleChoice) questions.get(i)).choiceOne);
                System.out.println("b. " + ((MultipleChoice) questions.get(i)).choiceTwo);
                System.out.println("c. " + ((MultipleChoice) questions.get(i)).choiceThree);
                System.out.println("d. " + ((MultipleChoice) questions.get(i)).choiceFour);
                System.out.println("Answer: " + ((MultipleChoice) questions.get(i)).choiceAnswer);
                System.out.println();
            }
            else
            {
                System.out.println(i + 1 + ". T/F " + questions.get(i).getQuestion());
                System.out.println("Answer: " + ((TrueFalse) questions.get(i)).answerChoice);
                System.out.println();
            }
        }
    }
    public static void main(String[] args)
    {
        Quiz quiz = new Quiz();
    }
}
