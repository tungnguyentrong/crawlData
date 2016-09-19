package retrofit.biliion.com.jsoupgetdata.deliverynow;


public class Filter {

    private String keyword;
    private String categoryIds;
    private String cuisineIds;
    private String districtIds;
    private Integer pageIndex;
    private Integer pageSize;
    private Integer sortType;
    private Double lat;
    private Double _long;
    private String hasServiceFee;
    private String isFoodyDelivery;

    public Filter(String keyword, String categoryIds, String cuisineIds, String districtIds,
                  Integer pageIndex, Integer pageSize, Integer sortType, Double lat,
                  Double _long, String hasServiceFee, String isFoodyDelivery) {
        this.keyword = keyword;
        this.categoryIds = categoryIds;
        this.cuisineIds = cuisineIds;
        this.districtIds = districtIds;
        this.pageIndex = pageIndex;
        this.pageSize = pageSize;
        this.sortType = sortType;
        this.lat = lat;
        this._long = _long;
        this.hasServiceFee = hasServiceFee;
        this.isFoodyDelivery = isFoodyDelivery;
    }

    public String getKeyword() {
        return keyword;
    }


    public void setKeyword(String keyword) {
        this.keyword = keyword;
    }


    public String getCategoryIds() {
        return categoryIds;
    }


    public void setCategoryIds(String categoryIds) {
        this.categoryIds = categoryIds;
    }


    public String getCuisineIds() {
        return cuisineIds;
    }


    public void setCuisineIds(String cuisineIds) {
        this.cuisineIds = cuisineIds;
    }


    public String getDistrictIds() {
        return districtIds;
    }


    public void setDistrictIds(String districtIds) {
        this.districtIds = districtIds;
    }


    public Integer getPageIndex() {
        return pageIndex;
    }


    public void setPageIndex(Integer pageIndex) {
        this.pageIndex = pageIndex;
    }


    public Integer getPageSize() {
        return pageSize;
    }


    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }


    public Integer getSortType() {
        return sortType;
    }


    public void setSortType(Integer sortType) {
        this.sortType = sortType;
    }


    public Double getLat() {
        return lat;
    }


    public void setLat(Double lat) {
        this.lat = lat;
    }


    public Double getLong() {
        return _long;
    }


    public void setLong(Double _long) {
        this._long = _long;
    }


    public String getHasServiceFee() {
        return hasServiceFee;
    }


    public void setHasServiceFee(String hasServiceFee) {
        this.hasServiceFee = hasServiceFee;
    }


    public String getIsFoodyDelivery() {
        return isFoodyDelivery;
    }


    public void setIsFoodyDelivery(String isFoodyDelivery) {
        this.isFoodyDelivery = isFoodyDelivery;
    }



}