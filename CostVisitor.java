class CostVisitor implements Visitor {
    private int totalCost = 0;

    @Override
    public void visitShape(Shape shape) {
        totalCost += shape.getCost();
    }

    @Override
    public void visitComposite(CompositeObject composite) {}

    public int getTotalCost() {
        return totalCost;
    }
}