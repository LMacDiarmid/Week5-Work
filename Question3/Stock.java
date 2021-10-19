package Question3;

/**
 * <h1> Question3 <h1>
 *
 * @author Leanne
 * @since 11/10/2021
 **/
public class Stock
{
    private long stockNumber;
    private String stockDescription;
    private int amountInStock;

    public Stock(long a, String b, int c)
    {
        stockNumber = a;
        stockDescription =b;
        amountInStock = c;

    }

    public int displayAmountInStock()
    {
        System.out.println("Amount in stock: "+amountInStock);
        return amountInStock;
    }

    public void displayAllDetails()
    {
        System.out.println("Stock Number: "+stockNumber);
        System.out.println("Stock Description: "+stockDescription);
        System.out.println("Amount in Stock : "+amountInStock);

    }

    public void updateStockAmountSubtract(int amountBought)
    {
        if (amountBought <amountInStock)
        {
            this.amountInStock = amountInStock - amountBought;
        }
        else
        {
            System.out.println("Not enough "+stockDescription+" stock");
        }

    }

    public void updateStockAmountAdd(int amountBought)
    {
        this.amountInStock = amountInStock + amountBought;
    }


}
