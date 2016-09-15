package retrofit.biliion.com.jsoupgetdata.data;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by framgia on 16/09/15.
 */
public class OfferTimeAvailable {
    private String time;
    private Integer timeValue;
    private Boolean isAvailable;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     *
     * @return
     * The time
     */
    public String getTime() {
        return time;
    }

    /**
     *
     * @param time
     * The Time
     */
    public void setTime(String time) {
        this.time = time;
    }

    /**
     *
     * @return
     * The timeValue
     */
    public Integer getTimeValue() {
        return timeValue;
    }

    /**
     *
     * @param timeValue
     * The TimeValue
     */
    public void setTimeValue(Integer timeValue) {
        this.timeValue = timeValue;
    }

    /**
     *
     * @return
     * The isAvailable
     */
    public Boolean getIsAvailable() {
        return isAvailable;
    }

    /**
     *
     * @param isAvailable
     * The IsAvailable
     */
    public void setIsAvailable(Boolean isAvailable) {
        this.isAvailable = isAvailable;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
