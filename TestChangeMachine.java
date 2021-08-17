
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import java.io.*;

/**
 * The test class TestChangeMachine.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class TestChangeMachine
{
    /**
     * Default constructor for test class TestChangeMachine
     */
    public TestChangeMachine()
    {
    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @BeforeEach
    public void setUp()
    {
    }

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @AfterEach
    public void tearDown()
    {
    }

    @Test
    public void test_1() 
    {
        PrintStream originalOut = System.out;
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        System.setOut(new PrintStream(bos));

        InputStream originalIn = System.in;
        ByteArrayInputStream bis = new ByteArrayInputStream("64".getBytes());
        System.setIn(bis);

        // action
        ChangeMachine.main(null);

        // assertion
        assertTrue(bos.toString().contains("64 cents makes:\n2 quarters\n1 dimes\n0 nickels\n4 pennies"));
        
        // undo the binding in System
        System.setOut(originalOut);
        System.setIn(originalIn);
    }
    
    @Test
    public void test_2() 
    {
        PrintStream originalOut = System.out;
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        System.setOut(new PrintStream(bos));

        InputStream originalIn = System.in;
        ByteArrayInputStream bis = new ByteArrayInputStream("23".getBytes());
        System.setIn(bis);

        // action
        ChangeMachine.main(null);

        // assertion
        assertTrue(bos.toString().contains("23 cents makes:\n0 quarters\n2 dimes\n0 nickels\n3 pennies"));
        
        // undo the binding in System
        System.setOut(originalOut);
        System.setIn(originalIn);
    }
    
    @Test
    public void test_3() 
    {
        PrintStream originalOut = System.out;
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        System.setOut(new PrintStream(bos));

        InputStream originalIn = System.in;
        ByteArrayInputStream bis = new ByteArrayInputStream("41".getBytes());
        System.setIn(bis);

        // action
        ChangeMachine.main(null);

        // assertion
        assertTrue(bos.toString().contains("41 cents makes:\n1 quarters\n1 dimes\n1 nickels\n1 pennies"));
        
        // undo the binding in System
        System.setOut(originalOut);
        System.setIn(originalIn);
    }
    
    @Test
    public void test_4() 
    {
        PrintStream originalOut = System.out;
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        System.setOut(new PrintStream(bos));

        InputStream originalIn = System.in;
        ByteArrayInputStream bis = new ByteArrayInputStream("15".getBytes());
        System.setIn(bis);

        // action
        ChangeMachine.main(null);

        // assertion
        assertTrue(bos.toString().contains("15 cents makes:\n0 quarters\n1 dimes\n1 nickels\n0 pennies"));
        
        // undo the binding in System
        System.setOut(originalOut);
        System.setIn(originalIn);
    }
}
