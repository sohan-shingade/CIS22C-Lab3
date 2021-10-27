public class Dollar extends Currency{
    private String name = "Dollar";

    /**
     * No args constructor
     */
    public Dollar(){
        super();
    }

    /**
     * Constructor with amount parameter
     * @param amount
     */
    public Dollar(double amount){
        super(amount);
    }

    /**
     * Copy constructor for Dollar
     * @param p
     */
    public Dollar(Dollar d){
        super(d);
    }
    /**
     * Gets the name of Dollar
     * @return
     */
    public String getName() {
        return name;
    }
   
    @Override
    public void print(){
        super.print();
        System.out.println(" " + name);
    }

}
