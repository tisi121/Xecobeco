/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package xecobeco;

import java.util.Date;

/**
 *
 * @author thejo
 */
public class Participant {
    //Constants
    
    //Atributs
    private int dorsal=0;
    private String dni;
    private String nom;
    private String cognoms;
    private Date data_naix;
    private String nom_equip;
    private static int qt;
    
    //Constructor

    public Participant(String dni, String nom, String cognoms, Date data_naix, String nom_equip) {
        qt++;
        this.dorsal = qt;
        this.dni = dni;
        this.nom = nom;
        this.cognoms = cognoms;
        this.data_naix = data_naix;
        this.nom_equip = nom_equip;
    }
    
}
