public class MainCompteBancaire {
    public static void main(String[] args) {

        CompteBancaire compte1 = new CompteBancaire("12345", "Alice", 500);
        compte1.deposer(200);
        compte1.retirer(100);
        System.out.println(compte1);

        CompteEpargne compte2 = new CompteEpargne("67890", "Bob", 1000, 0.02);
        compte2.deposer(500);
        compte2.appliquerInterets();
        compte2.retirer(300);
        System.out.println(compte2);

        CompteBancaire compte3 = compte2;
        compte3.deposer(100);
        System.out.println(compte3);
    }
}
