

public class SearchString {

    static void search(String s, char c) {
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == c) {
                count++;
            }
        }
        System.out.println("The character " + c + " appears " + count + " times in the string " + s);
    }
    public static void main(String[] args) {
       String s ="Hello";
       char c = 'l';
       search(s, c);
    }
    
}
