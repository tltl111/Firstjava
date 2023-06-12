public class Mainbit {
    public static void main(String[] args) {
        
        byte trein = 120;
        byte trein2 = 104;
        byte trein3 = 60;
        byte trein4 = 68;
        byte trein5 = 40;
        byte trein6 = 0;
        
        System.out.println(isLichtAan(trein));
        System.out.println(gaatVoorruit(trein));
        // System.out.println(snelheid(trein));

        System.out.println(isLichtAan(trein2));
        System.out.println(gaatVoorruit(trein2));
        // System.out.println(snelheid(trein2));

        System.out.println(isLichtAan(trein3));
        System.out.println(gaatVoorruit(trein3));
        // System.out.println(snelheid(trein3));

        System.out.println(isLichtAan(trein4));
        System.out.println(gaatVoorruit(trein4));
        // System.out.println(snelheid(trein4));

        System.out.println(isLichtAan(trein5));
        System.out.println(gaatVoorruit(trein5));
        // System.out.println(snelheid(trein5));

        System.out.println(isLichtAan(trein6));
        System.out.println(gaatVoorruit(trein6));
        // System.out.println(snelheid(trein6));
    }

    public static boolean isLichtAan(int trein) {
        return (trein >> 3 & 1) == 1;
    }

    public static boolean gaatVoorruit(int trein) {
        return (trein >> 6 & 1) == 1;
    }

    // public static String snelheid(int trein) {
    //     // 00 = 0
    //     // 01 = 33
    //     // 10 = 66
    //     // 11 = 100
    //     trein >>= 4;
    //     trein = (byte) ((trein & 2) + (trein & 1));
    //     switch(trein) {
    //     if ((trein >> 4 & 1) == 00) {
    //         return "0%";
    //     } else if ((trein >> 4 & 1) == 01) {
    //         return "33%";
    //     } else if ((trein >> 4 & 1) == 10) {
    //         return "66%";
    //     } else {
    //         return "100%";
    //     }
    // }
}
