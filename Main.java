import java.util.*;
public class Main {
    public static void main(String[] args) {

        VillageBuilder builder1 = new VillageBuilder();
        CompositeObject village1 =
                builder1.buildHouse("Brick")
                        .buildTree("Mango")
                        .buildWaterSource("Pool")
                        .getVillage();

        VillageBuilder builder2 = new VillageBuilder();
        CompositeObject village2 =
                builder2.buildHouse("Mud")
                        .buildTree("Banana")
                        .buildWaterSource("Pond")
                        .getVillage();

        CostVisitor costVisitor = new CostVisitor();
        village1.accept(costVisitor);
        System.out.println("Village 1 Cost: " + costVisitor.getTotalCost());

        ResourceVisitor resourceVisitor = new ResourceVisitor();
        village1.accept(resourceVisitor);
        System.out.println("Village 1 Resources: " + resourceVisitor.getResources());

        ReportVisitor reportVisitor = new ReportVisitor();
        village1.accept(reportVisitor);
        System.out.println(reportVisitor.getReport());

        CostVisitor costVisitor2 = new CostVisitor();
        village2.accept(costVisitor2);
        System.out.println("Village 2 Cost: " + costVisitor2.getTotalCost());
    }
}
