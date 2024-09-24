package bullscows;

public class BullsAndCows{
    //its position is also correct, then it is a bull
    private int bulls = 0;
    //correctly guessed digit is a cow
    private int cows = 0;

    public int getBulls() {
        return bulls;
    }

    public int getCows() {
        return cows;
    }

    public void counting(String secretCode, String guess){

        if (guess.equals(secretCode)){
            this.bulls = secretCode.length();
        }else{
            for (int index = 0; index <secretCode.length(); index++){
                if(secretCode.charAt(index) == guess.charAt(index)){
                   this.bulls++;
                }
            }
            char[] secretCodeArray = secretCode.toCharArray();
            char[] guessArray = guess.toCharArray();
            for(int index = 0; index < guess.length(); index++){
                String temp = String.valueOf(guessArray[index]);
                if( secretCode.contains(temp)){
                    if(secretCodeArray[index] != guessArray[index]) {
                        this.cows++;
                    }
                }
            }
        }
    }
    // rest integers bulls and cows after using them
    protected void resetBullsAndCows() {
        this.bulls = 0;
        this.cows  = 0;
    }
}
