class Solution {
     public String maxSumOfSquares(int num, int sum) {
        if(sum>num*9){
            return "";
        }
        StringBuilder sb=new StringBuilder();
        while(num>0){
            int dig=Math.min(9,sum);
            sb.append(dig);
            sum-=dig;
            num--;
        }
        return sb.toString();
     }
}
// class Solution {
//     public String maxSumOfSquares(int num, int sum) {
//         int ans=-1;
//         List<Integer> poss=findAll(num,sum);
//         for(int i=0;i<poss.size();i++){

//         }
//         return String.valueOf(ans);
//     }
//     static List<Integer> findAll(int n,int sum){
//         List<Integer> al=new ArrayList<Integer>();
//         dp(n,sum,al,0);
//         return al;
//     }
//     static void dp(int n,int sum,List<Integer> al,int num){
//         if(n==0){
//             if(sumDig(num)==sum){
//                 al.add(num);
//             }
//             else{
//                 return;
//             }
//         }
//         dp(n-1,sum,al,num)
//         return;
//     }
//     static sumDig(int num){
//         while(temp>0){
//             int temp=num%10;
//             sum+=temp;
//             num=num/10;
//         }
//     }

// }



