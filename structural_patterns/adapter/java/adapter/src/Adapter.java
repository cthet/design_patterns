package src;


public class Adapter implements Target {
    private LegacyService legacyService;

    public Adapter(LegacyService legacyService) {
        this.legacyService = legacyService;
    }

    @Override
    public void request() {
        legacyService.specificRequest();
    }
}
