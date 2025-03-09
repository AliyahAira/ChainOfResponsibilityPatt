class HazardousWasteCollector implements WasteCollector {
    private WasteCollector nextCollector;

    @Override
    public void setNextCollector(WasteCollector next) {
        this.nextCollector = next;
    }

    @Override
    public void collectWaste(WasteContainer container) {
        if (container.getType().equalsIgnoreCase("hazardous") && container.isFull()) {
            System.out.println(" Handling and disposing of hazardous waste...");
            container.emptyContainer();
        } else if (nextCollector != null) {
            nextCollector.collectWaste(container);
        } else {
            System.out.println(" No suitable collector found!\n");
        }
    }
}
