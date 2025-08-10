import java.util.Scanner;

public class PasswordGenerator {

    public static void main(String[] args) throws Exception {

        // esercizio di oggi è un (insicurissimo) Password Generator
        // nome del repo: java-password-generator
        // Create un nuovo progetto java chiamato java-password-generator
        // Aggiungete una classe PasswordGenerator che contiene un metodo main
        // Il programma deve fare quanto segue:
        // chiedere all'utente e salvare in opportune variabili
        // nome
        // cognome
        // colore preferito
        // data di nascita di un utente suddivisa in giorno, mese e anno in numero
        // generare (e stampare a video) una password  concatenando nome, cognome, 
        // colore preferito e somma di giorno, mese e anno      
        // di nascita, separate dal carattere -
        // Esempio: ho un utente che si chiama Pinco Pallo, nato il 12/05/1994, il cui colore preferito è il magenta
        // La sua password sarà Pinco-Pallo-magenta-2011
        
        Scanner scan = new Scanner(System.in);
        System.out.println("Inserire nome, cognome, colore preferito, data di nascita (suddivise in giorno, mese, anno) ");
        System.out.print("Inserire il nome ");
        String nome = scan.nextLine();
        System.out.print("Inserire il cognome ");
        String cognome = scan.nextLine();
        System.out.print("Inserire il colore preferito ");
        String colore = scan.nextLine();
        System.out.print("Inserire il giorno di nascita ");
        int giorno = scan.nextInt();
        System.out.print("Inserire il mese di nascita ");
        int mese = scan.nextInt();
        System.out.print("Inserire l'anno di nascita ");
        int anno = scan.nextInt();

        int sommaDataNascita = giorno + mese + anno;

        String password = nome + "-" + cognome + "-" + colore + "-" + sommaDataNascita;

        System.out.println("La tua password è: " + password);
    }
}