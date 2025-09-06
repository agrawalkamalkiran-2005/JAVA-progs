public class q9 
{
    public static void main(String[] args) {
        int i,temp,digit,n,sum;
        for (i = 1; i < 10000; i++)
        {
            temp=i;
            n=0;
            sum=0;
            int m=temp;
            while(m>0)
            {
                n++;
                m=m/10;
            }
            m=temp;
            while(m>0)
            {
                digit=m%10;
                int pow=1;
                for(int j=1;j<=n;j++)
                {
                    pow=pow*digit;
                }
                sum=sum+pow;
                m=m/10;
            }
            if(sum==i)
            {
                System.out.println(i+"");
            }
        }
    }
}
