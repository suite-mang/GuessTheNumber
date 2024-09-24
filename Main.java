package bullscows;

public class Main {

    public static void main(String[] args) {

        final int maxLength = 36;
        int turn = 1;
        String secretNumber;
        int possibleNumber;

        //creating all objects
        GameMessage gameMessage = new GameMessage();
        GameInput gameInput = new GameInput();
        BullsAndCows bullsAndCows = new BullsAndCows();
        RandomNumberGenerator random = new RandomNumberGenerator();
        gameMessage.guessNumberLengthMessage();

        String input = "";
        int codeLength;
        try {
            input = gameInput.getCodeLength();
            codeLength = Integer.parseInt(input);
        } catch (NumberFormatException e) {
            gameMessage.codeLengthError(input);
            return;
        }

        try{
            if (codeLength < maxLength && codeLength != 0) {
                gameMessage.possiblesSymbolsNumber();
                possibleNumber = gameInput.getPossibleSymbolNumber();

                if (possibleNumber < codeLength) {
                    gameMessage.smallSymbolsLength(codeLength, possibleNumber);
                    return;

                } else if (possibleNumber > 36) {
                    gameMessage.tooBigSymbolsLength();
                    return;

                }

                gameMessage.secretPrepared(codeLength, possibleNumber);
                gameMessage.startTheGameMessage();

                secretNumber = String.valueOf(random.secretGenerator(codeLength, possibleNumber));
                //just for test
                System.out.println("SecretNumber is :" + secretNumber);

                while (bullsAndCows.getBulls() < codeLength) {
                    bullsAndCows.resetBullsAndCows();
                    gameMessage.playerTurnMessage(turn);
                    String guess = gameInput.getGuess();
                    bullsAndCows.counting(secretNumber, guess);
                    gameMessage.gradeMessage(bullsAndCows.getBulls(), bullsAndCows.getCows());

                    turn++;

                }

            }else {
                throw new RuntimeException();
            }
            gameMessage.winningMessage();

        } catch (RuntimeException e) {
            gameMessage.errorMessage(codeLength);
        }

    }
}



