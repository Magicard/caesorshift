import java.util.Scanner;

public class ayy {

	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		System.out.println("How big do you want the Caesar shift cipher to be?");
		double CIPHER=  scan.nextInt();
		System.out.print("Now type whatever you want to encrypted and let the computer do the magic."
				+ "\n" + "Make sure it's lowercaps only:");
		scan.nextLine();
		String sentence= scan.nextLine();
		char sentenceChar[]= sentence.toCharArray();
		for(int i=0;i<sentence.length();i++){
			sentenceChar[i] += CIPHER;
			if (sentenceChar[i]>=97+ CIPHER && sentenceChar[i]<= 122+ CIPHER){	
				if (sentenceChar[i]> 122){
					sentenceChar[i]=(char)(sentenceChar[i]-26);
				}
				System.out.print((char)sentenceChar[i]);
			}
			else{
			System.out.print((char)(sentenceChar[i]-CIPHER));
			}
		}
		scan.close();
	}

}
