class ShapeFactory {
    public static Shape createShape(String type) {
        if (type.equals("Brick")) return new Shape("Brick", 100);
        if (type.equals("Mud")) return new Shape("Mud", 60);
        if (type.equals("MangoLeaf")) return new Shape("MangoLeaf", 20);
        if (type.equals("BananaLeaf")) return new Shape("BananaLeaf", 15);
        if (type.equals("PoolWater")) return new Shape("PoolWater", 50);
        if (type.equals("PondWater")) return new Shape("PondWater", 40);
        return null;
    }
}
