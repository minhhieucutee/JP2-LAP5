import java.util.*;


public class LyricWord {
    private static final String[] lyric = {"you", "say", "it", "best",
            "when", "you", "say", "nothing", "at", "all"};

    public static void main(String[] args) {

        List words = new ArrayList();

        for (String w : lyric)
            words.add(w);

        // Traverse the list
        for (Object o : words)
            System.out.print(o + " ");
        System.out.println("\n------------------");

        System.out.println("Contains [you]?:" + words.contains("you"));
        System.out.println("Contains [me]?:" + words.contains("me"));
        System.out.println("Where's [say]?:" + words.indexOf("say"));
        System.out.println("Where's the last [say]?: " +       words.lastIndexOf("say"));



        Collections.sort(words);



        for (Object o : words) {
            System.out.print(o + " ");
        }
    }
}
