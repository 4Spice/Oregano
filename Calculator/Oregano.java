//package Calculator;

//import java.util.Scanner;
//import jdk.internal.org.xml.sax.InputSource;
//import java.io.BufferedInputStream;
//import java.io.InputStream;
//import javafx.application.Application;
//import javafx.scene.*;//For Scene, Group, Shape, and paint.Color
//import javafx.stage.Stage;

public class Oregano 
{
    public static void main(String[] args) 
    {
        //InputStream userIn = new InputSource(System.in);
    }

    public static Double mathManager(Double num1, Double num2, String operand) 
    {
        //Do switch
        Arithmatic mathIt = new Arithmatic();        

        switch (operand) 
        {
            case "a":
                num1 = mathIt.Add(num1, num2);
                break;

            case "s":
            num1 = mathIt.Add(num1, num2);
            break;

            case "m":
            num1 = mathIt.Add(num1, num2);
            break;

            case "d":
            num1 = mathIt.Add(num1, num2);
            break;

            default:
                break;
        }

        return num1;
    }

    /*public void start(Stage calculatorGUI)
    {
        Group calcWindow = new Group();
    }

    /** Interprets button action events to select what operation to do.
     * @param num1 First variable of an unknown value
     * @param num2 Second variable of an unknown value
     * @param operand Used to call corect method in Arithmatic class
     * @return Result of operation returned start to show on calculator "Screen"
     */
    
}
