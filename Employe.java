import java.text.SimpleDateFormat;
import java.util.Date;

public class Employe {

    private int matricule;
    private String nom;
    private float salairebase;
    private int annne_embauche;
    
    public Employe(int mat, String name, float salaire, int annne){
        this.matricule=mat;
        this.nom =name;
        this.salairebase=salaire;
        this.annne_embauche=annne;
    }
    public  int getmatricule(){
        return matricule;
    }
    public String getnom(){
        return nom;
    }
    public float getsalairebase(){
        return salairebase;
    }
    public int getanne_embauche(){
        return annne_embauche;
    }

    public int anciennete(){
        SimpleDateFormat f = new SimpleDateFormat("yyyy");
        Date date = new Date();
        int annee_actule = Integer.valueOf(f.format(date)).intValue();
        return annee_actule-annne_embauche;
    }
    public float salaire(){
        int nbr_anne = anciennete();
        if (nbr_anne>10){
            return salairebase+120_000;
        }else if (nbr_anne>5) {
            return salairebase+75_000;
        }else if (nbr_anne>=0) {
            return salairebase;
        }else {
            return 0;
        }
    }

}