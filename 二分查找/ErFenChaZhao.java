import java.util.Scanner;
import java.util.Arrays;
public class ErFenChaZhao{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int[] a = {1,2,3,4,5,6,7,8,9,10};
		//Arrays.copyOf(����,M)----------->����ǰ����
		//Arrays.copyOfRange(����,M,N)---->����ָ��λ��M->N
		int[] d = Arrays.copyOf(a,8);
		int[] b = Arrays.copyOfRange(a,0,10);
		int[] c = {8,4,6,2,10,1,9,3,5,7};
		System.out.print("����a[]:");
		for(int i=0;i<a.length;i++) System.out.print(a[i]+"  ");
		System.out.print("\n����b[]:");
		for(int i=0;i<b.length;i++) System.out.print(b[i]+"  ");
		System.out.print("\n����c[]:");
		for(int i=0;i<c.length;i++) System.out.print(c[i]+"  ");
		System.out.print("\n����d[]:");
		for(int i=0;i<d.length;i++) System.out.print(d[i]+"  ");
		System.out.print("\n(Arrays.copyOfRange)copyOf��������b[]�����");
		for(int i=0;i<b.length;i++) System.out.print(b[i]+"  ");
		//Arrays.binarySearch(����,ֵ)---->֮���������е�λ�ã�������������
		System.out.println("\n(Arrays.binarySearch)7��������a[]��λ�ã�"+Arrays.binarySearch(a,7));
		//Arrays.equals(����1,����2)------>�Ƚ�����
		System.out.println("(Arrays.equals)�Ƚ�����a[]\\b[]��"+Arrays.equals(a,b));
		//Arrays.sort(����,M,N)--------------->��M->N��������
		Arrays.sort(c,3,9);
		System.out.print("(Arrays.sort)��M->N���������c[]:");
		for(int i=0;i<c.length;i++) System.out.print(c[i]+"  ");
		//Arrays.sort(����)--------------->������������������
		Arrays.sort(c);
		System.out.print("\n(Arrays.sort)�����������������c[]:");
		for(int i=0;i<c.length;i++) System.out.print(c[i]+"  ");
		//Arrays.fill(����,ֵ)------------>���������¸�ֵ
		Arrays.fill(a,1);
		System.out.print("\n(Arrays.fill)ȫ�����¸�ֵ�������a[]:");
		for(int i=0;i<a.length;i++) System.out.print(a[i]+"  ");
		//Arrays.fill(����,M,Nֵ)--------->������M->N���¸�ֵ
		Arrays.fill(a,2,8,2);
		System.out.print("\n(Arrays.fill)M->N���¸�ֵ�������a[]:");
		for(int i=0;i<a.length;i++) System.out.print(a[i]+"  ");



		System.out.println("\n\n\n");
	}
}