
public class string_buffer {
    public static void main(String[] args) {
        StringBuffer sb= new StringBuffer("Ajhar");
        System.out.println(sb.capacity());
        System.out.println(sb.length());
        System.out.println(sb.deleteCharAt(2));
        System.out.println(sb.insert(0, "Java "));
        System.out.println(sb.indexOf("v"));
    }
}
