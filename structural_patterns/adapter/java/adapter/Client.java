import src.Adapter;
import src.LegacyService;
import src.Target;

public class Client {
    public static void main(String[] args) {
        LegacyService legacyService = new LegacyService();
        Target target = new Adapter(legacyService);

        target.request(); // Client can call the method on the Target interface
        // Specific request being called on LegacyService.
    }
}
