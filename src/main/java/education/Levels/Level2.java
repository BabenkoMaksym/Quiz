package education.Levels;

import education.Task;

import java.util.HashMap;
import java.util.Map;

public class Level2 extends Level {

    private Map<Integer, Task> tasks;


    public Level2() {
        init();
    }

    private void init() {
        tasks = new HashMap<Integer, Task>();

        Task task1 = new Task();
        task1.setQuestion("What is 5 - 2?");
        task1.setAnswer("a", "4");
        task1.setAnswer("b", "7");
        task1.setAnswer("c", "5");
        task1.setAnswer("d", "3");
        task1.setCorrectAnswer("d", "3");
        tasks.put(1, task1);

        Task task2 = new Task();
        task2.setQuestion("What is 9 - 3?");
        task2.setAnswer("a", "5");
        task2.setAnswer("b", "6");
        task2.setAnswer("c", "4");
        task2.setAnswer("d", "7");
        task2.setCorrectAnswer("b", "6");
        tasks.put(2, task2);

        Task task3 = new Task();
        task3.setQuestion("What is 7 - 6?");
        task3.setAnswer("a", "1");
        task3.setAnswer("b", "5");
        task3.setAnswer("c", "2");
        task3.setAnswer("d", "3");
        task3.setCorrectAnswer("a", "1");
        tasks.put(3, task3);

        Task task4 = new Task();
        task4.setQuestion("What is 10 - 7?");
        task4.setAnswer("a", "1");
        task4.setAnswer("b", "2");
        task4.setAnswer("c", "3");
        task4.setAnswer("d", "4");
        task4.setCorrectAnswer("c", "3");
        tasks.put(4, task4);
    }

    @Override
    public Map<Integer, Task> getTasks() {
        return tasks;
    }
}

