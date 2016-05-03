public class Main {
   public static boolean ifAla(char a, char b, char c) {
  	if((a =='A' || a == 'a') && (b == 'l') && (c == 'a'))
	   	return true;

	else return false;
   }
   public static int stringCount (String []input) {
   	int res = 0;
	char prev;
	char prev2;
	
	for (int j = 0; j < input.length; j++)
	for(int i = 0; i<(input[j].length() - 2); i++){
		 if (ifAla(input[j].charAt(i), input[j].charAt(i+1), input[j].charAt(i+2)))
			res++;
	}
		return res;
   }
   public static void testIfAla() {
   	if(ifAla('a','l','a')) System.out.println("String test 1/5 passed");
   	if(ifAla('A','l','a')) System.out.println("String test 2/5 passed");
   	if(!ifAla('G','l','a')) System.out.println("String test 3/5 passed");
   	if(!ifAla('0','0','0')) System.out.println("String test 4/5 passed");
   	if(!ifAla('l','a','a')) System.out.println("String test 5/5 passed");
   }
   public static void myMethod (int a) {
   	a -= 1;
	System.out.println("myMethond int result: "+a);
   }
   public static void myMethod (double a) { 
   	a += 1;
	System.out.println("myMethond double result: "+a);
   }
   public static boolean isPalindrome(char [] input) {
	int length = input.length;
   	for (int i = 0; i<(length/2 +1); i++)
		if(input[i] != input[length - i - 1])
			return false;
	   return true;
   }
   public static void testIsPalindrome() {
   	if(isPalindrome("kajak".toCharArray())) System.out.println("Palindrome test 1/4 passed");
   	if(!isPalindrome("kaja".toCharArray())) System.out.println("Palindrome test 2/4 passed");
   	if(isPalindrome("0".toCharArray())) System.out.println("Palindrome test 3/4 passed");
   	if(isPalindrome("aabbccbbaa".toCharArray())) System.out.println("Palindrome test 4/4 passed");
   }
   public static int fibonacci(int a) {
	if(a == 1 || a == 0) { return 1; }
	if(a == 2) { return 2; }
	return fibonacci(a - 1) + fibonacci(a - 2);
   }
   public static void testFibonacci () {
   	if(fibonacci(1) == 1) { System.out.println("Fibonacci test 1/4 passed"); }
   	if(fibonacci(2) == 2) { System.out.println("Fibonacci test 2/4 passed"); }
   	if(fibonacci(4) == 5) { System.out.println("Fibonacci test 3/4 passed"); }
   	if(fibonacci(10) != 1) { System.out.println("Fibonacci test 4/4 passed"); }
   }
   public static void main (String [] args) {
	   RandomString random = new RandomString();
	   String [] inputForFirst = random.next();
	   System.out.println("'Ala' wystapilo "+stringCount(inputForFirst)+" razy");
	   testIfAla();

	   char equal = 2;

	   myMethod((int) equal);
	   myMethod((double) equal);

	   testIsPalindrome();
   	   testFibonacci();
   }
}
