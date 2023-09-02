package StackA;

public class Parcel implements Comparable<Parcel> {
    private String id; //pascel id
    private float distance;


    
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((id == null) ? 0 : id.hashCode());
        result = prime * result + Float.floatToIntBits(distance);
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Parcel other = (Parcel) obj;
        if (id == null) {
            if (other.id != null)
                return false;
        } else if (!id.equals(other.id))
            return false;
        if (Float.floatToIntBits(distance) != Float.floatToIntBits(other.distance))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "Pascel [id=" + id + ", distance=" + distance + "]";
    }

    public Parcel(String id, float distance) {
        this.id = id;
        this.distance = distance;
    }
    
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public float getDistance() {
        return distance;
    }
    public void setDistance(float distance) {
        this.distance = distance;
    }

    @Override
    public int compareTo(Parcel o) {
        if (Float.compare(this.getDistance(), o.getDistance()) == 0) {
            return this.getId().compareTo(o.getId());
        }else{
            return Float.compare(o.getDistance(), this.getDistance());
        }
    }

    
}
