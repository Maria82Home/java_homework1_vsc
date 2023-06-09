import java.util.Random;

public class homework1 {

    public static int randomI(int max){
        Random random = new Random();
        int res = random.nextInt(max);
        return res;
    }

    public static int biggestPosition(int i){
        return Integer.toBinaryString(i).length();
    }

    public static int[] arrayM1(int i, int n){
        int counter1 = 0;
        for (int j=i;j<Short.MAX_VALUE; j++) {
            if (j%n==0)
            counter1+=1;
        }
        int[] array = new int[counter1];
                int k = 0;
        for (int j=i;j<Short.MAX_VALUE;j++){
            if (j%n==0){
                array[k]=j;
                k+=1;
            }
        }
        return array;
    }

    public static int[] arrayM2(int i, int n){
        int counter1 = 0;
        for (int j=Short.MIN_VALUE;j<i; j++) {
            if (j%n==0)
            counter1+=1;
        }
        int[] array = new int[counter1];
                int k = 0;
        for (int j=Short.MIN_VALUE;j<i; j++){
            if (j%n==0){
                array[k]=j;
                k+=1;
            }
        }
        return array;
    }


    public static void main(String[] args){
        int i = randomI(2000);
        System.out.println(i);
        int n = biggestPosition(i);
        System.out.println(n);

        int[] m1 = arrayM1(i,n);
        int[] m2 = arrayM2(i,n);
    }

}