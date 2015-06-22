package foo;
import java.util.Random;

public class Omojan{
  final static String[] words= new String[]{
    "盛りだくさん","お客様","邪悪な","栄光の","タメ口","量産型","ショートコント",
    "スナフキン","のくせに生意気だ","ブルジョア","報徳学園","効いたよね",
    "早めの","祝福された","エヴァンゲリオン","戦略会議","慕情","通り",
    "デジタル","今月まで","裏側","席","カステラ","ツチノコ","スイミング",
    "定規","押入れ","アラーム","ピラミッド",
    };

  private String getSingleWord(){
    int index= new Random().nextInt(words.length);
    return words[index];
  }

  public String getWord(){
    return getSingleWord()+" "+getSingleWord();
  }
}
