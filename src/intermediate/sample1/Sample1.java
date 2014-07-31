package intermediate.sample1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Sample1 {

	public static void main(String[] args) throws IOException {
		// TODO 自動生成されたメソッド・スタブ


		System.out.println("入力してください。");

		//コンソール入力
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		String buf = br.readLine();

		System.out.println("あなたが入力したのは");
		System.out.println(buf);
		System.out.println("です。");




		System.out.println("数値を入力してください。");
		buf = br.readLine();

		double d = Double.parseDouble(buf); //文字を入力しているとエラーになります
		System.out.println(d);

		int num = (int)d;
		System.out.println(num);




		/*
		 * int num = Integer.parseInt(buf);
		 * に小数ありの入力値を渡すとエラーになります
		 */









	}


	/*

	//コンソール入力

	//コンソール入力は基本この3行で1セット
	InputStreamReader isr = new InputStreamReader(System.in);
	BufferedReader br = new BufferedReader(isr);
	String buf = br.readLine();

	//※補足[コンソール出力]
	System.out.print( [   出力する文字列   ]);
	System.out.println( [   出力する文字列   ]);など

	//型のキャスト


	//整数から整数
	int i = 10;
	long l = (long)i;
	//long l には10が代入される。
	//intとlongともに整数を格納できlongのほうがより大きな値も保持できます。
	//int・・・-2147483648～2147483647
	//long・・・約-922京～約922京

	//浮動小数から整数
	double d = 1.23456;
	int i = (int)d;
	//int i には1が代入される。
	//0.23456は切り捨てられる。

	・文字列から整数
	String str = “100000”;
	int i = Integer.parseInt(str);

	//整数から浮動小数などのように
	//浮動小数にも整数部はあるため、問題なくキャストできますが、
	//逆に浮動小数から整数へは、小数部が入らないため切り捨てられてしまいます。

	 */



}
