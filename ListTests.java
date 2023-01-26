import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.*;

import java.util.List;

public class ListTests {
	
  @Test
  public void testFilter() {
    List<String> input = List.of("array", "of", "strings");
    List<String> output = List.of("array", "of", "strings");
    
    StringChecker sc = new obj();
    assertEquals(output, ListExamples.filter(input, sc));
  }
}
