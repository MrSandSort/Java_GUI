
/**
 *  description of class Auto_Rcikshaw here.
 *
 * @author (Sandesh Prasad Paudel)
 * 
 */
public class AutoRickshaw extends Vehicle //Creating a Child Class AutoRickshaw
{
    //Declaring different attributes of AutoRickshaw Class
    
    private int EngineDisplacement;
    private String Torque;
    private int NumberOfSeats;
    private int FuelTankCapacity;
    private String GroundClearance;
    private int ChargeAmount;
    private String BookedDate;
    private boolean IsBooked;
    
    public AutoRickshaw(int VehicleId,String VehicleName,String
    VehicleWeight,String VehicleColor, String VehicleSpeed,int EngineDisplacement,String Torque,int FuelTankCapacity, String GroundClearance)
    /* Creating an AutoRickshaw Constructor
     * with nine parameters*/
    {
        super(VehicleId,VehicleName,VehicleWeight,VehicleColor);// Using a super keyword to extract attributes from superclass
        this.EngineDisplacement=EngineDisplacement;
        this.Torque=Torque;
        this.FuelTankCapacity=FuelTankCapacity;
        this.GroundClearance=GroundClearance;
        super.setVehicleSpeed(VehicleSpeed);
        super.setVehicleColor(VehicleColor);
        this.IsBooked=false;
        
    }     
    // Creating a getter method for Engine Displacement
    
    public int getEngineDisplacement()
    {
        return this.EngineDisplacement;
        
    }
    // Creating a getter method for Torque
    
    public String getTorque()
    {
        return this.Torque;
        
    }
    // Creating a getter method for NumberOfSeats
    
    public int getNumberOfSeats()
    {
        return this.NumberOfSeats;
    
    }
    //Creating a getter method for FuelTankCapacity
    public int getFuelTankCapacity()
    {
        return this.FuelTankCapacity;
    
    }
    // Creating a getter method for GroundClearance
    
    public String getGroundClearance()
    {
        return this.GroundClearance;
    
    }
    //Creating a getter method for ChargeAmount
    
    public int getChargeAmount()
    {
        return this.ChargeAmount;
        
    }
    // Creating  a getter method for BookedDate
    
    public String getBookedDate()
    {
        return this.BookedDate;
    
    }
    // Creating a getter method for IsBooked
    
    public boolean getIsBooked()
    {
        return this.IsBooked;
    
    }
    // Creating a setter method for Charge Amount by passing Charge Amount as parameter

    public void setChargeAmount(int ChargeAmount)
    {
        this.ChargeAmount=ChargeAmount;
    
    }
    // Creating a setter method for NumberOfSeats by passing Number of Seats as a parameter
    
    public void setNumberOfSeats(int NumberOfSeats)
    {
        this.NumberOfSeats=NumberOfSeats;
    
    }
    
    /*Creating a method for booking an AutoRickshaw 
    by passing three parameters BookedDate, ChargeAmount and Number Of Seats*/
    
    public void book_AutoRickshaw(String BookedDate, int ChargeAmount, int NumberOfSeats)
    {
        if(this.IsBooked==false)// Running an if else statement for booking an AutoRickshaw
        {
            this.BookedDate=BookedDate;
            setChargeAmount(ChargeAmount);
            setNumberOfSeats(NumberOfSeats);
            this.IsBooked=true;
            System.out.println("The Vehicle With Vehicle ID"+ getVehicleId()+"is Booked");
        }
        else
        {
            System.out.println("Booked Status is true ");
            System.out.println("This AutoRickshaw is already booked");
            
        } 
        
    }
        
        public void display()/* Creating a display method to display values of features of Autorickshaw  */
        {
            super.display();// Calling a display method of superclass
            
            if(this.IsBooked==true)// Running an if statement for booking of Autorickshaw
            {
                System.out.println("Engine Displacement for this AutoRickshaw is"+ this.EngineDisplacement);
                System.out.println("Torque Given by this AutoRickshaw is"+ this.Torque);
                System.out.println("Fuel Tank Capacity of this AutoRickshaw is"+ this.FuelTankCapacity);
                System.out.println("Ground Clearnance of this AutoRickshaw is"+ this.GroundClearance);
                System.out.println("Booked Date for this AutoRickshaw is"+ this.BookedDate);
            
            }
            
            if(this.ChargeAmount==0)// Running an if statement to check ChargeAmount that equals to zero or not
            {
                System.out.println("Charge Amount for this Autorickshaw is not set...!!");
            
            }
            
            if(this.NumberOfSeats==0)// Running an if Statement to check the number of seats
            {
                System.out.println("Number Of Seats Isn't fixed at...!!");
                
            }
            
            if(this.ChargeAmount!=0 && this.NumberOfSeats!=0)
            {
                System.out.println("The ChargeAmount for this AutoRickshaw is"+ this.ChargeAmount+ "and the Number of Seats are"+ this.NumberOfSeats);
            
            }
            
        
        }
            
            
            
            
            
            
        }
        
    
    

        
        
        
    
    
    
    
    
    
    
    
    

