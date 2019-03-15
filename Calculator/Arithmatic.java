package Calculator;
/**
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
      @param variable2 Second variable of an unknown Value. */
  public static double Add(double variable1, double variable2)
  {
    answer = variable1 + variable2;
    return answer;
  }

  public static double Subs(double variable1, double variable2)
  {
    answer = variable1 - variable2;
    return answer;
  }

  public static double Multi(double variable1, double variable2)
  {
    answer = variable1 * variable2;
    return answer;
  }

  public static double div(double variable1, double variable2)
  {
    answer = variable1 / variable2;
    return answer;
  }


}
