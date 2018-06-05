/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package biblioteca;
/**
 * @author ESFOT
 */

import java.util.Scanner;

public class Biblioteca {

    /**
     * @param args the command line arguments
     */
    
    Libro[] libros;

    public Libro[] getLibros() {
        return libros;
    }

    public void setLibros(Libro[] libros) {
        this.libros = libros;
    }

    char x;
    
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner scan = new Scanner(System.in);
     
        Libro[] libros=new Libro[10];
       
       
       /*System.out.println("Hola que deseas hacer ?"+"\n"+"ingresar un libro o ver  tus libros");
        System.out.println("escribe"+"\n"+"s para ingresar un nuevo libro");
        System.out.println("imprimir tus libros");*/
        
       for(int i=0; i<libros.length; i++){
             
        System.out.println("ingrese los datos del libro: "+(i+1));
       // scan.nextLine();
           
           System.out.println("Titulo");
           String titulo = scan.nextLine();
           
           System.out.println("Año");
           int anio =scan.nextInt();
           
           System.out.println("ingrese datos del Autor");
           scan.nextLine();
           
           Autor[]autor=new Autor[libros.length];
           
           for(int j=0; j<= i; j++){
           
               System.out.println("ingrese el nombre");
               String nombres =scan.nextLine();
               
               System.out.println("pais");
               String pais =scan.nextLine();
               j=0;
               break;
           }
              /*System.out.println("Informacion");
        
                for (int k=0; k<libros.length; k++){
        
                    System.out.println("libro: "+libros[i].getTitulo()+"\n"+"autor: "+libros[i].getAnio());
        
        }*/
       }  
       
     
           
       
       
       
    }
}
