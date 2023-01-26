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

  @Test
  public void testMerge() {
    List<String> input1 = List.of("a", "c");
    List<String> input2 = List.of("b", "d");
    List<String> output = List.of("a", "b", "c", "d");
    
    StringChecker sc = new obj();
    assertEquals(output, ListExamples.merge(input1, input2));
  }
}
