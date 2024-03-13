public class HelloWorld {
    public int roll;
    public String name;
    public boolean passed;
    public HelloWorld(){//Constructor
        roll = 18;
        name = "Shamim";
        passed = true;
    }
    public HelloWorld(int roll , String name, boolean passed){//Constructor
        this.roll = roll;
        this.name = name;
        this.passed = passed;
    }

    public int getRoll() {
        return roll;
    }

    public boolean isPassed() {
        return passed;
    }

    // joto gulo Globally variable thakbe totogulo getter setter method hobe
    //  getter method
   public String getName(){
        return name;
    }
   /* public void setName(String n){//  n local name
        name = n; //  name global name
    }*/

    public void setPassed(boolean passed) {
        this.passed = passed;
    }

    public void setRoll(int roll) {
        this.roll = roll;
    }

    // setter method
   public void setName(String name){//  name local name
       this.name = name; //  this. means current class
   }
    public static void main(String[] args) {
        HelloWorld helloWorld = new HelloWorld();
        HelloWorld helloWorld2 = new HelloWorld(71,"SHU",true);
        helloWorld.setName("Hossain");
        helloWorld.setRoll(17);
        helloWorld.setPassed(false);
        System.out.println(helloWorld2.getName());
        System.out.println(helloWorld.getRoll());
        System.out.println(helloWorld2.isPassed());
    }
}


