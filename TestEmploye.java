import java.util.Scanner;
public class TestEmploye {
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("entre le matricule de l'employe : ");
        int matricul = input.nextInt();
        System.out.println("entre le nom de l'employe : ");
        String nom = input.nextLine();
        System.out.println("entre le salaire de l'employe : ");
        float salair= input.nextFloat();
        System.out.println("entre l'anne d'embauche de l'employe : ");
        int annne_embauch= input.nextInt();
        Employe Empl1 = new Employe(matricul,nom,salair,annne_embauch);
        

    }
}
