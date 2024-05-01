public class reverse_string {
    

    public static void main(String[] args) {
        String s= "Priya";
        char[] a= s.toCharArray();

        for (int i = a.length;i>0; i--) {
            System.out.print(a[i-1]);


        }
    }
}
