/**
 * Currency.java
 * 
 * Superclass for all currencies, ex things like Dollar and Pound.
 * @author Sohan Shingade
 * 
 */
public abstract class Currency {
    
    private int note;
    private int coin; 
    /**
     * Default no-args constructor for Currency.
     */
    public Currency() {
        setNote(0);
        setCoin(0);    
    }
    /**
     * Constructor for Currency.
     * @param amount - double value for amount of currency
     */
    public Currency(double amount) {
        setNote((int) (Math.floor(amount)));
        setCoin((int) (Math.round((amount - getNote())*100)));
    }
    /**
     * Copy constructor for Currency.
     * @param c - Currency object to be copied
     */
    public Currency(Currency c) {
        setNote(c.getNote());
        setCoin(c.getCoin());
    }
    /**
     * Destructor for Currency.
     */
    public void destruct() {
        setNote(0);
        setCoin(0);
    }
    /**
     * Getter for coin value
     * @return the value of coin of currency
     */
    public int getCoin() {
        return coin;
    }
    /**
     * Setter for note value
     * @param coin - new value to set coin to
     */
    public void setCoin(int coin) {
        this.coin = coin;
    }

    /**
     * Getter for note value
     * @return value of note of currency
     */
    public int getNote() {
        return note;
    }
    /**
     * Setter for note value
     * @param note - new value to set note to
     */
    public void setNote(int note) {
        this.note = note;
    }
    /**
     * Add a Currency object to this Currency object
     * @param c - Currency to add to this Currency object
     */
    public void add(Currency c) {
        try{
            if(c.getClass() != this.getClass()){
                throw new Exception("Currency type mismatch");
            }
            else {
                setNote(getNote() + c.getNote());
                setCoin(getCoin() + c.getCoin());
            }
        }
        catch(Exception e){
            System.out.println("Invalid Addition");
        }
    }

    /**
     * Subtract currency from this Currency object
     * @param c - Currency to subtract from this Currency object
     */
    public void subtract(Currency c) {
        try {
            if (c.getClass() != this.getClass()) {
                throw new Exception("Currency type mismatch");
            }
            if (!isGreater(c)) {
                throw new Exception("Invalid Subtraction");
            }
            else {
                double temp = getNote()*(getCoin()/100.0) - c.getNote()*(getCoin()/100.0);
                setNote((int)Math.floor(temp));
                //set only to decimal part of temp
                setCoin((int)Math.round((temp - getNote())*100));
            }
        } catch (Exception e) {
            System.out.println("Invalid Subtraction");
        }
        
    }
    /**
     * Compare this Currency object to another Currency object
     * @param c - Currency to compare to this Currency object
     * @return true if this Currency object is equal to currency values of other object
     */
    public boolean isEqual(Currency c) {
        try {
            if (c.getClass() != this.getClass()) {
                throw new Exception("Currency type mismatch");
            }
            return (getNote() == c.getNote() && getCoin() == c.getCoin());
        } catch (Exception e) {
            System.out.println("Invalid Equality");
            return false;
        }
    }

    /**
     * Compare this Currency object to another Currency object
     * @param c - Currency to compare to this Currency object
     * @return true if this Currency object is greater than currency values of other object
     */
    public boolean isGreater(Currency c) {
        try {
            if (c.getClass() != this.getClass()) {
                throw new Exception("Currency type mismatch");
            }
            if (getNote() > c.getNote()) {
                return true;
            } else if (getNote() == c.getNote() && getCoin() > c.getCoin()) {
                return true;
            } else {
                return false;
            }
        } catch (Exception e) {
            System.out.println("Invalid Comparison");
            return false;
        }
    }
    /**
     * Prints the current note and coin values of currency
     */
    public void print() {
        System.out.print(getNote() + "." + getCoin());
    }


}