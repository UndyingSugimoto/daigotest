import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CollectionFunctions {

    //文字列の配列を、リストにして返す

    public List<String> arrayToList(String[] strings){
        //TODO 実装しろ
        return new ArrayList<>();
    }

    //数字の配列と文字列の配列から、key=数字、value=文字列のMapを生成して返す。
    //数字の配列と文字列の配列は、どちらも同じ長さという前提で良い。

    public Map<Integer,String> generateMap(Integer[]numbers, String[] names){
        //TODO 実装しろ
        return new HashMap<>();
    }

    //文字列のリストを、全て連結して返す

    public String connectStrings(List<String> strings){
        //TODO 実装しろ
        return "";
    }

    //引数のMapは、社員番号/名前である。
    //社員番号 1 ~ 10は役員
    //社員番号 11 ~ 20は部長
    //社員番号 21 ~ は平社員である
    //役員の報酬は 2000万
    //部長の報酬は 1000万
    //平社員の報酬は 500万 である
    //返値のMap<String,Integer> は、String=名前、Integer=報酬 の給与明細である。
    //上記の条件のもとに、引数の社員リストから給与明細を作成し、返すこと。
    // ※ただし、1000万 -> 1000で良い。

    public Map<String,Integer> createSalaryList(Map<Integer,String> empolyes){
        //TODO 実装しろ
        return new HashMap<String,Integer>();
    }

}
