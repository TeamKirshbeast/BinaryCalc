
public class CalcNum {
	int val; //decimal value
	int mode; //0:dec; 1:bin; 2:hex
	
	public CalcNum(String val, int mode) {
		this.mode = mode;
		if (mode == 0) {
			this.val = Integer.parseInt(val);
		} else if (mode == 1) {
			this.val = Integer.parseInt(val, 2); 
		} else {
			this.val = Integer.parseInt(val, 16);
		}
	}
	
	public String decToBin(int s) {
		return Integer.toBinaryString(s);
	}
	
	public String decToHex(int s) {
		return Integer.toHexString(s);
	}
	
	
}
