public class Question {
    int id;
    String question;
    String options[];
    String Answer;

    public Question(int id, String question, String[] options, String answer) {
        this.id = id;
        this.question = question;
        this.options = options;
        Answer = answer;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getQuestion() {
        return question;
    }
    public void setQuestion(String question) {
        this.question = question;
    }
    public String[] getOptions() {
        return options;
    }
    public void setOptions(String[] options) {
        this.options = options;
    }
    public String getAnswer() {
        return Answer;
    }
    public void setAnswer(String answer) {
        Answer = answer;
    }

    @Override
    public String toString() {
        return id + ": " + question + " Options: " + String.join(", ", options);
    }
}
