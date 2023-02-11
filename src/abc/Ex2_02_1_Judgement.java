package abc;

class Ex2_02_1_Judgement {

	//---フィールド----------------------------------------------

	public class Ex2_02_1_Player {

		public Object handStatus;

	}

	String  name ;  //審判の名前

	//---コンストラクタ------------------------------------------------

	Ex2_02_1_Judgement(String nm_jug){
		name = nm_jug ;
	}

	//---メソッド------------------------------------------------------

	//Judgementソッド
	void JudgementResult(Ex2_02_1_Player player1, Ex2_02_1_Player player2){

		Object judgement;
		if(player1.handStatus.equals(player2.handStatus)){

			System.out.println( "審判" + judgement.name + "「あいこ！勝負つかず！！！」" ) ;

		}else if(((player1.handStatus.equals("グー"))&&(player2.handStatus.equals("チョキ")))||((player1.handStatus.equals("パー"))&&(player2.handStatus.equals("グー")))||((player1.handStatus.equals("チョキ"))&&(player2.handStatus.equals("パー")))){

			System.out.println( "審判" + judgement.name + "「" + player1.name + "さんの勝ち」" ) ;

		}else if(((player2.handStatus.equals("グー"))&&(player1.handStatus.equals("チョキ")))||((player2.handStatus.equals("パー"))&&(player1.handStatus.equals("グー")))||((player2.handStatus.equals("チョキ"))&&(player1.handStatus.equals("パー")))){

			System.out.println( "審判" + judgement.name + "「" + player2.name + "さんの勝ち」" ) ;

		}

	}

	public static void judgementResult() {
		// TODO 自動生成されたメソッド・スタブ

	}
}