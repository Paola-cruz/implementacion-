/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg9.pkg5.pkg3;

import javax.swing.JOptionPane;

/**
 *
 * @author Yess
 */
public class Main {

    public static void main(String[] args) {
       
   int Opcion,a;
        Pila objpilaEnteros = new Pila();
        do{
            Opcion = Integer.parseInt(JOptionPane.showInputDialog(null,
                    "1. INGRESAR DATO\n"+
                    "2. QUITAR\n"+
                    "3. CIMA PILA\n"+
                    "4. PILA VACIA\n"+
                    "5. LIMPIAR PILA\n"+
                    "6. MOSTRAR\n"+        
                    "7. SALIR\n"+
                    "--------------------------------------------------------\n"+
                    "INGRESE LA OPCION [1 - 7]","MENU COLA",JOptionPane.QUESTION_MESSAGE));
             

            switch(Opcion)
            {
                case 1: 
                    a=Integer.parseInt(JOptionPane.showInputDialog(null,"Ingresa el número que deseas insertar"));
                    objpilaEnteros.insertar(a);break;
                case 2: objpilaEnteros.quitar();break;
                case 3: objpilaEnteros.cimaPila();break;
                case 4: objpilaEnteros.pilaVacia();break;
                case 5: objpilaEnteros.limpiarPila();break;
                case 6: objpilaEnteros.mostrarpila();break;
                case 7: System.exit(0);break;
                default: JOptionPane.showMessageDialog(null,"NO ES CORRECTA \n","ERROR OPCION",JOptionPane.WARNING_MESSAGE);break;
            }
        }while(true); 
    }
    }
  