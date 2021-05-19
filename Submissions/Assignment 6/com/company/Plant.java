package com.company;

public class Plant {
    private String name;
    private boolean needsWatering;
    private String plantFamily;
    private String wateringInstructions; 
    private String sunlightInstructions;

    public Plant(String plantFamily, String name) {
        this.plantFamily = plantFamily;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String getPlantFamily() {
        return plantFamily;
    }

    public String getWateringInstructions() {
        System.out.println(wateringInstructions);
        System.out.println("NeedsWatering is: " + needsWatering);
        return wateringInstructions;
    }

    public boolean needsWatering() {
        System.out.println("NeedsWatering is: " + needsWatering);
        return needsWatering;
    }
}

}
