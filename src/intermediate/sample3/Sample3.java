package intermediate.sample3;

/*
 * 自作関数1
 * 
 * 0. 関数について
 * 1. 最初の自作関数 printHello
 * 2. 引数を使用する printDecorate
 * 3. 返り値を使用する
 */

/*
 * 0.メソッド(関数)について
 * 
 * メソッドと関数はほぼ同じ意味。
 * メソッドとは、処理を塊にしたもの。
 * 処理をパーツに分け、パーツを再利用することで 分かりやすく・効率よくプログラムを作成できる。
 */

public class Sample3 {

	public static void main(String[] args) {
		printHello();                        // 同じクラス内にある関数を実行しています。
		printDecorate("こんにちは");         // 関数で定義された引数に、"こんにちは"という文字列を渡しています。
		System.out.println(getHello());      // 関数から返された値を、そのままほかの関数の引数として渡すことができます。
		printDecorate(getHello());           // もちろん自分で作った関数を組み合わせることもできます。
		
		System.out.println(sum(10, 20));
	}
	
	// -------------------- ↓ printHelloメソッド ここから --------------------
	/*
	 * メソッドを自分で定義する例
	 * 
	 * メソッドの定義：
	 * public static void メソッド名()
	 */
	
	public static void printHello()
	{
		System.out.println("hello!!");
	}
	// -------------------- ↑ printHelloメソッド ここまで --------------------
	
	
	// -------------------- ↓ printDecorateメソッド ここから --------------------
	/*
	 * 引数を持つメソッドの例
	 * メソッドを宣言する際に、引数という変数を定義する
	 * 
	 * 引数を持つメソッドの定義：
	 * public static void メソッド名(引数1の型 引数1の変数名)
	 */
	
	public static void printDecorate(String message)
	{
		System.out.println("★★★ " + message + " ★★★");
	}
	// -------------------- ↑ printDecorateメソッド ここまで --------------------
	
	/*
	 * 値を返す関数の例
	 * public static 返す値の型 メソッド名()
	 * 
	 * (void:返さない)
	 */
	public static String getHello()
	{
		return "こんにちは";
	}
	
	/*
	 * intの引数を二つ取り、その合計(int)を返す関数の例
	 * 
	 */
	public static int sum(int num1, int num2)
	{
		return num1 + num2;
	}

}
