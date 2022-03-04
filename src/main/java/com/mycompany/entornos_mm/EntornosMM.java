package com.mycompany.entornos_mm;

public class EntornosMM {

    public static void main(String[] args) {
        int Matriz []= {20,5,12,44,-3,0,26,-17,13,18};//Creamos una matriz de numeros para commprobar el funcionamiento del método
        EntornosMM.ordenar(Matriz);
        for(int x: Matriz ){    
            System.out.println(x);
        }
  
    }

    public static void ordenar(int[] Matriz) {//El metodo sirve para ordenar de menor a mayor los numeros de la matriz
        int i, j, Variable3;
        for (i = 0; i < Matriz.length ; i++) {
            for (j = 0; j < Matriz.length -1; j++) {
                if (Matriz[j + 1] < Matriz[j]) {
                    Variable3 = Matriz[j + 1];
                    Matriz[j + 1] = Matriz[j];
                    Matriz[j] = Variable3;
                }
            }
        }
        
    }
    
    
}
