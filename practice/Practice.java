package practice;

import java.util.Scanner;

public class Practice {
	
	static void Add(){
		int A=5;
		int B=6;
		A=A+B;
		System.out.println("\n Sum = "+A);
	}
	
	static void Diff()
	{
		int a=15;
		int b=7;
		a=a-b;
		System.out.println("\n Difference = "+a);
	}
	
	static void Multi(int a,Double b) {
		b=a*b;
		System.out.println("\n Result = "+b);
	}
	
	static void Div(){
		int a=10;
		int b=3;
		System.out.println("\n Qutioent = "+a/b);
		System.out.println("\n Reminder = "+a%b);
	}
	
	static void Swap() {
		int a=7;
		int b=43;
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("\n New Values are :"+"a = "+a+" ,b = "+b);
	}
	
	static void Area(int a,double b) {
		double area;
		area = a*b;
		System.out.println("\n Area of Reactangle =" + area);
	}
	
	static void SimpleIntrest(float p,float r,int n) {
		float intrest = (p*n*r)/100;
		System.out.println(" Result for simple intrest = "+ intrest);
	}
	
	static void AreaofCircle(double PI) {
		Scanner sc = new Scanner(System.in);
		System.out.println("\n Enter the Radius of Circle = ");
		double radius = sc.nextDouble();
		double area =PI*(radius*radius);
		System.out.println("\n Area of Circle = "+ area);
		sc.close();
	}
	
	static void Triangle() {
		System.out.println("\n **hypotenuse of a triangle**");
		Scanner sc = new Scanner(System.in);
		System.out.println("\n Enter the A value = ");
		int A = sc.nextInt();
		System.out.println("\n Enter the B value = ");
		int B = sc.nextInt();
		int hypotenuse = (A*A)+(B*B);
		System.out.println("\n hypotenuse = "+Math.sqrt(hypotenuse));
		sc.close();
	}
	
	static void Temprature(int celcius) {
		float f;
		f = (celcius * 9/5) + 32;
		System.out.println("\n Temprature in Fahrenheit = "+ f);
	}
	
	static void Average(int a,int b,int c) {
		float average = (a+b+c)/3;
		System.out.println("\n Average = "+average);
		//max
		if (a>b) {
			System.out.println("\n Greatest Number = "+a);
		}
		else {
			System.out.println("\n Greatest Number = "+b);
		}
		System.out.println("\n Greatest Number = "+Math.max(a, b));
		
	}
	static void OddorEven(int a) {
		if(a%2==0)
		{System.out.println("\n The Given value"+a+"is a even number");}
		else {
			System.out.println("\n  The Given value"+a+"is a odd number");
		}
		
	}
	
	
	public static void main(String[] args) {
		//Variable Declaration
		
		int a =42;
		double b = 5.346987;
		char c ='A';
		//boolean d =true;
		String e ="Hello,World";
		final double PI = 3.14159;
		
		//Arithmetic Operations
		Add();
		Diff();
		Multi(a, b);
		Div();
		
		//Variables
		Swap();
		Area(a, b);
		//increment
		a++;
		System.out.println(a);
		//simple intrest
		Scanner sc = new Scanner(System.in);
		System.out.println("\n**Simple Intrest**");
		System.out.println("\nEnter the princple = ");
		float Princple = sc.nextFloat();
		System.out.println("\n Enter the Rate of Intrest = ");
		float rate = sc.nextFloat();
		System.out.println("\n Enter theTime = ");
		int time = sc.nextInt();
		SimpleIntrest(Princple,rate,time);
		
		//Mixed
		 AreaofCircle(PI);
		//hypotenuse 
		 Triangle();
		 //temprature
		 Temprature(32);
		 //Average
		 Average(44,78,63);
		 OddorEven(time);
		 //ASCII
		 System.out.println("\n ASCII value for "+c+" is = "+(int)c);
		 //concat
		 String string2 = "JavaTutorial-";
		 String str2 = string2+e;
		 System.out.println("\n Concated String is "+str2);
		 sc.close();
		 //dividebyzero
		 System.out.println("\n Divide by Zero = "+a/0);
	}
	

}
