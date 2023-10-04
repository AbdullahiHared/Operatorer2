import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        
        //operator uppgift 1
        System.out.println("skriv in tal 1");
        int tal1 = sc.nextInt();

        System.out.println("skriv in tal 2");
        int tal2 = sc.nextInt();

        boolean  check = tal1 == tal2 || tal1 < tal2 || tal1 > tal2;
        
        System.out.println(check);

        // uppgift 2

        int[] talen = {4,5,2};
        boolean firstComparison = talen[0] > talen[1] || talen[0] > talen[2];
        boolean secondComparison = talen[0] < talen[1] || talen[0] < talen[2];
        boolean thirdComparison = talen[0] == talen[1] || talen[0] == talen[2];

        System.out.println(firstComparison);
        System.out.println(secondComparison);
        System.out.println(thirdComparison);


        // part 3 Uppgift c

        int checkNumber = 7;
        checkNumber+= 10;
        checkNumber*= 2;
        checkNumber-= 6;
        checkNumber /= 2;
        checkNumber += 3;
        checkNumber -= 7;
        boolean checking = checkNumber == 7;
        System.out.println("The result is " + checking);

        
        






        
    }
}