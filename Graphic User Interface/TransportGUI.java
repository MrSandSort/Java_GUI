
/**
 * Write a description of class TransportGUI here.
 *
 * @author (Sandesh Prasad Paudel)
 * @version (2022/07/15)
 */

import javax.swing.*;
import java.awt.*;
import java.util.*;
import java.awt.event.*;

public class TransportGUI implements ActionListener
{
    
    ArrayList<Vehicle> Shrug= new ArrayList<Vehicle>();
    
    Font font_1= new Font("Dialog",Font.BOLD,19);
    Font font_2= new Font("DialogInput",Font.BOLD,13);
    
    private JFrame f1,f2,f3;
    private JPanel p1,p2,p3,p4,p5,p6,p7,p8;
    
    private JLabel l1,l2,l3,l4,l5,l6,l8,l7,l9,l10,l11,l12,l13,l14,l15,
    e1,e2,e3,e4,e5,e6,e7,e8,e9,e10,e11,e12,e13,e14,e15;
    
    private JTextField t3,t4,t5,t6,t7,t8,t9,t10,t11,t12,t13,t15,t16,
    g2,g3,g4,g5,g6,g7,g8,g9,g10,g11,g12,g13,g14,g15;
    
    private JButton b1,b2,b3,b4,b5,b6,b7,b8,b11,b12,b13,b14,
    btn2,btn4,btn5,btn6,btn7,btn8,btn9;
    
    private JComboBox x,y,z;
    

    
    public void m1()
    {
       
        
        f1 = new JFrame("Sandesh AutoMobile Company");
        f1.setBounds(250,100,550,350);
        
        p1= new JPanel();
        p1.setBounds(250,100,550,350);
        p1.setLayout(null);
        p1.setBackground(new Color(255,224,224));
        
        l1= new JLabel();
        l1.setText("Choose Vehicle");
        l1.setForeground(new Color(255,128,0));
        l1.setBounds(185,40,280,40);
        l1.setFont(font_1);
        p1.add(l1);
        
        b1=new JButton("AutoRickshaw");
        b1.setBounds(170,100,180,55);
        b1.setFont(font_2);
        b1.setBackground(new Color(255,255,255));
        b1.addActionListener(this);
        p1.add(b1);
        
        
        b2=new JButton("Electric Scooter");
        b2.setBounds(170,180,180,55);
        b2.setFont(font_2);
        b2.setBackground(new Color(255,255,255));
        b2.addActionListener(this);
        p1.add(b2);
        
        f1.add(p1);
        f1.setVisible(true);
        f1.setBounds(250,100,550,350);
        f1.setResizable(false);
        f1.setLayout(null);
        
    }
    
    public void AutoRickshaw()
    {
        f2= new JFrame("Buy An AutoRickshaw Now");
        f2.setBounds(180,20,900,620);
        
        p2= new JPanel();
        p2.setBounds(180,40,900,600);
        p2.setBackground(new Color(224,224,224));
        p2.setLayout(null);
        
        l2= new JLabel();
        l2.setText("AutoRickshaw");
        l2.setBounds(380,5,300,45);
        l2.setFont(font_1);
        p2.add(l2);
        
        b3= new JButton("Skip to Scooter>>");
        b3.setBounds(700,8,140,45);
        b3.setBackground(new Color(160,160,160));
        b3.addActionListener(this);
        p2.add(b3);

        p3= new JPanel();
        p3.setBounds(10,60,870,230);
        
        l3= new JLabel("Vehicle Id:");
        l3.setBounds(20,10,120,30);
        p3.add(l3);
        
        t3= new JTextField();
        t3.setBounds(150,10,160,30);
        p3.add(t3);
        
        
        l4= new JLabel("Vehicle Weight:");
        l4.setBounds(20,50,120,30);
        p3.add(l4);
        
        
        t4= new JTextField();
        t4.setBounds(150,50,160,30);
        p3.add(t4);
        
        l5= new JLabel("Vehicle Speed:");
        l5.setBounds(20,90,120,30);
        p3.add(l5);
        
        t5= new JTextField();
        t5.setBounds(150,90,160,30);
        p3.add(t5);
        
        l6= new JLabel("Torque:");
        l6.setBounds(20,130,120,30);
        p3.add(l6);
        
        t6= new JTextField();
        t6.setBounds(150,130,160,30);
        p3.add(t6);
        
        
        l8= new JLabel("Vehicle Name:");
        l8.setBounds(400,10,120,30);
        p3.add(l8);
        
        t8= new JTextField();
        t8.setBounds(530,10,160,30);
        p3.add(t8);
        
        l9= new JLabel("Vehicle Color:");
        l9.setBounds(400,50,120,30);
        p3.add(l9);
        
        t9= new JTextField();
        t9.setBounds(530,50,160,30);
        p3.add(t9);
        
        l10= new JLabel("Engine Displacement:");
        l10.setBounds(400,90,130,30);
        p3.add(l10);
        
        t10= new JTextField();
        t10.setBounds(530,90,160,30);
        p3.add(t10);
        
        l11= new JLabel("Fuel Tank Capacity:");
        l11.setBounds(400,130,120,30);
        p3.add(l11);
        
        t11= new JTextField();
        t11.setBounds(530,130,160,30);
        p3.add(t11);
        
        b4= new JButton("Add An AutoRickshaw");
        b4.setBounds(670,170,180,45);
        b4.setBackground(new Color(255,255,51));
        b4.addActionListener(this);
        p3.add(b4);
        
        b5= new JButton("Hide Add Info");
        b5.setBounds(10,170,160,45);
        b5.setBackground(new Color(255,255,51));
        b5.addActionListener(this);
        p3.add(b5);
        
        l7= new JLabel("Ground Clearance:");
        l7.setBounds(230,180,120,30);
        p3.add(l7);
        
        t7= new JTextField();
        t7.setBounds(360,180,180,30);
        p3.add(t7);
        
        
        b11=new JButton("Show Add Info");
        b11.setBounds(400,150,150,45);
        b11.setBackground(new Color(255,255,51));
        b11.addActionListener(this);
        b11.setVisible(false);
        p2.add(b11);
        
        p3.setBackground(new Color(204,255,229));
        p3.setLayout(null);
        p2.add(p3);
        
        p4= new JPanel();
        p4.setBounds(10,295,870,230);
        
        l12= new JLabel("Vehicle ID:");
        l12.setBounds(230,20,120,30);
        p4.add(l12);
        
        t12= new JTextField();
        t12.setBounds(360,20,180,30);
        p4.add(t12);
        
        l13= new JLabel("No of Seats:");
        l13.setBounds(230,60,120,30);
        p4.add(l13);
        
        t13= new JTextField();
        t13.setBounds(360,60,180,30);
        p4.add(t13);
        
        l14= new JLabel("Booked Date:");
        l14.setBounds(230,100,120,30);
        p4.add(l14);
        
         String[] yer={"2018","2019","2020","2021","2022"};
        String[] months={"January","February","March","April","May","June","July","August","September",
            "October","November","December"};
        String[] days={"1","2","3","4","5","6","7","8","9","10","11","12","13","14","15","16","17",
            "18","19","20","21","22","23","24","25","26","27","28","29","30","31"};
        
        x= new JComboBox(yer);
        x.setBounds(360,100,60,30);
        y= new JComboBox(months);
        y.setBounds(425,100,80,30);
        z= new JComboBox(days);
        z.setBounds(510,100,35,30);
        
        p4.add(x);
        p4.add(y);
        p4.add(z);  
        
        l15= new JLabel("Charge Amount:");
        l15.setBounds(230,140,120,30);
        p4.add(l15);
        
        t15= new JTextField();
        t15.setBounds(360,140,180,30);
        p4.add(t15);
        
        b12= new JButton("Hide Book Info");
        b12.setBounds(10,75,160,45);
        b12.setBackground(new Color(255,255,51));
        b12.addActionListener(this);
        p4.add(b12);
        
        b13= new JButton("Book an AutoRickshaw");
        b13.setBounds(670,75,180,45);
        b13.setBackground(new Color(255,255,51));
        b13.addActionListener(this);
        p4.add(b13);
        
        b14= new JButton("Show Book Info");
        b14.setBounds(400,380,150,45);
        b14.setBackground(new Color(255,255,51));
        b14.addActionListener(this);
        b14.setVisible(false);
        p2.add(b14);
        
        
        p4.setBackground(new Color(255,255,255));
        p4.setLayout(null);
        p4.setVisible(true);
        p2.add(p4);
        
        b6= new JButton("<<Back");
        b6.setBounds(250,530,140,45);
        b6.setBackground(new Color(255,0,0));
        b6.addActionListener(this);
        b6.setFont(font_2);
        p2.add(b6);
        
        b7= new JButton("Clear All");
        b7.setBounds(400,530,140,45);
        b7.setBackground(new Color(255,255,255));
        b7.addActionListener(this);
        b7.setFont(font_2);
        p2.add(b7);
        
        b8= new JButton("Display");
        b8.setBounds(550,530,140,45);
        b8.setBackground(new Color(0,255,0));
        b8.addActionListener(this);
        b8.setFont(font_2);
        p2.add(b8);
        
        f2.add(p2);
        f2.setResizable(false);
        f2.setVisible(true);
        f2.setLayout(null);
        
    
    
    
    
    
    
    }
    
    public void ElectricScooter()
    {
        f3= new JFrame("Buy An ElectricScooter Now");
        f3.setBounds(180,20,900,620);
        
        p5= new JPanel();
        p5.setBounds(180,40,900,620);
        p5.setBackground(new Color(224,224,224));
        p5.setLayout(null);
        
        e1= new JLabel();
        e1.setText("Electric Scooter");
        e1.setBounds(380,5,300,45);
        e1.setFont(font_1);
        p5.add(e1);
        
        btn2= new JButton("Skip to AutoRickshaw>>");
        btn2.setBounds(650,8,180,45);
        btn2.setBackground(new Color(160,160,160));
        btn2.addActionListener(this);
        p5.add(btn2);
        
        p6= new JPanel();
        p6.setBounds(10,60,870,180);
        
        e2= new JLabel("Vehicle Id:");
        e2.setBounds(20,10,120,30);
        p6.add(e2);
        
        g2= new JTextField();
        g2.setBounds(150,10,160,30);
        p6.add(g2);
        
        
        e3= new JLabel("Vehicle Name:");
        e3.setBounds(20,50,120,30);
        p6.add(e3);
        
        
        g3= new JTextField();
        g3.setBounds(150,50,160,30);
        p6.add(g3);
        
        e4= new JLabel("Vehicle Weight:");
        e4.setBounds(20,90,120,30);
        p6.add(e4);
        
        g4= new JTextField();
        g4.setBounds(150,90,160,30);
        p6.add(g4);
        
        e5= new JLabel("Vehicle Color:");
        e5.setBounds(400,90,120,30);
        p6.add(e5);
        
        g5= new JTextField();
        g5.setBounds(530,90,160,30);
        p6.add(g5);

        e6= new JLabel("Vehicle Speed:");
        e6.setBounds(400,10,120,30);
        p6.add(e6);
        
        g6= new JTextField();
        g6.setBounds(530,10,160,30);
        p6.add(g6);
        
        e7= new JLabel("Battery Capacity:");
        e7.setBounds(400,50,120,30);
        p6.add(e7);
        
        g7= new JTextField();
        g7.setBounds(530,50,160,30);
        p6.add(g7);
        
        btn4= new JButton("Add An Electric Scooter");
        btn4.setBounds(600,130,200,45);
        btn4.setBackground(new Color(255,255,51));
        btn4.addActionListener(this);
        p6.add(btn4);
        
        
        p6.setBackground(new Color(204,255,229));
        p6.setLayout(null);
        p5.add(p6);
        
       
        
        
        p7= new JPanel();
        p7.setBounds(10,245,870,180);
        p7.setBackground(new Color(255,255,255));
        
        
        e8= new JLabel("Vehicle Id:");
        e8.setBounds(20,10,120,30);
        p7.add(e8);
        
        g8= new JTextField();
        g8.setBounds(150,10,160,30);
        p7.add(g8);
        
        e9= new JLabel("Brand:");
        e9.setBounds(400,10,120,30);
        p7.add(e9);
        
        g9= new JTextField();
        g9.setBounds(530,10,160,30);
        p7.add(g9);
        
        e10= new JLabel("Price:");
        e10.setBounds(20,50,120,30);
        p7.add(e10);
        
        g10= new JTextField();
        g10.setBounds(150,50,160,30);
        p7.add(g10);
        
        e11= new JLabel("Charging Time:");
        e11.setBounds(400,50,120,30);
        p7.add(e11);
        
        g11= new JTextField();
        g11.setBounds(530,50,160,30);
        p7.add(g11);
        
        e12= new JLabel("Mileage:");
        e12.setBounds(20,90,120,30);
        p7.add(e12);
        
        g12= new JTextField();
        g12.setBounds(150,90,160,30);
        p7.add(g12);
        
        e13= new JLabel("Range:");
        e13.setBounds(400,90,120,30);
        p7.add(e13);
        
        g13= new JTextField();
        g13.setBounds(530,90,160,30);
        p7.add(g13);
        
        btn5= new JButton("Purchase An Electric Scooter");
        btn5.setBounds(600,125,210,45);
        btn5.setBackground(new Color(255,255,51));
        btn5.addActionListener(this);
        p7.add(btn5);
        
        p7.setLayout(null);
        p7.setVisible(true);
        p5.add(p7);
        
        p8= new JPanel();
        p8.setBounds(10,430,870,95);
        p8.setBackground(new Color(204,255,229));
        
        e14= new JLabel("Vehicle Id:");
        e14.setBounds(20,10,120,30);
        p8.add(e14);
        
        g14= new JTextField();
        g14.setBounds(150,10,160,30);
        p8.add(g14);
        
        e15= new JLabel("Price:");
        e15.setBounds(420,10,120,30);
        p8.add(e15);
        
        g15= new JTextField();
        g15.setBounds(530,10,160,30);
        p8.add(g15);
        
        p8.setLayout(null);
        p8.setVisible(true);
        p5.add(p8);
        
        btn6= new JButton("Sell An Electric Scooter");
        btn6.setBounds(600,45,200,45);
        btn6.setBackground(new Color(255,255,51));
        btn6.addActionListener(this);
        p8.add(btn6);
        
        btn7= new JButton("<<Back");
        btn7.setBounds(250,530,140,45);
        btn7.setBackground(new Color(255,0,0));
        btn7.addActionListener(this);
        btn7.setFont(font_2);
        p5.add(btn7);
        
        btn8= new JButton("Clear All");
        btn8.setBounds(400,530,140,45);
        btn8.setBackground(new Color(255,255,255));
        btn8.addActionListener(this);
        btn8.setFont(font_2);
        p5.add(btn8);
        
        btn9= new JButton("Display");
        btn9.setBounds(550,530,140,45);
        btn9.setBackground(new Color(0,255,0));
        btn9.addActionListener(this);
        btn9.setFont(font_2);
        p5.add(btn9);
        
        f3.add(p5);
        f3.setResizable(false);
        f3.setVisible(true);
        f3.setLayout(null);
    
    
    
    
    
    
    }
    
    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource()== b1)
        {
            AutoRickshaw();
            f1.setVisible(false);
            
        }
        
        if(e.getSource()== b2)
        {
             ElectricScooter();
            f1.setVisible(false);
        }
        
        if(e.getSource()== btn2)
        {
            AutoRickshaw();
            f3.setVisible(false);
        }
        
        if (e.getSource()== b3)
        {
            ElectricScooter();
            f2.setVisible(false);
        }
        if(e.getSource()== b6)
        {
            m1();
            f2.setVisible(false);
            
        }
        if(e.getSource()==b7)
        { 
            t3.setText("");
            t4.setText("");
            t5.setText("");
            t6.setText("");
            t7.setText("");
            t8.setText("");
            t9.setText("");
            t10.setText("");
            t11.setText("");
            t12.setText("");
            t13.setText("");
            t15.setText("");
            
        }
        if(e.getSource()== b5)
        {
            p3.setVisible(false);
            b11.setVisible(true);
        }
        
        if(e.getSource()== b11)
        {
            p3.setVisible(true);
            b11.setVisible(false);
        }
        
        if(e.getSource()==b12)
        {
            p4.setVisible(false);
            b14.setVisible(true);
        }
        
        if(e.getSource()==b14)
        {
            p4.setVisible(true);
            b14.setVisible(false);
        }
        
        if (e.getSource()==b4)
        { 
           
         try
         {
            int id= Integer.parseInt(t3.getText());
            String weight= t4.getText();
            String speed= t5.getText();
            String torque= t6.getText();
            String GroundClearance= t7.getText();
            String name= t8.getText();
            String color= t9.getText();
            int EngineDisplacement= Integer.parseInt(t10.getText());
            int FuelTankCapacity= Integer.parseInt(t11.getText());
            
            boolean lulu=false;
            
            if
            (id == -1 ||id==0||  weight.equals("") || speed.equals("")|| torque.equals("")||
              GroundClearance.equals("")|| name.equals("")|| color.equals("") ||
              EngineDisplacement == -1 ||EngineDisplacement ==0||
              FuelTankCapacity ==-1||FuelTankCapacity==0 )
            {
                 JOptionPane.showMessageDialog( p2,"Please fill all the fields");
                 return;
            
            }
            else
            {
                if(Shrug.isEmpty())
                {
                  lulu=true;
                
                }
                else
                {
                    for(Vehicle obj: Shrug)
                    {
                        if(obj.getVehicleId()== id)
                        {
                             JOptionPane.showMessageDialog( p2,"Vehicle ID already exists");
                        
                             return;
                        }
                        else
                        {
                            lulu=true;
                        }
                    
                    }
                }
            }
                
            if(lulu== true)
                {
                AutoRickshaw Ar1= new AutoRickshaw(id,name,weight,color,speed,
                EngineDisplacement,torque,FuelTankCapacity,GroundClearance);
                
                Shrug.add(Ar1);
                JOptionPane.showMessageDialog( p2,"Autorickshaw Added Sucessfully");
             }
            
        }catch(NumberFormatException nnr)
        {
            JOptionPane.showMessageDialog(p2,"Invalid input...Try Again"); 
        
        }
       }
       
       if(e.getSource()==b13)
         {
          try{
             int Vehicle_Id= Integer.parseInt(t12.getText());
             int Seats= Integer.parseInt(t13.getText());
             int ChargeAmount= Integer.parseInt(t15.getText());
             
             String year= x.getSelectedItem().toString();
             String month=y.getSelectedItem().toString();
             String days= z.getSelectedItem().toString();
             
             String BookedDate=year+month+days;
             
             if(Vehicle_Id == -1 || Vehicle_Id==0|| Seats==0|| Seats == -1 ||
             ChargeAmount== -1 || ChargeAmount==0||
             BookedDate.equals("") )
             {
                JOptionPane.showMessageDialog(p2, "Please properly fill all the fields");
                return;
                
                
             }
             else
             {
                 if(Shrug.isEmpty())
                 {
                    JOptionPane.showMessageDialog(p2, "First of all add Autorickshaw in the list");
                    return;
                     
                }else
                {
                    for (Vehicle obj:Shrug)
                    {
                     if(obj instanceof AutoRickshaw)
                     {
                         if(obj.getVehicleId()==Vehicle_Id)
                         {
                              
                             JOptionPane.showMessageDialog(p2,"Your Vehicle Id is"+" "+Vehicle_Id+"\n"
                             +"Your Booked Date is"+""+BookedDate+"\n"
                             +"No of Seats are"+" "+ Seats +"\n"
                             +"Charge Amount is"+" "+ChargeAmount);
                           
                             AutoRickshaw auto_obj= (AutoRickshaw) obj;
                             
                              if(auto_obj.getIsBooked()== false )
                             {
                             auto_obj.book_AutoRickshaw(BookedDate,ChargeAmount,Seats);
                             JOptionPane.showMessageDialog(p2,"AutoRickshaw Booked Sucessfully");
                             return;
                             }
                             
                             else
                             {
                              JOptionPane.showMessageDialog(p2,"This Vehicle with "+" "+Vehicle_Id+" "+"is already Booked");
                             return;
                              } 
                          }
                        
                      }
                             
                }
                
                JOptionPane.showMessageDialog(p2, "AutoRickshaw not found");
                
                }
                
            }
                
          }catch(NumberFormatException ntr)
          {
                 JOptionPane.showMessageDialog(p2,"Invalid Input..Try Again!!");
            }
        }
        
        if (e.getSource()==btn4)
        {
            try{
                int Vehicle_Id= Integer.parseInt(g2.getText());
                String Name= g3.getText();
                String Weight= g4.getText();
                String Color= g5.getText();
                String Speed= g6.getText();
                int Battery= Integer.parseInt(g7.getText());
                boolean red= false;
                
            if
            (Vehicle_Id == -1||Vehicle_Id==0 || Name.equals("") || Weight.equals("") ||Color.equals("")
            || Speed.equals("")|| Battery == -1|| Battery==0)
            {
                JOptionPane.showMessageDialog(p5, "Please properly fill all the fields ");
                return;
            }
            else
            {
                if(Shrug.isEmpty())
                {
                    red= true;
                }
                   
                else
                {
                     for(Vehicle obj:Shrug)
                     {
                         if(obj.getVehicleId()==Vehicle_Id)
                            {
                                JOptionPane.showMessageDialog(p5,"ElectricScooter already present");
                                return;
                                
                            }
                            else
                            {
                                red=true;
                            }
                        }
                    }
                            
                }
              if(red== true)
              {
                  ElectricScooter Es= new ElectricScooter(Vehicle_Id,Name,Weight,Speed,
                  Color,Battery);
                  Shrug.add(Es);
                  JOptionPane.showMessageDialog(p5, "Electric Scooter added successfully");
              }
              

          } catch(NumberFormatException ltt)
           {
               JOptionPane.showMessageDialog(p5, "Invalid Input.... Try Again!!");
            
           } 
           
        }
        
        if(e.getSource()== btn5)
        {
            try
            {
                int Id= Integer.parseInt(g8.getText());
                int Price= Integer.parseInt(g10.getText());
                int Range= Integer.parseInt(g13.getText());
                String Brand= g9.getText();
                String Charging= g11.getText();
                String Mileage= g12.getText();
                
                if(Id==-1 || Id==0|| Price==0|| Range==0|| Price==-1 || Range== -1 || Brand.equals("") 
                || Charging.equals("")||Mileage.equals("") )
                {
                  JOptionPane.showMessageDialog(p5, "Properly fill all the fields ");
                  return;   
                }else
                {
                    if(Shrug.isEmpty())
                    {
                        JOptionPane.showMessageDialog(p5, " First of all"+" \n"+" Add ElectricScooter ");
                        return;
                        
                    }else
                    {
                        for(Vehicle nobj: Shrug)
                        {
                            if(nobj instanceof ElectricScooter)
                            {
                                if(nobj.getVehicleId()== Id)
                                {
                                 JOptionPane.showMessageDialog(p5,"Your Vehicle Id is"+" "+Id+"\n"
                                 +"Price is:"+" "+Price+"\n"
                                 +"Range is:"+" "+ Range +"\n"
                                 +"While Mileage it gives is"+" "+Mileage+
                                 "\n"+"Brand Name of it is :"+" "+Brand +"\n"+
                                 "And Its Charging Time is:"+" "+Charging);
                                    
                                 ElectricScooter elect_obj=(ElectricScooter)nobj;
                             
                                    if(elect_obj.getHasPurchased()== false)
                                    {
                                        elect_obj.PurchaseElectricScooter(Brand,Price, Charging,Mileage,Range);
                                        JOptionPane.showMessageDialog(p5," Your ElectricScooter is Purchased Sucessfully");
                                        return;
                                    }
                                    else
                                    {
                                        JOptionPane.showMessageDialog(p5, "ElectricScooter with Id"+"\n"+ Id +"is already purchased");
                                        return;
                                    }
                                }
                            
                            }
                        }
                        JOptionPane.showMessageDialog(p5, "ElectricScooter not found");
                    
                    
                    }
                }
                    

            
            }catch(NumberFormatException agt)
            {
                JOptionPane.showMessageDialog(p5, "Inavlid Input..."+"\n"+"Try Again");
            
            }
        
        
        
        }
        
        if(e.getSource()==btn6)
        {
            try{
            int ID= Integer.parseInt(g14.getText());
            int Price= Integer.parseInt(g15.getText());
            
            if(ID == -1 || Price == -1 || ID==0 || Price == 0)
            {
                JOptionPane.showMessageDialog(p5,"Properly fill all the fields");
                return;
            }
            else
            {
             if(Shrug.isEmpty())
             {
                 JOptionPane.showMessageDialog(p5, "First of all add Electric Scooter"+"\n"
                 + "in the list");
                 return;
             }
                for(Vehicle obj: Shrug)
                {
                    if(obj.getVehicleId()==ID)
                    {
                        if(obj instanceof ElectricScooter)
                        {
                             JOptionPane.showMessageDialog(p2,"Your Vehicle Id is"+" "+ID+"\n"
                             +"Price is"+""+Price);
                             
                            ElectricScooter elect_obj=(ElectricScooter)obj;
                            
                            if(elect_obj.getHasSold()== false)
                            {
                                elect_obj.SoldElectricScooter(Price);
                                JOptionPane.showMessageDialog(p5, "The Electric Scooter is sold successfully");
                                return;
                            }
                            else
                            {
                                JOptionPane.showMessageDialog(p5, "Electric Scooter with Id"+" "+ID+ "\n"
                                +"is already sold");
                                return;
                            
                            }
                        
                        
                        }
                        
                
                
                    }
            
            }
            JOptionPane.showMessageDialog(p5, "ElectricScooter Not Found");
            
            
        }
        }catch(NumberFormatException aaa)
        {
        
            JOptionPane.showMessageDialog(p5,"Invalid Input Try Again" );
        }
            
        
        
        }
           
        
        
        
        
        
       
        
           
        if(e.getSource()==btn7)
        {
            m1();
            f3.setVisible(false);
        }
        
        if(e.getSource()== btn8)
        {
           g2.setText("");
           g3.setText("");
           g4.setText("");
           g5.setText("");
           g6.setText("");
           g7.setText("");
           g8.setText("");
           g9.setText("");
           g10.setText("");
           g11.setText("");
           g12.setText("");
           g13.setText("");
           g14.setText("");
           g15.setText("");
           
        
        }
        
        if(e.getSource()== btn9)
        {
            int count=0;
            
            if(Shrug.isEmpty())
            {
                JOptionPane.showMessageDialog(p5,"No Electric Scooters Added in the list");
                count=0;
            }
            else
            {
                for (Vehicle dis:Shrug)
                {
                    if(dis instanceof ElectricScooter)
                    {
                        ElectricScooter disply=(ElectricScooter) dis;
                        disply.display();
                        count++;
                
                }
            }
            
            if (count==0)
            {
                JOptionPane.showMessageDialog(p5,"No Electric Scooters Added");
                return;
            }
            else
            {
                String message="";
                for(Vehicle dis:Shrug)
                {
                    if(dis instanceof ElectricScooter)
                    {
                        message = "Displayed Successfully";
                        
                    }
                
                }
                JOptionPane.showMessageDialog(p5,message);
                
            
            }
            
            }
        }
        
        if(e.getSource()== b8)
        {
            
            int set=0;
            
            if(Shrug.isEmpty())
            {
                JOptionPane.showMessageDialog(p5,"There is No AutoRickshaw in the list");
                set=0;
            }
            else
            {
                for (Vehicle dis:Shrug)
                {
                    if(dis instanceof AutoRickshaw)
                    {
                        AutoRickshaw disply=(AutoRickshaw) dis;
                        disply.display();
                        set++;
                
                }
            }
            
            if (set == 0)
            {
                JOptionPane.showMessageDialog(p5,"No AutoRickshaw Added");
                return;
            }
            else
            {
                String message="";
                for(Vehicle dis:Shrug)
                {
                    if(dis instanceof AutoRickshaw)
                    {
                        message = "Displayed Successfully";
                        
                    }
                
                }
                JOptionPane.showMessageDialog(p5,message);
                
            
            }
            
            }
        }
        
        
        }
        
        
        
        
    


            
           
            

        
    
            

  
  public static void main(String[]args)
  {
      TransportGUI trans= new TransportGUI();
      trans.m1();
     
  }       
             
             
            
 }

         
            
        
   
    
    
    
    
    
    
    
  
    

   
    
    
    
    
