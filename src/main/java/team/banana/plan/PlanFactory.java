package team.banana.plan;

import java.util.ArrayList;
import java.util.List;

public class PlanFactory {

    private static PlanFactory instance;

    public static PlanFactory getInstance() {
        return instance;
    }

    List<Plan> plans = new ArrayList<>();

    public static void init() {
        instance = new PlanFactory();
    }

    private PlanFactory() {

    }

    public void addPlan(Plan plan) {
        plans.add(plan);
    }

    public void removePlan(Plan plan) {
        plans.remove(plan);
    }

    public void removePlan(int index) {
        plans.remove(index);
    }

    public Plan getPlan(int index){
        return plans.get(index);
    }

    public List<Plan> getPlans() {
        return plans;
    }
}
