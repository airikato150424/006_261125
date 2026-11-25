import java.util.Scanner;

class toku001{
    public static void main(String[]args){
        Scanner sc =new Scanner(System.in);

        //試験の数Nを読み込む
        int n = sc.nextInt();

        //AとBの得点を格納する配列を用意
        int[]a = new int[n];
        int[]b = new int[n];

        //Aの得点を配列に格納
        for(int i=0;i < n;i++){
            a[i]=sc.nextInt();
        }

        //Bの得点を配列に格納
        for(int i=0;i < n;i++){
            b[i]=sc.nextInt();
        }
        
        //得点差（A[i]-B[i])を計算して出力

        for(int i =0;i < n;i++){
            System.out.print(a[i]-b[i]);

            //最後の要素以外は後ろに半角スペースをいれる
            if(i <n-1){
            System.out.print(" ");
        }

        }
    }
}