import java.util.Scanner;


////1 string array saxlayın. İstifadəçidən 1 char daxil etməsini istəyin.
////onun daxil etdiyi char-ı string array-də hansı dəyərlərdə varsa,
////onları çapa çıxarın. və həmin char-ın o dəyərdə hansı index-də dayandığını çapa verin.
////
////Metodlar ilə yazın


//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String[] array = {"Arda", "Ferdi", "Alex", "Fred", "Simanski"};
        boolean check = true;

        while (true) {
            char bukva = getHerf(sc);
            for (int i = 0; i < array.length; i++) {
                for (int j = 0; j < array[i].length() - 1; j++) {

                    if (bukva == array[i].charAt(j)) {
                        System.out.println(array[i]);
                        System.out.println(j);
                    }
                }
            }
        }
    }
    public static char getHerf(Scanner sc) {
        System.out.print("bir herf daxil edin: ");
        String herf = sc.nextLine();
        return herf.charAt(0);
    }
}