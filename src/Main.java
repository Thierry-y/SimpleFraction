public class Main {
    public static void main(String[] args) throws Exception {
        Fraction f1 = new Fraction(3,5);
        Fraction f2 = new Fraction(2);
        Fraction f3 = new Fraction();
        
        assert f1.toString().equals("3/5") : "f1 incorrect";
        assert f2.toString().equals("2/1") : "f2 incorrect";
        assert f3.toString().equals("0/1") : "f3 incorrect";

        assert f1.doubleValue() ==  0.6 : "f1 doubleValue incorrect";

        assert f1.add(new Fraction(1,5)).toString().equals("20/25") : "f1 + 1/5 incorrect";

        assert f1.equals(new Fraction(6,10)) : "f1 equals incorrect";

        assert f1.compareTo(f2) : "f1 < f2 incorrect";
    }
}
