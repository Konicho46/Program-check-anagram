import java.util.Scanner;

class Function4 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        String kata1, kata2;
        System.out.println("-----PROGRAM ANAGRAM-----");
        System.out.print("Masukan kata pertama: ");
        kata1 = sc.next();
        System.out.print("Masukan kata kedua: ");
        kata2 = sc.next();

        checkAnagram(kata1, kata2);
        // Contoh:
        // Input 1: Azizi
        // Input 2: iziza
        // BUKAN ANAGRAM (Dikarenakan alfabet 'A' pada input 2 tidak kapital)
    }

    public static void checkAnagram(String n, String m) {
        try {

            //Mencari apakah kedua kata inputan ANAGRAM atau BUKAN ANAGRAM
            int lengthResult, found = 0, notFound = 0;
            int length1 = n.length();
            int length2 = m.length();

            if (length1 == length2) {
                lengthResult = length1;

                for (int i = 0; i < lengthResult; i++) {
                    found = 0;
                    for (int j = 0; j < lengthResult; j++) {
                        if (n.charAt(i) == m.charAt(j)) {
                            found = 1;
                            break;
                        }
                    }
                    if (found == 0) {
                        notFound = 1;
                        break;
                    }
                }
                if (notFound == 1) {
                    System.out.println("BUKAN ANAGRAM");
                } else {
                    System.out.println("ANAGRAM");
                }
            } else {
                System.out.println("BUKAN ANAGRAM");
            }
        } catch (Exception error) {
            System.out.println(error);
            System.out.println("Input tidak sesuai");
        }
    }
}
