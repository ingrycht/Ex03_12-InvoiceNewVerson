
public class InvoiceTest 
{
    public static void main (String[]args)
    {
        Invoice invoice1 = new Invoice("Central Heating Pump","123-ABC",
        6, 123.45);
        Invoice invoice2 = new Invoice("", "", 0, 0.0);
        Invoice invoice3 = new Invoice("LapTop", "587-DRC", -5, -542.36);
        
        /*if you dont provide the constructor, the default will provide it
        Invoice invoice1 = new Invoice();
        Invoice invoice2 = new Invoice();
        Invoice invoice3 = new Invoice();
        
        invoice1.setPartDescription("Central Heating Pump");
        invoice1.setPartNumber("123-ABC");
        invoice1.setPricePerItem(123.45);
        invoice1.setQuantity(6);*/
        
        invoice2.setPartDescription("Cistern");
        invoice2.setPartNumber("567-DFR");
        invoice2.setPricePerItem(56.45);
        invoice2.setQuantity(10);
        
        /*
        //limited the characters and align it on right side
        System.out.printf("%20s\t %8s %10.2f %10d %10.2f\n", invoice1.getPartDescription(),
                invoice1.getPartNumber(), invoice1.getPricePerItem(), invoice1.getQuantity(),
                invoice1.getInvoiceAmount());
        
        //the number the line start to align on right side
         System.out.printf("%20s\t %8s %10.2f %10d %10.2f\n", invoice2.getPartDescription(),
                invoice2.getPartNumber(), invoice2.getPricePerItem(), invoice2.getQuantity(),
                invoice2.getInvoiceAmount());
         System.out.println();
         
        //limited the characters
        System.out.printf("%-20s\t %8s %10.2f %10d %10.2f\n", invoice1.getPartDescription(),
                invoice1.getPartNumber(), invoice1.getPricePerItem(), invoice1.getQuantity(),
                invoice1.getInvoiceAmount());
        
        //if you put "-" after de % before the number the line start to align on left side
         System.out.printf("%-20s\t %8s %10.2f %10d %10.2f\n", invoice2.getPartDescription(),
                invoice2.getPartNumber(), invoice2.getPricePerItem(), invoice2.getQuantity(),
                invoice2.getInvoiceAmount());*/
         
         //it is just memory location
         System.out.println("\nCalling toString method explicitly\n");
         System.out.println(invoice1.toString());//prompt name of the class follow by hexadecimal number default
         System.out.println(invoice2.toString());//prompt name of the class follow by hexadecimal number default
         System.out.println(invoice3.toString());
         //after declare String method this return the value of constructor
    
         System.out.println("\nCalling toString method implicitly\n");
         System.out.println(invoice1);//just provide the memory location as well
         System.out.println(invoice2);
         System.out.println(invoice3);
    }//end method main

}//end of class InvoiceTest
