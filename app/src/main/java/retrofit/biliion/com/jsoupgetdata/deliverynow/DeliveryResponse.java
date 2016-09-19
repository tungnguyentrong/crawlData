package retrofit.biliion.com.jsoupgetdata.deliverynow;

import java.util.List;

/**
 * Created by framgia on 16/09/19.
 */
public class DeliveryResponse {
    // this include object filters and list Object DeliveryItems

    private Filter Filters;
    private List<DeliveryItems> ListResult;
    private int TotalCount ;

    public void setTotalCount(int totalCount) {
        TotalCount = totalCount;
    }

    public int getTotalCount() {
        return TotalCount;
    }

    public void setFilters(Filter filters) {
        Filters = filters;
    }

    public Filter getFilters() {
        return Filters;
    }

    public List<DeliveryItems> getListResult() {
        return ListResult;
    }

    public void setListResult(List<DeliveryItems> listResult) {
        ListResult = listResult;
    }

}
