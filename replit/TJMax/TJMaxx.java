package TJMax;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;



/*
 * represents TJMaxx store class.
 * https://tjmaxx.com/
 */
public class TJMaxx {

    /*
     * Private ArrayList to hold regular Item objects
     * and OnSaleItem objects that represent items that sell in TJMaxx
     */
    private ArrayList<Item> regularItems;
    private ArrayList<OnSaleItem> onSaleItems;

    /*
     * Public no-args constructor - Instantiates regularItems and onSaleItems lists
     * as new ArrayList
     */
    public TJMaxx() {
        //TODO

        regularItems= new ArrayList<>();
        onSaleItems = new ArrayList<>();
    }

    /*
     * adds an item object to regularItems list
     * @param item
     */
    public void addRegularItem(Item item) {

        regularItems.add(item);

    }

    /*
     * adds OnSaleItem object to onSaleItems list
     * @param item
     */
    public void addOnSaleItem(OnSaleItem item) {

        onSaleItems.add(item);

    }

    /*
     * getter for regularItems
     * @return
     */
    public ArrayList<Item> getRegularItems() {
        //TODO change from null
        return regularItems;
    }

    /*
     * getter for onSaleItems
     * @return
     */
    public ArrayList<OnSaleItem> getOnSaleItems() {
        //TODO change from null
        return onSaleItems;
    }

    /*
     * return count of regularItem object
     * @return
     */
    public int regularItemsCount() {
        //TODO change from -1
        return regularItems.size();
    }

    /*
     * returns count of onSaleItems in TJ Maxx
     * @return
     */
    public int onSaleItemsCount() {
        //TODO change from -1
        return onSaleItems.size();
    }

    /*
     * returns the name of each item in TJ Maxx starting
     * from regular item then onSaleItems
     * @return
     */
    public ArrayList<String> getAllItemNames() {

      String[] allNames = new String[regularItems.size() + onSaleItems.size()];
        for (int i = 0; i < regularItems.size(); i++) {
            allNames[i] = regularItems.get(i).getName();
        }

        for (int i = regularItems.size(); i < regularItems.size() + onSaleItems.size(); i++) {
            allNames[i] = onSaleItems.get(i).getName();
        }
        ArrayList<String> allNamesList = new ArrayList<>();
              allNamesList.addAll(  Arrays.asList(allNames));

        return allNamesList;
    }

    /*
     * gets catalog number and returns price for the item
     * it will search for the item both regularItems and onSaleItems
     * @param catalogNumber
     * @returns 0.0 if product cannot be found with that catalognumber
     */
    public double getItemPrice(int catalogNumber)
    {
            for (Item item : regularItems) {
            if (item.getCatalogNumber() == catalogNumber) {
                return item.getPrice();
            }
        }


         for (OnSaleItem item : onSaleItems) {
             if (item.getCatalogNumber() == catalogNumber) {
                 return item.getPrice();
             }
         }

        return 0.0;
    }

    /**
     * accepts a name then searches
     * amoung onSaleItems. Once it finds, the method will return
     * that OnSaleItem object
     * @param name
     * @return
     */
    public OnSaleItem getOnSaleItem(String name)
    {
        for (OnSaleItem item : onSaleItems) {
            if(item.getName().equals(name)){
                return item;
            }

        }

        return null;
    }

    /**
     * removes the item with matching catalogNumber
     * from both regularItems and onSaleItems.
     * Does nothing if not found
     * @param catalogNumber
     */
    public void removeItem(int catalogNumber) {

        for (Item item : regularItems) {
            if(item.getCatalogNumber()== catalogNumber){ regularItems.remove(item);  }
    }
}
    /**
     * - it accepts a catalog number and finds that item
     * among regularItems and onSaleItems
     * - if it finds the item:
     *   - decrease the count of the Item by 1
     *   - if count reaches 0 after decrementing then remove the product(call removeItem method)
     *
     * @param catalogNumber
     */
    public void buyItem(int catalogNumber) {




    }


}