public class App
{
    public static void main(String[] args)
    {
        System.out.println(SHA256Helper.hash("Hello world!"));
        System.out.println(SHA256Helper.hash(SHA256Helper.hash("Hello world!")));
        System.out.println(SHA256HelperBasic.hash(SHA256HelperBasic.hash("Hello world!")));
    }
}