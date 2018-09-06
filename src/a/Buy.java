
package a;

public class Buy implements Comparable<Buy> {

    private Integer buyPrice;
    private Integer buyVolume;
    private Integer buyCounter;


    public Buy (int buyPrice, int buyVolume, int buyCounter) {
        this.buyPrice = buyPrice;
        this.buyVolume = buyVolume;
        this.buyCounter=buyCounter;
       
    }
 @Override
    public String toString() {
              return "BUY " + buyVolume + "@" +buyPrice  ;
    }
   
  @Override
 public int compareTo(Buy s){
    if(s.buyPrice.compareTo(this.buyPrice)==0)
         return this.buyCounter.compareTo(s.buyCounter);
     else return s.buyPrice.compareTo(this.buyPrice); 
 }
    /**
     * @return the buyPrice
     */
    public int getBuyPrice() {
        return buyPrice;
    }

    public void setBuyPrice(int buyPrice) {
        this.buyPrice = buyPrice;
    }

    /**
     * @return the buyVolume
     */
    public int getBuyVolume() {
        return buyVolume;
    }

    /**
     * @param buyVolume the buyVolume to set
     */
    public void setBuyVolume(int buyVolume) {
        this.buyVolume = buyVolume;
    }

       /**
     * @return the buyCounter
     */
    public int getBuyCounter() {
        return buyCounter;
    }

    /**
     * @param buyCounter the buyCounter to set
     */
    public void setBuyCounter(int buyCounter) {
        this.buyCounter = buyCounter;
    }

   
   
}
 
