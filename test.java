public class test {
    public static void main(String[] args) throws Exception {
        int a =1;
        int b = 2;
        int c = 3;

        boolean ascend = (a<b) && (b<c);
        boolean descnd = (c>b) && (b>a);
        System.out.println(ascend || descnd); 
    }

}
