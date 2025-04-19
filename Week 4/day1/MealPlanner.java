package week4.day1.level2;

interface MealPlan {
    String getMealDescription();
}

class VegetarianMeal implements MealPlan {
    public String getMealDescription() {
        return "Vegetarian Meal with grains, vegetables, and dairy.";
    }
}

class VeganMeal implements MealPlan {
    public String getMealDescription() {
        return "Vegan Meal with plant-based ingredients only.";
    }
}

class KetoMeal implements MealPlan {
    public String getMealDescription() {
        return "Keto Meal with low carbs and high fats.";
    }
}

class HighProteinMeal implements MealPlan {
    public String getMealDescription() {
        return "High Protein Meal with lean meat, eggs, and legumes.";
    }
}

class Meal<T extends MealPlan> {
    private T mealType;

    public Meal(T mealType) {
        this.mealType = mealType;
    }

    public T getMealType() {
        return mealType;
    }
}

class MealGenerator {
    public static <T extends MealPlan> void generateMeal(Meal<T> meal) {
        System.out.println(meal.getMealType().getMealDescription());
    }
}

public class MealPlanner {
    public static void main(String[] args) {
        Meal<VegetarianMeal> vegMeal = new Meal<>(new VegetarianMeal());
        Meal<VeganMeal> veganMeal = new Meal<>(new VeganMeal());
        Meal<KetoMeal> ketoMeal = new Meal<>(new KetoMeal());
        Meal<HighProteinMeal> proteinMeal = new Meal<>(new HighProteinMeal());

        MealGenerator.generateMeal(vegMeal);
        MealGenerator.generateMeal(veganMeal);
        MealGenerator.generateMeal(ketoMeal);
        MealGenerator.generateMeal(proteinMeal);
    }
}

