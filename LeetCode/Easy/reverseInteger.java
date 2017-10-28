public class Solution{
    public int reverse(int x){
        if(x==0)
            return x;
        int flag=0;
        if(x<0)
        {
            flag=1;
            x=-x;
        }
        int result=0;
        int i=0;
        while(x>0)
        {
            if((Integer.MAX_VALUE-x%10)/10<result)
                return 0;
            result=result*10+(x%10);
            i++;
            x=x/10;
        }
        if(flag==1)
        {
            result=-result;
        }
        return result;
    }
}
