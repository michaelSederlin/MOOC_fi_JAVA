
public class Apartment {

    private int rooms;
    private int squares;
    private int pricePerSquare;

    public Apartment(int rooms, int squares, int pricePerSquare) {
        this.rooms = rooms;
        this.squares = squares;
        this.pricePerSquare = pricePerSquare;
    }
    
    public int getSquares() {
        return this.squares;
    }
    
    public int getPrice() {
        return this.pricePerSquare*this.squares;
    }
    
    public boolean largerThan(Apartment otherApartment) {
        if (otherApartment.getSquares() < this.getSquares()) {
            return true; 
        }
        return false; 
    }
    
    public int priceDifference(Apartment otherApartment) {
        int diff = otherApartment.getPrice() - this.getPrice(); 
        if (diff < 0) {
            return -diff;
        } else {
            return diff;
        }
    }
    
    public boolean moreExpensiveThan(Apartment otherApartment) {
        if (this.getPrice() > otherApartment.getPrice()) {
            return true;
        } else {
            return false;
        }
    }
    

}
