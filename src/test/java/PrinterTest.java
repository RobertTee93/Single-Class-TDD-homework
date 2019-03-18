import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PrinterTest {

    Printer printer;

    @Before
    public void before(){
        printer = new Printer(100, 50);
    }

    @Test
    public void hasPaper(){
        assertEquals(100, printer.getSheetsOfPaper());
    }

    @Test
    public void canPrint(){
        printer.print(2, 5);
        assertEquals(90, printer.getSheetsOfPaper());
    }

    @Test
    public void wontPrintIfNotEnoughPaper(){
        printer.print(6, 100);
        assertEquals(100, printer.getSheetsOfPaper());
    }

    @Test
    public void canBeFilledWithPaper(){
        printer.print(3, 10);
        printer.fillPaper();
        assertEquals(100, printer.getSheetsOfPaper());
    }

    @Test
    public void hasToner(){
        assertEquals(50, printer.getTonerVolume());
    }

    @Test
    public void tonerReducesWithPrint(){
        printer.print(3, 2);
        assertEquals(44, printer.getTonerVolume());
    }

    @Test
    public void tonerCanBeFilled(){
        printer.print(3, 2);
        printer.fillToner();
        assertEquals(50, printer.getTonerVolume());
    }
}
