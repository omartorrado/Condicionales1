/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package condicionales;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author otorradomiguez
 */
public class Condicionales {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // creamos el objeto c1 de la clase condicional1
        Condicional1 c1=new Condicional1(9,5);
        //comp1 es el metodo condicional anidado que contempla las 3 posibilidades
        // n1<n2, n2<n1, n1==n2
        //comp1 compara las variables del objeto dadas en el constructor 9,5
        c1.comp1();
        //comp2 compara los numeros dados, no las variables del objeto c1
        c1.comp2(6, 3);
        ////Igual que lo anterior pero pidiendo los numeros
        //int a= Integer.parseInt(JOptionPane.showInputDialog("Escribe un numero"));
        //int b= Integer.parseInt(JOptionPane.showInputDialog("Escribe un numero"));
        ////Nuevo objeto de clase condicional1 usando los numero pedidos antes
        //Condicional1 c2=new Condicional1(a,b);
        Condicional1 c2=new Condicional1(1,-6);
        c2.comp1();
        //al no haber else en comp2 la siguiente linea no hace nada porque
        //no se cumple el if, por lo que el programa continua con la siguiente
        //linea del codigo
        c2.comp2(5,5);
        //Al ser iguales devuelve 8 es mayor(el else) pq no cumple la condicion
        //del if (8>8)
        c2.CompDoble(8, 8);
        
        //EJEMPLOS DE USO DE SCANNER
        Scanner sc1=new Scanner(System.in);
        System.out.println("Introduce dos numeros enteros");
        Condicional1 c3=new Condicional1(sc1.nextInt(),sc1.nextInt());
        c3.comp1();
        //si metemos mas de dos digitos cuando nos pide numeros el c3
        //se consideran los nextint de este metodo (o los proximos del codigo
        c3.compcomp(sc1.nextInt(),sc1.nextInt());
        //si el input no empieza con 4 ints da error, los datos introduciodos 
        //a continuacion de los 4 ints no se tienen en cuenta pq no hay mas 
        //llamadas a scanner
    }
    
}
