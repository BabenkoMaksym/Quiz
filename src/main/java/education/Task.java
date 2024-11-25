package education;

import java.util.HashMap;
import java.util.Map;

public final class Task {

    private String question;
    private Map<String, String> answers;
    private Map<String, String > correctAnswers;

    public void print() {
        System.out.println("Question: " + question);
        System.out.println("Answers: ");
        for (Map.Entry<String, String> answer : answers.entrySet()) {
            System.out.println(answer.getKey() + ": " + answer.getValue());
        }
    }

    public boolean checkAnswer( String answer) {
        if (answer.length() > 1) {
            String[] split = answer.split(",");
            for (String s : split) {
                s = s.toLowerCase();
                if (!correctAnswers.containsKey(s)) {
                    return false;
                }
            }
        } else {
            answer = answer.toLowerCase();
            if (!correctAnswers.containsKey(answer)) {
                return false;
            }
        }
        return true;
    }


    public Task() {
        answers = new HashMap<>();
        correctAnswers = new HashMap<>();
    }


    public void setQuestion(String question) {
        this.question = question;
    }


    public void setAnswer(String answerPosition, String answer) {
        answers.put(answerPosition, answer);
    }

    public void setCorrectAnswer(String answerPosition, String correctAnswer) {
        correctAnswers.put(answerPosition, correctAnswer);
    }
}
