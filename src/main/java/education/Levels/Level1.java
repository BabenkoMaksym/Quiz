package education.Levels;

import education.Task;

import java.util.HashMap;
import java.util.Map;

public class Level1 extends Level {

    public Map<Integer, Task> getTasks() {
        return tasks;
    }

    private Map<Integer, Task> tasks;


    public Level1() {
        init();
    }

    private void init() {
        tasks = new HashMap<Integer, Task>();

        Task task1 = new Task();
        task1.setQuestion("What is 2 + 2?");
        task1.setAnswer("a", "5");
        task1.setAnswer("b", "6");
        task1.setAnswer("c", "4");
        task1.setAnswer("d", "3");
        task1.setCorrectAnswer("c", "4");
        tasks.put(1, task1);

        Task task2 = new Task();
        task2.setQuestion("What is 3 + 3?");
        task2.setAnswer("a", "5");
        task2.setAnswer("b", "6");
        task2.setAnswer("c", "4");
        task2.setAnswer("d", "7");
        task2.setCorrectAnswer("b", "6");
        tasks.put(2, task2);

        Task task3 = new Task();
        task3.setQuestion("What is 4 + 6?");
        task3.setAnswer("a", "8");
        task3.setAnswer("b", "10");
        task3.setAnswer("c", "24");
        task3.setAnswer("d", "10");
        task3.setCorrectAnswer("b", "10");
        tasks.put(3, task3);

        Task task4 = new Task();
        task4.setQuestion("What is 5 + 7?");
        task4.setAnswer("a", "10");
        task4.setAnswer("b", "11");
        task4.setAnswer("c", "12");
        task4.setAnswer("d", "13");
        task4.setCorrectAnswer("c", "12");
        tasks.put(4, task4);
    }

}

