package ua.khpi.oop.elesin2;
import java.util.Random;

public class Main {
	public static void main(String[] args) {
		 Random random = new Random(); // случайное число
		 Main mn = new Main(); 
		 int rand_ = random.nextInt();
		 for (int i = 0; i< 10; i++) {
			 rand_ = random.nextInt();
			 System.out.println("--------------------------------");
			 System.out.println("|Число                Результат|");
			 System.out.print("|"+ rand_);
			 int temporal = rand_;
			 if (temporal<0) {
				 temporal = temporal * (-1);
				 temporal = 28 - findCount(temporal);
			 }
			 else 
				 temporal = 29 - findCount(temporal);
			 for(int j = 0;j<temporal;j++) {
				 System.out.print(' ');
			 }
			 System.out.print(mn.findTheBigesNum(rand_)+"|\n");
			 System.out.println("--------------------------------");
			 }
		 }
		 int findTheBigesNum(int num) {// нахождение найбольшей цифры
			 if(num<0)
				 num = num*(-1);
			 int counter = findCount(num);
			 int max = 0;
			 for(int i =1; i <= counter;i++) {
				 if(max<((num/(int)Math.pow(10,(counter-i)))%10)) {
					 max = (num/(int)Math.pow(10,(counter-i)))%10;
				 }
			 }
			 return max;
		 }
		 
		static int findCount(int num) { // нахождения разряда 
			 int counter = 0;
			 while(num>0) {
				 num = num / 10;
				 counter++;
			 }
			 
			 return counter;
		 }
}