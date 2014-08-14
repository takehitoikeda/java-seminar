package intermediate.sample5;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Sample5 {

	/*
	 * I/O入出力（ファイル）
	 *
	 *
	 *
	 *
	 */

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		String filePath = "";
		
		FileReader fr = null;
		try {
			File file = new File(filePath);
			fr = new FileReader(file);
		} catch (FileNotFoundException e) {
			// ファイルが開けなければエラーメッセージを出して終了
			System.out.println("ファイルが開けませんでした。");
			System.exit(0);
		}
		
		// 
		BufferedReader br = new BufferedReader(fr);
		String str;
		try {
			while((str = br.readLine()) != null){
				System.out.println(str);
			}
		} catch (IOException e) {
			System.out.println("ファイル読み込み中にエラーが発生しました。");
			System.exit(0);
		
		}
		
	}

}
