// String reverse
public class stringr {

    public static void main(String[] args) {
        String firstn ="sandhya";
        String lastn ="gunduboina";
        for(int i=0;i< firstn.length();i++)
        {
            lastn=firstn.charAt(i)+lastn;
        }
        System.out.println("the reverse number is"+lastn);
    }
} 