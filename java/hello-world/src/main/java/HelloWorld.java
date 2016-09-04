public class HelloWorld {

    public static String hello(String name) {

        if (name == null || name == "") {
            return "Hello, World!";
        } else {
            name = "Hello, " + name + "!";
            return name;
        }

    }

}
