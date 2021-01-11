class Exercise3
{ 
	static boolean isVowel(char ch)
	{
		if(ch != 'a' && ch != 'e' && ch != 'i' && ch != 'o' && ch != 'u')
		{
			return false;
		}
		return true;
	}
    static String alterString(char str[])
	{
		for(int i=0; i<str.length; i++)
		{
			if(!isVowel(str[i]))
			{
				str[i] = (char)(str[i]+1);
			}
		}
		return String.valueOf(str);
	}
    public static void main(String[] args) 
    { 
        String str = "nidhi"; 
        System.out.println(alterString(str.toCharArray())); 
    } 
}  
  