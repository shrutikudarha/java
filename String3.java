public class String3 {
    public static void main(String[] args) {
        
       String str = "racecar";
       char target = 'r';
       char[] arr=str.toCharArray();
       int count = 0;
       for(int i = 0;i<arr.length;i++){
        if(arr[i] == target){
            count++;
        }
       }
        System.out.println("the number of time "+ target + " appers is " + count);
    }
}