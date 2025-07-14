package Mathematics;


public class GreatestCommonDivisor {
    public static void main(String[] args) {
        int a =8, b=12;
        System.out.println(gcd(a,b));
    }

    private static int gcd(int a, int b){
        int res = Math.min(a,b);
        if(b%a == 0){
            return a;
        }

        while(res >0){
            if(a%res ==0 && b%res ==0){
                break;
            }
            res--;
        }
        return res;
    }

}
