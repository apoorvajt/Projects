package Program;
import java.util.*;
class OccuranceInteger{
@SuppressWarnings("unchecked")
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
int count;
int n=sc.nextInt();
int arr[]=new int[n];
Map<Integer,Integer> map=new HashMap();
for(int i=0;i<n;i++){
arr[i]=sc.nextInt();}
for(int i=1;i<=9;i++){
count=0;
for(int k=0;k<arr.length;k++){
if(arr[k]%i==0){
count++;
}

map.put(i,count);

}
}
System.out.println(map);
}
}
