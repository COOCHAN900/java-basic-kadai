package kadai_021;

public class ictionaryExec_Chapter21 {

	public static void main(String[] args) {
		// 辞書クラスのインスタンスを生成してワードをセット
		Dictionary_Chapter21 dictionary = new Dictionary_Chapter21();
		dictionary.addWordsInMap();
		
		// 配列を生成し、調べる単語をセット
		String[] unknownWords = {"apple", "banana", "grape", "orange"};
		
		// 検索
		for(String word : unknownWords) {
			if(dictionary.hasWord(word)) {
				System.out.println(word + "の意味は" + dictionary.map.get(word));
			} else {
				System.out.println(word + "は辞書に存在しません");
			}
		}
	}
}
