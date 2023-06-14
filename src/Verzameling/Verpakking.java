package Verzameling;
public class Verpakking {
    
    private int l;
    private int b;
    private int h;
    private boolean vloeistof;

    public Verpakking(int l, int b, int h, boolean vloeistof) {
        this.l = l;
        this.b = b;
        this.h = h;
        this.vloeistof = vloeistof;
    }

    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
    
        Verpakking that = (Verpakking) o;

        if (this.vloeistof && that.vloeistof) {
            int inhoud1 = this.b * this.h * this.l;
            int inhoud2 = this.b * this.h * this.l;
            return inhoud1 == inhoud2;
        } else {
            return this.l == that.l && this.h == that.h && this.b == that.b;
        }
    }
    
}
