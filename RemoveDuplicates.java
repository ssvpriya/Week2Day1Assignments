package week2.day2.assignments;

public class RemoveDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String text = "We learn java basics as part of java sessions in java week1";
		String[] split = text.split(" ");
		for(int i=0;i<split.length;i++)
		{
			if(split[i] !=null )
			{
				for(int j=i+1;j<split.length;j++)
				{
					if(split[i].equals(split[j]))
					{
						split[j]=null;
					}
					
				}
			}
		}
		for(int i=0;i<split.length;i++)
		{
            if(split[i] !=null )
			System.out.print(split[i] + " ");
		}
		
	}

}
//public class RemoveDuplicates {
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		String text = "We learn java basics as part of java sessions in java week1";
//		int count=0;
//		 String[] words=text.split(" ");      //Splitting every word in the sentence with the help of spaces
//		    for(int i=0;i<words.length;i++)    //Outer loop for Comparison and to check if sentence is empty or not    
//		    {
//		      if(words[i]!=null)
//		      {
//		      
//		      for(int j=i+1;j<words.length;j++)          //Inner loop to compare two words in a sentence to check for duplicacy
//		      {
//		        
//		      if(words[i].equals(words[j]))          //Checking if both the compared strings are equal
//		        {
//		          words[j]=null;      //Deletes the duplicate words if the compared strings are equal
//		        }
//		      }
//		      }
//		    }
//		    for(int k=0;k<words.length;k++)    //Displaying the String without the duplicate words  
//		    {
//		      if(words[k]!=null)
//		      {
//		        System.out.print(words[k] + " ");
//		      }
//		      
//		    }  
//		
//	}
//
//}
