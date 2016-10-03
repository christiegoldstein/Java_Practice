public class Exam1{
	public static void main(String []args){
		int oddnum = 0;
		int evennum= 0; 
		int seven = 0; 
		int sum = 0; 

		System.out.println("Generated: ");
		for(int i = 0; i < 20; i++){
			int randomnum = (int)(Math.random()*20);
			System.out.println(randomnum);

			if(randomnum % 2 == 0){
				evennum++;
				if(randomnum > 13){
					break;
				}
			}
			else if(randomnum % 3 == 1){
				oddnum++;
				if(randomnum == 7){
					seven++;
				}
			}
		} 

		System.out.println("The sum of the randomly generated input was: "+sum);
		System.out.println("There were "+oddnum+" odd numbers and "+evennum+" even numbers");
		System.out.println("The number of times 7 appeared was: "+seven);
	}
}

