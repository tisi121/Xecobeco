/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package xecobeco;

import java.util.Scanner;
import java.util.TreeSet;

/**
 *
 * @author thejo
 */
public class Xecobeco {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Excepcio1 {
        //Variables
        int opcio;
        Scanner sc = new Scanner(System.in);
        TreeSet<Participant> participants = new TreeSet<>();

        do {
            System.out.println("Benvinguts a les inscripcions de la nostra cursa, escolleix una opcio: ");
            System.out.println("Opcio 1 - Alta Participant");
            System.out.println("Opcio 2 - Consultar per DNI");
            System.out.println("Opcio 3 - Eliminar participant per DNI");
            System.out.println("Opcio 4 - Modificar informacio del participant");
            System.out.println("Opcio 5- Sortir");
            opcio = sc.nextInt();

            switch (opcio) {
                case 1:
                    //Variables
                    String dni;
                    String nom;
                    String cognoms;
                    String data_naix;
                    String nom_equip;
                    char sexe;
                    
                    
                    System.out.println("Primer de tot voldrem el DNI del participant");
                    dni = sc.next();

                    boolean dniExisteix = false;
                    for (Participant p : participants) {
                        if (p.getDni().equals(dni)) {
                            dniExisteix = true;
                            break; // Sortir del bucle si trobem el DNI
                        }
                    }
                    if (dniExisteix) {
                        System.out.println("Error: El DNI del participant ja està registrat.");
                    }
                    System.out.println("Introdueix el nom del participant");
                    nom = sc.next();
                    System.out.println("Introdueix els cognoms del participant");
                    cognoms = sc.nextLine();
                    System.out.println("Introdueix la data de naixement del participant");
                    data_naix = sc.nextLine();
                    System.out.println("Introdueix el nom del equip(si te equip)");
                    nom_equip = sc.next();
                    System.out.println("Introdueix el sexe del participant(H/D)");
                    sexe = sc.next().charAt(0);

                    participants.add(new Participant(dni, nom, cognoms, data_naix, nom_equip, sexe));
                    System.out.println("Participant introduit correctament");
                    System.out.println(participants.toString());//Falta ficar els participants de corredors[]
                    
                    break;
                case 2:
                    //Variables
                    boolean dniBuscat;
                    String dniBuscar;
                    
                    
                    System.out.println("Introdueix el DNI del participant");
                    dniBuscar=sc.next();
                    for (Participant buscar : participants) {
                        if (buscar.getDni().equals(dniBuscar)) {
                            dniBuscat = true;
                            break; // Sortir del bucle si trobem el DNI
                        }
                    }
                    
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    break;
            }

        } while (opcio != 5);
    }

}
