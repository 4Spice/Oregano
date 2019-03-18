package Calculator;
/**
  @author 4Spice
  @version 0.3
  This program is licenced under The MIT License.
  The Arithmatic Class allows the use of basic matimatics in a calculator or other programs.
*/
public class Arithmatic
{
  /** Default Constructor*/
  public void Arithmatic()
  {

  }

  /** The Add Method does basic addition
      @param variable1 First variable of an unknown value
      @param variable2 Second variable of an unknown Value.
      @return The results of the addition is returned*/

  public static double Add(double variable1, double variable2)
  {
    double answer = variable1 + variable2;
    return answer;
  }

  /** The Multi Method does basic 2-variable Substitution.
      @param variable1 First variable of an unknown value
      @param variable2 Second variable of an unknown Value.
      @return The results of the subtraction is returned*/

  public static double Subs(double variable1, double variable2)
  {
    double answer = variable1 - variable2;
    return answer;
  }

  /** The Multi Method does basic 2-variable multiplication.
      @param variable1 First variable of an unknown value
      @param variable2 Second variable of an unknown Value.
      @return The results of the multiplication is returned*/

  public static double Multi(double variable1, double variable2)
  {
    double answer = variable1 * variable2;
    return answer;
  }

  /** The Div Method does basic 2-variable Division.
      @param variable1 First variable of an unknown value
      @param variable2 Second variable of an unknown Value.
      @return The results of the Division is returned*/

  public static double Div(double variable1, double variable2)
  {
    double answer = variable1 / variable2;
    return answer;
  }


}
