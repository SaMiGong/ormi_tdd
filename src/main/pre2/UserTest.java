package com.example.tddtest2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class UserTest {

  @Test
  void 사용자_이름은_2자_이상이어야합니다() {
    Assertions.assertThrows(IllegalArgumentException.class, () -> new User("A"));
    Assertions.assertDoesNotThrow(() -> new User("Bob"));
  }
}
