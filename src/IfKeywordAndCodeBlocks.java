public class IfKeywordAndCodeBlocks {
    public static void main(String[] args) {
        boolean gameOver = true;
        int score = 800;
        int levelCompleted = 5;
        int bonus = 100;

        int highScore = calculateScore(gameOver, score, levelCompleted, bonus);
        System.out.println("your final score was" + highScore);

        score = 10000;
        levelCompleted = 8;
        bonus = 200;

        highScore = calculateScore(gameOver, score, levelCompleted, bonus);
        System.out.println("your final score was" + highScore);


        //create a method called display highScorePosition
        //it should display players name as parameter and 2nd parameter as positon in highScore table
        //you should display players name along with message like "managed to get into position" and
        //the position they got and a further message "on high score table"
        //create second method called calculateHighScorePosition
        //it should be sent one argument only the player score
        //it should return an int
        //the return data should be
        //1 if the high score is >1000
        //2 if the high score is >500 and <1000
        //3 if the high score is >100 and <500
        //4 in all other cases
        //call both methods and display result of following
        //score of 1500, 900, 400 and 50


        int HighScorePosition = calculateHighScorePosition(1500);
        displayHighScorePosition ("Harshit", HighScorePosition);

        HighScorePosition = calculateHighScorePosition(900);
        displayHighScorePosition("bob", HighScorePosition);

        HighScorePosition = calculateHighScorePosition(400);
        displayHighScorePosition("tim", HighScorePosition);

        HighScorePosition = calculateHighScorePosition(50);
        displayHighScorePosition("john", HighScorePosition);

        HighScorePosition = calculateHighScorePosition( 1000);
        displayHighScorePosition( "varun", HighScorePosition);

        HighScorePosition = calculateHighScorePosition( 500);
        displayHighScorePosition("amit", HighScorePosition);
    }


    public static void displayHighScorePosition(String playerName, int HighScorePosition) {
        System.out.println(playerName + "managed to get into position"
                + HighScorePosition + "on the high score table");
    }

    public static int calculateHighScorePosition(int playerScore) {
        if (playerScore >= 1000) {
            return 1;
        } else if (playerScore >= 500 && playerScore < 1000) {
            return 2;
        } else if (playerScore >= 100 && playerScore < 500) {
            return 3;
        } else {
            return 4;
        }
    }

    public static int calculateScore (boolean gameOver, int score, int levelCompleted, int bonus){



            if (gameOver) {
                int finalScore = score + (levelCompleted * bonus);
                finalScore += 2000;
                return 0;
            }
            return -1;


        }
    }