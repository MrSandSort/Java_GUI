
/**
 * description of class Vehicle here.
 *
 * @author (Sandesh Prasad Paudel)
 * 
 */
public class Vehicle // creating a class Vehicle
{
    // declaring different attributes of Vehicle Class
    private int VehicleId;
    private String VehicleName;
    private String VehicleWeight;
    private String VehicleColor;
    private String VehicleSpeed;
    
    // Creating Constructor Vehicle With Vehicle ID, VehicleName, VehicleWeight, VehicleSpeed as parameters 
    
    public Vehicle(int VehicleId, String VehicleName, String VehicleWeight, String VehicleSpeed)
    {
        this.VehicleId=VehicleId;
        this.VehicleName=VehicleName;
        this.VehicleWeight=VehicleWeight;
        this.VehicleColor=VehicleColor;
    
    }
   // Creating Getter Method for Vehicle ID
   
    public int getVehicleId()
    {
        return this.VehicleId;
    
    }
    // Creating Getter Method for Vehicle Name 
    
    public String getVehicleName()
    {
        return this.VehicleName;
    
    }
    // Creating Getter Method for Vehicle Weight
    
    public String getVehicleWeight()
    {
        return this.VehicleWeight;
    
    }
    // Creating Getter Method for Vehicle Color
    
    public String getVehicleColor()
    {
        return this.VehicleColor;
    
    }
    // Creating Getter Method for Vehicle Speed
    
    public String getVehicleSpeed()
    {
        return this.VehicleSpeed;
    
    }
    // Creating Setter Method for Vehicle Speed Taking NewVehicleSpeed as parameter
    
    public void setVehicleSpeed(String VehicleSpeed)
    {
        this.VehicleSpeed=VehicleSpeed;

    }
    //Creating Setter Method for Vehicle
    
    public void setVehicleColor(String VehicleColor)
    {
        this.VehicleColor=VehicleColor;
    
    }
    
    public void display()// Creating display method to display VehicleId,VehicleName,VehicleColor and VehicleSpeed
    {
        System.out.println("ID for this Vehicle:"+this.VehicleId);
        System.out.println("Name of this Vehicle:"+this.VehicleName);
        System.out.println("Color of this Vehicle:"+this.VehicleColor);
        System.out.println("Speed of this Vehicle:"+this.VehicleSpeed);
        
        if(this.VehicleWeight=="")
        
        /*Running an if statement to check whether the instance value of Vehicle Weight
           is Null or not */
        {
            System.out.println("Error...!!! Please Enter the Vehicle Weight" );
        }
        else
        { 
            System.out.println("Weight for this Vehicle is:"+ this.VehicleWeight);
        }
    
    }
    
    
       
    
    
    
    
}
