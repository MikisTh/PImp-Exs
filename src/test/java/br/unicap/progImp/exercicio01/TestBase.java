package br.unicap.progImp.exercicio01;

import org.junit.jupiter.api.Assertions;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;
import java.util.Locale;


public abstract class TestBase {
  public abstract void main();

  public void testInputOutput(String input, String output) {
    PrintStream originalOut = System.out;
    InputStream originalIn = System.in;
    ByteArrayOutputStream bos = new ByteArrayOutputStream();
    String inputStream = input;
    ByteArrayInputStream bis = new ByteArrayInputStream(inputStream.getBytes());
    System.setOut(new PrintStream(bos));
    System.setIn(bis);

    // action
    main();

    // assertion
    String expected = output;
    String actual = bos.toString();
    Assertions.assertEquals(expected, actual);

    // undo the binding in System
    System.setOut(originalOut);
    System.setIn(originalIn);
  }

  public String print(double number, int decimals){
    Locale systemLocale = Locale.getDefault();
    String format = "%."+decimals+"f";
    return String.format(systemLocale,format , number);
  }
}
