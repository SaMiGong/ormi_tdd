package com.example.tddtest2;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class CalculatorTest {
  private Calculator calculator;

  @BeforeEach
  void setUp() {
    calculator = new Calculator();
  }

  @DisplayName("양의 정수와 양의 정수의 합")
  @Test
  void testAddTwoPositiveNumbers() {
    assertEquals(7, calculator.add(3, 4), "3 + 4 should equal 7");
  }

  @DisplayName("음의 정수와 음의 정수의 합")
  @Test
  void testAddTwoNegativeNumbers() {
    assertEquals(-7, calculator.add(-3, -4), "-3 + (-4) should equal -7");
  }

  @DisplayName("양의 정수와 음의 정수의 합")
  @Test
  void testAddPositiveAndNegativeNumber() {
    assertEquals(-1, calculator.add(3, -4), "3 + (-4) should equal -1");
  }

  @DisplayName("양의 정수와 0의 합")
  @Test
  void testAddZero() {
    assertEquals(3, calculator.add(3, 0), "3 + 0 should equal 3");
  }

  @DisplayName("양의 정수와 양의 정수의 차")
  @Test
  void testsub(){
    assertEquals(-1, calculator.sub(3,4), "3 - 4 should equal -3");
  }
}
