package pojos;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class GoRestPojo {

    private Object meta;
    private GoRestPojo data;

    public GoRestPojo(Object meta, GoRestPojo data) {
        this.meta = meta;
        this.data = data;
    }

    public GoRestPojo() {
    }

    public Object getMeta() {
        return meta;
    }

    public void setMeta(Object meta) {
        this.meta = meta;
    }

    public GoRestPojo getData() {
        return data;
    }

    public void setData(GoRestPojo data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "GoRestPojo{" +
                "meta=" + meta +
                ", data=" + data +
                '}';
    }
}
