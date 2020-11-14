package bzbzal;

public class Bzbzal {
    public static void main(String[] args) {
        int a[]= {5,8,98,78,90};
        int qanak=0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] % 5 ==0 ){
                qanak++;
                }
        }
        System.out.println(qanak);
    }
}
