package ArgumenntPassing;

public class HelloAllCondition {
public static void main(String[] args) {
	int size =args.length;
	if (size==0){
		System.out.println("Hello all argument");
	
	
		
	}else {
		for(int i=0; i< size;i++){
			System.out.println("hello "+args[i]);
		}
	}
}
}
