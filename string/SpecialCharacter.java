package string;

public class SpecialCharacter {
		private String alphabet;
		public SpecialCharacter(String alphabet) {
			this.alphabet = alphabet;
		}
		public String getSpecialCharacter() {
			String a = alphabet.replaceAll("[A-Za-z0-9]","");
			String b = alphabet.replaceAll("[^A-Za-z0-9]","");
			return b+a;
		}
		public void setSpecialCharacter(String alphabet) {
			this.alphabet = alphabet;
		}	
}
