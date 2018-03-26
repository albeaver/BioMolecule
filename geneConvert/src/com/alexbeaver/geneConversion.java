package com.alexbeaver;

/**
 * Created by albeaver on 3/25/18.
 */
public class geneConversion {
    private String input;
    public static String output;

    public geneConversion(String input) {
        this.input = input.toUpperCase();
    }

    public void genOpposite(){
        Character inputChar;
        String charAsString;
        String appender;
        String toBeOutputed = "";
        for(int i = 0; i < input.length(); i++){

            inputChar = input.charAt(i);
            charAsString = inputChar.toString();
            switch (charAsString){
                case "C":
                    appender = "G";
                    break;
                case "G":
                    appender = "C";
                    break;
                case "A":
                    appender = "T";
                    break;
                case "T":
                    appender = "A";
                    break;
                default:
                    appender = " ";
                    break;


            }


            toBeOutputed = toBeOutputed + appender;
        }
        output = toBeOutputed;




    }

    public String getOutput() {
        return output;
    }

    public String getInput() {
        return input;
    }
}
