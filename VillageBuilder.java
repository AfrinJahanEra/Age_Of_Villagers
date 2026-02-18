class VillageBuilder {
    private CompositeObject village;

    public VillageBuilder() {
        village = new CompositeObject("Village");
    }

    public VillageBuilder buildHouse(String type) {
        CompositeObject house = new CompositeObject(type + " House");
        house.add(ShapeFactory.createShape(type));
        house.add(ShapeFactory.createShape(type));
        village.add(house);
        return this;
    }

    public VillageBuilder buildTree(String type) {
        CompositeObject tree = new CompositeObject(type + " Tree");
        tree.add(ShapeFactory.createShape(type + "Leaf"));
        tree.add(ShapeFactory.createShape(type + "Leaf"));
        village.add(tree);
        return this;
    }

    public VillageBuilder buildWaterSource(String type) {
        CompositeObject water = new CompositeObject(type);
        water.add(ShapeFactory.createShape(type + "Water"));
        water.add(ShapeFactory.createShape(type + "Water"));
        village.add(water);
        return this;
    }

    public CompositeObject getVillage() {
        return village;
    }
}
