public class HW1CheckPassFail {


    public static void CheckPassFail(){

        int mark = 49;

        if (mark >= 50) {
            System.out.println("PASS");
        } else {
            System.out.println("FAIL");
        }
        System.out.println("\n======\n DONE");
    }

    public static void CheckOddEven(){

        int number = 0; //even

        if(number%2<1){System.out.println("Even Number - Число четное, нет остатка от деления на 2!");} else {
            System.out.println("Odd Number - Число нечетное, не делится на 2 без остатка");
        }
    }

    // Problem 3 1 variant
    public static void PrintNumberInWord() {
        int number = 0;
        if (number==1) {System.out.println("ONE");}
        else if (number==2) {System.out.println("TWO");}
        else if (number==3) {System.out.println("THREE");}
        else if (number==4) {System.out.println("FOUR");}
        else if (number==5) {System.out.println("FIVE");}
        else if (number==6) {System.out.println("SIX");}
        else if (number==7) {System.out.println("SEVEN");}
        else if (number==8) {System.out.println("EIGHT");}
        else if (number==9) {System.out.println("NINE");}
        else if (number>9 || number <1) {System.out.println("OTHER");}
    }

    /*// Problem 3 2 variant
    public static void PrintNumberInWord(){
        int number = 1;
        switch (number) {
            case 1:
                System.out.println("ONE"); break;
            case 2:
                System.out.println("TWO"); break;
            case 3:
                System.out.println("THREE"); break;
            case 4:
                System.out.println("FOUR"); break;
            case 5:
                System.out.println("FIVE"); break;
            case 6:
                System.out.println("SIX"); break;
            case 7:
                System.out.println("SEVEN"); break;
            case 8:
                System.out.println("EIGHT"); break;
            case 9:
                System.out.println("NINE"); break;
            default:
                System.out.println("OTHER");
        }
    }*/

    // Problem 4 1 variant
/*    public static void PrintDayInWord() {
        int day = 3;
        if (day==1) {System.out.println("SUNDAY");}
        else if (day==2) {System.out.println("MONDAY");}
        else if (day==3) {System.out.println("TUESDAY");}
        else if (day==4) {System.out.println("WEDNESDAY");}
        else if (day==5) {System.out.println("THURSDAY");}
        else if (day==6) {System.out.println("FRIDAY");}
        else if (day==7) {System.out.println("SATURDAY");}
        else if (day>7 || day <1) {System.out.println("Not a valid day");}
    }*/
    // Problem 4 2 variant
    public static void PrintDayInWord() {
        int day = 1;
        switch(day){
            case 1: System.out.println("SUNDAY"); break;
            case 2: System.out.println("MONDAY"); break;
            case 3: System.out.println("TUESDAY"); break;
            case 4: System.out.println("WEDNESDAY"); break;
            case 5: System.out.println("THURSDAY"); break;
            case 6: System.out.println("FRIDAY"); break;
            case 7: System.out.println("SATURDAY"); break;
            default: System.out.println("Not a valid day");
        }
    }

    // Problem 5
    public static void ProblemFive(){
        int a = 100;
        int b = 10;
        if (a > b){
            System.out.println("The number " + a + " has a greater value then " + b);
        } else {
            System.out.println("The number " + b + " has a greater value then " + a);
        }
    }

    // Problem 6
    public static void ProblemSix(){
        // a x + b = 0;    5*2 + (-10) = 0;
        // x = (-b)/a
        int a = 0;
        int b = 0;
        int x = 0;

        if (a == 0 || b == 0 ) {
            System.out.println("a или b не должны быть равны нулю! Деление на ноль невозможно!");
        } else {x = (-b)/a; System.out.println(x);}

    }

    // Problem 7
    public static void ProblemSeven(){
        int a = -7;
        int b = 3;

        if (Math.abs(a) > Math.abs(b)) {
            System.out.println("Число " + a + " имеет большую величину");
        } else {
            System.out.println("Число " + b + " имеет большую величину");
        }

    }

    // Problem 8
    public static void ProblemEight(){
        //a* x^2 + b*x + c = 0
        // а =2; b = -0,5; c = 2,2
    }

    public static void main(String[] args) {
            // CheckPassFail(); Problem 1
            // CheckOddEven(); Problem 2
            // PrintNumberInWord(); Problem 3
            //PrintDayInWord();
            //ProblemFive();
            //ProblemSix();
            //ProblemSeven();
            ProblemEight();
    }

}
