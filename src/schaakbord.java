public class schaakbord {
    private int x;
    private int y;
    private String alphabet;
    int counter = 0;

    public schaakbord(int x, int y) {
        this.alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        this.x = x;
        this.y = y;
    }

    public void print() {
        for (int i = 0; i < this.x; i++) {
            for (int j = 0; j < this.y; j++) {
                // System.out.print("[" + (i + 1) + "," + (j + 1) + "] ");
                System.out.print("[" + (alphabet.charAt(counter)) + "," + (j + 1) + "]");
            }
            System.out.println();
            counter += 1;
        }
    }
}
