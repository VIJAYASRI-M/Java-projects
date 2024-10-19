import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class QuestionService {

    Question[] questions = new Question[10];
    int answers[]=new int[10];

    public void setQuestions() throws FileNotFoundException{
        BufferedReader br = new BufferedReader(new FileReader("../Questions.txt"));
        try(br){
            String line;
            int index=0;

            while((line= br.readLine())!=null && questions.length>0){
                String[] parts = line.split("\\|");
                int id = Integer.parseInt(parts[0]);
                String question = parts[1];
                String[] options = parts[2].split("--");
                String answer = parts[3];
                questions[index++]=new Question(id,question,options,answer);
            }
        }
        catch(IOException e){
            e.printStackTrace();
        }

    }

    public void PlayQuiz(){
        System.out.println("Lets start the Quizz");
        int i=0;
        for(Question q : questions){
            DisplayQuestion(q);
            Scanner sc =new Scanner(System.in);
            answers[i++]=sc.nextInt();
        }
    }

    public void DisplayScore(){
        int score=0;
        int index=0;
        for(Question q : questions){
            int actualAnswer = FindAnswerIndex(q);
            if(answers[index++]==actualAnswer){
                score++;
            }
        }
        System.out.println("Out of "+questions.length+" You've scored "+score+" Hurayyyyy!!!");
    }

    public int FindAnswerIndex(Question q){
        int index=-1;
        for(int i=0; i<q.getOptions().length;i++){
            if(q.getOptions()[i].equals(q.getAnswer()))
                return ++i;
        }
        return index;
    }

    public void DisplayQuestion(Question q){
        int index=1;
        System.out.println("Question no "+q.getId()+". "+q.getQuestion());
        for(String option : q.getOptions()){
            System.out.println((index++)+" - "+option);
        }
    }
    
}
