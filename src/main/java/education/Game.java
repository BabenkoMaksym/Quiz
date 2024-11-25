package education;

import education.Levels.Level;
import education.Levels.Level1;
import education.Levels.Level2;
import education.Levels.Level3;

import java.util.ArrayList;
import java.util.Map;
import java.util.Scanner;

public class Game {

    private ArrayList<Task> tasks;

    public void start() {
        boolean playAgain = true;
        Scanner scanner = new Scanner(System.in);
        while (playAgain) {
            System.out.println("""
                    Welcome to the game!
                    This is a console game. Questions and answers will appear. To provide an answer, you need to enter the selected option in the console and press Enter.
                    The game has levels from 1 to 3. The higher the level, the harder the tasks.\
                     Please select a game level from 1 to 3 inclusive""");
            while (scanner.hasNextInt()) {
                try {
                    int gameLvl = Integer.parseInt(scanner.next());
                    if (gameLvl >= 1 && gameLvl <= 3) {
                            playAgain = start(gameLvl, scanner);
                            break;
                    } else {
                        System.out.println("You have entered an invalid value. Please try again.");
                    }
                } catch (NumberFormatException e) {
                    System.out.println("Please enter a valid number.");
                }
            }
        }
    }


    private boolean start(Integer gameLvl, Scanner scanner) {
        int scores = 0;
        Task task;
        String answer;
        Level level = new Level1();
        switch (gameLvl) {
            case 1 -> level = new Level1();
            case 2 -> level = new Level2();
            case 3 -> level = new Level3();
        }
        Map<Integer, Task> tasks = level.getTasks();
        for (Map.Entry<Integer, Task> entry : tasks.entrySet()) {
            task = entry.getValue();
            task.print();
            while (scanner.hasNext()) {
                answer = scanner.next();
                if (task.checkAnswer(answer)) {
                    scores++;
                }
                break;
            }
        }
        System.out.println("Congratulations, you have completed the game and given " + scores + " correct answers. Would you like to play again? (Enter: y-yes, n-no)");
        String playAgain = scanner.next();
        return playAgain.equalsIgnoreCase("y");
    }
}
