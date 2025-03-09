class WasteContainer {
    private String type;
    private boolean isFull;

    public WasteContainer(String type) {
        this.type = type;
        this.isFull = false; // Initially empty
    }

    public String getType() {
        return type;
    }

    public boolean isFull() {
        return isFull;
    }

    public void setFull(boolean isFull) {
        this.isFull = isFull;
    }

    public void emptyContainer() {
        this.isFull = false;
        System.out.println(type + " waste container emptied!\n");
    }
}