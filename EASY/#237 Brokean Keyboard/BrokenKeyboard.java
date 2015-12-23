import java.io.File;
import java.util.List;
import java.nio.file.Files;
import java.util.ArrayList;
import java.io.IOException;

public class BrokenKeyboard {
    final static String filePath = "enable1.txt";
    public static List<String> dictArray;
    public static String found = "";
    public static String[] keys = new String[]{"edcf", "bnik", "poil", "vybu"};
    public static ArrayList<String> foundArray = new ArrayList<>();

    public static void main(String[] args) {
        File dictFile = new File(filePath);
        try {
            dictArray = Files.readAllLines(dictFile.toPath());
        } catch (IOException e) {
            e.printStackTrace();
        }

        for (String key : keys) {
            for (String words : dictArray) {
                String temp = words;
                char[] charArray = key.toCharArray();
                for (char chars : charArray)
                    temp = temp.replace(Character.toString(chars), "");
                if (temp.equals(""))
                    if (found.length() < words.length())
                        found = words;
            }
            foundArray.add(found);
            found = "";
        }
        System.out.println(foundArray);
    }
}