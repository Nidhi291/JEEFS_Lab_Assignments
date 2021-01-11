class Exercise6
{ 
static int calculateDifference(int n)
{ 
  int i, j, k; 
    i = (n * (n + 1) * (2 * n + 1)) / 6; 
      
    j = (n * (n + 1)) / 2; 
  
    // Square of k 
    j = j * j; 
      
    k = Math.abs(i - j); 
      
    return k; 
} 
public static void main(String s[]) 
{ 
    int n = 10; 
    System.out.println(calculateDifference(n));      
      
} 
}  