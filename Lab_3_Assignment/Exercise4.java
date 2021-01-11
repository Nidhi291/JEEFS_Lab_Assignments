class Exercise4
{
 public static int modifyNumber(int num)
 {
  int count = 0;
  while(num != 0)
  {
	num = num / 10;
	count++;
  }
  //System.out.println("count of digits in number: "+count);
  
  int arr[] = new int[count];
  int i = 0, rem;
  while(num != 0)
  { 
	rem = num % 10;
	arr[i] = rem;
	num = num / 10;
	i++;
  }
  
  String n = "";
  String fl = "";
  int diff, firstLast = 0;
  for(i=0; i<count; i++)
  {
	  firstLast = arr[count-1] - arr[i];
  }
  
  for(i=0; i<count; i++)
  {
	  diff = Math.abs(arr[i] - arr[i+1]);
	  n = n + diff;
  }
  fl = fl + n + firstLast;
  int k = Integer.parseInt(fl);
  
  return k;
 }
 public static void main(String args[])
 {
  int num = 45862;
  System.out.println(modifyNumber(num));
 }
}