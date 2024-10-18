import java.util.*;

public class Transformchatgpt {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String start = sc.next();
        String end = sc.next();
        String[] dictArray = sc.nextLine().trim().split(" ");
        Set<String> dictionary = new HashSet<>(Arrays.asList(dictArray));

        List<String> result = transform(start, end, dictionary);
        if (result != null) {
            for (String word : result) {
                System.out.print(word + " ");
            }
        } else {
            System.out.println("null");
        }
    }

    public static List<String> transform(String start, String end, Set<String> dictionary) {
        if (!dictionary.contains(end)) {
            return null; // End word not in dictionary, transformation not possible
        }

        Queue<List<String>> queue = new LinkedList<>();
        Set<String> visited = new HashSet<>();
        List<String> path = new ArrayList<>();
        path.add(start);
        queue.offer(path);
        visited.add(start);

        while (!queue.isEmpty()) {
            List<String> currentPath = queue.poll();
            String currentWord = currentPath.get(currentPath.size() - 1);

            if (currentWord.equals(end)) {
                return currentPath; // Found transformation path
            }

            char[] chars = currentWord.toCharArray();

            for (int i = 0; i < chars.length; i++) {
                char originalChar = chars[i];
                for (char c = 'a'; c <= 'z'; c++) {
                    chars[i] = c;
                    String newWord = new String(chars);
                    if (dictionary.contains(newWord) && !visited.contains(newWord)) {
                        List<String> newPath = new ArrayList<>(currentPath);
                        newPath.add(newWord);
                        queue.offer(newPath);
                        visited.add(newWord);
                    }
                }
                chars[i] = originalChar;
            }
        }

        return null; // Transformation not possible
    }
}
