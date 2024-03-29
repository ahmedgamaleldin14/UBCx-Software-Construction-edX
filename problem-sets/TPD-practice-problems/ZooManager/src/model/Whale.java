package model;

public class Whale extends Animal {
    private boolean waterType;
    private double maxDiveDepth;

    public Whale(String nm, String ct, int age, Zookeeper zk, double wgt, boolean typ, double mdd) {
        super(nm, ct, age, zk, wgt);
        waterType = typ;
        maxDiveDepth = mdd;
    }

    // getters
    public boolean isWaterType() { return waterType; }
    public double getMaxDiveDepth() { return maxDiveDepth;}


}