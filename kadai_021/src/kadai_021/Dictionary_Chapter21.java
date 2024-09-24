package kadai_021;

import java.util.HashMap;
import java.util.Map;

public class Dictionary_Chapter21 {
	public HashMap<String, String> map;

	public Dictionary_Chapter21() {
		map = new HashMap<>();
	}

	/**
	 * 辞書に指定の単語を追加
	 * 繰り返し処理を使い、調べる英単語が辞書に追加されているか判定する
	 */
	public void addWordsInMap() {
		map.put("apple", "りんご");
		map.put("peach", "桃");
		map.put("banana", "バナナ");
		map.put("lemon", "レモン");
		map.put("pear", "梨");
		map.put("kiwi", "キウイ");
		map.put("strawberry", "いちご");
		map.put("grape", "ぶどう");
		map.put("muscat", "マスカット");
		map.put("cherry", "さくらんぼ");
	}

	/**
	 * 辞書内に検索ワードが含まれているか返す
	 * @param word 検索ワード
	 * @return 検索ワードが含まれていたらtrue
	 */
	public Boolean hasWord(String word) {
		return map.containsKey(word);
	}


	public static void main(String[] args) {

		Dictionary_Chapter21 dictionary = new Dictionary_Chapter21();
		dictionary.addWordsInMap();

		for(Map.Entry<String, String> entry : dictionary.map.entrySet()) {
			if(entry.getValue() != null) {
				System.out.println("Key:" + entry.getKey() + " Value:" + entry.getValue());
			} else {
				System.out.println("辞書に存在しません");
			}
		}
	}

}

