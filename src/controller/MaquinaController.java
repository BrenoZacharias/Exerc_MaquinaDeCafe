package controller;

public class MaquinaController {

	private int a1, a2, a3;
	
	public MaquinaController(int a1, int a2, int a3) {
		this.a1 = a1;
		this.a2 = a2;
		this.a3 = a3;
	}
	
	public int minutosMelhorPosicionamento(){
		int min_melhor = 0;
		if((a1>a2)&&(a1>a3)) {
			int min_total_a2 = (a2 * 2);
			int min_total_a3 = (a3 * 4);
			min_melhor = min_total_a2 + min_total_a3;
		}
			
		else if((a2>a1)&&(a2>a3)) {
			int min_total_a1 = (a1 * 2);
			int min_total_a3 = (a3 * 2);
			min_melhor = min_total_a1 + min_total_a3;
		}
		
		else if((a3>a1)&&(a3>a2)) {
			int min_total_a1 = (a1 * 4);
			int min_total_a2 = (a2 * 2);
			min_melhor = min_total_a1 + min_total_a2;
		}
		
		return min_melhor;
	}

}
