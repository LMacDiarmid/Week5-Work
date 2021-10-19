package Question3;

/**
 * <h1> Question3 <h1>
 *
 * @author Leanne
 * @since 11/10/2021
 **/
public class Question3Driver
{
    public static void main(String[] args)
    {
        //Declarations
        Stock stockRed = new Stock(100,"Red Socks",100);
        Stock stockBlue = new Stock(101,"Blue Socks",90);
        Stock stockGreen = new Stock(102,"Green Socks",50);

        //Display All
        displayAll(stockRed, stockBlue, stockGreen);

        //Deduct 90 red socks
        stockRed.updateStockAmountSubtract(90);
        //Deduct 60 green socks
        stockGreen.updateStockAmountSubtract(60);
        //Add 20 blue socks
        stockBlue.updateStockAmountAdd(20);

        displayAll(stockRed, stockBlue, stockGreen);

    }

    public static void lineBreak()
    {
        System.out.println("\n_____________________________________________________________________\n");
    }

    public static void displayAll(Stock a, Stock b, Stock c)
    {
        lineBreak();
        a.displayAllDetails();
        lineBreak();
        b.displayAllDetails();
        lineBreak();
        c.displayAllDetails();
        lineBreak();
        lineBreak();

    }
}
