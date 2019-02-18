package by.belstu.it.dokurno.basejava;

import static java.lang.Math.*;
import java.util.Arrays;

public class Main {


	/**
	 * @param args CommandLineArgs
	 */
    public static void main(String[] args) {

    	//TASK_b
	    char ch = 'h';
	    int i = 255;
	    short s = 15;
	    byte v = 6;
	    long l = 100;
	    boolean b = true;
	    double d = 5.9;
	    String str = "hello";

	    System.out.println(str+i);
        System.out.println(str+ch);
        System.out.println(str+d);
        System.out.println(v = (byte) (v+i));
		//i = d + l;
		l = i + 2147483647L; //сделать положительным
		System.out.println(l);
		//static int sint;
		System.out.println(b=b&&b);
		System.out.println(b=b^b);
		//System.out.println(b+b); - нельзя
		 long highValue1 = 9223372036854775807L;
		 long highValue2 = 0x7fff_ffff_fffL;
		 char ch2 = 'b', ch3 = '\u0061', ch4 = 97;
		System.out.println(ch2+ch3+ch4); //складываются по коду
		System.out.println(3.45%2.4);
		System.out.println(1.0/0.0); //Infinity
		System.out.println(0.0/0.0); //NaN
		System.out.println(log(-345));//NaN
		System.out.println(Float.intBitsToFloat(0x7F800000)); //Infinity
		System.out.println(Float.intBitsToFloat(0xFF800000)); //-Infinity
		//TODO в каких системах счисления можно записывать целые константы?

		//TASK_d
		System.out.println(Math.PI);
		System.out.println(Math.E);
		System.out.println(Math.round(PI));
		System.out.println(Math.round(E));
		System.out.println(Math.min(PI,E));
		System.out.println(Math.random());

		//TASK_e

		//упаковка
		Boolean objbool = true;
		Character objchar = 'c';
		Integer objint = 9;
		Byte objbyte=50;
		Short objshort = 5245;

		System.out.println(objbool);
		System.out.println(Long.MAX_VALUE);
		System.out.println(Long.MIN_VALUE);
		String str2 = "425";

		//Распаковка
		int ival = objint.intValue();
		byte bval = objbyte.byteValue();

		System.out.println(Integer.parseInt(str2));
		System.out.println(Integer.toHexString(ival));
		System.out.println(Integer.toString(ival));
		System.out.println(Integer.bitCount(ival));
		//isNaN отсутствует

		//TASK_f
		String s34 = "2345";
		int s34_int = Integer.parseInt(s34); //через parse
		s34_int = Integer.valueOf(s34); //через valueOf

		String inputString = "Vadim";
		// преобразуем нашу строку в массив байт
		byte[] byteArray = inputString.getBytes();
		System.out.println("Строку в массив байт : " + Arrays.toString(byteArray));
		// конвертируем байты в строку
		String string = new String(byteArray);
		System.out.println("байты в строку : " + string);


		//String в логический тип
		String str3 = "true";
		Boolean b1 = Boolean.valueOf(str3);
		Boolean b2 = Boolean.parseBoolean(str3);

		String str5 = "hello";
		String str6 = "hello";
		System.out.println("-СРАВНЕНИЕ-");
		System.out.println(str5==str6);
		System.out.println(str5.equals(str6));
		System.out.println(str5.compareTo(str6));

		System.out.println(str5.split(str6));
		System.out.println(str5.hashCode());
		System.out.println(str5.indexOf('e'));
		System.out.println(str5.length());
		System.out.println(str5.replace('e','a'));

		//TASK_g
		char[][] c1;
		char[] c2[];
		char c3[][];

		c1=new char[2][];
		c1[0] = new char[1];
		c1[1]=new char[2];
		c1[0][0]='a';
		c1[1][0]='b';
		c1[1][1]='c';


		System.out.println(c1.length);
		System.out.println(c1[0].length);

		//..
		//boolean comRez = c2==c3;
		//c2=c3;

		for (char[] x:c1) {
			System.out.println(x);
		}

		WrapperString testWrapp = new WrapperString("hello");
		String test2 = "";
		test2=testWrapp.replaces('e','p');
		System.out.println(test2);
    }
}
