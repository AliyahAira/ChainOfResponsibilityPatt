class RecyclableWasteCollector implements WasteCollector {
    private WasteCollector nextCollector;

    @Override
    public void setNextCollector(WasteCollector next) {
        this.nextCollector = next;
    }

    @Override
    public void collectWaste(WasteContainer container) {
        if (container.getType().equalsIgnoreCase("recyclable") && container.isFull()) {
            System.out.println(" Collecting and recycling waste...");
            container.emptyContainer();
        } else if (nextCollector != null) {
            nextCollector.collectWaste(container);
        } else {
            System.out.println(" No suitable collector found!\n");
        }
    }
}