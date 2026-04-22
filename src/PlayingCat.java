public class PlayingCat {
    public static void main(String[] args) {
        boolean playFullCat = isCatPlaying(true, 45);

        System.out.println(playFullCat ? "The cat is playing" : "The cat doesn't play in this weather.");
    }

    public static boolean isCatPlaying(boolean summer, int temperature) {
        int maxValue = summer ? 45 : 35;

        if(temperature < 25 || temperature > maxValue) {
            return false;
        }

        return true;
    }
}
