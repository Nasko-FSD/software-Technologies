
public class Strings {
    public static void main(String[] args) {

        String str = "SoftUni";
        System.out.println(str);

        for (int i = 0; i < str.length(); i++) {
            System.out.printf("str[%d] = %s%n", i, str.charAt(i));
        }
        System.out.println(str.indexOf("Uni"));
        System.out.println(str.indexOf("uni"));
        System.out.println(str.substring(4, 7));
        System.out.println(str.replace("Soft", "Hard"));
        System.out.println(str.toLowerCase());
        System.out.println(str.toUpperCase());

        String firstName = "Steve";
        String lastName = "Jobs";
        int age = 56;

        System.out.println(firstName + " " + lastName +
                " (age: " + age + ")");

        String allLanguages = "C#, Java; HTML, CSS; PHP, SQL";
        String[] languages = allLanguages.split("[, ;]+"); // Split by RegEx

        for (String lang: languages) {
            System.out.println(lang);
        }

        System.out.println("Lang = " + String.join(", ", languages));
        System.out.printf(" %n%n Software  University  ".trim());
    }
}