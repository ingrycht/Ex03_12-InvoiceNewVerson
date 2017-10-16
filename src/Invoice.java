
public class Invoice 
{
    //instance variable are associated with object created using this class
    private String partDescription;//instance variable
    private String partNumber;//instance variable
    private int quantity;//instance variable
    private double pricePerItem;//instance variable
    
    //leave the warning out the constructor
    @SuppressWarnings("OverridableMethodCallInConstructor")
    //created constructor
    public Invoice(String partDescription, String partNumber, int quantity, double pricePerItem)
    {
        //using that sentence you are not using the validation constructor
        //this.partDescription = partDescription;
        
        //set you are using the validation constructor
        setPartDescription(partDescription);
        setPartNumber(partNumber);
        setQuantity(quantity);
        setPricePerItem(pricePerItem);
    
    }
    //the netbeans will create the set and get
    //right bottom + inset code + setter and getter

    public String getPartDescription() 
    {
        return partDescription;
    }

    //this. refer the instance variable
    //after = is the parameter name
    public void setPartDescription(String partDescription) 
    {
        this.partDescription = partDescription;
    }

    public String getPartNumber() 
    {
        return partNumber;
    }

    public void setPartNumber(String pN)//String pN is a local variable 
    {
        partNumber = pN;
    }

    public int getQuantity() 
    {
        return quantity;
    }

    public void setQuantity(int quantity) 
    {
        if(quantity >= 0)
            this.quantity = quantity;
    }

    public double getPricePerItem() 
    {
        return pricePerItem;
    }

    public void setPricePerItem(double pricePerItem) 
    {
        if(pricePerItem >= 0.0)
            this.pricePerItem = pricePerItem;
    }
    
    //multiple 2 instance variable calling return
    //don't need to declare a new instance variable
    public double getInvoiceAmount()
    {
        return getPricePerItem()*getQuantity();
    
    }
    
    //created String method
    public String toString()
    {
        /*hello from memory location
        return "Hello from " + this.hashCode();*/
        
        //prompt data
        //return a string description of this class objects
        //it just return what was printed in another file
        String invoiceDescription = String.format("%-20s\t %8s %10.2f %10d %10.2f\n", 
                getPartDescription(), getPartNumber(), getPricePerItem(),
                getQuantity(), getInvoiceAmount());
        
        return invoiceDescription;
    
    }//end toString method
    
    

}//end of class Invoice
