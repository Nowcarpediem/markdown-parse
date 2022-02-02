import static org.junit.Assert.*;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;

import org.junit.*;

public class MarkdownParseTest<T> {
   
  
    @Test
    public void addition() {
        assertEquals(2, 1 + 1);
    }

    @Test
    public void testMethod()  throws IOException { 
        ArrayList<String> toReturn = new ArrayList<>();
        toReturn.add("https://something.com");
        toReturn.add("some-page.html");
        Path fileName = Path.of("test-file.md");
	    String contents = Files.readString(fileName);
        assertEquals(toReturn, MarkdownParse.getLinks(contents));
    }

}



