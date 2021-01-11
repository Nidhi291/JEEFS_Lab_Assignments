class Exercise2
{
	public static String getImage(String str)
	{
		//int n = str.length;
		//char ch[] = new char[n];
		char[] ch = new char[str.length()];
		str.toCharArray();
		String reverse = "";
		String newString = "";
		
		for(int i=ch.length; i>=0; i++)
		{
			reverse = reverse + ch[i];
		}
		newString = newString + str + "|" + reverse;
		
		return newString;
	}
	public static void main(String args[])
	{
		String str = "EARTH";
		System.out.println(getImage(str));
	}
}