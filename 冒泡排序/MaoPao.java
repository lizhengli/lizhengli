public class MaoPao{
	public static void main(String[] ars){
		int[] a ={8,7,2,6,9,10,14,15,3,5};
		for(int i = 0; i<a.length;i++){
			for(int j = 0;j<a.length-1;j++){
				if(a[j]>a[j+1]){
					int x = a[j];
					a[j] = a[j+1];
					a[j+1] = x;
				}
			}
			
		}
		for(int k = 0;k<a.length;k++){
			System.out.print(a[k]+"\t");
		}
		
	
	}
}