public class Family {
    public String name;
    public String motherName;
    public String foodItem;
    public FoodDetails food;

    public Family(String name, String motherName, String foodItem, FoodDetails food) {
        this.name = name;
        this.motherName = motherName;
        this.foodItem = foodItem;
        this.food = food;
    }

    public Family(String name, String motherName, String foodItem) {
        this(name, motherName, foodItem, new FoodDetails());
    }

    @Override
    public String toString() {
        return "FamilyFood{" +
                "name='" + name + '\'' +
                ", motherName='" + motherName + '\'' +
                ", foodItem='" + foodItem + '\'' +
                ", food=" + food +
                '}';
    }
}
