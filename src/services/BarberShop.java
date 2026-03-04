package services;

import entities.Barber;
import entities.ChairReservation;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BarberShop {





    private List<Barber> barbers = new ArrayList<>();
    private List<ChairReservation> reservations = new ArrayList<>();



    public BarberShop(){
        barbers.add(new Barber("Carlos", "1234123213", 1));
        barbers.add(new Barber("Jonas", "4123124123", 2));
        barbers.add(new Barber("Marcos", "6623234231", 3));

    }

    public void fazerReserva(Scanner sc){
        System.out.print("Nome do cliente: ");
        String name = sc.nextLine();

        System.out.print("Telefone: ");
        String clientPhone = sc.nextLine();

        int code;

        while (true){
            System.out.println("Escolha o barbeiro (1-Carlos, 2-Jonas, 3-Marcos)");
            code = sc.nextInt();
            sc.nextLine();

            if (code<1 || code> barbers.size()){
                System.out.println("Codigo de barbeiro invalido!");
                continue;
            }
            Barber chosenBarber = barbers.get(code -1);

            if (chosenBarber.isOcupado()){
                System.out.println("Barbeiro indisponivel ");
                continue;
            }

            int chair;

            while (true){
                System.out.print("Escolha a cadeira(1-20): ");
                chair = sc.nextInt();
                sc.nextLine();

                if (chair<1 || chair>20){
                    System.out.println("Número invalido!");
                    continue;
                }

                if (cadeiraJaExiste(chair)){
                    System.out.println("Cadeira ocupada!");
                    continue;
                }

                break;

            }

            chosenBarber.setOcupado(true);

            reservations.add(new ChairReservation(name, clientPhone, chair, chosenBarber));

            System.out.println("Reserva realizada!");
            break;
        }

    }
        private boolean cadeiraJaExiste(int chair){
        for (ChairReservation c : reservations){
            if (c.getChairNumber() == chair){
                return true;
            }
        }
        return false;

        }

        public void cancelarReserva(Scanner sc){

            System.out.println("Digite o numero da cadeira: ");
            int chair = sc.nextInt();
            sc.nextLine();

           ChairReservation reservaEncontrada = null;

           for (ChairReservation c: reservations){
               if (c.getChairNumber() == chair){
                   reservaEncontrada = c;
                   break;
               }
           }

           if (reservaEncontrada == null){
               System.out.println("Reserva não encontrada");
               return;
           }

           reservaEncontrada.getBarber().setOcupado(false);
           reservations.remove(reservaEncontrada);

            System.out.println("Reserva cancelada!");

        }


        public void listarDisponiveis(){

            for (Barber b: barbers){
                if (!b.isOcupado()){
                    System.out.println(b);
                }
            }
        }

        public void listarReservas(){
        if (reservations.isEmpty()){
            System.out.println("Nenhuma rezerva encontrada");
            return;
        }

        for (ChairReservation c: reservations){
            System.out.println(c);
        }

    }

}
