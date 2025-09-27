public class Fraction extends Number {
    private int numerateur;
    private int denominateur;

    public static final Fraction ZERO = new Fraction(0,1);
    public static final Fraction UN = new Fraction(1,1);

    public Fraction(int numerateur, int denominateur) {
        this.numerateur = numerateur;
        this.denominateur = denominateur;
    }

    public Fraction(int numerateur) {
        this(numerateur, 1);
    }

    public Fraction() {
        this(0, 1);
    }

    public String toString() {
        return numerateur + "/" + denominateur;
    }

    public int getNumerateur() {
        return numerateur;
    }

    public int getDenominateur() {
        return denominateur;
    }

    @Override
    public double doubleValue() {
        return (double) numerateur / denominateur;
    }

    @Override
    public int intValue() {
        return (int) doubleValue();
    }

    @Override
    public float floatValue() {
        return (float) doubleValue();
    }

    @Override
    public long longValue() {
        return (long) doubleValue();
    }

    public Fraction add(Fraction f) {
        int n = this.numerateur * f.denominateur + f.numerateur * this.denominateur;
        int d = this.denominateur * f.denominateur;
        return new Fraction(n, d);
    }

    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Fraction)) return false;
        Fraction f = (Fraction) o;
        return this.numerateur * f.denominateur == f.numerateur * this.denominateur;
    }

    public boolean compareTo(Fraction f) {
        return this.numerateur * f.denominateur < f.numerateur * this.denominateur;
    }
}
