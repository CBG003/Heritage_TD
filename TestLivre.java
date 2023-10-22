package ex3;
public class TestLivre {
    public static void main(String[] args) {
        Librairie librairie = new Librairie(4);

        Livre livre = new Livre("Earth", 1, "Fiction", 200);
        Roman roman = new Roman("Nature", 2, "Aventure", 300, "Tifanny", "Molas");
        Magazine magazine = new Magazine("Couscous", 3, "Cuisine", 150, "Janvier");

        librairie.ajoutLiv(livre);
        librairie.ajoutLiv(roman);
        librairie.ajoutLiv(magazine);

        System.out.println("Inventaire complet de la librairie:");
        librairie.inventaire();

        Roman roman2 = new Roman("Our weeding", 4, "Drame", 250, "Lola", "Dania");
        librairie.ajoutLiv(roman2);

        System.out.println("\nInventaire des romans dans la librairie:");
        librairie.inventaire("Roman");

        double montantTotalRomans = 0;
        for (int i = 0; i < librairie.getNb(); i++) {
            if (librairie.getLivres()[i] instanceof Roman) {
                montantTotalRomans += librairie.getLivres()[i].calculePrix();
            }
        }

        System.out.println("\nMontant total pour les romans dans la librairie: " + montantTotalRomans);

        Magazine magazine2 = new Magazine("Moon", 5, "Science", 180, "Février");
        librairie.ajoutLiv(magazine2); 
    }
}
