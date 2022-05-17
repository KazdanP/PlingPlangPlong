public class Raindrops {

  public static String plingPlangPlong(int inputNum) {

    boolean factorOfThree = inputNum % 3 == 0;
    boolean factorOfFive = inputNum % 5 == 0;
    boolean factorOfSeven = inputNum % 7 == 0;
    boolean Zero = inputNum == 0;

    if ((!factorOfThree && !factorOfFive && !factorOfSeven) || Zero) {
      return String.valueOf(inputNum);
    } else {
      String output = "";

      if (factorOfThree) { output += "Pling"; }
      if (factorOfFive) { output += "Plang"; }
      if (factorOfSeven) { output += "Plong"; }

      return output;
    }

  }
}
