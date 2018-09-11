package AH_Helper;

import javax.xml.crypto.Data;

public class Materials {

    private int starlight_rose_count;
    private int aethril_count;
    private int foxflower_count;
    private int dreamleaf_count;
    private int fjarnskaggl_count;
    private int obliterum_ash_count;

    private ItemDatabase database;

    public Materials() {
        DatabaseSerializer databaseSerializer = new DatabaseSerializer();
        this.database = databaseSerializer.deserialize("database.ser");
    }

    public int calculateRawWithUndercut(int undercut) {

        int total = 0;

        total += starlight_rose_count * (database.getStarlight_rose_price() - undercut);
        total += aethril_count * (database.getAethril_price() - undercut);
        total += foxflower_count * (database.getFoxflower_price() - undercut);
        total += dreamleaf_count * (database.getDreamleaf_price() - undercut);
        total += fjarnskaggl_count * (database.getFjarnskaggl_price() - undercut);
        total += (obliterum_ash_count / 100) * (database.getObliterum_price() - undercut);

        return total;

    }

    public int getStarlight_rose_count() {
        return starlight_rose_count;
    }

    public void setStarlight_rose_count(int starlight_rose_count) {
        this.starlight_rose_count = starlight_rose_count;
    }

    public int getAethril_count() {
        return aethril_count;
    }

    public void setAethril_count(int aethril_count) {
        this.aethril_count = aethril_count;
    }

    public int getFoxflower_count() {
        return foxflower_count;
    }

    public void setFoxflower_count(int foxflower_count) {
        this.foxflower_count = foxflower_count;
    }

    public int getDreamleaf_count() {
        return dreamleaf_count;
    }

    public void setDreamleaf_count(int dreamleaf_count) {
        this.dreamleaf_count = dreamleaf_count;
    }

    public int getFjarnskaggl_count() {
        return fjarnskaggl_count;
    }

    public void setFjarnskaggl_count(int fjarnskaggl_count) {
        this.fjarnskaggl_count = fjarnskaggl_count;
    }

    public int getObliterum_ash_count() {
        return obliterum_ash_count;
    }

    public void setObliterum_ash_count(int obliterum_ash_count) {
        this.obliterum_ash_count = obliterum_ash_count;
    }
}
