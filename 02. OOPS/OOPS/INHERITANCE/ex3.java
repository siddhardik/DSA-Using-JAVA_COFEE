class Vehicle{
    String colour;
    private int number;
    void set(int number)
    {
        number=number;  // ha😂😂😂😂😂😂hahahaha
    }
    int get()
    {
        return number;
    }
}

class ex3 extends Vehicle{
    public static void main(String[] args) {
        Vehicle v = new Vehicle();
        v.colour = "white";
        v.set(1010) ;
        System.out.println(v.colour + " " + v.get());
    }
}