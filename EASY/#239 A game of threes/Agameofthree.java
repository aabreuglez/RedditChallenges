public class Agameofthree {

    public static void main(String[] args) {
        int n = 31337357; 
        
        while (n > 1)
        {
            if ( n % 3 == 0 )
            {
                
                System.out.println(n);
                n /= 3;
            }
            else if ( n % 3 == 1 )
            {
                System.out.println(n + " -1");
                n -= 1;
                n /= 3;
            }
            else if ( n % 3 == 2 )
            {
                System.out.println(n + " +1");
                n += 1;
                n /= 3;
            }
            
        }
        System.out.println(n);
    }
    
}
