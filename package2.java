public class package2 {
    public class VarArgs{
        static void add(int...nums){
            System.out.println("fourth elements:"+ nums[3]);
            System.out.println("length of array is :"+ nums.length);
        }
        public static void main(String[] args) {
            add(20,30,40,50,10,40,59);
            add(20,30,2,0);
        }
    }
}
