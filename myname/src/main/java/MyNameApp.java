import com.google.gson.Gson;

public class MyNameApp {
    public static void main(String[] args) {
        Person person = new Person();
        person.setName("Tatiana");
        person.setLastName("Zayarnyuk");
        Gson gson = new Gson();
        System.out.println(gson.toJson(person));
    }
}
