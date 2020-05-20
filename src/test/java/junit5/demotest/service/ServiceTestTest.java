package junit5.demotest.service;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class ServiceTestTest {
  // テスト対象のクラス
  ServiceTest test;

  @BeforeEach
  void setUp() {
    test = new ServiceTest();
  }

  @DisplayName("Test Service")
  @Test
  public void Serviceテストクラス() {
    assertEquals("Hello Test!", test.sayHello("Test!"));
  }

  @DisplayName("計算クラス")
  @Test
  public void calcTest() {
    assertEquals(3, test.calc(1, 2));
  }

  @DisplayName("if計算クラス")
  @Test
  public void ifCalc() {
    assertEquals(100, test.ifCalc(1, 1), "パターン1");
    assertEquals(200, test.ifCalc(2, 3), "パターン2");
    assertEquals(4, test.ifCalc(2, 2), "パターン2");
  }
}
