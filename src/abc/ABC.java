package abc;

import java.util.Scanner;

public class ABC {

	public static void main(String[] args) {

		// ユーザの手をキーボードから入力してもらう
		int user = getUser();

		// コンピュータの手を乱数で作成する
		int pc = getPc();

		// 勝敗の判定を行う
		String result = judgeJanken(user, pc);

		// 結果を表示する
		showResult(user, pc, result);

	}

	public static int getUser() {
		// キーボード入力の準備
		Scanner stdin = new Scanner(System.in);

		// 無限ルール
		while (true) {
			// メッセージの表示
			System.out.println("あなたのじゃんけんの手を入力して下さい");
			System.out.print("(グー:0、チョキ:1、パー:2) --> ");

			// 例外処理でデータのチェックを行う
			try {
				// トークンを文字列として読み込む
				String token = stdin.next();
				// 文字列を整数に変換し、変数に代入
				// 整数に変換できない場合、例外が発生
				int number = Integer.parseInt(token);
				// 整数でも有効なのは「0，1，2」のみ
				if (number <= -1 || number >= 3) {
					// 範囲外は無効なデータなのでやり直し
					System.out.println("【エラー】入力できるのは「0～2」です");
					continue;
				} else {
					// 0,1,2の場合、メソッドの結果として返す
					return number;
				}
			} catch (NumberFormatException e) {
				// 整数以外の場合、無効なデータなのでやり直し
				System.out.println("【エラー】入力できるのは整数だけです");
			}
		}
	}

	public static int getPc() {
		// Mathクラスを利用して乱数をもとめる
		int no = (int) Math.floor(Math.random() * 3);
		return no;
	}

	public static String judgeJanken(int user, int pc) {
		String result = ""; // 判定結果を保存する

		switch (user) {
		case 0: // ユーザの手が0「グー」の場合
			switch (pc) {
			case 0:// コンピュータの手が0「グー」の場合
				result = "あいこ";
				break;
			case 1:// コンピュータの手が1「チョキ」の場合
				result = "勝ち";
				break;
			case 2:// コンピュータの手が2「パー」の場合
				result = "まけ";
				break;
			}
			break;
		case 1: // ユーザの手が1「チョキ」の場合
			switch (pc) {
			case 0:// コンピュータの手が0「グー」の場合
				result = "まけ";
				break;
			case 1:// コンピュータの手が1「チョキ」の場合
				result = "あいこ";
				break;
			case 2:// コンピュータの手が2「パー」の場合
				result = "勝ち";
				break;
			}
			break;
		case 2: // ユーザの手が2「パー」の場合
			switch (pc) {
			case 0:// コンピュータの手が0「グー」の場合
				result = "勝ち";
				break;
			case 1:// コンピュータの手が1「チョキ」の場合
				result = "まけ";
				break;
			case 2:// コンピュータの手が2「パー」の場合
				result = "あいこ";
				break;
			}
			break;
		}

		// 勝敗結果を返す
		return result;
	}

