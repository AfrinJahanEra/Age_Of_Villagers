import java.util.*;

class CompositeObject implements VillageComponent {
    private String name;
    private List<VillageComponent> children = new ArrayList<>();

    public CompositeObject(String name) {
        this.name = name;
    }

    public void add(VillageComponent component) {
        children.add(component);
    }

    public List<VillageComponent> getChildren() {
        return children;
    }

    public String getName() {
        return name;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visitComposite(this);
        for (VillageComponent c : children) {
            c.accept(visitor);
        }
    }
}