package week2.day2.assignments;

public class ChangeOddIndexToUpperCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String name = "changeme";
        char[] array = name.toCharArray();
        for(int i=1;i<=name.length();i++)
        {
        	if(i%2 !=0)
        	{
        		char upperCase = Character.toUpperCase(array[i-1]);
        		System.out.print(upperCase);
        	}
        	else
        	{
        		System.out.print(array[i-1]);
        	}
        }
		

	}

}
