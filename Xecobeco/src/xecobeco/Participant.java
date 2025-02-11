/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package xecobeco;


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
    private String data_naix;
    private String nom_equip;
    private static int qt;
    
    //Constructor

    public Participant(String dni, String nom, String cognoms, String data_naix, String nom_equip) throws Excepcio1 {
        qt++;
        this.dorsal = qt;
        this.setDni(dni);
        this.nom = nom;
        this.cognoms = cognoms;
        this.data_naix = data_naix;
        this.nom_equip = nom_equip;
    }
    
    //Setters

    public void setDni(String dni) throws Excepcio1 {
        if(validarDni(dni)){
            this.dni = dni;
        }
        else{
            throw new Excepcio1("DNI no valid");
        }
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setCognoms(String cognoms) {
        this.cognoms = cognoms;
    }

    public void setData_naix(String data_naix) {
        this.data_naix = data_naix;
    }

    public void setNom_equip(String nom_equip) {
        this.nom_equip = nom_equip;
    }
    
    //Getters

    public boolean getDni(String dni) {
        return dni.matches("^\\d{8}[A-Z]$");
    }

    public String getNom() {
        return nom;
    }

    public String getCognoms() {
        return cognoms;
    }

    public String getData_naix() {
        return data_naix;
    }

    public String getNom_equip() {
        return nom_equip;
    }
    
    
    //Mètodes

    public static boolean validarDni(String dni){
        //Agafar la part numerica i la lletra
        String partNumerica=dni.substring(0,8);
        char lletraDni=dni.charAt(8);
        
        char lletraCalculada=calcularLletraDni(partNumerica);
        return lletraDni==lletraCalculada;
        
    } 
     private static char calcularLletraDni(String partNumerica) {
        // Tabla de letras para DNIs
        char[] letras = {'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z', 'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E'};

        // Convertir la part numérica a un nombre enter
        int numeroDNI = Integer.parseInt(partNumerica);

        // Calcular la resta de la divisió entre 23
        int resto = numeroDNI % 23;

        // Tornar la lletra correspondent
        return letras[resto];
    }
     
    @Override
    public String toString() {
        return "Participant{" + "dorsal=" + dorsal + ", dni=" + dni + ", nom=" + nom + ", cognoms=" + cognoms + ", data_naix=" + data_naix + ", nom_equip=" + nom_equip + '}';
    }
    
}
