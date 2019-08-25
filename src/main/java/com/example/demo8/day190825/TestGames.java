package com.example.demo8.day190825;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * 测试--斗地主流程牌
 */
public class TestGames {
    public static void main(String[]args){
        HashMap<Integer,String> poker = new HashMap<>();
        ArrayList<Integer> pokerIndex = new ArrayList<>();
        GamesDemo gamesDemo = new GamesDemo(poker,pokerIndex);
        //准备牌
        gamesDemo.prepare();
        // 打印牌
        gamesDemo.printPoker();
    }
}
