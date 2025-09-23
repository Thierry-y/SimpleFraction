public class Main {
    public static void main(String[] args) throws Exception {
        Fraction f = new Fraction();
        
        assert f.toString().equals("Je suis une fraction.") 
            : "Échec : toString() ne retourne pas la chaîne attendue";
        
        System.out.println(f);
    }
}
