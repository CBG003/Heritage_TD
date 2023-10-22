package ex3;

public class Librairie {
    private Livre[] liste;
    private int capacite, nb;

    public Librairie(int capacite) {
        this.capacite = capacite;
        this.liste = new Livre[capacite];
        this.nb = 0;
    }

    public int getNb() {
        return nb;
    }

    public Livre[] getLivres() {
        return liste;
    }

    public void inventaire() {
        for (int i = 0; i < nb; i++) {
            System.out.println("Livre " + liste[i].toString() + " prix " + liste[i].calculePrix());
        }
    }

    public void inventaire(String categ) {
        for (int i = 0; i < nb; i++) {
            if (liste[i].getClass().getSimpleName().equals(categ)) {
                System.out.println("Livre " + liste[i].toString() + " prix " + liste[i].calculePrix());
            }
        }
    }

    public void ajoutLiv(Livre liv) {
        if (liv != null && nb < capacite) {
            liste[nb] = liv;
            nb++;
        } else {
            System.out.println("Impossible d'ajouter un livre.");
        }
    }

    public void suppLivre(int num) {
        int index = -1;
        for (int i = 0; i < nb; i++) {
            if (liste[i].identifiant == num) {
                index = i;
                break;
            }
        }
        if (index != -1) {
            for (int i = index; i < nb - 1; i++) {
                liste[i] = liste[i + 1];
            }
            nb--;
        } else {
            System.out.println("Livre non trouvé dans la librairie.");
        }
    }}