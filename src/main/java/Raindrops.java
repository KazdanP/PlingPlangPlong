public class Raindrops {

  public static String plingPlangPlong(int inputNum) {

    String output = "";

    boolean factorOfThree = inputNum % 3 == 0;
    boolean factorOfFive = inputNum % 5 == 0;
    boolean factorOfSeven = inputNum % 7 == 0;
    boolean negativeOrZero = inputNum <= 0;

    if ((!factorOfThree && !factorOfFive && !factorOfSeven) || negativeOrZero) {
      return String.valueOf(inputNum);
    } else {
      if (factorOfThree) { output += "Pling"; }
      if (factorOfFive) { output += "Plang"; }
      if (factorOfSeven) { output += "Plong"; }
    }

    return output;
  }
}
