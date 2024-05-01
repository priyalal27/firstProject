public class first {
 
    
    public static void main(String[] args) {

        first obj1 = new first();
        obj1.test_object();
        System.out.println("Hello");
        String value =first.name();
        System.out.println(value);

    }

    public static String name(){
        return "test";
    }
}

public void test_object(){
    System.out.println("Cheking Method by creating class Object");
}
// Objects are instances/ refernces of classes 