public class vararge {
    public int sumnumber(int ... args){
        int sum = 0;
        for(int x : args){
            sum += x;
        }
        return sum;
    }
    public static void main(String[] args) {
        vararge ve = new vararge();
        int sum1 = ve.sumnumber(2,4);
        System.out.println("sum 1="+ sum1);
        int sum2 = ve.sumnumber(1,2,5,6);
        System.out.println("sum 2="+ sum2);
        int sum3 = ve.sumnumber(2,4,5,6,7,8,9,0,8);
        System.out.println("sum 3="+ sum3);


    }
}
