/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.util.Scanner;
/**
 *
 * @author JYOTHI PRAKASH N
 */
public class Stud {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        student obj[]=new student[10];
        for(int i=0;i<2;i++)
        {
            obj[i]=new student();
            obj[i].getdata();
            obj[i].markcalc();
            obj[i].display();
       }
        // TODO code application logic here
    }
    
}
class student{
    String name,dept,status;
    double m1,m2,m3,avg;
    void getdata()
    {
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter name:");
        name=obj.next();
        System.out.println("Enter dept:");
        dept=obj.next();
        System.out.println("Enter marks:");
        m1=obj.nextDouble();
        m2=obj.nextDouble();
        m3=obj.nextDouble();
    }
void markcalc()
{
    avg=(m1+m2+m3)/3;
    if(m1<50||m2<50||m3<50){
        status="FAIL";
    }
    else{
        if(avg>=80)
            status="First class";
        if(avg>=70&&avg<=79)
            status="Second class";
        if(avg>=50&&avg<=69)
            status="Third class";
    }
}
void display()
{
    System.out.println("Name:"+name+"\nDept:"+dept+"\nM1:"+m1+"\nM2:"+m2+"\nm3:"+m3+"\nAverage:"+avg+"\nStatus:"+status);
}   
}    
    

