package com.bink.lesson.day0810;


import java.util.*;

/**
 * @author yangbingkun
 * 2020/8/10 --2:30 下午
 */
public class DouDiZhu {
    public static void main(String[] args) {
        final int pokerNum = 54;
        final int playerNum = 17;
        final int diPaiNum = 3;
        List<String> pokers = pokers();
        List<String> palyerA = new ArrayList<>();
        List<String> palyerB = new ArrayList<>();
        List<String> palyerC = new ArrayList<>();
        List<String> diPai = new ArrayList<>();

        Map<Integer, String> pokerMap = new HashMap<>(54);
        for (int i = 0; i < pokerNum; i++) {
            pokerMap.put(i, pokers.get(i));
        }
        System.out.println(pokerMap);
        for (int i = 0; i < pokerNum; i++) {
            if (i >= 51) {
                diPai.add(pokerMap.get(i));
            } else if (i % 3 == 0) {
                palyerA.add(pokerMap.get(i));
            } else if (i % 3 == 1) {
                palyerB.add(pokerMap.get(i));
            } else {
                palyerC.add(pokerMap.get(i));
            }
        }
        Collections.sort(palyerA);
        Collections.sort(palyerB);
        Collections.sort(palyerC);
        Collections.sort(diPai);
        System.out.println(palyerA);
        System.out.println(palyerB);
        System.out.println(palyerC);
        System.out.println(diPai);

//        showPoker("Bink",);
    }

    /**
     * 准备一副牌
     */
    public static List<String> pokers() {
        List<String> colors = List.of("♠️", "♣️", "♥️", "♦️");
        List<String> numbers = List.of("A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K");
        List<String> pokers = new ArrayList<>();
        for (String color : colors) {
            for (String number : numbers) {
                String poker = color + number;
                pokers.add(poker);
            }
        }
        pokers.add("大王");
        pokers.add("小王");
//      打乱顺序
        Collections.shuffle(pokers);
        return pokers;
    }

    /**
     * @param name    玩家名称
     * @param hashMap 牌
     * @param list    牌索引
     */
    public static void showPoker(String name, HashMap<Integer, String> hashMap, ArrayList<Integer> list) {
        System.out.print(name + ":    ");
        for (Integer integer : list) {
            String value = hashMap.get(integer);
            System.out.print(value + " ");
        }
        System.out.println();
    }
}
