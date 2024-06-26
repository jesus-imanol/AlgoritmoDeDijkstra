package models;

import models.Vertice;

import java.util.*;

public class Grafo {
    Vertice [] listaVertices;
    private int [][] matrizAdyacencia;
    private List<Integer>[] listaAdyacencia;

    public Grafo(int cantidadVertices) {
        matrizAdyacencia = new int[cantidadVertices][cantidadVertices];
        listaVertices = new Vertice[cantidadVertices];
        for (int i = 0; i < matrizAdyacencia.length; i++) {
            for (int j = 0; j < matrizAdyacencia.length; j++) {
                matrizAdyacencia[i][j] = 0;
            }
        }
    }

    public void agregarVertice(String etiqueta, int numero) {
        Vertice nuevoVertice = new Vertice(etiqueta);
        nuevoVertice.asigVert(numero);
        listaVertices[numero] = nuevoVertice;
    }
    public void agregarAristas(){
        Scanner entrada=new Scanner(System.in);
        int origen, destino, opcion;
        do {
            for(int i=0; i<listaVertices.length;i++){
                System.out.println(i+1+")"+listaVertices[i].getNombre());
            }
            System.out.println("Ingresa el vertice origen");
            origen=entrada.nextInt();
            System.out.println("Ingresa el vertice destino");
            destino=entrada.nextInt();
            matrizAdyacencia[origen-1][destino-1] = 1;
            System.out.println("Agregar más aristas 1) SI \t2) NO");
            opcion=entrada.nextInt();
        }while(opcion==1);
    }

    public void imprimir(){
        System.out.println("Matriz de adyacencia");
        for(int i=0; i<matrizAdyacencia.length;i++){
            for(int j=0; j<matrizAdyacencia[i].length; j++){
                System.out.print(matrizAdyacencia[i][j]+"\t");
            }
            System.out.println();
        }
    }
}