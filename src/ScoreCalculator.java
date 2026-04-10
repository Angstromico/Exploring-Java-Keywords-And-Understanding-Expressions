public class ScoreCalculator {

    public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {
        int finalScore = 0;

        if (gameOver) {
            finalScore += levelCompleted + bonus;
            finalScore += 1000;
            System.out.println("Your final score was " + finalScore);
        }

        return finalScore;
    }

    public static String displayHighScorePosition(String playerName, int playerPosition) {
        return playerName + " managed to get into position " + playerPosition + " in high score list";
    }

    public static int calculateHighScorePosition(int playerScore) {

        if (playerScore >= 1000) {
            return 1;
        } else if (playerScore >= 500) {
            return 2;
        } else if (playerScore >= 100) {
            return 3;
        } else {
            return 4;
        }
    }
}
