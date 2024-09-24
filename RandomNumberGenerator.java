package bullscows;

import java.util.Random;

public class RandomNumberGenerator{

    StringBuilder secretGenerator(int codeLength, int possibleNumber) {

        StringBuilder secretCode = new StringBuilder();
        String number ="0123456789";
        String alphabet ="abcdefghijklmnopqrstuvwxyz";
        String mixRandom = (possibleNumber <= 10)? number:number + alphabet.substring(0,possibleNumber-10);

        Random random = new Random();
        do{
            int index = (int)(random.nextFloat() * mixRandom.length());
            String temp = String.valueOf(mixRandom.charAt(index));
            if(!secretCode.toString().contains(temp)){
                secretCode.append(temp);
            }

        } while(secretCode.length() < codeLength);




        /*do {
            //pseudoRandomNumber = String.valueOf(System.nanoTime());
            String[] random =String.valueOf(Math.random()).split("\\.") ;
            char[] randomNumber = random[1].toCharArray();

            for (int index =0 ; index < codeLength; index++) {
               int num = randomNumber.charAt(index);
                //String temp = String.valueOf(randomNumber.charAt(index));
                if(secretCode.length() < codeLength) {
                    String temp = String.valueOf(randomNumber[index]);
                    if (secretCode.isEmpty() && Character.getNumericValue(randomNumber[index]) != 0) {
                        secretCode.append(randomNumber[index]);
                    } else if (
                            !secretCode.isEmpty() &&
                                    !secretCode.toString().contains(temp)
                    ) {
                        secretCode.append(randomNumber[index]);

                    }
                }else{
                    break;
                }
            }


        } while (secretCode.length() < codeLength);*/

        return secretCode;
    }




}

