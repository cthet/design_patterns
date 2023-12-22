package src.adapter;

public class Client {
    public static void main(String[] args) {
        LegacyService legacyService = new LegacyService();
        Target target = new Adapter(legacyService);

        target.request(); // src.adapter.src.media_adapter.Client can call the method on the Target interface
        // Specific request being called on LegacyService.
    }
}
