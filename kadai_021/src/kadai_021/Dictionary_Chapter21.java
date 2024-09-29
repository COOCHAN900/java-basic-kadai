package kadai_021;

import java.util.HashMap;

public class Dictionary_Chapter21 {
	public HashMap<String, String> dictionary;

	public Dictionary_Chapter21() {
		dictionary = new HashMap<>();

		// 辞書に英単語をセット
		dictionary.put("apple", "りんご");
		dictionary.put("peach", "桃");
		dictionary.put("banana", "バナナ");
		dictionary.put("lemon", "レモン");
		dictionary.put("pear", "梨");
		dictionary.put("kiwi", "キウイ");
		dictionary.put("strawberry", "いちご");
		dictionary.put("grape", "ぶどう");
		dictionary.put("muscat", "マスカット");
		dictionary.put("cherry", "さくらんぼ");
	}

	/**
	 * 辞書に含まれていたら単語の意味を、含まれていなかったらその旨を出力する
	 * @param words 調べたい英単語の配列
	 */
	public void searchWords(String[] keys) {
		for(String key : keys) {
			if(dictionary.containsKey(key)) {
				System.out.println(key + ":" + dictionary.get(key));
			} else {
				System.out.println(key + "は辞書に存在しません");
			}
		}
	}

}

