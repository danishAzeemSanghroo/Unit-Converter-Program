import java.util.*;
class Unit
{
			void kilo2grm(int num)
		{
			System.out.println("Grams= "+(num*1000));
		}
	    void grm2kilo(int num1)
		{
			//System.out.print("Enter Grams: ");
			System.out.println("Kilograms= "+(num1/1000));	
		}
		void inch2fet(int num2)
		{
			//System.out.print("Enter Inches: ");
			System.out.println("Feet= "+(num2/12));
		}
		void fet2inch(int num3)
		{
			//System.out.print("Enter Feet: ");
			System.out.println("Inches= "+(num3*12));
		}
}
	class UnitConvertor
	{
		
	public static void main(String arg[])
	{
		Unit u=new Unit();
		Scanner ob=new Scanner(System.in);
		System.out.print("Enter Kilograms: ");
		int num=ob.nextInt();
		System.out.print("Enter Grams: ");
		int num1=ob.nextInt();
		System.out.print("Enter Inches: ");
		int num2=ob.nextInt();
		System.out.print("Enter Feet: ");
		int num3=ob.nextInt();
		u.kilo2grm(num);
		u.grm2kilo(num1);
		u.inch2fet(num2);
		u.fet2inch(num3);
	/*Unit u=new Unit();
	u.kilo2grm(5);
	u.grm2kilo(22778);
	u.fet2inch(12);
	u.inch2fet(36);*/
	}
	}