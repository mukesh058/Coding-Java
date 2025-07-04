package String;

public class CapitalChar {

    public static void main(String[] args) {
        String s1 = "Mukesh Suryawanshi";
        
        // Output: mUKESH sURYAWANSHI
       
        StringBuilder sb = new StringBuilder();
        String[] words = s1.split(" ");
        
        for (String word : words) {
            for (char ch : word.toCharArray()) {
                if (Character.isUpperCase(ch)) {
                    sb.append(Character.toLowerCase(ch));
                } else {
                    sb.append(Character.toUpperCase(ch));
                }
            }
          
        }
        
        
     
        System.out.println(sb.toString());
    }
}
