public class Main {
    public static void main(String[] args) {
       int newScore = calculateScore("tim", 500);
        System.out.println("New score is " + newScore);
        calculateScore(5000);
        calculateScore();
        double result = calcFeedAndInchesToCentimeters(-10, 9);
        System.out.println(result);

        result = calcFeedAndInchesToCentimeters(129);
        System.out.println(result);
    }

    public static int calculateScore(String playName, int score) {
        System.out.println("Player " + playName + " scored " + score + " points");
        return score * 1000;
    }

    public static int calculateScore(int score) {
        System.out.println("Unnamed player " + " scored " + score + " points");
        return score * 1000;
    }

    public static int calculateScore() {
        System.out.println("Unnamed player with no score");
        return 0;
    }

    //overload challenge
    public static double calcFeedAndInchesToCentimeters(double feet, double inches) {
        if (feet < 0 || inches < 0 || inches > 12) return -1;
        else {
           double totalInches = calcInches(feet) + inches;
           return totalInches * 2.54;
        }
    }

    public static double calcFeedAndInchesToCentimeters(double inches) {
        if (inches < 0 && inches > 12) return -1;
        else {
            int feet = (int) (inches / 12);
            inches = inches % 12;
            return calcFeedAndInchesToCentimeters(feet, inches);
        }
    }
    public static double calcInches(double feet) {
        return feet * 12;
    }
}
