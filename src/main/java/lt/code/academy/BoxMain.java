package lt.code.academy;

public class BoxMain {
    public static void main(String[] args) {
        Box box = new Box();
        box.setOb(500);
        if(box.getOb() instanceof Integer intValue) {
            System.out.println(intValue);
        }
        //int value = (int) box.getOb();

        box.setOb("500");

        if(box.getOb() instanceof String stringValue) {
            System.out.println(stringValue);
        }
        GenericBox<Integer>integerGenericBox = new GenericBox<>();
        integerGenericBox.setObj(565656);
        integerGenericBox.setObj(11111);
       // integerGenericBox.setObj("55"); taip negalima

        GenericBox<String>stringGenericBox = new GenericBox<>();
        stringGenericBox.setObj("Belekas");
        stringGenericBox.setObj("111111111");

        GenericBox<User> userGenericBox = new GenericBox<>();
        userGenericBox.setObj(new User("Petras"));

      //  integerGenericBox = stringGenericBox; taip negalima


    }
}