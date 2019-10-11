/**
 *
 * @author kris
 */
package edu.stud.manish;

/**
 *
 * @author kris
 */
public interface CObject {
    /**
     * Object properties are:
     * PrizeDesc    - a full name of the prize
     * value        - integer value contain a value of the gift card
     * size         - character indicate size of the product, s-small m-medium l-large
     * sold         - a flag used to indecate sold product
     */

    /**
     * Get a full name of the product.
     * @return string, prize full name.
     */
    abstract String getDesc();
    
    /**
     * Get the value of the gift card.
     * @return interger, value of the gift card.
     */
    abstract int getValue();
    
    /**
     * Get the size of the product.
     * @return string, s-small m-medium l-large.
     */
    abstract String getSize();
    
    /**
     * Get selling status of the product.
     * @return boolean, true-sold, false-unsold.
     */
    abstract boolean isSold();
    
    abstract void setValue(int value);
    
    abstract void setSold(boolean sold);
    
    abstract void setSize(String size);
}
