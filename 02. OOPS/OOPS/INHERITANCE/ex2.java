class Vehicle{
    String colour;
    private int number;
}

class ex2 extends Vehicle{
    public static void main(String[] args) {
        Vehicle v = new Vehicle();
        v.colour = "black";
        v.number = 8486;  //Error
        System.out.println(v.number + " " + v.colour);
    }
}