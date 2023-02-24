package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int opcion=0;

        do{
            System.out.println("------------------------");
            System.out.println("Aplicacion de Mensajes");
            System.out.println("1.- Crear Mensaje");
            System.out.println("2.- Listar Mensajes");
            System.out.println("3.- Eliminar Mensajes");
            System.out.println("4.- Editar Mensajes");
            System.out.println("5.- SALIR");
            System.out.println("------------------------");

            //leemos la opcion del usuario
            opcion=sc.nextInt();

            switch (opcion){
                case 1:
                    mensajesService.crearMensaje();
                    break;
                case 2:
                    mensajesService.listarMensajes();
                    break;
                case 3:
                    mensajesService.borrarMensaje();
                    break;
                case 4:
                    mensajesService.editarMensaje();
                    break;
                default:
                    break;
            }


        }while(opcion !=5);
    }
}