import java.util.*;

class DNSEntry {
    String ip;
    long expiryTime;

    DNSEntry(String ip, int ttl) {
        this.ip = ip;
        this.expiryTime = System.currentTimeMillis() + ttl * 1000;
    }

    boolean isExpired() {
        return System.currentTimeMillis() > expiryTime;
    }
}

class DNSCache {

    HashMap<String, DNSEntry> cache = new HashMap<>();

    public String resolve(String domain) {

        if (cache.containsKey(domain)) {

            DNSEntry entry = cache.get(domain);

            if (!entry.isExpired()) {
                return "Cache HIT: " + entry.ip;
            }

            cache.remove(domain);
        }

        String ip = queryUpstream(domain);
        cache.put(domain, new DNSEntry(ip, 300));

        return "Cache MISS: " + ip;
    }

    private String queryUpstream(String domain) {
        return "172.217.14.206";
    }
}

public class Problem3 {

    public static void main(String[] args) {

        DNSCache dns = new DNSCache();

        System.out.println(dns.resolve("google.com"));
        System.out.println(dns.resolve("google.com"));

    }
}