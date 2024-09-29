package kadai_021;

public class DictionaryExec_Chapter21 {

	public static void main(String[] args) {
		// 辞書クラスのインスタンスを生成してワードをセット
		Dictionary_Chapter21 dictionary = new Dictionary_Chapter21();
		
		// 配列を生成し、調べる単語をセット
		String[] keys = {"apple", "banana", "grape", "orange"};
		
		// 検索実行
		dictionary.searchWords(keys);
	}
}
