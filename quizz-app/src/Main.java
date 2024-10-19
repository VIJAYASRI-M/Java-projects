import java.io.FileNotFoundException;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        QuestionService service = new QuestionService();
        service.setQuestions();
        service.PlayQuiz();
        service.DisplayScore();
    }
    
}