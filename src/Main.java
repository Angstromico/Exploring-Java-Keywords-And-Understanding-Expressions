public class Main {
    public static void main(String[] args) {

        ScoreCalculator.calculateScore(true, 800, 5, 100);
        int hightScore  = ScoreCalculator.calculateScore(true, 10000, 8, 200);
        System.out.println("The hight score is: " + hightScore);
    }
}
