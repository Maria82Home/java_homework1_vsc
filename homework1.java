import java.util.Random;

public class homework1 {
    public static void main(String[] args){
        Random random = new Random();
        int i = random.nextInt(2000);
        System.out.println(i);
        String str = Integer.toBinaryString(i);
        System.out.println(str);
        // System.out.println(n.length());
        int n = Integer.toBinaryString(i).length();
        System.out.println(n);
        int[] m1 = new int[1];
        System.out.println(m1.length);
        for (int j=i;j<2010;j++){
            if (j%n==0){
                m1[0]=j;
                System.out.println(m1[0]);
                // System.out.println(j);
                // int[] tmp = new int[m1.length+1];
                // System.out.println(tmp.length);
                // for (int k=0; k<tmp.length; k++) tmp[k]=m1[k];
                // m1=tmp;
                // m1[tmp.length]=j;

            }

        }
    }

}