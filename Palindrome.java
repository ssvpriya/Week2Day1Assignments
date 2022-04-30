package week2.day2.assignments;

public class Palindrome {
	public String is_palindrome(String text)
	{
		String reverse="";
		for(int i=text.length();i>0;i--)
		{
			reverse = reverse + text.charAt(i-1);
		}
		System.out.println("the reversal of word "+reverse);
		return reverse;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String word = "madam";
		Palindrome obj= new Palindrome();
		String reverse=obj.is_palindrome(word);
		if(reverse.equals(word))
			System.out.println("The Given word is Palindrome");
		else
			System.out.println("The Given word is not Palindrome");
	}

}
