package retrofit.biliion.com.jsoupgetdata.data;

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by framgia on 16/09/15.
 */
public class Product {
    private Integer id;

    @SerializedName("ShortDescription")
    private String shortDescription;
    @SerializedName("ShowDate")
    private String showDate;
    @SerializedName("StartDate")
    private String startDate;
    @SerializedName("EndDate")
    private String endDate;
    @SerializedName("DetailUrl")
    private String detailUrl;
    @SerializedName("RestaurantId")
    private Integer restaurantId;
    @SerializedName("Picture")
    private String picture;
    @SerializedName("MobileImageUrl")
    private String mobileImageUrl;
    @SerializedName("RestaurantName")
    private String restaurantName;
    @SerializedName("Address")
    private String address;
    @SerializedName("UrlRewriteName")
    private String urlRewriteName;
    @SerializedName("CityID")
    private Integer cityID;
    @SerializedName("Cuisines")
    private List<Cuisine> cuisines = new ArrayList<Cuisine>();
    @SerializedName("Categories")
    private List<Category> categories = new ArrayList<Category>();
    @SerializedName("OffersList")
    private List<OffersList> offersList = new ArrayList<OffersList>();
    @SerializedName("MetaDescription")
    private String metaDescription;


    /**
     *
     * @return
     * The id
     */
    public Integer getId() {
        return id;
    }

    /**
     *
     * @param id
     * The Id
     */
    public void setId(Integer id) {
        this.id = id;
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
     * The showDate
     */
    public String getShowDate() {
        return showDate;
    }

    /**
     *
     * @param showDate
     * The ShowDate
     */
    public void setShowDate(String showDate) {
        this.showDate = showDate;
    }

    /**
     *
     * @return
     * The startDate
     */
    public String getStartDate() {
        return startDate;
    }

    /**
     *
     * @param startDate
     * The StartDate
     */
    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    /**
     *
     * @return
     * The endDate
     */
    public String getEndDate() {
        return endDate;
    }

    /**
     *
     * @param endDate
     * The EndDate
     */
    public void setEndDate(String endDate) {
        this.endDate = endDate;
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
     * The restaurantId
     */
    public Integer getRestaurantId() {
        return restaurantId;
    }

    /**
     *
     * @param restaurantId
     * The RestaurantId
     */
    public void setRestaurantId(Integer restaurantId) {
        this.restaurantId = restaurantId;
    }

    /**
     *
     * @return
     * The picture
     */
    public String getPicture() {
        return picture;
    }

    /**
     *
     * @param picture
     * The Picture
     */
    public void setPicture(String picture) {
        this.picture = picture;
    }

    /**
     *
     * @return
     * The mobileImageUrl
     */
    public String getMobileImageUrl() {
        return mobileImageUrl;
    }

    /**
     *
     * @param mobileImageUrl
     * The MobileImageUrl
     */
    public void setMobileImageUrl(String mobileImageUrl) {
        this.mobileImageUrl = mobileImageUrl;
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
     * @param restaurantName
     */

    public void setRestaurantName(String restaurantName) {
        this.restaurantName = restaurantName;
    }

    /**
     *
     * @return
     * The address
     */
    public String getAddress() {
        return address;
    }

    /**
     *
     * @param address
     * The Address
     */
    public void setAddress(String address) {
        this.address = address;
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
     * The cityID
     */
    public Integer getCityID() {
        return cityID;
    }


    public void setCityID(Integer cityID) {
        this.cityID = cityID;
    }


    public List<Cuisine> getCuisines() {
        return cuisines;
    }


    public void setCuisines(List<Cuisine> cuisines) {
        this.cuisines = cuisines;
    }


    public List<Category> getCategories() {
        return categories;
    }


    public void setCategories(List<Category> categories) {
        this.categories = categories;
    }


    public List<OffersList> getOffersList() {
        return offersList;
    }


    public void setOffersList(List<OffersList> offersList) {
        this.offersList = offersList;
    }

    public String getMetaDescription() {
        return metaDescription;
    }

    public void setMetaDescription(String metaDescription) {
        this.metaDescription = metaDescription;
    }

}
