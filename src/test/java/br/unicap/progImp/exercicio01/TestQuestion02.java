package br.unicap.progImp.exercicio01;

import org.junit.jupiter.api.Test;

class TestQuestion02 extends TestBase{

  @Test
  void test01() {
    testInputOutput("5", "5 x 1 = 5\n" + //
        "5 x 2 = 10\n" + //
        "5 x 3 = 15\n" + //
        "5 x 4 = 20\n" + //
        "5 x 5 = 25\n" + //
        "5 x 6 = 30\n" + //
        "5 x 7 = 35\n" + //
        "5 x 8 = 40\n" + //
        "5 x 9 = 45\n" + //
        "5 x 10 = 50\n");
  }

  @Test
  void test02() {
    testInputOutput("2", "2 x 1 = 2\n" + //
        "2 x 2 = 4\n" + //
        "2 x 3 = 6\n" + //
        "2 x 4 = 8\n" + //
        "2 x 5 = 10\n" + //
        "2 x 6 = 12\n" + //
        "2 x 7 = 14\n" + //
        "2 x 8 = 16\n" + //
        "2 x 9 = 18\n" + //
        "2 x 10 = 20\n");
  }

  @Test
  void test03() {
    testInputOutput("100", "100 x 1 = 100\n" + //
        "100 x 2 = 200\n" + //
        "100 x 3 = 300\n" + //
        "100 x 4 = 400\n" + //
        "100 x 5 = 500\n" + //
        "100 x 6 = 600\n" + //
        "100 x 7 = 700\n" + //
        "100 x 8 = 800\n" + //
        "100 x 9 = 900\n" + //
        "100 x 10 = 1000\n");
  }

  @Override
  public void main() {
    Question02.main(null);
  }

  
}
