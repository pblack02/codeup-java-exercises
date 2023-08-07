import java.util.Random;

public class ServerNameGenerator {
    static String [] adjectives = {
            "Humor",
            "Happy",
            "Bright",
            "Gentle",
            "Generous",
            "Good",
            "Cheerful",
            "Ambitious",
            "Clean",
            "Calm"
    };

    static String [] nouns = {
            "Table",
            "Lion",
            "City",
            "Beach",
            "Book",
            "Pencil",
            "Movie",
            "Car",
            "Game",
            "Family",
    };

    public static String randomElement(String[] array){
        Random ran = new Random();
        int index = ran.nextInt(array.length);
        return array[index];
    }

    public static void main(String[] args) {
        System.out.println("Your sever name is:");
        String one = randomElement(adjectives);
        String two = randomElement(nouns);
        System.out.printf("%s-%s", one,two);

    }


}
