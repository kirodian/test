class Break{
	public static void main(String args[]) {
		first:{
			System.out.println("hello\n");
			}
		second:{
			int i = 1;
			if (i == 0) break second; 
			else System.out.println("hii\n");
			}
		}
}
