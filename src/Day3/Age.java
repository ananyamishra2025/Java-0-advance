package Day3;

public class Age {
    public static void main (String[] args){
        //if statement
        int age = 20;

        if (age >= 18) {
            System.out.println("You are an adult.");
        }

        //if-else statement
        int num = 10;

        if(num % 2 == 0){
            System.out.println("Even number");
        } else {
            System.out.println("Odd number");
        }

        //else-if ladder
        int marks = 75;

        if(marks >= 90){
            System.out.println("Grade A");
        }
        else if(marks >= 75){
            System.out.println("Grade B");
        }
        else if(marks >= 60){
            System.out.println("Grade C");
        }
        else{
            System.out.println("Fail");
        }

        //nested if
        int age2 = 25;
        boolean hasID = true;

        if(age2 >= 18){
            if(hasID){
                System.out.println("Entry allowed.");
            } else {
                System.out.println("ID required!");
            }
        }
        else{
            System.out.println("Underage!");
        }

        //for loop
        for(int i = 1; i <= 5; i++){
            System.out.println("Hello " + i);
        }

        //while loop
        int j = 1;
        while(j <= 5){
            System.out.print(j);
            j++;
        }

        //do-while loop
        int k = 1;

        do {
            System.out.print(k);
            k++;
        } while(k <= 5);

        //break
        for(int m = 1; m <= 10; m++){
            if(m == 5) break;
            System.out.print(m);
        }

        //continue
        for(int n = 1; n <= 5; n++){
            if(n == 3) continue;
            System.out.print(n);
        }

        //for each loop
        int[] arr = {1, 2, 3, 4, 5};
        int count = 0;

        for(int num2 : arr){
            if(num2 % 2 == 0){
                count++;
            }
        }

        System.out.println(count);
    }
}
