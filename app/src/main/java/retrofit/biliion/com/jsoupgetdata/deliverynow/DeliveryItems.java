package retrofit.biliion.com.jsoupgetdata.deliverynow;

import com.google.gson.annotations.SerializedName;

public class DeliveryItems {

    @SerializedName("ListDeliveryMilestoneFee")
    private String listDeliveryMilestoneFee;
    @SerializedName("RestaurantId")
    private int restaurantId;
    @SerializedName("DeliveryId")
    private int deliveryId;
    @SerializedName("DetailUrl")
    private String detailUrl;
    @SerializedName("ImageUrl")
    private String imageUrl;
    @SerializedName("Category")
    private String category;
    @SerializedName("Cuisines")
    private String cuisines;
    @SerializedName("RestaurantName")
    private String restaurantName;
    @SerializedName("RestaurantAddress")
    private String restaurantAddress;
    @SerializedName("ShortDescription")
    private String shortDescription;
    @SerializedName("Description")
    private String description;
    @SerializedName("TimeRange")
    private String timeRange;
    @SerializedName("PriceRange")
    private String priceRange;
    @SerializedName("Minimum")
    private int minimum;
    @SerializedName("DeliveryFee")
    private int deliveryFee;
    @SerializedName("MaxDistance")
    private int maxDistance;
    @SerializedName("DeliveryBy")
    private String deliveryBy;
    @SerializedName("ServicePercent")
    private int servicePercent;
    @SerializedName("VATPercent")
    private int vATPercent;
    @SerializedName("AllowMinimumOrder")
    private Boolean allowMinimumOrder;
    @SerializedName("MinimumOrderFee")
    private int minimumOrderFee;
    @SerializedName("ResLat")
    private Double resLat;
    @SerializedName("ResLng")
    private Double resLng;
    @SerializedName("IsAvailableDate")
    private Boolean isAvailableDate;
    @SerializedName("Busy")
    private String busy;
    @SerializedName("UrlRewriteName")
    private String urlRewriteName;
    @SerializedName("Location")
    private String location;


    public DeliveryItems(String listDeliveryMilestoneFee, int restaurantId, int deliveryId, String detailUrl,
                         String imageUrl, String category, String cuisines, String restaurantName, String restaurantAddress,
                         String shortDescription, String description, String timeRange, String priceRange, int minimum, int deliveryFee,
                         int maxDistance, String deliveryBy, int servicePercent, int vATPercent, Boolean allowMinimumOrder,
                         int minimumOrderFee, Double resLat, Double resLng, Boolean isAvailableDate, String busy, String urlRewriteName,
                         String location) {
        this.listDeliveryMilestoneFee = listDeliveryMilestoneFee;
        this.restaurantId = restaurantId;
        this.deliveryId = deliveryId;
        this.detailUrl = detailUrl;
        this.imageUrl = imageUrl;
        this.category = category;
        this.cuisines = cuisines;
        this.restaurantName = restaurantName;
        this.restaurantAddress = restaurantAddress;
        this.shortDescription = shortDescription;
        this.description = description;
        this.timeRange = timeRange;
        this.priceRange = priceRange;
        this.minimum = minimum;
        this.deliveryFee = deliveryFee;
        this.maxDistance = maxDistance;
        this.deliveryBy = deliveryBy;
        this.servicePercent = servicePercent;
        this.vATPercent = vATPercent;
        this.allowMinimumOrder = allowMinimumOrder;
        this.minimumOrderFee = minimumOrderFee;
        this.resLat = resLat;
        this.resLng = resLng;
        this.isAvailableDate = isAvailableDate;
        this.busy = busy;
        this.urlRewriteName = urlRewriteName;
        this.location = location;
    }


    public String getListDeliveryMilestoneFee() {
        return listDeliveryMilestoneFee;
    }

    public void setListDeliveryMilestoneFee(String listDeliveryMilestoneFee) {
        this.listDeliveryMilestoneFee = listDeliveryMilestoneFee;
    }

    public Integer getRestaurantId() {
        return restaurantId;
    }

    public void setRestaurantId(Integer restaurantId) {
        this.restaurantId = restaurantId;
    }

    /**
     *
     * @return
     * The deliveryId
     */
    public Integer getDeliveryId() {
        return deliveryId;
    }

    /**
     *
     * @param deliveryId
     * The DeliveryId
     */
    public void setDeliveryId(Integer deliveryId) {
        this.deliveryId = deliveryId;
    }

    /**
     *
     * @return
     * The detailUrl
     */
    public String getDetailUrl() {
        return detailUrl;
    }

    /**
     *
     * @param detailUrl
     * The DetailUrl
     */
    public void setDetailUrl(String detailUrl) {
        this.detailUrl = detailUrl;
    }

    /**
     *
     * @return
     * The imageUrl
     */
    public String getImageUrl() {
        return imageUrl;
    }

    /**
     *
     * @param imageUrl
     * The ImageUrl
     */
    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    /**
     *
     * @return
     * The category
     */
    public String getCategory() {
        return category;
    }

    /**
     *
     * @param category
     * The Category
     */
    public void setCategory(String category) {
        this.category = category;
    }

    /**
     *
     * @return
     * The cuisines
     */
    public String getCuisines() {
        return cuisines;
    }

    /**
     *
     * @param cuisines
     * The Cuisines
     */
    public void setCuisines(String cuisines) {
        this.cuisines = cuisines;
    }

    /**
     *
     * @return
     * The restaurantName
     */
    public String getRestaurantName() {
        return restaurantName;
    }

    /**
     *
     * @param restaurantName
     * The RestaurantName
     */
    public void setRestaurantName(String restaurantName) {
        this.restaurantName = restaurantName;
    }

    /**
     *
     * @return
     * The restaurantAddress
     */
    public String getRestaurantAddress() {
        return restaurantAddress;
    }

    /**
     *
     * @param restaurantAddress
     * The RestaurantAddress
     */
    public void setRestaurantAddress(String restaurantAddress) {
        this.restaurantAddress = restaurantAddress;
    }

    /**
     *
     * @return
     * The shortDescription
     */
    public String getShortDescription() {
        return shortDescription;
    }

    /**
     *
     * @param shortDescription
     * The ShortDescription
     */
    public void setShortDescription(String shortDescription) {
        this.shortDescription = shortDescription;
    }

    /**
     *
     * @return
     * The description
     */
    public String getDescription() {
        return description;
    }

    /**
     *
     * @param description
     * The Description
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     *
     * @return
     * The timeRange
     */
    public String getTimeRange() {
        return timeRange;
    }

    /**
     *
     * @param timeRange
     * The TimeRange
     */
    public void setTimeRange(String timeRange) {
        this.timeRange = timeRange;
    }

    /**
     *
     * @return
     * The priceRange
     */
    public String getPriceRange() {
        return priceRange;
    }

    /**
     *
     * @param priceRange
     * The PriceRange
     */
    public void setPriceRange(String priceRange) {
        this.priceRange = priceRange;
    }

    /**
     *
     * @return
     * The minimum
     */
    public int getMinimum() {
        return minimum;
    }

    /**
     *
     * @param minimum
     * The Minimum
     */
    public void setMinimum(int minimum) {
        this.minimum = minimum;
    }

    /**
     *
     * @return
     * The deliveryFee
     */
    public int getDeliveryFee() {
        return deliveryFee;
    }

    /**
     *
     * @param deliveryFee
     * The DeliveryFee
     */
    public void setDeliveryFee(int deliveryFee) {
        this.deliveryFee = deliveryFee;
    }

    /**
     *
     * @return
     * The maxDistance
     */
    public int getMaxDistance() {
        return maxDistance;
    }

    /**
     *
     * @param maxDistance
     * The MaxDistance
     */
    public void setMaxDistance(int maxDistance) {
        this.maxDistance = maxDistance;
    }

    /**
     *
     * @return
     * The deliveryBy
     */
    public String getDeliveryBy() {
        return deliveryBy;
    }

    /**
     *
     * @param deliveryBy
     * The DeliveryBy
     */
    public void setDeliveryBy(String deliveryBy) {
        this.deliveryBy = deliveryBy;
    }

    /**
     *
     * @return
     * The servicePercent
     */
    public int getServicePercent() {
        return servicePercent;
    }

    /**
     *
     * @param servicePercent
     * The ServicePercent
     */
    public void setServicePercent(int servicePercent) {
        this.servicePercent = servicePercent;
    }

    /**
     *
     * @return
     * The vATPercent
     */
    public int getVATPercent() {
        return vATPercent;
    }

    /**
     *
     * @param vATPercent
     * The VATPercent
     */
    public void setVATPercent(int vATPercent) {
        this.vATPercent = vATPercent;
    }

    /**
     *
     * @return
     * The allowMinimumOrder
     */
    public Boolean getAllowMinimumOrder() {
        return allowMinimumOrder;
    }

    /**
     *
     * @param allowMinimumOrder
     * The AllowMinimumOrder
     */
    public void setAllowMinimumOrder(Boolean allowMinimumOrder) {
        this.allowMinimumOrder = allowMinimumOrder;
    }

    /**
     *
     * @return
     * The minimumOrderFee
     */
    public int getMinimumOrderFee() {
        return minimumOrderFee;
    }

    /**
     *
     * @param minimumOrderFee
     * The MinimumOrderFee
     */
    public void setMinimumOrderFee(int minimumOrderFee) {
        this.minimumOrderFee = minimumOrderFee;
    }

    /**
     *
     * @return
     * The resLat
     */
    public Double getResLat() {
        return resLat;
    }

    /**
     *
     * @param resLat
     * The ResLat
     */
    public void setResLat(Double resLat) {
        this.resLat = resLat;
    }

    /**
     *
     * @return
     * The resLng
     */
    public Double getResLng() {
        return resLng;
    }

    /**
     *
     * @param resLng
     * The ResLng
     */
    public void setResLng(Double resLng) {
        this.resLng = resLng;
    }

    /**
     *
     * @return
     * The isAvailableDate
     */
    public Boolean getIsAvailableDate() {
        return isAvailableDate;
    }

    /**
     *
     * @param isAvailableDate
     * The IsAvailableDate
     */
    public void setIsAvailableDate(Boolean isAvailableDate) {
        this.isAvailableDate = isAvailableDate;
    }

    /**
     *
     * @return
     * The busy
     */
    public String getBusy() {
        return busy;
    }

    /**
     *
     * @param busy
     * The Busy
     */
    public void setBusy(String busy) {
        this.busy = busy;
    }

    /**
     *
     * @return
     * The urlRewriteName
     */
    public String getUrlRewriteName() {
        return urlRewriteName;
    }

    /**
     *
     * @param urlRewriteName
     * The UrlRewriteName
     */
    public void setUrlRewriteName(String urlRewriteName) {
        this.urlRewriteName = urlRewriteName;
    }

    /**
     *
     * @return
     * The location
     */
    public String getLocation() {
        return location;
    }

    /**
     *
     * @param location
     * The Location
     */
    public void setLocation(String location) {
        this.location = location;
    }


}