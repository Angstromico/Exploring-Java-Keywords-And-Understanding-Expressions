public class MethodOverloading {
    public static void main(String[] args) {
        int newScore  = calculateScore("Manuel", 5);
        System.out.println("The new score is: " + newScore);

        int aNewScore = calculateScore(75);
        System.out.println(aNewScore);

        int zero = calculateScore();
        System.out.println(zero);
    }

    public static int calculateScore(String playerName, int score) {
        System.out.println("Player " + playerName + " score " + score);
        return score * 890;
    }

    public static int calculateScore(int score) {
        System.out.println("Unnamed player " + " score " + score);
        return score * 890;
    }

    public static int calculateScore() {
        System.out.println("No player, no score...");
        return 0;
    }
}
