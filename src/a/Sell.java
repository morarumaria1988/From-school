
package a;

public class Sell implements Comparable<Sell> {
    private Integer sellPrice;
    private Integer  sellVolume;
    private Integer sellCounter;
public Sell(int sellVolum) {
        this.sellVolume = sellVolume;
    }
    public Sell(int sellPrice, int sellVolume, int sellCounter) {
        this.sellPrice = sellPrice;
        this.sellVolume = sellVolume;
        this.sellCounter = sellCounter;
    }

    @Override
    public String toString() {
        return "SELL " + sellVolume  + "@" + sellPrice ;
    }
  @Override
 public int compareTo(Sell s){
     if(this.sellPrice.compareTo(s.sellPrice)==0)
         return this.sellCounter.compareTo(s.sellCounter);
     else return this.sellPrice.compareTo(s.sellPrice);
     }
 
 
    /**
     * @return the sellPrice
     */
    public int getSellPrice() {
        return sellPrice;
    }

    /**
     * @param sellPrice the sellPrice to set
     */
    public void setSellPrice(int sellPrice) {
        this.sellPrice = sellPrice;
    }

    /**
     * @return the sellVolume
     */
    public int getSellVolume() {
        return sellVolume;
    }

    /**
     * @param sellVolume the sellVolume to set
     */
    public void setSellVolume(int sellVolume) {
        this.sellVolume = sellVolume;
    }

    /**
     * @return the OriginalSellInput
     */
    public int getSellCounter() {
        return sellCounter;
    }

    /**
     * @param OriginalSellInput the OriginalSellInput to set
     */
    public void setSellCounter(int sellCounter) {
        this.sellCounter = sellCounter;
    }
   
}
