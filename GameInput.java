package bullscows;
import java.util.Scanner;

public class GameInput{

    final static Scanner scanner = new Scanner(System.in);

    protected String getCodeLength() {
        return scanner.nextLine();
    }

    protected String getGuess() {
        return scanner.next();
    }

    protected int  getPossibleSymbolNumber() {
        return  scanner.nextInt();
    }

}
