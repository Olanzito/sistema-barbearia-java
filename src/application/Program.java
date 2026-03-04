package application;

import services.BarberShop;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        BarberShop shop = new BarberShop();


        int option;


        do {
            System.out.println("1 - Fazer reserva");
            System.out.println("2 - Listar reservas");
            System.out.println("3 - Cancelar reserva");
            System.out.println("4 - Barbeiros disponíveis");
            System.out.println("5 - Sair");

            option = sc.nextInt();
            sc.nextLine();

            switch (option){

                case (1):
                    shop.fazerReserva(sc);
                    break;

                case (2):
                    shop.listarReservas();
                    break;

                case (3):
                    shop.cancelarReserva(sc);
                    break;

                case (4):
                    shop.listarDisponiveis();
                    break;

                default:
                    System.out.println("Opção inválida");

            }



        }while (option !=5);

        sc.close();


    }
}
