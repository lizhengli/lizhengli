public class XuanZe{
	public static void main(String[] ag){
		 int[] a={1,3,2,45,65,33,12};
		 System.out.println("有一组数据");
		 for(int i = 0;i<a.length;i++){
			System.out.print(a[i]+"\t");
		 }
		 for(int i = 0;i<a.length-1;i++){
			int k = i;
			for(int j = k+1;j<a.length;j++){
			  if(a[j] < a[k]){ 
				
				k = j; //记下目前找到的最小值所在的位置

			}
			
		 }
		 if(i!=k){
			int x = a[i];
			a[i] = a[k];
			a[k] = x;
		}
			
	}
	System.out.println("排序后");
	for(int num:a){
		System.out.print(num+"\t");
	}
}
}