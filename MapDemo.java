package ch11;

import java.util.Map;

public class MapDemo {
    public static void main(String[] args) {
        Map<Integer, String > fruits = Map.of(5, "사과", 3, "바나나", 10, "포도", 1, "딸기");
        System.out.println(fruits.size() + "종류의 과일이 있습니다.");
        System.out.println(fruits);

        for (Integer key : fruits.keySet())
            System.out.println(key + "개의 " + fruits.get(key) + "가 있습니다.");

        Integer key = 3;
        if (fruits.containsKey(key))
            System.out.println(key + "개의 " + fruits.get(key) + "가 있습니다.");

        fruits.forEach((k, n) -> System.out.print(n + "(" + k + ")"));

    }
}
