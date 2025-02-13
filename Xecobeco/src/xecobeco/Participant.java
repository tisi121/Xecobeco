/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package xecobeco;

import java.util.Objects;


/**
 *
 * @author thejo
 */
public class Participant implements Comparable<Participant>{
    //Constants
    
    //Atributs
    private int dorsal=0;
    private String dni;
    private String nom;
    private String cognoms;
    private String data_naix;
    private String nom_equip;
    private char sexe;
    private static int qt;
    
    //Constructor

    public Participant(String dni, String nom, String cognoms, String data_naix, String nom_equip,char sexe) throws Excepcio1 {
        String[] corredors = {"97", "RUIZ SORIANO, CRISTINA", "43627363F", "5", "43", "56", "14", "4", "1992", "S", "F", "", "89", "FERNÁNDEZ MÁRQUEZ, CARLOS", "45376372J", "6", "45", "46", "17", "7", "1965", "V", "M", "Sherpas de Montserrat", "99", "TORNER ALSINA, MIRIAM", "46384732H", "9", "22", "12", "24", "6", "1961", "V", "F", "", "86", "AGUADO MASCARÓ, ANGELA", "46536384D", "8", "54", "54", "12", "4", "1973", "V", "F", "Relámpagos del suelo", "95", "PUNZANO GOMEZ, MANUEL", "46537628W", "6", "33", "35", "23", "11", "1987", "S", "M", "", "96", "RIERA MARTÍ, JOAN", "46537726S", "5", "55", "0", "5", "2", "1974", "V", "M", "", "99", "TORNER CORRONS, JOAN", "46554444H", "9", "34", "58", "24", "6", "1967", "V", "M", "Sombres de llampecs", "90", "GÓMEZ MARTÍN, ÓSCAR", "46563746T", "8", "55", "49", "19", "12", "1979", "S", "M", "Llebretes i tortugues", "93", "ORTEGA PEDREGOSA, CRISTINA", "46748574D", "7", "33", "1", "2", "6", "1971", "V", "F", "Amb una sabata i una espardenya", "98", "SEGURA ALSINA, POL", "46748993L", "5", "32", "48", "21", "5", "1968", "V", "M", "", "84", "SOLSONA GUISADO, CRISTINA", "46781969S", "5", "20", "48", "30", "8", "1991", "S", "F", "", "87", "BERNAUS ROVIRA, MARC", "46875384T", "6", "33", "46", "6", "3", "1987", "S", "M", "Sherpas de Montserrat", "88", "CAąIZARES GARCÍA, JORDI", "46875384Y", "8", "23", "49", "26", "2", "1981", "S", "M", "Sin prisa pero sin pausa", "26", "CERDÁN DOMINGO, POL", "47079943J", "9", "53", "15", "8", "4", "1983", "S", "M", "La alegria de la huerta", "75", "PARADELL SOLANO, AFRICA", "47110139K", "6", "17", "46", "23", "9", "1990", "S", "F", "Amb una sabata i una espardenya", "81", "SAEZ DELGADO, SANDRA", "47110277K", "6", "14", "35", "14", "2", "1992", "S", "F", "", "78", "PIąOL RODRIGUEZ, ANA", "47110539F", "7", "14", "47", "7", "11", "1964", "V", "F", "", "79", "RIALP GUTIÉRREZ, MARIA LUISA", "47111955C", "7", "9", "1", "23", "6", "1987", "S", "F", "", "72", "NINOT SEGURA, PAULA", "47112432Z", "5", "46", "28", "26", "3", "1981", "S", "F", "Amb una sabata i una espardenya", "76", "PIJOAN PEąA, GEMMA", "47112571S", "8", "43", "49", "6", "4", "1983", "S", "F", "", "74", "PALOMO MOHAMED, SOFIA", "47113927Z", "7", "14", "7", "19", "12", "1979", "S", "F", "Amb una sabata i una espardenya", "69", "HERNÁNDEZ JUSTRIBÓ, SANDRA", "47115806F", "6", "51", "20", "28", "7", "1985", "S", "F", "Pastores de Benasque", "71", "MUąOZ VILA, ESTER", "47117106L", "9", "8", "57", "6", "9", "1987", "S", "F", "Sabatilles BiĽniques", "85", "SURROCA ESTRADA, CAMELIA", "47120856C", "9", "10", "58", "11", "2", "1969", "V", "F", };
        qt++;
        this.dorsal = qt;
        this.setDni(dni);
        this.nom = nom;
        this.cognoms = cognoms;
        this.data_naix = data_naix;
        this.nom_equip = nom_equip;
        this.setSexe(sexe);
    }
    
    //Setters

    public void setDni(String dni) throws Excepcio1 {
        if(validarDni(dni)){
            this.dni = dni;
        }
        else{
            throw new Excepcio1(dni+"DNI no valid");
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

    public void setSexe(char sexe) throws Excepcio1 {
        if(sexe=='H' || sexe=='D' ||sexe=='h' || sexe=='d'){
            this.sexe = sexe;
            
        }
        else{
            throw new Excepcio1("S'ha introduit un sexe incorrecte!!!");
        }
        
    }
    
    
    //Getters

    public String getDni() {
        return dni;
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

    public char getSexe() {
        return sexe;
    }
    
    
    //Mètodes

    public static boolean validarDni(String dni){
        if (!dni.matches("^\\d{8}[A-Z]{1}$")) {
            return false;
        }
 
        // Extraer la parte numérica y la letra
        int numero = Integer.parseInt(dni.substring(0, 8));
        char letra = dni.charAt(8);

        // Calcular la letra correcta
        String letrasDNI = "TRWAGMYFPDXBNJZSQVHLCKE";
        char letraCorrecta = letrasDNI.charAt(numero % 23);

        // Comparar la letra proporcionada con la letra correcta
        return letra == letraCorrecta;
        
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
        return "Participant{" + "dorsal=" + dorsal + ", dni=" + dni + ", nom=" + nom + ", cognoms=" + cognoms + ", data_naix=" + data_naix + ", nom_equip=" + nom_equip + ", sexe=" + sexe + '}';
    }
     
    

    @Override
    public int hashCode() {
        int hash = 7;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Participant other = (Participant) obj;
        return Objects.equals(this.dni, other.dni);
    }

    
    @Override
    public int compareTo(Participant o) {
        return this.dni.compareTo(o.dni);
    }

    
    
}
