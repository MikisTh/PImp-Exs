package br.unicap.progImp.exercicio01;

import org.junit.jupiter.api.Test;

class TestQuestion03 extends TestBase{

    @Test
    void test01() {
      testInputOutput("5\n5\n1\n2", "12.5\n");
    }
  
    @Test
    void test02() {
        testInputOutput("20\n10\n2\n2", "50.0\n");
    }
  
    @Test
    void test03() {
        testInputOutput("18\n8\n2\n2", "36.0\n");
    }
  
    @Override
    public void main() {
      Question03.main(null);
    }
  
  }
