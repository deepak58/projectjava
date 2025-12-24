package introjava;

public class Conditional_Statement {
    public static void main(String[] args) {
        Conditional_Statement op = new Conditional_Statement();
          //op.oddEven(25);
          //op.check2(-5);
          //op.greaterNumber(30,30);
          //op.greater3Num(10,11,11);
          //op.year(2025);
          //op.div(75);
          //op.week(6);

    }

    public void oddEven(int num) {
        if (num % 2 == 0) {
            System.out.println("The number is even");
        } else
            System.out.println("The number is odd");
    }

    public void posiviteNegative(int num2) {
        if (num2 > 0) {
            System.out.println("positive number");
        } else if (num2 < 0) {
            System.out.println("negative number");
        }else
            System.out.println("0 is not a valid number");
    }
    public void greaterNumber(int num3,int num4){
        if (num3>num4){
            System.out.println(num3 +" is greater than "+num4);
        }else if (num3<num4) {
            System.out.println(num4 + " is greater than " + num3);
        }else {
            System.out.println("equal");
        }

    }
//need to check with trainer(why last statement is not work if i give same value to all)
    public void greater3Num(int A,int B,int C){
        if (A>=B && A>=C){
            System.out.println(A+" A is the largest number");
        } else if (B>=A && B>=C) {
            System.out.println(B+" B is the largest number");
        }else {
            System.out.println(C+" C is the largest number");
        }
    }
    public void year(int y){
        if (y%4 ==0){
            System.out.println("Its a leap year");
        }else {
            System.out.println("Its not a leap year");
        }
    }
public void div(int d){
        if (d%3==0 && d%5==0){
            System.out.println("it is divisible by 3 and 5");
        }else {
            System.out.println("no its not divisible by 3 and 5");
        }
}
public void week(int day){
        if (day>1 && day<7){
            System.out.println("Day "+day+" Its a Weekday!");
        }else {
            System.out.println("Day "+day+" Its a Holiday!");
        }
}
//public void vowel(char[] letter){
//        if (letter[] = {'a','e','i','o','u'};){
//            System.out.println("its a vowel");
//        }else {
//            System.out.println("its a consonant");
//        }
//
//}
}
