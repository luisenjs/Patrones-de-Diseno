package com.mycompany.patronstrategy;

import Context.Context;
import Strategy.*;
import java.util.Scanner;

public class PatronStrategy {

    public static void main(String[] args) {
        int menu = 1;        
        Context context = new Context();
        Scanner entrada=new Scanner(System.in);
        
        System.out.println("---Bienvenido al sistema de pagos---");
        
        while (menu!=0){                        
            System.out.println("\t0: Salir"+"\n"+"\t1: PayPal"+"\n"+"\t2: FastSpring"+"\n"+"\t3: AmazonPay");                
            System.out.print("Introduzca la forma de pago: ");
            menu = entrada.nextInt();
            
            switch (menu){
            
                case 0:                
                    System.out.println("\nSaliendo del sistema....");                
                    break;                
                case 1:                
                    context.setStrategy(new Paypal());
                    context.realizarTransaccion();                
                    break;
                case 2:
                    context.setStrategy(new FastSpring());
                    context.realizarTransaccion();
                    break;
                case 3:
                    context.setStrategy(new AmazonPay());
                    context.realizarTransaccion();
                    break;
                default:
                    System.out.println("\nEntrada no válida");
                    break;
            }
        }
    }
}
