package  ua.khpi.oop.elesin1;

public class Main {
	
	public static void main(String[] args) {
		
		Main mn = new Main();
		int student_number = 0x3; // номер студ.
		long phone_number = 380988561818L; // моб. телефон
		int last2 = 0b10010; // последние числа (2)
		int last4 = 03432; // последние числа	(4) 
		int num = 3; // номер по списку
		char ch = 64+3; // 3 символ 
		mn.oddAndEven(student_number);
		mn.oddAndEven(phone_number);
		mn.oddAndEven(last2);
		mn.oddAndEven(last4);
		mn.oddAndEven(num);
		mn.oddAndEven((int)ch);
		mn.countOnes(student_number);
		mn.countOnes(phone_number);
		mn.countOnes(last2);
		mn.countOnes(last4);
		mn.countOnes(num);
		mn.countOnes((int)ch);
	}
	
	void oddAndEven(long i) { // функция нахождения парных и не парных цифр
		var l = i;
		long n = 0;
		long p = 0;
		long np = 0; 
		while(i > 0) 
		{ 
			n=i%10;
			i=i/10;
			if(n%2==1) 
				np++;
			else
				p++;
			
		}
		System.out.println(l+"\n"+Integer.toBinaryString((int)l));
		System.out.println(String.format("Количество парных: %s\nКоличество непарных: %s", p , np));
		return ;
	}
	
	void countOnes(long i) { // функция поиска одиниц в бинарном представлении числа
	    long n = i;
		int count=0;	
		while(i!=0) {
			if(i % 2 == 1) {
				count++;
			}
			i /= 2;
		}
		System.out.println(n+"\n"+Integer.toBinaryString((int)n));
		System.out.println("Количество единиц: " + count);
		}
}
