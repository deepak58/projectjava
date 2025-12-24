package introjava;

public class Operators {
    public static void main(String[] args){
        Operators op = new Operators();
        //op.operatorsWith2Num(555,9);
        //op.areaPerimeter(10,15);
        //op.greaterSmaller(5,0);
        //op.marksAndAttendance(35,74);
        //op.rank(89,95,95,88,77);
        //op.discountEligibility(500,false);
        //op.personAge(19);
        op.identityVerification(56,"",67);
        //op.identityVerification2(true,false,true);
    }
    //program to perform addition, subtraction, multiplication, division, and modulus on two numbers.
    public void operatorsWith2Num(int num1,int num2){
        var add = num1+num2;
        var sub = num1-num2;
        var mul = num1*num2;
        var div = num1/num2;
        var mod = num1%num2;
        System.out.println("Addition of 2 number is = "+add);
        System.out.println("Subtraction of 2 number is = "+sub);
        System.out.println("Multiplication of 2 number is = "+mul);
        System.out.println("Division of 2 number is = "+div);
        System.out.println("Modulus of 2 number is = "+mod);
    }
    //program to calculate the area and perimeter of a rectangle using arithmetic operators.
    public void areaPerimeter(int L,int B){
        var area = L*B;
        System.out.println("Area of rectangle(Length X Breadth) is = "+area);
        var perimeter = 2*(L+B);
        System.out.println("Area of perimeter(2 x (L+B)) is = "+perimeter);
    }
    //program to compare two numbers and print which is greater, smaller, or equal.
    public void greaterSmaller(int num1,int num2){
        var a = num1;
        var b = num2;
        if (a>b){
            System.out.println(a+" is greater and "+b+" is smaller");
        } else if (b>a) {
            System.out.println(b+" is greater and "+a+" is smaller");
        }else {
            System.out.println("its a equal number");
        }
    }
    //program to check if a student passes based on: marks ≥ 35 AND attendance ≥ 75%.
    public void marksAndAttendance(int marks,int atten){
        if (marks>=35 && atten>=75){
            System.out.println("pass");
        }else {
            System.out.println("fail");
        }
    }
    //Detailed one with same example
    public void rank(int eng,int sci,int soc,int mat,int atten){
        var total = eng+sci+soc+mat;
        var first = 375;
        var second = 340;
        var third = 300;
        if (atten>=75){
            if (eng>=35 && sci>=35 && soc>=35 && mat>=35){
                System.out.println(" All pass and Total marks in all subject is "+total+"/400");
                if (total>=first){
                    System.out.println("Congrats 1st Rank");
                } else if (total>=second) {
                    System.out.println("Congrats 2nd Rank");
                } else if (total>=third) {
                    System.out.println("Congrats 3rd Rank");
                }else {
                    System.out.println("Now you are a Rank Holder! good but need to more focus on studies!");
                }
            } else if (eng<35) {
                System.out.println("fail in english(avg pass mark is 35) and no rank");
            } else if (sci<35) {
                System.out.println("fail in science(avg pass mark is 35) and no rank");
            } else if (soc<35) {
                System.out.println("fail in social(avg pass mark is 35) and no rank");
            }else {
                System.out.println("fail in maths(avg pass mark is 35) and no rank");
            }
        }else {
            System.out.println("fail because of low attendance %");

        }

    }
    //program to check discount eligibility: purchase amount > 1000 OR customer is a premium member.
    public void discountEligibility(int amount,boolean premiumMember){
        if (amount>1000 || premiumMember==true){
            System.out.println("You are Eligible for Discount");
        }else {
            System.out.println("You are not Eligible for Discount");
        }
    }
    //program to check if a person’s age is between 20 and 60 (inclusive).
    public void personAge(int age){
        if (age>=10){
            if (age<18){
                System.out.println("You are a Teenager!");
            }else if (age>=18 && age<20) {
                System.out.println("You are a Adult");
            } else if (age>=20 && age<=60) {
                System.out.println("You are a Middle aged Person");
            }else if (age>60 && age<=100) {
                System.out.println("You are a Senior Citizens");
            }else {
                System.out.println("Plz check the input you are given more than 100");
            }
        }else {
            System.out.println("Plz give the valid input");
        }

    }
    //program to check identity verification: Aadhaar AND PAN present OR Driving License present.
    public void identityVerification(int Aadhaar,String pan,int license){
        var A = Aadhaar>0;
        boolean check = A;
        var P = pan=="";
        boolean check2 = P;
        var L = license>0;
        boolean check3 = L;
        if (A && P || L ){
            System.out.println("Identity Verification is Success!");
        }else {
            System.out.println("Verification Failed!");
        }
    }
    public void identityVerification2(boolean Aadhaar,boolean pan,boolean license){
        if (Aadhaar && pan || license){
            System.out.println("Verification Pass.!");
        }else {
            System.out.println("Verification Fail.!");
        }
    }

}