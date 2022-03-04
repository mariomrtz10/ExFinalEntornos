package com.mycompany.entornos_mm;

public class EntornosMM {

    public static void main(String[] args) {
        
    }

    public static void unMetodoSospechoso(int[] Matriz) {
        int i, j, Variable3;
        for (i = 0; i < Matriz.length - 1; i++) {
            for (j = 0; j < Matriz.length - i - 2; j++) {
                if (Matriz[j + 1] < Matriz[i]) {
                    Variable3 = Matriz[j + 1];
                    Matriz[j + 1] = Matriz[j];
                    Matriz[j] = Variable3;
                }
            }
        }
        
    }
    
    
}
