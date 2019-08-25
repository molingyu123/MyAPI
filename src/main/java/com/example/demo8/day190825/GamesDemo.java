package com.example.demo8.day190825;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Objects;

/**
 *斗地主案列
 * 流程：准备牌，洗牌，发牌，排序，看牌
 */
public class GamesDemo {

    //牌的索引和组装好的牌
    private HashMap<Integer,String> poker;
    // 牌的的索引
    private ArrayList<Integer> pokerIndex;

    public HashMap<Integer, String> getPoker() {
        return poker;
    }

    public ArrayList<Integer> getPokerIndex() {
        return pokerIndex;
    }

    public void setPoker(HashMap<Integer, String> poker) {
        this.poker = poker;
    }

    public void setPokerIndex(ArrayList<Integer> pokerIndex) {
        this.pokerIndex = pokerIndex;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof GamesDemo)) return false;
        GamesDemo gamesDemo = (GamesDemo) o;
        return Objects.equals(poker, gamesDemo.poker) && Objects.equals(pokerIndex, gamesDemo.pokerIndex);
    }

    @Override
    public int hashCode() {

        return Objects.hash(poker, pokerIndex);
    }

    public GamesDemo(HashMap<Integer, String> poker, ArrayList<Integer> pokerIndex) {
        this.poker = poker;
        this.pokerIndex = pokerIndex;
    }

    @Override
    public String toString() {
        return "GamesDemo{" + "poker=" + poker + ", pokerIndex=" + pokerIndex + '}';
    }

    /**
     * 牌的花色
     * @return
     */
    private static ArrayList<String> getColors(){
       ArrayList<String> colors = new ArrayList<>();
        //"♠", "♥", "♣", "♦"
       colors.add("♠");
       colors.add("♥");
       colors.add("♣");
       colors.add("♦");
       return colors;
    }

    /**
     * 牌的序号
     * @return
     */
    private static ArrayList<String> getNumbers(){
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("2");
        arrayList.add("A");
        arrayList.add("K");
        arrayList.add("Q");
        arrayList.add("J");
        arrayList.add("10");
        arrayList.add("9");
        arrayList.add("8");
        arrayList.add("7");
        arrayList.add("6");
        arrayList.add("5");
        arrayList.add("4");
        arrayList.add("3");
        return arrayList;
    }

    /**
     * 准备牌
     */
    void prepare(){
        //添加大小王
        int index =0;
        this.poker.put(0,"大王");
        this.pokerIndex.add(index);
        index++;
        this.poker.put(1,"小王");
        this.pokerIndex.add(index);
        index++;
        // 组装52张牌，存储到扑克集合和扑克索引集合中
        for(String number:getNumbers()){
            for(String color:getColors()){
                //组装序号（外)和花色(内）
                this.poker.put(index,color+number);
                this.pokerIndex.add(index);
                ++index;
            }
        }
    }

    /*
      洗牌
     */
    void shufflePoker(){
        // 打乱顺序
        Collections.shuffle(pokerIndex);
    }

    /**
     * 发牌
     * @return
     */
    HashMap<String,ArrayList<Integer>> sendPoker(){
        // 创建三个玩家和底牌
        ArrayList<Integer> player01 = new ArrayList<>();
        ArrayList<Integer> player02 = new ArrayList<>();
        ArrayList<Integer> player03 = new ArrayList<>();
        // 存储地主的三张牌
        ArrayList<Integer> leftCard = new ArrayList<>();
        // 除了最后的三张，前面的分别发给三个玩家
        for(int i=0;i<pokerIndex.size();i++){
            Integer in= pokerIndex.get(i);
            if(i>50){
                leftCard.add(in);
            }else if(i%3==0){
                player01.add(in);
            }else if(i%3==1){
                player02.add(in);
            }else if(i%3==2){
                player03.add(in);
            }
        }

        //每个玩家拿到牌后进行排序
        Collections.sort(player01);
        Collections.sort(player02);
        Collections.sort(player03);

        // 装在集合中返回集合
        HashMap<String,ArrayList<Integer>> stringArrayListHashMap = new HashMap<>();
        stringArrayListHashMap.put("玩家01",player01);
        stringArrayListHashMap.put("玩家02",player02);
        stringArrayListHashMap.put("玩家03",player03);
        return  stringArrayListHashMap;
    }

    /**
     * 将扑克索引换成扑克牌
     * @param index
     * @return
     */
    ArrayList<String> replacePokerIndex (ArrayList<Integer> index){
        ArrayList<String> replacePoker = new ArrayList<>();
        for(int i=0;i<index.size();i++){
            Integer in = index.get(i);
            // 得到对应的牌
            String indexPoker = poker.get(in);
            replacePoker.add(indexPoker);
        }
        return replacePoker;
    }


    /**
     * 打印扑克和索引
     */
    void printPoker(){
        // 得到发牌后的集合
        HashMap<String,ArrayList<Integer>> playerPokers = sendPoker();
        // 2.遍历循环
        for(String key:playerPokers.keySet()){
            // 根据key 得到值
            ArrayList<Integer> playerPoker = playerPokers.get(key);
            // 将扑克对应的索引转换为扑克牌
            ArrayList<String> newPlayerPoker = replacePokerIndex(playerPoker);
            // 输出
            System.out.println(key+":"+newPlayerPoker);
        }
    }


}

