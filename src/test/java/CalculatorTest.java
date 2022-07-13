import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

class CalculatorTest {

    @Test
    void calc() {
        // given
        DonutParty donutParty = mock(DonutParty.class);
        when(donutParty.getNumberOfDonuts()).thenReturn(9);
        when(donutParty.getNumberOfPersons()).thenReturn(3);

        // when
        int actual = Calculator.getNumberOfDonutsPerPerson(donutParty);

        // then
        Assertions.assertEquals(3, actual);
    }

    @Test
    void exc() {
        // given
        DonutParty donutParty = mock(DonutParty.class);
        when(donutParty.getNumberOfDonuts()).thenThrow(new IllegalStateException("No donuts"));
        when(donutParty.getNumberOfPersons()).thenReturn(3);

        // when
        try {
            Calculator.getNumberOfDonutsPerPerson(donutParty);
            Assertions.fail("Expected exception not passed to caller");
        } catch (IllegalStateException e) {
            Assertions.assertEquals("No donuts", e.getMessage());
        }
    }

}