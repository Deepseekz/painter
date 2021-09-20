package printer;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;


import org.junit.jupiter.api.*;

public class ItemListTest {

    private ByteArrayOutputStream outContent;

    @BeforeEach
    public void setUpStream() {
        outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));
    }

    @AfterEach
    public void cleanUpStream() {
        System.setOut(null);
    }

    @Test
    public void testPrintHTML() {
        ItemList list = new ItemList();
        list.add("a"); list.add("b");
        list.printHTML();
        String expectedOutput = "<ul><li>a</li><li>b</li></ul>";
        assertThat(outContent.toString(), equalTo(expectedOutput));
    }

    @Test
    public void testPrintLaTeX() {
        ItemList list = new ItemList();
        list.add("a"); list.add("b");
        list.printLaTeX();
        String expectedOutput = "\\begin{itemize}\n\\item a\n\\item b\n\\end{itemize}\n";
        assertThat(outContent.toString(), equalTo(expectedOutput));
    }
}