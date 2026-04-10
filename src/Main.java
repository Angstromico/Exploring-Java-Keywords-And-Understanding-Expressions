public class Main {
    public static void main(String[] args) {

        ScoreCalculator.calculateScore(true, 800, 5, 100);
        int highScore  = ScoreCalculator.calculateScore(true, 10000, 8, 200);
        System.out.println("The high score is: " + highScore);
    }
}
