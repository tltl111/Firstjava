package Verzameling;
public class schaakbord {
    private int x;
    private int y;
    private String alphabet;
    int counter = 0;
    int counter2 = 0;

    public schaakbord(int x, int y) {
        this.alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        this.x = x;
        this.y = y;
        this.counter2 = x;
    }

    public void print() {
        for (int i = 0; i < this.x; i++) {
            for (int j = this.y; j > 0; j--) {
                System.out.print("[" + (alphabet.charAt(counter)) + "," + counter2 + "]");
                counter += 1;
            }
            System.out.println();
            counter = 0;
            counter2 -= 1;
        }

        // for (int i = 0; i < this.x; i++) {
        //     for (int j = 0; j < this.y; j++) {
        //         System.out.print("[" + (alphabet.charAt(counter)) + "," + (j + 1) + "]");
        //     }
        //     System.out.println();
        //     counter += 1;
        //     }
        // }
    }
}
