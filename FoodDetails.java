public class FoodDetails {
    public String rice;
    public int price;

    public FoodDetails() {
        rice="vegBiryani";
        price=300;
    }

    @Override
    public String toString() {
        return "FoodDetails{" +
                "rice='" + rice + '\'' +
                ", price=" + price +
                '}';
    }
}
