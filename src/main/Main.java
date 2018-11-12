package main;


import patron.strategy.Contexto.Contexto;
import patron.strategy.Estrategias.EstrategiaA;
import patron.strategy.Estrategias.EstrategiaB;
import patron.strategy.Inteface.Estrategia;


public class Main {
   public static void main(String args[]){
       Estrategia estrategiaPrimera = new EstrategiaA();
       Contexto context = new Contexto(estrategiaPrimera);
       context.metodos();
       
       Estrategia estrategiaSegunda = new EstrategiaB();
       context.setEstrategia(estrategiaSegunda);
       context.metodos();
       
       context.setEstrategia(estrategiaPrimera);
       context.metodos();
       
       
   } 
}
