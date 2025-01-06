/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package emma;

/**
 *
 * @author HP
 */ 
public class Next_AI_Inc{
    
    
    public void weeklypay(double basepay, int hoursworked){
        
        if(basepay < 30000){
            System.out.println("Error, base pay should not be less ugx 30000");
            return;
        }
        
        if(hoursworked > 72){
            System.out.println("Error, hours worked per week should not be greater than 72 hours");
            return;
        }
        
        double totalpay;
        if(hoursworked <= 48){
            totalpay = basepay * hoursworked;
        }
        else{
            int regularhours = 48;
            int overtimehours = hoursworked - regularhours;
            totalpay = (basepay * hoursworked) + (basepay * 2 * overtimehours);
        }
        
        System.out.println();
        System.out.println("Weekly Total pay: " + totalpay);
        
    }
    public static void main (String [] args){
      Next_AI_Inc   likambo = new Next_AI_Inc();
        
        System.out.println();
        likambo.weeklypay(30000,51);
        System.out.println();
        
        System.out.println();
        likambo.weeklypay(20000,40);
        System.out.println();
        
        System.out.println();
        likambo.weeklypay(30000, 96);
        
        
    }
    
}
