interface WasteCollector {
    void setNextCollector(WasteCollector next);
    void collectWaste(WasteContainer container);
}