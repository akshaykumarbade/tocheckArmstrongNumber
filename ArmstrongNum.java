import java.util.Scanner;

class ArmstrongNum {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num;
        System.out.println("Enter a number: ");
        num = scan.nextInt();
        isArmstrongNo(num);
        
    }
    
    public static void isArmstrongNo(int num){
        int temp; //making a temp 
        int last=0, digit=0, sum=0; 
        temp = num;// assigning num to temp
        while(temp>0){
            temp=temp/10;// to count the number of digits in given number.
            digit++;
        }
        temp = num; //re assigning num to temp
        while(temp>0){
            last=temp%10; // to get the value of digits in the number. eg. 153%10=3 so we get 3 as the digit.
            sum += (Math.pow(last, digit));
            temp = temp/10; // 153 /10 = 15 next loop 15/10=1 next loop 1/10 loop strops.
        }
        if(num==sum){
            System.out.println("Number "+num+" is a Armstrong Number.");
        }else{
            System.out.println("Number "+num+" is not an Armstrong Nubmer.");
        }
    }
}