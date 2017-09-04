import java.util.*;

public class Main {
    public static void main(String[] args) {
        Map<String, Integer> players = new HashMap<>();
        for (int i = 1; i < 16; i++) {
            players.put("Людовик " + i + "-ый", (int) (Math.random() * 10));
        }

        Set<Integer> setPoints = new TreeSet<>((a, b) -> b - a);
        setPoints.addAll(players.values());
        System.out.println("Очки игроков в порядке убывания");
        setPoints.forEach(System.out::println);

        List<Map.Entry<String, Integer>> listPlayers = new ArrayList(players.entrySet());
        listPlayers.sort((a, b) -> b.getValue() - a.getValue());
        System.out.println("Игроки в порядке убывания очков");
        listPlayers.forEach(System.out::println);

        System.out.println("Три лучших игрока");
        int i = 0;
        for (Map.Entry item : listPlayers) {
            if (i < 3) {
                System.out.println(item);
            }
            i++;
        }
    }
}
