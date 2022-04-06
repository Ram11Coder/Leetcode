package Strings;

import java.util.stream.Stream;

public class MostWordsFound {
	public static void main(String[] args) {
		System.out.println(new MostWordsFound().mostWordsFound(
				new String[] { "alice and bob love leetcode", "i think so too", "this is great thanks very much" }));
		
		System.out.println(new MostWordsFound().mostWordsFoundWithJava8(
				new String[] { "alice and bob love leetcode", "i think so too", "this is great thanks very much" }));
	}

	public int mostWordsFound(String[] sentences) {
		int max = 0;
		for (String sentence : sentences)
			max = Math.max(sentence.split(" ").length, max);
		return max;
	}

	public int mostWordsFoundWithJava8(String[] sentences) {
		return Stream.of(sentences).mapToInt(s -> s.split(" ").length).max().getAsInt();
	}
}
