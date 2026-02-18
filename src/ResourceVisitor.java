import java.util.*;

class ResourceVisitor implements Visitor {
    private Map<String, Integer> resources = new HashMap<>();

    @Override
    public void visitShape(Shape shape) {
        resources.put(shape.getName(), resources.getOrDefault(shape.getName(), 0) + 1);
    }

    @Override
    public void visitComposite(CompositeObject composite) {}

    public Map<String, Integer> getResources() {
        return resources;
    }
}