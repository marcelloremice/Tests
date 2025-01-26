public class TestsRunner
{
        public static void main(String[] args) {
            // Declare variables for the test scores
            double testScore1 = 80.9;
            double testScore2 = 94.9;
            double testScore3 = 72.9;

            // Calculate the average of the test scores
            double average = (testScore1 + testScore2 + testScore3) / 3;

            // Display the test scores and their average
            System.out.printf("Test score 1:   %.1f%n", testScore1);
            System.out.printf("Test score 2:   %.1f%n", testScore2);
            System.out.printf("Test score 3:   %.1f%n", testScore3);
            System.out.printf("The average of 3 test scores is:  %.2f%n", average);
        }
    }

