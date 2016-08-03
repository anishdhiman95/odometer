class Three {
	public static int difference(int a,int b) {
	    if(a>b) {
	        int temp = a;
	        a = b;
	        b = temp;
	    }
		int result = 0;
		while(a!=b) {
		    a = Two.next(a);
		    result++;
		}
		return result;
		
	}
	
	public static int nextnth(int num,int n) {
	    int count = 0;
	    while(count!=n) {
	        num = Two.next(num);
	        count++;
	    }
	    return num;
	}
	
	public static int prevnth(int num,int n) {
	    int count = 0;
	    while(count!=n) {
	        num = Two.prev(num);
	        count++;
	    }
	    return num;
	}
	
	
}