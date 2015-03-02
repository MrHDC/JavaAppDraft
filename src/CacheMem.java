import org.apache.commons.collections4.map.LRUMap;

/**
 * Created by Hoang on 2/28/2015.
 */
public class CacheMem<K, T> {
    private LRUMap cache;
    public CacheMem(int maxsize){
        cache = new LRUMap(maxsize);
    }

}
