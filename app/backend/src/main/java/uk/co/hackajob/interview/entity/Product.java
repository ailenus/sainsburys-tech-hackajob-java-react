package uk.co.hackajob.interview.entity;

public class Product {
    public class UnitPrice {
        private float price;
        private String measure;
        private int measureAmount;

        public float getPrice() {
            return price;
        }

        public void setPrice(float price) {
            this.price = price;
        }

        public String getMeasure() {
            return measure;
        }

        public void setMeasure(String measure) {
            this.measure = measure;
        }

        public int getMeasureAmount() {
            return measureAmount;
        }

        public void setMeasureAmount(int measureAmount) {
            this.measureAmount = measureAmount;
        }
    }

    private String productUid;
    private String productType;
    private String name;
    private String image;
    private UnitPrice unitPrice;
    private boolean isAvailable;

    public String getProductUid() {
        return productUid;
    }

    public void setProductUid(String productUid) {
        this.productUid = productUid;
    }

    public String getProductType() {
        return productType;
    }

    public void setProductType(String productType) {
        this.productType = productType;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public UnitPrice getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(UnitPrice unitPrice) {
        this.unitPrice = unitPrice;
    }

    public boolean getIsAvailable() {
        return isAvailable;
    }

    public void setIsAvailable(boolean available) {
        isAvailable = available;
    }
}
