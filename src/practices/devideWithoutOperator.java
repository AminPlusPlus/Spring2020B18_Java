package practices;


import java.io.IOException;


public class devideWithoutOperator {
    public static void main(String[] args) {
        int a = 20;
        int b = 5;
        int count = 0;
        while (a - b >= 0) {
            a = a - b;
            count++;

        }
        System.out.println(count+"\n ===================");
  //Swap the numbers
        int a1 = 20;
        int b1 = 10;

        a1 = a1+b1;
        b1 = a1-b1;
        a1 = a1-b1;
        System.out.println("a1  "+a1);
        System.out.println("b1  "+b1);

        System.out.println("========================");
  /// Prime numbers
        int prime = 19;

        for(int i = 2; i < prime; i++){
            if(prime % i == 0){
                System.out.println(false);
                break;
            }else{
                System.out.println("true");

                System.out.println("=========================");


            }

        }

    }
}