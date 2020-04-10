package JavaCollectionAndHashCodeEquals;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;

// This class' object is used as key
// in the HashMap
class Key{
    int index;
    String Name;
    Key(int index, String Name){
        this.index = index;
        this.Name = Name;
    }

    @Override
    // A very bad implementation of hashcode
    // done here for illustrative purpose only
    public int hashCode(){
        return 5;
    }

    @Override
    // A very bad implementation of equals
    // done here for illustrative purpose only
    public boolean equals(Object obj){
        return false;
    }
}
////https://viettuts.vn/java/phuong-thuc-equals-va-hashcode-trong-java LINK
public class HashMapTest {
    public static void main(String[] args) {
        // 1 BUCKET CHỈ CHỨA 1 HASH
        Map<Key, String> cityMap = new HashMap<Key, String>();
        // làn đâu tiên gọi put nó chỉ gọi hashCode để sinh ra hash(mã băm) từ Key và tìm bucket để save key-value(entry)
        cityMap.put(new Key(1, "NY"),"New York City" );
        // làn thứ 2 gọi put gọi hashCode để sinh ra hash(mã băm) từ Key
        // nếu hashCode đả tồn tại vì nó sẽ gọi tiếp equals để check 2 key này có bâng nhau về mặc giá trị hay không
        //nếu true ghi đè lên entry củ
        // nếu false , insert thêm 1 key-value ở trong bucket có hash đó
        cityMap.put(new Key(2, "ND"), "New Delhi");
        cityMap.put(new Key(3, "NW"), "Newark");
        cityMap.put(new Key(4, "NP"), "Newport");

        System.out.println("size before iteration " + cityMap.size());
        Iterator<Key> itr = cityMap.keySet().iterator();
        while (itr.hasNext()){
            System.out.println(cityMap.get(itr.next()));
        }
        System.out.println("size after iteration " + cityMap.size());
    }

}

