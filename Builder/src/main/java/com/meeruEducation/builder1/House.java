package com.meeruEducation.builder1;

public class House {

    //Required Parameter
    private final String foundation;
    private final int rooms;
    private final int bathRooms;

    //Optional parameter
    private final boolean hasGarden;
    private final boolean hasGarage;
    private final boolean hasPool;
    private final boolean hasRoofTop;
    private final String flooringType;

    private House(Builder builder) {
        this.hasGarden = builder.hasGarden;
        this.hasRoofTop = builder.hasRoofTop;
        this.foundation = builder.foundation;
        this.rooms = builder.rooms;
        this.bathRooms = builder.bathRooms;
        this.hasPool = builder.hasPool;
        this.flooringType = builder.flooringType;
        this.hasGarage = builder.hasGarage;
    }

    @Override
    public String toString() {
        return "House{" +
                "foundation='" + foundation + '\'' +
                ", rooms=" + rooms +
                ", bathRooms=" + bathRooms +
                ", hasGarden=" + hasGarden +
                ", hasGarage=" + hasGarage +
                ", hasPool=" + hasPool +
                ", hasRoofTop=" + hasRoofTop +
                ", flooringType='" + flooringType + '\'' +
                '}';
    }

    public static class Builder {

        //required parameters
        private final String foundation;
        private final int rooms;
        private final int bathRooms;

        //optional parameters
        private boolean hasGarden = false;
        private boolean hasGarage = false;
        private boolean hasPool = false;
        private boolean hasRoofTop = false;
        private String flooringType = "Concrete";

        public Builder(String foundation, int rooms, int bathRooms) {
            this.foundation = foundation;
            this.rooms = rooms;
            this.bathRooms = bathRooms;
        }

        public Builder setHasGarden(boolean hasGarden) {
            this.hasGarden = hasGarden;
            return this;
        }

        public Builder setHasGarage(boolean hasGarage) {
            this.hasGarage = hasGarage;
            return this;
        }

        public Builder setHasRoofTop(boolean hasRoofTop) {
            this.hasRoofTop = hasRoofTop;
            return this;
        }

        public Builder setFlooringType(String flooringType) {
            this.flooringType = flooringType;
            return this;
        }

        public  Builder setHasPool(boolean hasPool) {
            this.hasPool = hasPool;
            return this;
        }

        public House build() {
            return new House(this);
        }

    }
}
