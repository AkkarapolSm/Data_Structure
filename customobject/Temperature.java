package customobject;

public class Temperature {
    
    private float high, low;

    public Temperature(float high, float low) {
        this.high = high;
        this.low = low;
    }
    @Override
    public String toString() {
        return "Temperature [high = " + high + ", low = " + low + "]";
    }

    public float getHigh() {
        return high;
    }


    public void setHigh(float high) {
        this.high = high;
    }

    public float getLow() {
        return low;
    }

    public void setLow(float low) {
        this.low = low;
    }
    
}
