public class FoodTest {
    public static void main(String[] args) {
        FoodDetails food1=new FoodDetails();
        food1.rice="vegPulav";
        food1.price=150;

        Family family=new Family("bindu","sarika","pulav",food1);
        System.out.println("FamilyFood"+family);
        Family family1=new Family("nani","aruna","vegBiryani");
        System.out.println("FoodDetails"+family1);


    }
    }

