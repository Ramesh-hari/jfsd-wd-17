package module_1.day.nine.oops.object;

public class ObjectDemo {
    public static void main(String[] args) {
        User user1 = new User("john", 19);
        User user2 = new User("john", 19);

//        System.out.println(user1);
//        System.out.println(user1.equals(user2));
        System.out.println(user1.hashCode());
        System.out.println(user2.hashCode());


    }
}
