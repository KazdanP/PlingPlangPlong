package com.sparta.lh;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.provider.ValueSource;
import org.junit.jupiter.params.ParameterizedTest;

import static org.assertj.core.api.Assertions.*;

public class RaindropsTest {

  @Test
  void zeroTest() {
    String actualReturned = Raindrops.plingPlangPlong(0);

    assertThat(actualReturned).isEqualTo("0");
  }

  @ParameterizedTest
  @ValueSource(ints = {8, 13, 34, 68, 1003})
  void noFactorsTest(int noFactors) {
    String actualReturned = Raindrops.plingPlangPlong(noFactors);

    assertThat(actualReturned).isEqualTo(String.valueOf(noFactors));
  }

  @ParameterizedTest
  @ValueSource(ints = {3, 12, 18, 33, 99})
  void factorOfThree(int threeFactor) {
    String actualReturned = Raindrops.plingPlangPlong(threeFactor);

    assertThat(actualReturned).isEqualTo("Pling");
  }

  @ParameterizedTest
  @ValueSource(ints = {15, 30, 45, 60, 75})
  void factorOfThreeFive(int threeFiveFactor) {
    String actualReturned = Raindrops.plingPlangPlong(threeFiveFactor);

    assertThat(actualReturned).isEqualTo("PlingPlang");
  }

  @ParameterizedTest
  @ValueSource(ints = {21, 42, 63, 84, 126})
  void factorOfThreeSeven(int threeSevenFactor) {
    String actualReturned = Raindrops.plingPlangPlong(threeSevenFactor);

    assertThat(actualReturned).isEqualTo("PlingPlong");
  }

  @ParameterizedTest
  @ValueSource(ints = {105, 210, 315, 420, 525})
  void factorOfThreeFiveSeven(int threeFiveSevenFactor) {
    String actualReturned = Raindrops.plingPlangPlong(threeFiveSevenFactor);

    assertThat(actualReturned).isEqualTo("PlingPlangPlong");
  }

  @ParameterizedTest
  @ValueSource(ints = {5, 10, 20, 25, 40})
  void factorOfFive(int fiveFactor) {
    String actualReturned = Raindrops.plingPlangPlong(fiveFactor);

    assertThat(actualReturned).isEqualTo("Plang");
  }

  @ParameterizedTest
  @ValueSource(ints = {35, 70, 140, 175, 245})
  void factorOfFiveSeven(int fiveSevenFactor) {
    String actualReturned = Raindrops.plingPlangPlong(fiveSevenFactor);

    assertThat(actualReturned).isEqualTo("PlangPlong");
  }

  @ParameterizedTest
  @ValueSource(ints = {7, 14, 28, 49, 56})
  void factorOfSeven(int sevenFactor) {
    String actualReturned = Raindrops.plingPlangPlong(sevenFactor);

    assertThat(actualReturned).isEqualTo("Plong");
  }
}
