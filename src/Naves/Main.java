package Naves;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        boolean bool= true;
        int cont = 0;
        Scanner sc = new Scanner(System.in);
        ArrayList<CrearTripulada> nave = new ArrayList<>();
        ArrayList<CrearNoTripulada> nave2 = new ArrayList<>();

        /*
        nave.add(new CrearTripulada("sonia"));
        nave.add(new CrearTripulada("whale"));
        nave.add(new CrearTripulada("python"));

        for(int i = 0; i < nave.size(); i++) {
            System.out.println(nave.get(i).getName());
        }

        System.out.println(nave.get(2).getTransport());*/

        while (bool == true){
            System.out.println("Elija el tipo de nave a crear: 1.Tripulada 2.No tripulada");
            int num = sc.nextInt();
            sc.nextLine();
            if(num == 1){
                System.out.println("Digite nombre de la nave tripulada: ");
                String name = sc.nextLine();
                nave.add(new CrearTripulada(name));
                System.out.println("Digite tipo de combustible: 1.Solido 2.Liquido 3. Liquido - solido ");
                name = sc.nextLine();
                nave.get(cont).fuel(name);
                System.out.println("Digite cantidad de pasajeros: ");
                name = sc.nextLine();
                nave.get(cont).cantidadPasajeros(name);
                System.out.println("Digite tipo de mision: 1.Mantenimiento 2.Investigacion ");
                name = sc.nextLine();
                nave.get(cont).mission(name);
            }else if(num == 2){
                System.out.println("Digite nombre de la nave no tripulada: ");
                String name = sc.nextLine();
                nave2.add(new CrearNoTripulada(name));
                System.out.println("Digite tipo de combustible: 1.Solido 2.Liquido 3. Liquido - solido ");
                name = sc.nextLine();
                nave2.get(cont).fuel(name);
                System.out.println("Digite tipo de nave no tripulada: 1.Sonda 2.Satelite ");
                name = sc.nextLine();
                nave2.get(cont).typeNave(name);
                System.out.println("Digite destino de la nave (planeta o lunas del sistema solar)");
                name = sc.nextLine();
                nave2.get(cont).study(name);
            }
            cont += 1;

            System.out.println("Desea crear mas naves? : 1.Si 2.No");
            num = sc.nextInt();
            if(num == 1){
                bool = true;
            }else {
                bool = false;
            }


        }

        System.out.println("Las naves tripuladas creadas son:");

        for(int i = 0; i < nave.size(); i++) {
            System.out.println("la nave "+i+1+" es: ");
            System.out.println(nave.get(i).getName());
            System.out.println(nave.get(i).getFuel());
            System.out.println(nave.get(i).getCantPas());
            System.out.println(nave.get(i).getDest());
            System.out.println("\n");
        }

        System.out.println("Las naves no tripuladas creadas son:");
        for(int i = 0; i < nave2.size(); i++) {
            System.out.println("la nave "+i+1+" es: ");
            System.out.println(nave2.get(i).getName());
            System.out.println(nave2.get(i).getType());
            System.out.println(nave2.get(i).getFuel());
            System.out.println(nave2.get(i).getPlanet());
            System.out.println("\n");
        }


    }
}
