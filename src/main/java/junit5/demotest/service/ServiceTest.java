package junit5.demotest.service;

import org.springframework.stereotype.Service;

@Service
public class ServiceTest {

  public String sayHello(String str) {
    return "Hello " + str;
  }

  /* テスト計算 part1
   */
  public int calc(int per1, int per2) {
    return per1 + per2;
  }

  /* テスト計算 part2
   */
  public int ifCalc(int per1, int per2) {
    if (per1 == 1 && per2 == 1) {
      return 100;
    }
    if (per1 == 2 && per2 == 3) {
      return 200;
    }
    if (per1 == 3 && per2 == 3) {
      return 333;
    }
    return per1 * per2;
  }

  /* テスト計算 part4
   */
  public void nomethod() {}
}
