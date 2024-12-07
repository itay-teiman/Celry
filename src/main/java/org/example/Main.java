package org.example;

import java.util.ArrayList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class







Main {

    // פעולה לחישוב השכר
    public  static  int Celry(ArrayList<Employee> employees, int moth){

         int a=0;
         int b=0;
        for( int i = 1;i<employees.size();i++){
          int  celry=(int) employees.get(i).salary();
            if(employees.get(i).getDateOFBirth()== moth){

             celry+=300;

            }

        if(employees.get(i).getDateOfStart()>5){
            celry+=1000;
        }
        if(employees.get(i).getDateOfStart()>10){
            celry+=1000;
        }


        a=celry;
        b= (int) (celry*0.35);

        }

       return  a+ b;

    }


    public static void main(String[] args) {
        ArrayList<Employee> employees=new ArrayList<Employee>(1);






    }}