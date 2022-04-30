package week2.day2.assignments;

public class ReverseEvenWords {
	public static String reverse(String names)
	{
		char[] array = names.toCharArray();
		String reverse="";
		for(int i=names.length();i>0;i--)
		{
			reverse = reverse + array[i-1];
		}
		return reverse;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String text1 = "I am a software tester";
		String[] words = text1.split(" ");
		//String[] words2=new String[words.length];
		for(int i=0;i<words.length;i++)
		{
			if((i+1)%2==0)
			{
				words[i]=reverse(words[i]);
			}
			System.out.print(words[i] + " ");	
		}

	}

}
