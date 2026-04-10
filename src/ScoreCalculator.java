public class ScoreCalculator {

    public static void calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {
        int finalScore = 0;

        if (gameOver) {
            finalScore += levelCompleted + bonus;
            finalScore += 1000;
            System.out.println("Your final score was " + finalScore);
        }
    }

}
