import java.util.Scanner;

public class Decrypt {
	
	public static void main(String[] args){
	
	/**************************************************************
	 * Saad Anjum
	 * Network Security
	 * 	9/13/16
	 * 
	 * ANSWERS
	 * a) HAVE FUN WHILE WORKING HARD Key=8
	 * b) THIS SUMMER WAS SO NICE Key=19
	 * c) PROGRAMMING IS NOT FUN Key=19
	 * 
	 * 
	 * This is a program that decrypts a Caesar Cipher code. 
	 * 
	 * 
	 */
		
		
	String MSG = ""; //String to hole new decrypt message 
	int Key = 0;
	int temp;
	int num;
	char c;//Final character
	
	
	//Get in user input
	Scanner s = new Scanner(System.in);
	System.out.println("Enter in code to decrypt: ");
	String text = s.nextLine();
	
	
	//loop to get the decrypted message, iterate 25 times. The key can only go up to 25.
	for(int o =0; o < 25; o++){
		Key++;
		MSG = "";
		for(int i = 0; i < text.length(); i++){
			
			num = ((text.charAt(i) - Key) -64);
			if(num <= 0){
				temp =(90 - (num * (-1)) %26);
			}
			else{
				temp =((num % 26) +64);
			}
			c = (char) temp;
			

			if(text.charAt(i) == ' '){
				c = ' ';
			}
			
			MSG = MSG + c;
		}
	
		System.out.println(Key + ") " + MSG);
	}
	}	
}
	

