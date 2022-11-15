package lesson8.datatemp;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;

public class Temperature {
    @JsonProperty(value = "Metric")
    private TempUnit metric;
    @JsonProperty(value = "Imperial")
    private TempUnit imperial;

    @JsonGetter("Metric")
    public TempUnit getMetric() {
        return metric;
    }

    @JsonSetter("Metric")
    public void setMetric(TempUnit metric) {
        this.metric = metric;
    }

    @JsonGetter("Imperial")
    public TempUnit getImperial() {
        return imperial;
    }

    @JsonSetter("Imperial")
    public void setImperial(TempUnit imperial) {
        this.imperial = imperial;
    }
}
