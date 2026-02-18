class ReportVisitor implements Visitor {
    private StringBuilder report = new StringBuilder();

    @Override
    public void visitShape(Shape shape) {
        report.append("Shape: ").append(shape.getName()).append("\n");
    }

    @Override
    public void visitComposite(CompositeObject composite) {
        report.append("Object: ").append(composite.getName()).append("\n");
    }

    public String getReport() {
        return report.toString();
    }
}