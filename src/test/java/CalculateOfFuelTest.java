import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculateOfFuelTest {


    @Test
    void calc() {
        double countExpense=2.0;
        double countGasTank=100.0;
        double distance=countGasTank/countExpense;
        assertEquals(50,distance);
    }


}
