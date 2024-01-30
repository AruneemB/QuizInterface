public class TrueFalse implements Question
{
    String question;
    String answerChoice;

    public TrueFalse(String question, String answerChoice)
    {
        this.question = question;
        this.answerChoice = answerChoice;
    }

    public String getQuestion()
    {
        return question;
    }

    public String getAnswer()
    {
        return answerChoice;
    }
}
