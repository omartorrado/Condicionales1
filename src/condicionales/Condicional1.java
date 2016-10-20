/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package condicionales;

/**
 *
 * @author otorradomiguez
 */
public class Condicional1 {
    int num1,num2;

    public Condicional1(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
        }
        
    public void comp1(){
        if (num1>num2){
            System.out.println(num1+" es mayor");
            }
        else { if(num1==num2){
            System.out.println("Los numeros son iguales");
            }
        else{
            System.out.println(num2+" es mayor");
            }
        }

    
    }
    //Metodo que pide los numeros a comparar pero no los guarda en las variables
    //del objeto
    public void comp2(int n1,int n2){
        if(n1>n2)
            System.out.println(n1+" es mayor");
    }
    //Metodo if prescindiendo de llaves porque solo es una linea en cada if/else
    public void CompDoble(int n1, int n2){
        if(n1>n2)
            System.out.println(n1+" es mayor");
        else
            System.out.println(n2+" es mayor");
        System.out.println("Bye Bye");
    }
    //Metodo if compacto
    public void compcomp(int n1, int n2){
        int numero= (n1>n2)? n1:n2;
        System.out.println("El mayor es "+numero);
    }
    
    
}
