
import java.util.*;
import java.lang.*;
import java.io.*;

class Two
{
	public static int next(int num) {
		if(num == 23456789) return 12;
		while(!isValid(++num)) ;
		return num;
	}
	public static int prev(int num) {
		if(num == 12) return 23456789;
		while(!isValid(--num)) ;
		return num;
	}
	public static boolean isValid(int num) {
		int prev = num%10;
		num = num/10;
		while(num != 0) {
			if(num%10 >= prev) return false;
			prev = num%10;
			num = num/10;
		}
		return true;
	}
}