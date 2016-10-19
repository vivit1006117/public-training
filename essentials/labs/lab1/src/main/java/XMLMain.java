import com.hazelcast.client.HazelcastClient;
import com.hazelcast.core.Hazelcast;
import com.hazelcast.core.HazelcastInstance;

<<<<<<< HEAD
public class XMLMain {
    public static void main(String[] args) {
        HazelcastInstance hz = Hazelcast.newHazelcastInstance();
=======
// https://github.com/hazelcast/hazelcast/issues/9081

public class XMLMain {
    public static void main(String[] args) {
    	HazelcastInstance hz = Hazelcast.newHazelcastInstance();
>>>>>>> upstream/master
        HazelcastInstance client = HazelcastClient.newHazelcastClient();
    }
}
