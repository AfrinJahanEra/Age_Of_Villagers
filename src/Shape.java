class Shape implements VillageComponent {
    private String name;
    private int cost;

    public Shape(String name, int cost) {
        this.name = name;
        this.cost = cost;
    }

    public String getName() {
        return name;
    }

    public int getCost() {
        return cost;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visitShape(this);
    }
}