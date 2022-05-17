import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

public class RaindropsTests {

  @Test
  void zeroTest() {
    String zero = "0";

    String actualReturned = Raindrops.plingPlangPlong(0);

    assertThat(actualReturned).isEqualTo(zero);
  }

  @Test
  void negativeNumberTest() {
    String negative = "-3";

    String actualReturned = Raindrops.plingPlangPlong(-3);

    assertThat(actualReturned).isEqualTo(negative);
  }

  @Test
  void noFactorsTest() {
    String noFactors = "8";

    String actualReturned = Raindrops.plingPlangPlong(8);

    assertThat(actualReturned).isEqualTo(noFactors);
  }

  @Test
  void secondNoFactorsTest() {
    String noFactorsTwo = "88";

    String actualReturned = Raindrops.plingPlangPlong(88);

    assertThat(actualReturned).isEqualTo(noFactorsTwo);
  }

  @Test
  void factorOfThree() {
    String twelve = "12";

    String actualReturned = Raindrops.plingPlangPlong(12);

    assertThat(actualReturned).isEqualTo(twelve);
  }

  @Test
  void factorOfThreeFive() {
    String fifteen = "15";

    String actualReturned = Raindrops.plingPlangPlong(15);

    assertThat(actualReturned).isEqualTo(fifteen);
  }

  @Test
  void factorOfThreeSeven() {
    String twentyOne = "21";

    String actualReturned = Raindrops.plingPlangPlong(21);

    assertThat(actualReturned).isEqualTo(twentyOne);
  }

  @Test
  void factorOfThreeFiveSeven() {
    String fortyTwo = "42";

    String actualReturned = Raindrops.plingPlangPlong(42);

    assertThat(actualReturned).isEqualTo(fortyTwo);
  }

  @Test
  void factorOfFive() {
    String twenty = "20";

    String actualReturned = Raindrops.plingPlangPlong(20);

    assertThat(actualReturned).isEqualTo(twenty);
  }

  @Test
  void factorOfFiveSeven() {
    String thirtyFive = "35";

    String actualReturned = Raindrops.plingPlangPlong(35);

    assertThat(actualReturned).isEqualTo(thirtyFive);
  }

  @Test
  void factorOfSeven() {
    String fortyNine = "49";

    String actualReturned = Raindrops.plingPlangPlong(49);

    assertThat(actualReturned).isEqualTo(fortyNine);
  }
}
