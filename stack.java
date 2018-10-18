import java.util.ArrayList;

public class Stack {
	public void stackView(int stackNum){
		
		ArrayList<Integer> arl = new ArrayList<Integer>();
		arl.add(stackNum);
	
		for (int i = arl.size(); i > 0; i--) {
			System.out.println(arl.get(i));
		}
	}

}
