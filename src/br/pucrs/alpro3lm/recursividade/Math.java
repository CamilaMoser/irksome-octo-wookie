package br.pucrs.alpro3lm.recursividade;

public class Math {

	
	public static void main(String[] args) {
		System.out.println(Math.factorial(3));
	}

	/**
	 * 
	 * @param n
	 * @return
	 */
	public static int factorial(int n) {
		if (n < 0)
			throw new IllegalArgumentException();
		
		return fact(n);
	}

	/*
	 * 
	 */
	private static int fact(int n) {
		if (n == 0)
			return 1;
		else
		    return n * fact(n - 1);
	}
	
	
	public static int sum(int n) {
		if (n < 0)
			throw new IllegalArgumentException();
		
		return s(n);
	}	
	
	private static int s(int n) {
		if (n == 0)
			return 0;
		
		return n + s(n - 1);
	}
	
	public static boolean isPalindrome(String s) {
		if (s == null)
			throw new IllegalArgumentException();	
		s = s.trim();
		if (s.isEmpty())
			throw new IllegalArgumentException();			
		return p(s);
	}
	
	
	
	private static boolean p(String s) {
		if (s.equals(""))
			return true;
		if (s.length() == 1)
			return true;		
		
		if (s.charAt(0) != s.charAt(s.length() - 1))
			return false;
		s = s.substring(1, s.length() - 2);
		return p(s);
	}
	
	
	
	
	
	

	private Math() {
		// TODO Auto-generated constructor stub
	}
}
