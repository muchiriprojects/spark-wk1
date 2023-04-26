package ke.co.safaricom;

public class encryptAndDecrypt {
    static String alphabet = ("abcdefghijklmnopqrstuvwxyz");

    public static String Encoding(String pText, int Key) {
        pText = pText.toLowerCase();

        String cText ="";

        for (int i = 0; i < pText.length(); i++) {
            int charIndex = alphabet.indexOf(pText.charAt(i));
            int newIndex = (charIndex + key);
            char cipherChar = alphabet.charAt(newIndex);
            cText = (cText) + (cipherChar);

            return cText;
        };

        public static String decoding(String cText, int key){
            cText = cText.toLowerCase();

            String pText ="";

            for(int i = 0; i < cText.length(); i++) {
                int charIndex = alphabet.indexOf(cText.charAt(i));
                int newIndex = (charIndex-key);


                char plainChar = alphabet.charAt(newIndex);
                pText = (pText)+(plainChar);


                return pText;
            };
        };
    };


    public static class encryptAndDecrypt1(String[] args){
            Scanner scan = new Scanner(system.in);

            System.out.Print("Enter plain text>>");
            String plain = scan.nextLine();

            System.out.Print("Enter key>>");
            int key = scan.nextInt();

            String cipherText = encoding(plain, key);
            System.out.printIn("The cipher text: + cipherText");

            System.out.printIn("The decoded message is: + decoding(cipherText, key");


        };

    };







