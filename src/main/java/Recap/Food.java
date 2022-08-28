package Recap;

public abstract class Food {
    private String[] ingredients;
    private int index;
    public Food(){
        System.out.println("All food will be prepared");
    }

    public String[] getIngredients() {
        return ingredients;
    }

    public void addIngredients(final String ingredient){
        ingredients[index] = ingredient;
        index++;
    }

    public void setIngredients(final String[] ingredients) {
        this.ingredients = ingredients;
    }

    public abstract void mixIngredients();
}
