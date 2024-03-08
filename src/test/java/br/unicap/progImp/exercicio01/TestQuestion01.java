package br.unicap.progImp.exercicio01;

import org.junit.jupiter.api.Test;

class TestQuestion01 extends TestBase{

  @Test
  void test01() {
    testInputOutput("2\n4", "-2.0\n");
  }

  @Test
  void test02() {
    testInputOutput("1\n-1", "1.0\n");
  }

  @Test
  void test03() {
    testInputOutput("4\n-10", "2.5\n");
  }

  @Test
  void test04() {
    testInputOutput("-3\n15", "5.0\n");
  }

  
  

  @Override
  public void main() {
    Question01.main(null);
  }

}
