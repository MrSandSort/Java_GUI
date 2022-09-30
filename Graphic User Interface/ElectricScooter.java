
/**
 *  class Electric_Scooter here.
 *
 * @author (Sandesh Prasad Paudel)
 * 
 */
public class ElectricScooter extends Vehicle// Creating a child class ElectricScooter
{
    // Declaring different attributes of ElectricScooter Class
    private int Range;
    private int BatteryCapacity;
    private int Price;
    private String ChargingTime;
    private String Brand;
    private String Mileage;
    private boolean HasPurchased;
    private boolean HasSold;
    
    public ElectricScooter(int VehicleId, String VehicleName,String VehicleWeight,String VehicleSpeed ,String VehicleColor,int BatteryCapacity)
    // creating an ElectricScooter Constructer with six parameters
    {
        super(VehicleId,VehicleName, VehicleWeight,VehicleColor);
        super.setVehicleSpeed(VehicleSpeed);
        super.setVehicleColor(VehicleColor);
        //Calling and Setting a superclass attributes
        this.BatteryCapacity=BatteryCapacity;
        this.Range=0;
        this.Price=0;
        this.Brand="";
        this.Mileage="";
        this.ChargingTime="";
        this.HasPurchased=false;
        this.HasSold=false;
        
    }
    
    public int getRange()// Creating a getter method for Range
    {
        return this.Range;
        
    }
    
    public int getBatteryCapacity()// Creating a getter method for BatteryCapacity
    {
        return this.BatteryCapacity;
    
    }
    
    public int getPrice()// Creating a getter method for Price
    {
        return this.Price;
    
    }
    
    public String getChargingTime()// Creating a getter method for ChargingTime
    {
        return this.ChargingTime;
    
    }
    
    public String getBrand()// Creating a getter method for Brand
    {
        return this.Brand;
    
    }
    
    public String getMileage()// Creating a getter method for Mileage 
    {
        return this.Mileage;
    
    }
    
    public boolean getHasPurchased()// Creating a getter method for HasPurchased
    {
        return this.HasPurchased;
    
    }
    
    public boolean getHasSold()// Creating a getter method for HasSold
    {
        return this.HasSold;
    
    }
    
    public void setBrand(String Brand)// Creating a setter method for setting Brand by taking single parameter
    {
        if(this.HasPurchased==false)/*Using If ...Else statement to check if scooter is purchased or 
        not along with Brand */
        {
          this.Brand=Brand;
        }
        
        else
        {
            System.out.println("The scooter has already been purchased and its brand name cannot be changed");
        
        }
    
    }
    
    public void PurchaseElectricScooter(String Brand,int Price, String ChargingTime,String Mileage,int Range)
    // Creating a method to Purchase an ElectricScooter by taking five parameters
    {
        if(this.HasPurchased==false)// Running an if statement
        {
           setBrand(Brand);
           this.Price = Price;
           this.ChargingTime = ChargingTime;
           this.Mileage = Mileage;
           this.Range = Range;           
           this.HasPurchased =true;
        }
    }
    
    public void SoldElectricScooter(int Price)// Creating a method to sell an Electric Scooter by taking one parameter
    {
        if(this.HasSold==false)
        // Running an If else statement for checking HasSold attribute
        {
           this.Price=Price;
           this.ChargingTime ="";
           this.Mileage="";
           this.BatteryCapacity=0;
           this.Range=0;
           this.HasSold =true;
           this.HasPurchased =false;
           
           System.out.println("The Scooter With Id:"+" "+getVehicleId()+"is sold");
           
        }
        
        else
        {
            System.out.println("The scooter is already sold..!!");
        
        }
    
    }
    
    public void display()// Creating a method to display Brand, BatteryCapacity, Mileage, Range and Charging Time
    {
        super.display();// Calling a display method of superclass
        
        if(this.HasPurchased==true)// Running an if statement to check whether HasPurchased is set to true 
        {
           System.out.println("This Electric Scooter has brand as : "+this.Brand);
           System.out.println("The Capacity of Battery for this Electric Scooter is: "+this.BatteryCapacity);
           System.out.println("The Mileage this Electric Scooter gives is: "+this.Mileage);
           System.out.println("This Electric Scooter Range is: "+this.Range);
           System.out.println("This Electric Scooter takes the time to charge its battery is: "+this.ChargingTime);
       }
        
    }
    
    
    }
    
    
    
    
    
    
    
    

    
    
