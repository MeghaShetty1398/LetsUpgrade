/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myemployeedetails;

/**
 *
 * @author Owner
 */
public class MyEmployeeDetails {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Doctor[] d=new Doctor[3];
        Engineer[] e=new Engineer[3];
        Pilot[] p=new Pilot[3];
        for(int i=0;i<3;i++)
        {
            d[i]=new Doctor();
            d[i].getDetails();           
        }
        for(int i=0;i<3;i++)
        {
            d[i].displayDetails();
            d[i].myinfo();
        }
        
        for(int i=0;i<3;i++)
        {
            e[i]=new Engineer();
            e[i].getDetails();           
        }
        for(int i=0;i<3;i++)
        {
            e[i].displayDetails();
            e[i].myinfo();
        }
        for(int i=0;i<3;i++)
        {
            p[i]=new Pilot();
            p[i].getDetails();           
        }
        for(int i=0;i<3;i++)
        {
            p[i].displayDetails();
            p[i].myinfo();
        }
    }
    
}
