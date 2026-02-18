interface Visitor {
    void visitShape(Shape shape);
    void visitComposite(CompositeObject composite);
}