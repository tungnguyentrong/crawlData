package retrofit.biliion.com.jsoupgetdata.data;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by framgia on 16/09/15.
 */
public class OffersList {

    private Integer id;
    private Integer reservationId;
    private Integer labelId;
    private String title;
    private String titleEn;
    private String shortDescription;
    private String description;
    private String createdOn;
    private String startDate;
    private String endDate;
    private Integer price;
    private Integer discountValue;
    private String offerText;
    private Object offerTextEn;


    private String labelText;
    private Object typeText;
    private String labelClass;
    private Integer skips;
    private String urlDetail;
    private List<OfferTimeAvailable> offerTimeAvailable = new ArrayList<OfferTimeAvailable>();
    private Object iconCss;
    private Integer pointFDC;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

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
     * The reservationId
     */
    public Integer getReservationId() {
        return reservationId;
    }

    /**
     *
     * @param reservationId
     * The ReservationId
     */
    public void setReservationId(Integer reservationId) {
        this.reservationId = reservationId;
    }

    /**
     *
     * @return
     * The labelId
     */
    public Integer getLabelId() {
        return labelId;
    }

    /**
     *
     * @param labelId
     * The LabelId
     */
    public void setLabelId(Integer labelId) {
        this.labelId = labelId;
    }

    /**
     *
     * @return
     * The title
     */
    public String getTitle() {
        return title;
    }

    /**
     *
     * @param title
     * The Title
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     *
     * @return
     * The titleEn
     */
    public String getTitleEn() {
        return titleEn;
    }

    /**
     *
     * @param titleEn
     * The Title_En
     */
    public void setTitleEn(String titleEn) {
        this.titleEn = titleEn;
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
     * The createdOn
     */
    public String getCreatedOn() {
        return createdOn;
    }

    /**
     *
     * @param createdOn
     * The CreatedOn
     */
    public void setCreatedOn(String createdOn) {
        this.createdOn = createdOn;
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
     * The price
     */
    public Integer getPrice() {
        return price;
    }

    /**
     *
     * @param price
     * The Price
     */
    public void setPrice(Integer price) {
        this.price = price;
    }

    /**
     *
     * @return
     * The discountValue
     */
    public Integer getDiscountValue() {
        return discountValue;
    }

    /**
     *
     * @param discountValue
     * The DiscountValue
     */
    public void setDiscountValue(Integer discountValue) {
        this.discountValue = discountValue;
    }

    /**
     *
     * @return
     * The offerText
     */
    public String getOfferText() {
        return offerText;
    }

    /**
     *
     * @param offerText
     * The OfferText
     */
    public void setOfferText(String offerText) {
        this.offerText = offerText;
    }

    /**
     *
     * @return
     * The offerTextEn
     */
    public Object getOfferTextEn() {
        return offerTextEn;
    }

    /**
     *
     * @param offerTextEn
     * The OfferText_En
     */
    public void setOfferTextEn(Object offerTextEn) {
        this.offerTextEn = offerTextEn;
    }

    /**
     *
     * @return
     * The labelText
     */
    public String getLabelText() {
        return labelText;
    }

    /**
     *
     * @param labelText
     * The LabelText
     */
    public void setLabelText(String labelText) {
        this.labelText = labelText;
    }

    /**
     *
     * @return
     * The typeText
     */
    public Object getTypeText() {
        return typeText;
    }

    /**
     *
     * @param typeText
     * The TypeText
     */
    public void setTypeText(Object typeText) {
        this.typeText = typeText;
    }

    /**
     *
     * @return
     * The labelClass
     */
    public String getLabelClass() {
        return labelClass;
    }

    /**
     *
     * @param labelClass
     * The LabelClass
     */
    public void setLabelClass(String labelClass) {
        this.labelClass = labelClass;
    }

    /**
     *
     * @return
     * The skips
     */
    public Integer getSkips() {
        return skips;
    }

    /**
     *
     * @param skips
     * The Skips
     */
    public void setSkips(Integer skips) {
        this.skips = skips;
    }

    /**
     *
     * @return
     * The urlDetail
     */
    public String getUrlDetail() {
        return urlDetail;
    }

    /**
     *
     * @param urlDetail
     * The UrlDetail
     */
    public void setUrlDetail(String urlDetail) {
        this.urlDetail = urlDetail;
    }

    /**
     *
     * @return
     * The offerTimeAvailable
     */
    public List<OfferTimeAvailable> getOfferTimeAvailable() {
        return offerTimeAvailable;
    }

    /**
     *
     * @param offerTimeAvailable
     * The OfferTimeAvailable
     */
    public void setOfferTimeAvailable(List<OfferTimeAvailable> offerTimeAvailable) {
        this.offerTimeAvailable = offerTimeAvailable;
    }

    /**
     *
     * @return
     * The iconCss
     */
    public Object getIconCss() {
        return iconCss;
    }

    /**
     *
     * @param iconCss
     * The IconCss
     */
    public void setIconCss(Object iconCss) {
        this.iconCss = iconCss;
    }

    /**
     *
     * @return
     * The pointFDC
     */
    public Integer getPointFDC() {
        return pointFDC;
    }

    /**
     *
     * @param pointFDC
     * The PointFDC
     */
    public void setPointFDC(Integer pointFDC) {
        this.pointFDC = pointFDC;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }
}
