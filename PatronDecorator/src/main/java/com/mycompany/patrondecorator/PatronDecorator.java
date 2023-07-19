/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.patrondecorator;

import Decorator.IngredienteAtun;
import Decorator.IngredientePollo;
import Decorator.IngredienteChancho;
import Menu.ComboA;
import Menu.ComboB;
import Menu.ComboSandwich;

/**
 *
 * @author ander
 */
public class PatronDecorator {

    public static void main(String[] args) {
        ComboSandwich pedido1 = new ComboA();
        //System.out.println(pedido1.getDescripcion() + "\nTotal: $" + pedido1.getPrecio());
        
        pedido1 = new IngredientePollo(new IngredienteChancho(pedido1));
        
        System.out.println(pedido1.getDescripcion() + "\nTotal: $" + pedido1.getPrecio());
        
        ComboSandwich pedido2 = new ComboB();
        //System.out.println(pedido2.getDescripcion() + "\nTotal: $" + pedido2.getPrecio());
        
        pedido2 = new IngredienteAtun(pedido2);
                
        System.out.println(pedido2.getDescripcion() + "\nTotal: $" + pedido2.getPrecio());

    }
}
