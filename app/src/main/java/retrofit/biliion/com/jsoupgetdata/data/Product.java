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
    @SerializedName("Id")
    private int id;

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
    private int restaurantId;

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
    @SerializedName("MetaDescription")
    private  String metaDescription;

    /*@SerializedName("Cuisines")
    private List<Cuisine> cuisines = new ArrayList<Cuisine>();
    @SerializedName("Categories")
    private List<Category> categories = new ArrayList<Category>();
    @SerializedName("OffersList")
    private List<OffersList> offersList = new ArrayList<OffersList>();
    @SerializedName("MetaDescription")
    private String metaDescription;
*/
    // create constructor

    public Product (int id, String shortDescription,String showDate,String startDate,String endDate, String detailUrl,int restaurantId,String picture,
                    String mobileImageUrl,String restaurantName,String address,String urlRewriteName,int cityID){
        this.id=id;
        this.shortDescription=shortDescription;
        this.showDate= showDate;
        this.startDate = startDate ;
        this.endDate= endDate ;
        this.detailUrl= detailUrl ;
        this.restaurantId= restaurantId;
        this.picture = picture;
        this.mobileImageUrl = mobileImageUrl;
        this.restaurantName = restaurantName;
        this.address= address;
        this.urlRewriteName=urlRewriteName;
        this.cityID=cityID;
    }

    public void setMetaDescription(String metaDescription) {
        this.metaDescription = metaDescription;
    }

    public String getMetaDescription() {
        return metaDescription;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
    public String getShortDescription() {
        return shortDescription;
    }
    public void setShortDescription(String shortDescription) {
        this.shortDescription = shortDescription;
    }
    public String getShowDate() {
        return showDate;
    }
    public void setShowDate(String showDate) {
        this.showDate = showDate;
    }
    public String getStartDate() {
        return startDate;
    }
    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }
    public String getEndDate() {
        return endDate;
    }
    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }
    public String getDetailUrl() {
        return detailUrl;
    }
    public void setDetailUrl(String detailUrl) {
        this.detailUrl = detailUrl;
    }
    public Integer getRestaurantId() {
        return restaurantId;
    }
    public void setRestaurantId(Integer restaurantId) {
        this.restaurantId = restaurantId;
    }
    public String getPicture() {
        return picture;
    }
    public void setPicture(String picture) {
        this.picture = picture;
    }
    public String getMobileImageUrl() {
        return mobileImageUrl;
    }
    public void setMobileImageUrl(String mobileImageUrl) {
        this.mobileImageUrl = mobileImageUrl;
    }
    public String getRestaurantName() {
        return restaurantName;
    }

    public void setRestaurantName(String restaurantName) {
        this.restaurantName = restaurantName;
    }
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public String getUrlRewriteName() {
        return urlRewriteName;
    }
    public void setUrlRewriteName(String urlRewriteName) {
        this.urlRewriteName = urlRewriteName;
    }
    public Integer getCityID() {
        return cityID;
    }


    public void setCityID(Integer cityID) {
        this.cityID = cityID;
    }

/*

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
*/

}
