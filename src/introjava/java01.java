package introjava;

public class java01 {
    public static void main(String[] args){
        java01 method = new java01();
        //method.looping();
        //method.vowel('a');
        method.example();
    }
    public void looping(){
        String name[] = {"deepak","ajay","hari","mahendhran","ahamad","kamal"};
        for (int i=0; i<name.length; i++){
            System.out.println(name[i]);
        }
    }
    public void vowel(char let){
        if (let=='a'||let=='e'||let=='i'||let=='o'||let=='u'){
            System.out.println("Its a vowel");
            System.out.println("new");
        }else {
            System.out.println("Its a consonant");
        }
    }
    public void example(){
        int num = 10;
        int num2 = num++;
        for (int i = 1; i<=num2;i++){
            System.out.println(num2);
         }
    }
}
