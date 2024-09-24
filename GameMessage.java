package bullscows;

public class GameMessage{
    protected void tooBigSymbolsLength() {
        System.out.println("Error: maximum number of possible symbols in the code is 36 (0-9, a-z).");
    }

    protected void smallSymbolsLength(int codeLength,int symbolLength) {
        System.out.printf("Error: it's not possible to generate a code with a length of %d with %d unique symbols.", codeLength,symbolLength);
    }

    protected void codeLengthError(String codeLength) {
        System.out.printf("Error: \"%s\" isn't a valid number.",codeLength);
    }

    protected void guessNumberLengthMessage() {
        System.out.println("Please, enter the secret code's length:");
    }

    protected void possiblesSymbolsNumber() {
        System.out.println("Input the number of possible symbols in the code:");
    }

    protected void startTheGameMessage() {
        System.out.println("Okay, let's start a game!");
    }

    protected void playerTurnMessage (int turn) {
        System.out.printf("Turn %d:\n", turn);
    }

    protected void winningMessage() {
        System.out.print("Congratulations! You guessed the secret code.\n");
    }

    protected void errorMessage(int length) {
        System.out.printf(
                "Error: can't generate a secret number with a length of %d because there aren't enough unique digits.",
                length);
    }

    protected void gradeMessage(int bulls, int cows) {
        if (bulls == 0 && cows == 0) {
            System.out.println("Grade: None.");
        } else if (bulls == 0) {
            System.out.println("Grade: " + cows + " cow(s).");
        } else if (cows == 0) {
            System.out.println("Grade: " + bulls + " bull(s).");
        } else {
            System.out.printf("Grade: %d bull(s) and %d cow(s).\n",bulls,cows);
        }

    }

    protected void secretPrepared(int codeLength,int possibleNumber) {
        String star = "*";
        String string = "abcdefghijklmnopqrstuvwxyz";

        String charString = (possibleNumber > 36)? "(0-9, a-f)" :
                (possibleNumber <= 10)? "(0-9)" :
                        (possibleNumber - 10 == 1 )? "(0-9, a)": "(0-9, a-" + string.charAt(possibleNumber - 11) + ")";
        System.out.printf("The secret is prepared: %s %s.\n", star.repeat(codeLength),charString);

    }

}
