import java.util.Scanner;

public class BinDecHex {

    public static String Dec2Bin(int dec) {
        String revBin = "";
        String Bin = "";
        int reminder, quotient;
        do {
            quotient = dec / 2;
            reminder = dec % 2;
            revBin += reminder;
            dec = quotient;

        }
        while (quotient != 0);

        for (int i = revBin.length() - 1; i >= 0; i--) {
            Bin += String.valueOf(revBin.charAt(i));
        }
        return Bin;
    }

    public static String Dec2Hex(int dec) {
        String revHex = "";
        String Hex = "";
        int reminder, quotient;
        do {
            quotient = dec / 16;
            reminder = dec % 16;
            switch (reminder) {
                case 10:
                    revHex += "A";
                    break;
                case 11:
                    revHex += "B";
                    break;
                case 12:
                    revHex += "C";
                    break;
                case 13:
                    revHex += "D";
                    break;
                case 14:
                    revHex += "E";
                    break;
                case 15:
                    revHex += "F";
                    break;
                default:
                    revHex += reminder;
                    break;
            }
            dec = quotient;

        } while (quotient != 0);

        for (int i = revHex.length() - 1; i >= 0; i--) {
            Hex += String.valueOf(revHex.charAt(i));
        }
        return Hex;
    }

    public static int Bin2Dec(String Bin) {
        int dec = 0;

        for (int i = Bin.length() - 1; i >= 0; i--) {

            if (Bin.charAt(i) == '1') {
                dec += Math.pow(2, Bin.length() - 1 - i);
            } else if (Bin.charAt(i) != '0') {
                System.out.println("This is not a binary number!");
                System.exit(1);
            }

        }

        return dec;
    }

    public static int Hex2Dec(String hex){
        int dec = 0;
        for(int i= hex.length()-1;i>=0;i--){
            if(Character.getNumericValue(hex.charAt(i))>=0 && Character.getNumericValue(hex.charAt(i))<=15){
                dec+=Character.getNumericValue(hex.charAt(i))* Math.pow(16,hex.length()-1-i);
            }
           else {
                System.out.println("This is not a hex number!"); System.exit(1);
            }
        }
        return dec;
    }

    public static void Dec2BinHex() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a decimal number: ");
        int dec = scan.nextInt();
        System.out.println("Your number in Binary: " + Dec2Bin(dec));
        System.out.println("Your number in Hex: " + Dec2Hex(dec));
    }

    public static void Bin2DecHex(){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a Binary number: ");
        String bin = scan.nextLine();
        int dec = Bin2Dec(bin);
        String hex = Dec2Hex(dec);
        System.out.println("Your number in decimal: "+dec);
        System.out.println("Your number in hex: "+ hex);

    }
    public static void Hex2DecBin(){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a Hexadecimal number: ");
        String hex = scan.nextLine();
        int dec = Hex2Dec(hex);
        String bin = Dec2Bin(dec);
        System.out.println("Your number in decimal: "+dec);
        System.out.println("Your number in binary: "+bin);
    }


    public static void main(String[] args) {
    Dec2BinHex();
        System.out.println();
    Bin2DecHex();
        System.out.println();
    Hex2DecBin();
    }
}
