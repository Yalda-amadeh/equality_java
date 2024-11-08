package quiz;


public class Quiz_1 {

	public static void main(String[] args) {
		String[] list1= {"zahra","hamed","yalda","vahid"};
		String[] list2= {"zahra","sara","vahid"};
		
		for (String string : list1) {
			for (String string2 : list2) {
				if (string==string2) {
					System.out.println(string);}	
			}		
		}
	}
}
