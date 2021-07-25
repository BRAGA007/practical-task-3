package week3;

public class Phone {
	public static String convert(String oldFormat) {
        StringBuilder sb = new StringBuilder(oldFormat);
        if (oldFormat.matches("^[8]\\d{10}")) {
            sb.replace(0, 1, "+7");
        } else if (!oldFormat.matches("^[+]\\d{11}")) {
            sb.insert(0, "Wrong format: ");
            return sb.toString();
        }
        sb.insert(5, '-');
        sb.insert(9, '-');
        return sb.toString();
    }
	public static void main(String[] args) {
        System.out.println(Phone.convert("89175655655"));
}
}
