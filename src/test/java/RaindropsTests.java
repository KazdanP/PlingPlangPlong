import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

public class RaindropsTests {

  @Test
  void zeroTest() {
    String actualReturned = Raindrops.plingPlangPlong(0);

    assertThat(actualReturned).isEqualTo("0");
  }

  @Test
  void negativeNumberTest() {
    String actualReturned = Raindrops.plingPlangPlong(-3);

    assertThat(actualReturned).isEqualTo("Pling");
  }

  @Test
  void noFactorsTest() {
    String actualReturned = Raindrops.plingPlangPlong(8);

    assertThat(actualReturned).isEqualTo("8");
  }

  @Test
  void secondNoFactorsTest() {
    String actualReturned = Raindrops.plingPlangPlong(34);

    assertThat(actualReturned).isEqualTo("34");
  }

  @Test
  void factorOfThree() {
    String actualReturned = Raindrops.plingPlangPlong(12);

    assertThat(actualReturned).isEqualTo("Pling");
  }

  @Test
  void factorOfThreeFive() {
    String actualReturned = Raindrops.plingPlangPlong(15);

    assertThat(actualReturned).isEqualTo("PlingPlang");
  }

  @Test
  void factorOfThreeSeven() {
    String actualReturned = Raindrops.plingPlangPlong(21);

    assertThat(actualReturned).isEqualTo("PlingPlong");
  }

  @Test
  void factorOfThreeFiveSeven() {
    String actualReturned = Raindrops.plingPlangPlong(105);

    assertThat(actualReturned).isEqualTo("PlingPlangPlong");
  }

  @Test
  void factorOfFive() {
    String actualReturned = Raindrops.plingPlangPlong(20);

    assertThat(actualReturned).isEqualTo("Plang");
  }

  @Test
  void factorOfFiveSeven() {
    String actualReturned = Raindrops.plingPlangPlong(35);

    assertThat(actualReturned).isEqualTo("PlangPlong");
  }

  @Test
  void factorOfSeven() {
    String actualReturned = Raindrops.plingPlangPlong(49);

    assertThat(actualReturned).isEqualTo("Plong");
  }
}
