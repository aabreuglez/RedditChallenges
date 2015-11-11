public class ConsonantsandVowels {


    public static void main(String[] args) {
       String input1 = "cvcvcc";
       String input2 = "CcvV";
       String input3 = "cvcvcvcvcvcvcvcvcvcv";
       String bagconsonants ="bcdfghjklmnpqrstvwxyz";
       String bagvowels= "aeiou";
       String output="";
       output = exchange(input3,bagconsonants,bagvowels);
       System.out.println(output);
       
    }
    public static boolean isConsonant(char c)
    {
        String bag ="cC";
        boolean devolver=false;
        String temp = "" + c;
        if (bag.contains(temp))
        {
            devolver = true;
        }
        return devolver;    
    }
    public static boolean isVowel(char c)
    {
        String bag ="vV";
        boolean devolver=false;
        String temp = "" + c;
        if (bag.contains(temp))
        {
            devolver = true;
        }
        return devolver;        
    }
    public static String exchange(String input1, String bagc, String bagv)
    {
        int index=0;              
        char[] c = input1.toCharArray();
        
        for (int i=0; i < c.length; i++)
        {
            if (isConsonant(c[i]))
            {
               index=(int)Math.rint(((bagc.length()-1)*Math.random()));
               c[i]=bagc.charAt(index);
            }
            if (isVowel(c[i]))
            {
               index=(int)Math.rint(((bagv.length()-1)*Math.random()));
               c[i]=bagv.charAt(index);
            }
        }
        
        String merged = new String(c);
        return merged;
    }
    
}