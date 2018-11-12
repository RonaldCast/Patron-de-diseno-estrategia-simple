
package patron.strategy.Contexto;

import patron.strategy.Inteface.Estrategia;

public class Contexto {
   Estrategia tipoEstrategia;
   
   public Contexto(Estrategia tipoEstrategia ){
       this.tipoEstrategia = tipoEstrategia;
   }
   public void setEstrategia(Estrategia tipoEstrategia){
       this.tipoEstrategia = tipoEstrategia;
   }
   
   public void metodos(){
       tipoEstrategia.Comportamiento();
   }
}
