package congloe.com.crunchify;

import org.apache.commons.collections4.MapIterator;
import org.apache.commons.collections4.map.LRUMap;

import java.util.ArrayList;
import java.util.Collection;

public class CrunchifyInMemoryCache<K, T> {
    private long timeToLive;
    private LRUMap crunchifyCacheMap;

    protected class CrunchifyCacheObject {
        public long lastAccessed = System.currentTimeMillis();
        public T value;

        protected CrunchifyCacheObject(T value) {
            this.value = value;
        }
    }

    public CrunchifyInMemoryCache(long crunchifyTimeToLive, final long crunchifyTimerInterval, int maxItems){
        this.timeToLive = crunchifyTimeToLive * 1000;
        crunchifyCacheMap = new LRUMap(maxItems);
        if (timeToLive > 0 && crunchifyTimerInterval >0){
            Thread t = new Thread(new Runnable() {
                @Override
                public void run() {
                    while (true){
                        try {
                            Thread.sleep(crunchifyTimerInterval*1000);
                        }catch (InterruptedException ex) {

                        }
                        cleanup();
                    }
                }
            });
            t.setDaemon(true);
            t.start();
        }
    }

    public void put(K key, T value){
        synchronized (crunchifyCacheMap){
            crunchifyCacheMap.put(key, new CrunchifyCacheObject(value));
        }
    }

    public T get(K key){
        synchronized (crunchifyCacheMap){
            CrunchifyCacheObject c = (CrunchifyCacheObject) crunchifyCacheMap.get(key);
            if (c==null){
                return null;
            }else {
                c.lastAccessed = System.currentTimeMillis();
                return c.value;
            }
        }
    }

    public void remove(K key){
        synchronized (crunchifyCacheMap){
            crunchifyCacheMap.remove(key);
        }
    }

    public int size(){
        synchronized (crunchifyCacheMap){
            return crunchifyCacheMap.size();
        }
    }

    public T getFirst(){
        synchronized (crunchifyCacheMap){
            K key = (K) crunchifyCacheMap.firstKey();
            CrunchifyCacheObject object = (CrunchifyCacheObject) crunchifyCacheMap.get(key);
            if (object==null){
                return null;
            }else {
                object.lastAccessed = System.currentTimeMillis();
                return object.value;
            }

        }
    }

    public void cleanup(){
//        long now = System.currentTimeMillis();
//        ArrayList<K> deleteKey = null;
//
//        synchronized (crunchifyCacheMap){
//            MapIterator irt = crunchifyCacheMap.mapIterator();
//
//            deleteKey = new ArrayList<K>(crunchifyCacheMap.size()/2+1);
//            K key = null;
//            CrunchifyCacheObject c = null;
//
//            while (irt.hasNext()){
//                key = (K) irt.next();
//                c= (CrunchifyCacheObject) irt.getValue();
//
//                if (c!=null && (now > (timeToLive + c.lastAccessed))){
//                    deleteKey.add(key);
//                }
//            }
//        }
//
//        for (K key : deleteKey){
//            synchronized (crunchifyCacheMap){
//                crunchifyCacheMap.remove(key);
//            }
//        }
        synchronized (crunchifyCacheMap){
            crunchifyCacheMap.clear();
        }
    }
}
