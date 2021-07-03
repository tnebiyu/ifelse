public class myClass {
    public static void main(String[] args) {
        boolean gameOver = true;
        int score = 800;
        int levelCompleted = 5;
        int bonus = 100;
        if (gameOver){
            int finalScore = score + (levelCompleted* bonus);
            finalScore += 1000;
            System.out.println("your final scre was " + finalScore);
        }
        score = 1000;
        levelCompleted = 0;
        bonus = 200;
        if (gameOver){
            int finalScore = score + (levelCompleted * bonus);
            System.out.println("your final score was " + finalScore);
        }
    }
}
