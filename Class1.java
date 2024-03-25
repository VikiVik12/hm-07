import java.util.HashSet;
import java.util.Set;

public class Class1 {
    public static char[] findUniqueCharacters(String[] strings) {
      Set<Character> uniqueCharacters = new HashSet<>();
      for (String str : strings) {
        for (char c : str.toCharArray()) {
          uniqueCharacters.add(c);
        }
      }

      char[] result = new char[uniqueCharacters.size()];
      int index = 0;
      for (char c : uniqueCharacters) {
        result[index++] = c;
      }

      return result;
    }

    public static void main(String[] args) {
      String[] strings = {"logo", "mama", "coco"};
      char[] uniqueChars = findUniqueCharacters(strings);

      System.out.println("Унікальні символи:");
      for (char c : uniqueChars) {
        System.out.print(c + " ");
      }
    }
  }
