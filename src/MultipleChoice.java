public class MultipleChoice implements Question
{
    String question;
    String choiceOne;
    String choiceTwo;
    String choiceThree;
    String choiceFour;
    String choiceAnswer;

    public MultipleChoice(String question, String choiceOne, String choiceTwo, String choiceThree, String choiceFour, String choiceAnswer)
    {
        this.question = question;
        this.choiceOne = choiceOne;
        this.choiceTwo = choiceTwo;
        this.choiceThree = choiceThree;
        this.choiceFour = choiceFour;
        this.choiceAnswer = choiceAnswer;
    }

    public String getQuestion()
    {
        return question;
    }

    public String getAnswer()
    {
        return choiceAnswer;
    }
}
