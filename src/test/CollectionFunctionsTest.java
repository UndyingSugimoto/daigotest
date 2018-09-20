import org.junit.Test;
import org.junit.runner.RunWith;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.junit.Assert.*;

public class CollectionFunctionsTest {

    @Test
    public void arrayToList() {
        String[] val = {"a","b","c","d","e"};
        CollectionFunctions tag = new CollectionFunctions();
        List<String> result = tag.arrayToList(val);
        int index = 0;
        if(result.size() != val.length){
            fail("長さが違う");
        }
        for (String elm: val){
            String tagElm = result.get(index);
            assertEquals(elm,tagElm);
            index++;
        }
    }

    @Test
    public void generateMap() {
        String[] names = {"a","b","c","d","e"};
        Integer[] nums = {1,2,3,4,5};

        CollectionFunctions tag = new CollectionFunctions();
        Map<Integer,String> rtn = tag.generateMap(nums,names);
        Integer index = 0;
        for (Integer num:nums
             ) {
            String act =  rtn.get(num);
            String expect = names[index];
            assertEquals(expect,act);
            index++;
        }
    }

    @Test
    public void connectStrings() {
        CollectionFunctions tag = new CollectionFunctions();
        List<String> param =  new ArrayList<>();
        param.add("a");
        param.add("b");
        param.add("c");
        param.add("d");
        String act = tag.connectStrings(param);
        String expect = "abcd";
        assertEquals(expect,act);
    }

    @Test
    public void createSalaryList() {
        CollectionFunctions tag = new CollectionFunctions();
        Map<Integer,String> empolyes = new HashMap<>();
        empolyes.put(1,"フェイカー");
        empolyes.put(2,"バン");
        empolyes.put(10,"ウルフ");
        empolyes.put(11,"ダブルリフト");
        empolyes.put(15,"フロッゲン");
        empolyes.put(19,"アフロムー");
        empolyes.put(20,"JPKRUG");
        empolyes.put(21,"Evi");
        empolyes.put(100,"KAZUTA");
        empolyes.put(2000,"ケイン・コスギ");
        empolyes.put(3000,"トリンダメア");

        Map<String,Integer> rtn = tag.createSalaryList(empolyes);

        assertEquals(2000,empolyes.get("フェイカー"));
        assertEquals(2000,empolyes.get("バン"));
        assertEquals(2000,empolyes.get("ウルフ"));

        assertEquals(1000,empolyes.get("ダブルリフト"));
        assertEquals(1000,empolyes.get("フロッゲン"));
        assertEquals(1000,empolyes.get("アフロムー"));
        assertEquals(1000,empolyes.get("JPKRUG"));

        assertEquals(500,empolyes.get("Evi"));
        assertEquals(500,empolyes.get("KAZUTA"));
        assertEquals(500,empolyes.get("ケイン・コスギ"));
        assertEquals(500,empolyes.get("トリンダメア"));

        assertEquals(null,empolyes.get("hoge"));


    }
}
