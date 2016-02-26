import javax.swing.JOptionPane;


public class palindromeChallenge {
	public static void main(String[] args) {
		//Solicita a palavra ou frase
		String text = JOptionPane.showInputDialog("Qual a Palavra ou Frase?");
		//Pega o texto e tudo que for espaço ele irá remover
		text = text.replaceAll(" ", "");
		//Cria String result
		String result=""; 
		for(int i=text.length()-1;i>=0;i--){
			result+= text.charAt(i);
		}

		if(result.equals(text)){
			System.out.println("The Text: "+text+ " is a palindrome");
		}else{
			System.out.println("The Text: "+text+ " isn't a palindrome");;
		}
	}

}
