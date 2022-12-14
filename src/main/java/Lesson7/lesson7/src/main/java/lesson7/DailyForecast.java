package lesson7;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import javax.annotation.Generated;
import java.util.List;

@JsonPropertyOrder({
        "Date",
        "EpochDate",
        "Temperature",
        "Day",
        "Night",
        "Sources",
        "MobileLink",
        "Link"
})
@Generated("jsonschema2pojo")
public class DailyForecast {

    @JsonProperty("Date")
    private String date;
    @JsonProperty("EpochDate")
    private Integer epochDate;
    @JsonProperty("Temperature")
    private Temperature temperature;
    @JsonProperty("Day")
    private Day day;
    @JsonProperty("Night")
    private Night night;
    @JsonProperty("Sources")
    private List<String> sources = null;
    @JsonProperty("MobileLink")
    private String mobileLink;
    @JsonProperty("Link")
    private String link;

    public DailyForecast() {
    }

    public DailyForecast(String date, Integer epochDate, Temperature temperature, Day day, Night night, List<String> sources, String mobileLink, String link) {
        super();
        this.date = date;
        this.epochDate = epochDate;
        this.temperature = temperature;
        this.day = day;
        this.night = night;
        this.sources = sources;
        this.mobileLink = mobileLink;
        this.link = link;
    }

    @JsonProperty("Date")
    public String getDate() {
        return date;
    }

    @JsonProperty("Date")
    public void setDate(String date) {
        this.date = date;
    }

    public DailyForecast withDate(String date) {
        this.date = date;
        return this;
    }

    @JsonProperty("EpochDate")
    public Integer getEpochDate() {
        return epochDate;
    }

    @JsonProperty("EpochDate")
    public void setEpochDate(Integer epochDate) {
        this.epochDate = epochDate;
    }

    public DailyForecast withEpochDate(Integer epochDate) {
        this.epochDate = epochDate;
        return this;
    }

    @JsonProperty("Temperature")
    public Temperature getTemperature() {
        return temperature;
    }

    @JsonProperty("Temperature")
    public void setTemperature(Temperature temperature) {
        this.temperature = temperature;
    }

    public DailyForecast withTemperature(Temperature temperature) {
        this.temperature = temperature;
        return this;
    }

    @JsonProperty("Day")
    public Day getDay() {
        return day;
    }

    @JsonProperty("Day")
    public void setDay(Day day) {
        this.day = day;
    }

    public DailyForecast withDay(Day day) {
        this.day = day;
        return this;
    }

    @JsonProperty("Night")
    public Night getNight() {
        return night;
    }

    @JsonProperty("Night")
    public void setNight(Night night) {
        this.night = night;
    }

    public DailyForecast withNight(Night night) {
        this.night = night;
        return this;
    }

    @JsonProperty("Sources")
    public List<String> getSources() {
        return sources;
    }

    @JsonProperty("Sources")
    public void setSources(List<String> sources) {
        this.sources = sources;
    }

    public DailyForecast withSources(List<String> sources) {
        this.sources = sources;
        return this;
    }

    @JsonProperty("MobileLink")
    public String getMobileLink() {
        return mobileLink;
    }

    @JsonProperty("MobileLink")
    public void setMobileLink(String mobileLink) {
        this.mobileLink = mobileLink;
    }

    public DailyForecast withMobileLink(String mobileLink) {
        this.mobileLink = mobileLink;
        return this;
    }

    @JsonProperty("Link")
    public String getLink() {
        return link;
    }

    @JsonProperty("Link")
    public void setLink(String link) {
        this.link = link;
    }

    public DailyForecast withLink(String link) {
        this.link = link;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(DailyForecast.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("date");
        sb.append('=');
        sb.append(((this.date == null) ? "<null>" : this.date));
        sb.append(',');
        sb.append("epochDate");
        sb.append('=');
        sb.append(((this.epochDate == null) ? "<null>" : this.epochDate));
        sb.append(',');
        sb.append("temperature");
        sb.append('=');
        sb.append(((this.temperature == null) ? "<null>" : this.temperature));
        sb.append(',');
        sb.append("day");
        sb.append('=');
        sb.append(((this.day == null) ? "<null>" : this.day));
        sb.append(',');
        sb.append("night");
        sb.append('=');
        sb.append(((this.night == null) ? "<null>" : this.night));
        sb.append(',');
        sb.append("sources");
        sb.append('=');
        sb.append(((this.sources == null) ? "<null>" : this.sources));
        sb.append(',');
        sb.append("mobileLink");
        sb.append('=');
        sb.append(((this.mobileLink == null) ? "<null>" : this.mobileLink));
        sb.append(',');
        sb.append("link");
        sb.append('=');
        sb.append(((this.link == null) ? "<null>" : this.link));
        sb.append(',');
        if (sb.charAt((sb.length() - 1)) == ',') {
            sb.setCharAt((sb.length() - 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }

}
