package Array;

public class oneDarray {
	public static void main(String[] args) {
		int [] table= new int[10];
		table[0]=1;
		table[1]=3;
		table[3]=7;
		table[5]=9;
		table[7]=2;
		//for(int i=0; i<table.length;i++)
		//System.out.print(table[i]);
		for(int a:table)
			System.out.print(a);
	}

}
