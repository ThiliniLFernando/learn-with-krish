import java.util.Map;

public class Main {
 public static void main(String []args) {
	 CacheManager cacheManager = CacheManager.getCacheManager();
	 System.out.println(cacheManager);
	 Map<Object, Object> cache = cacheManager.getCache();
	 cache.put("user_name", "John");
	 
	 CacheManager cacheManager1 = CacheManager.getCacheManager();
	 System.out.println(cacheManager1);
	 Map<Object, Object> cache1 = cacheManager1.getCache();
	 cache1.put("user_name", "Katharin");
	 
	 Map<Object, Object> cache2 = cacheManager1.getCache();
	 System.out.println(cache2.get("user_name"));
 }
}