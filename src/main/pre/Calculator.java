package com.example.tddtest2;

public class Calculator {
  public int add(int a, int b) {
    if (willAdditionOverflow(a, b)) {
      if (a > 0) {
        return Integer.MIN_VALUE;
      } else {
        return Integer.MAX_VALUE;
      }
    }
    return a + b;
  }

  public int sub(int c, int d) {
    if (willAdditionOverflow(c, d)) {
      if (c > 0) {
        return Integer.MIN_VALUE;
      } else {
        return Integer.MAX_VALUE;
      }
    }
    return c - d;
  }


  private boolean willAdditionOverflow(int a, int b) {
    if (b > 0 && a > Integer.MAX_VALUE - b) {
      return true;
    }
    if (b < 0 && a < Integer.MIN_VALUE - b) {
      return true;
    }
    return false;
  }
}
