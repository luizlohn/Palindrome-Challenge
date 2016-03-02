package Code;
import javax.swing.JOptionPane;


public class palindromeChallenge {
	public static void main(String[] args) {
		//Solicita a palavra ou frase
		String text = JOptionPane.showInputDialog("Qual a Palavra ou Frase?");
		//Pega o texto e tudo que for espaço ele irá remover
		String text_final = text;
		text = text.replaceAll("\\s", "");
		text = text.toUpperCase();
		//Cria String result  
		String result="";  
		for(int i=text.length()-1;i>=0;i--){
			result+= text.charAt(i);
		}

		if(result.equals(text)){
			JOptionPane.showMessageDialog(null, "The Text: "+text_final+ " is a palindrome");
		}else{
			JOptionPane.showMessageDialog(null, "The Text: "+text_final+ " isn't a palindrome");;
		}
	}

}
