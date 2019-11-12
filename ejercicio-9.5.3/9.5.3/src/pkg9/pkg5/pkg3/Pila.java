/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg9.pkg5.pkg3;

import java.util.Vector;

/**
 *
 * @author Yess
 */
class Pila {
   private static final int INICIAL = 19;
	 private int cima;
	 private Vector listaPila;
	 public Pila()
	 {
	 	 cima = -1;
	 	 listaPila = new Vector(INICIAL);
	 }  
         public void mostrarpila() {
        for (int i = listaPila.size(); i > 0; i--) {
            if ((int) listaPila.elementAt(i - 1) != 0) {
                System.out.println(listaPila.elementAt(i -1));
            }

        }
    }
	 public void insertar(Object elemento)
	 {
	 	 cima++;
	 	 listaPila.addElement(elemento);
	 }
	 public Object quitar() 
	 {	
	 	 Object aux;
	 	 if (pilaVacia())
	 	 {
	 	 	                System.out.println("Pila vacía, no se puede extraer.");
	 	 }
	 	 aux = listaPila.elementAt(cima);
	 	 listaPila.removeElementAt(cima);
	 	 cima--;
	 	 return aux;
	 }
	 public Object cimaPila()
	 {	
	 	 if (pilaVacia())
	 	 {
	 	 	                System.out.println("Pila vacía, no se puede extraer.");
	 	 }
	 	 return listaPila.elementAt(cima);
	 }
	 public boolean pilaVacia()
	 {
	 	 return cima == -1;
	 }
	 public void limpiarPila() 
	 {
             try{
	 	 while (! pilaVacia())
	 	 	 quitar();
             }catch (Exception e) {
                 
             }
	 }
}
