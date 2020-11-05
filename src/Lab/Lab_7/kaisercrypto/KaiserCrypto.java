package Lab.Lab_7.kaisercrypto;

import javax.swing.JOptionPane;

public class KaiserCrypto {

	public static void main(String[] args) {
		KaiserCryptoTable t = new KaiserCryptoTable(1);
		String original = JOptionPane.showInputDialog("암호화할 문장을 입력하세요.");
		String encoded = t.encode(original);
		String decoded = t.decode(encoded);
		JOptionPane.showMessageDialog(null, "원본: " + original + "\n암호화: " + encoded + "\n복호화: " + decoded);
	}
}


