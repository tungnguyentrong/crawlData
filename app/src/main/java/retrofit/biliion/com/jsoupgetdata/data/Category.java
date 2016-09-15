package retrofit.biliion.com.jsoupgetdata.data;

import java.util.HashMap;
import java.util.Map;

public class Category {

    private Integer displayOrder;
    private Boolean isActive;
    private Boolean isFeatured;
    private Boolean isPopular;
    private Object asciiName;
    private Object urlRewriteName;
    private String nameEn;
    private Object icon;
    private Object iconClass;
    private Object categoryGroupKey;
    private Integer restaurantCount;
    private Integer id;
    private String name;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     *
     * @return
     * The displayOrder
     */
    public Integer getDisplayOrder() {
        return displayOrder;
    }

    /**
     *
     * @param displayOrder
     * The DisplayOrder
     */
    public void setDisplayOrder(Integer displayOrder) {
        this.displayOrder = displayOrder;
    }

    /**
     *
     * @return
     * The isActive
     */
    public Boolean getIsActive() {
        return isActive;
    }

    /**
     *
     * @param isActive
     * The IsActive
     */
    public void setIsActive(Boolean isActive) {
        this.isActive = isActive;
    }

    /**
     *
     * @return
     * The isFeatured
     */
    public Boolean getIsFeatured() {
        return isFeatured;
    }

    /**
     *
     * @param isFeatured
     * The IsFeatured
     */
    public void setIsFeatured(Boolean isFeatured) {
        this.isFeatured = isFeatured;
    }

    /**
     *
     * @return
     * The isPopular
     */
    public Boolean getIsPopular() {
        return isPopular;
    }

    /**
     *
     * @param isPopular
     * The IsPopular
     */
    public void setIsPopular(Boolean isPopular) {
        this.isPopular = isPopular;
    }

    /**
     *
     * @return
     * The asciiName
     */
    public Object getAsciiName() {
        return asciiName;
    }

    /**
     *
     * @param asciiName
     * The AsciiName
     */
    public void setAsciiName(Object asciiName) {
        this.asciiName = asciiName;
    }

    /**
     *
     * @return
     * The urlRewriteName
     */
    public Object getUrlRewriteName() {
        return urlRewriteName;
    }

    /**
     *
     * @param urlRewriteName
     * The UrlRewriteName
     */
    public void setUrlRewriteName(Object urlRewriteName) {
        this.urlRewriteName = urlRewriteName;
    }

    /**
     *
     * @return
     * The nameEn
     */
    public String getNameEn() {
        return nameEn;
    }

    /**
     *
     * @param nameEn
     * The NameEn
     */
    public void setNameEn(String nameEn) {
        this.nameEn = nameEn;
    }

    /**
     *
     * @return
     * The icon
     */
    public Object getIcon() {
        return icon;
    }

    /**
     *
     * @param icon
     * The Icon
     */
    public void setIcon(Object icon) {
        this.icon = icon;
    }

    /**
     *
     * @return
     * The iconClass
     */
    public Object getIconClass() {
        return iconClass;
    }

    /**
     *
     * @param iconClass
     * The IconClass
     */
    public void setIconClass(Object iconClass) {
        this.iconClass = iconClass;
    }

    /**
     *
     * @return
     * The categoryGroupKey
     */
    public Object getCategoryGroupKey() {
        return categoryGroupKey;
    }

    /**
     *
     * @param categoryGroupKey
     * The CategoryGroupKey
     */
    public void setCategoryGroupKey(Object categoryGroupKey) {
        this.categoryGroupKey = categoryGroupKey;
    }

    /**
     *
     * @return
     * The restaurantCount
     */
    public Integer getRestaurantCount() {
        return restaurantCount;
    }

    /**
     *
     * @param restaurantCount
     * The RestaurantCount
     */
    public void setRestaurantCount(Integer restaurantCount) {
        this.restaurantCount = restaurantCount;
    }

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
     * The name
     */
    public String getName() {
        return name;
    }

    /**
     *
     * @param name
     * The Name
     */
    public void setName(String name) {
        this.name = name;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
