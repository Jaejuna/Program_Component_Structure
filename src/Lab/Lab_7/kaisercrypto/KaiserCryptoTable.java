package Lab.Lab_7.kaisercrypto;

public class KaiserCryptoTable {
	
	private int[] encode_table;
	private int[] decode_table;
	
	public KaiserCryptoTable(int seed) {
		encode_table = new int[27];
		decode_table = new int[27];
		encode_table[0] = seed;
		decode_table[seed] = 0;
		for (int i = 1; i < 27; i++) {
			int new_code = (encode_table[i-1]+4) % 27;
			encode_table[i] = new_code;
			decode_table[new_code] = i;
		}
	}
	
	private int c2i(char c) {
		if (c == ' ') 
			return 0;
		if ('a' <= c && c <= 'z')
			return c - 'a' + 1;
		throw new RuntimeException("c2i: invalid character " + c);
	}
	
	private char i2c(int i) {
		if (i == 0) 
			return ' ';
		if (0 < i && i < 27)
			return (char)('a'+i-1);
		throw new RuntimeException("i2c: invalid code " + i);
	}
	
	public char encode(char c) {
		return i2c(encode_table[c2i(c)]);
	}

	public String encode(String s) {
		String answer = "";
		for (int i = 0; i < s.length(); i++)
			answer = answer + encode(s.charAt(i));
		return answer;
	}
	
	public char decode(char c) {
		return i2c(decode_table[c2i(c)]);
	}
		
	public String decode(String s) {
		String answer = "";
		for (int i = 0; i < s.length(); i++)
			answer = answer + decode(s.charAt(i));
		return answer;
	}	
}
