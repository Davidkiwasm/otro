/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package scarga.cal2;

/**
 *
 * @author david
 */
public class intent {
    public float suma(float a,float b){
        return a+b;
    }
       public float resta(float a,float b){
        return a-b;
    }
 public float division(float a,float b){
        return a/b;
    }
    
    public boolean multiplo(int a,int b){
        if(a % b == 0)
            return true;
        return false;
    }

   public int factorial(int n){
        int mult=1;
        for(int i=1;i<=n;i++)
           mult=mult*i;
 
        return mult;
    }
}
