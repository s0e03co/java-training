class Main{

    //method
    //Method signature --> <AccessModifier> returnType methodName (method arguments)
    //method arguments -->
    //method body

    public static void main(String[] arguments){
        System.out.println("Hello World");
        //<Type> variablename =
        User user = new User();
        // object creation
        User usha = new User();
        //

        System.out.println(user.name + ":" + user.age); //null :0
        System.out.println(usha.name + ":" + usha.age); //null: 0

        user.name= "random-name";
        user.age= 40;

        usha.name = "usha";

        System.out.println(user.name + ":" + user.age); //random-name: 40
        System.out.println(usha.name + ":" + usha.age); //usha: 0

    }
}