class WasteManagementSystem {
    private WasteCollector firstCollector;

    public WasteManagementSystem() {
        // Initialize chain
        this.firstCollector = new OrganicWasteCollector();
        WasteCollector recyclableCollector = new RecyclableWasteCollector();
        WasteCollector hazardousCollector = new HazardousWasteCollector();

        // Set up chain
        firstCollector.setNextCollector(recyclableCollector);
        recyclableCollector.setNextCollector(hazardousCollector);
    }

    public void processWaste(WasteContainer container) {
        firstCollector.collectWaste(container);
    }
}