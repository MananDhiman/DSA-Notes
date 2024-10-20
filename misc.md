# GCD / HCF / Greatest Common Divisor / Highest common factor
```java
public static int findGcd(int a, int b) {
	while(a > 0 && b > 0) {
		if(a > b) 
			a = a % b;
    	else 
    		b = b % a;
	}

	if(a == 0) 
		return b
	
	return a;
}       
```