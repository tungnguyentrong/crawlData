package retrofit.biliion.com.jsoupgetdata.data;

import java.util.List;

/**
 * Created by framgia on 16/09/16.
 */
public class ProductResponse {
    private int LastId ;
    private int TotalCounts ;
    private  int TotalRemaining ;
    private List<Product> Items;


    public void setItems(List<Product> items) {
        Items = items;
    }

    public void setLastId(int lastId) {
        LastId = lastId;
    }

    public void setTotalCounts(int totalCounts) {
        TotalCounts = totalCounts;
    }

    public void setTotalRemaining(int totalRemaining) {
        TotalRemaining = totalRemaining;
    }

    public int getLastId() {
        return LastId;
    }

    public int getTotalCounts() {
        return TotalCounts;
    }

    public int getTotalRemaining() {
        return TotalRemaining;
    }

    public List<Product> getItems() {
        return Items;
    }
}
