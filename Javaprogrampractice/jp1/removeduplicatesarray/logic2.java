package removeduplicatesarray;

public class logic2 {
    public static int[] a = new int[] { 4, 5, 4, 5, 4, 5, 7, 8 };

    public static int[] b = new int[a.length];

    public static int k = 0;

    public static void main(String[] args) {

          for (int i = 0; i < a.length; i++)

          {
               int count = 0;
               for (int j = i + 1; j < a.length; j++) {
                     if (a[i] == a[j]) {
                          count++;
                     }
               }
               if (count == 0) {
                     b[k++] = a[i];
                    // System.out.println(k);
               }

          }

          for (int i = 0; i < k; i++) {
               a[i] = b[i];
               System.out.print(a[i] + " ");
          }
    }


}
