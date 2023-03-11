
public class FrequencyOfK{
 

class FindFreq {
	
	static int Ffrequency(int a[],
	int n, int x)
	{
		int count = 0;
		for (int i=0; i < n; i++)
		if (a[i] == x)
			count++;
		return count;
	}
	
	// Main Function
	public static void main (String[]
	args) {
		
		int a[] = {2, 4 ,5, 6 , 9};
		int x = 5;
		int n = a.length;
		
		System.out.println(Ffrequency(a, n, x));
	}
}

}