package kadai_021;

import java.util.HashMap;

public class Dictionary_Chapter21 {
	public HashMap<String, String> map;

	public Dictionary_Chapter21() {
		map = new HashMap<>();
	}

	/**
	 * 辞書に指定の単語を追加
	 * @param map
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

}

