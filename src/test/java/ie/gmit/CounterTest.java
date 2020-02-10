package ie.gmit;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CounterTest {

    Counter myCounter;

    @BeforeEach
    void init() {
        myCounter = new Counter();
    }

    @DisplayName("Check Constructor is initialised")
    @Test
    void  testConstructor() {
        myCounter = new Counter();
        assertEquals(0, myCounter.getCount());
    }

    @DisplayName("Check Constructor with value")
    @Test
    void  testConstructorWithValue() {
        myCounter = new Counter();
        assertThrows(IllegalAccessException.class, ()-> { new Counter(0);});
    }
}
