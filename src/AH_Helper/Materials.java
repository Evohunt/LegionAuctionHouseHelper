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

        return total;

    }

    public int calculateObliterumProfit(int undercut) {

        return (obliterum_ash_count / 100) * (database.getObliterum_price() - undercut);

    }

    public int calculateCountlessArmiesMinimum(int undercut) {
        return Math.min(Math.min((starlight_rose_count / 7), (aethril_count / 10)), (foxflower_count / 10)) * (database.getCountless_armies_price() - undercut);
    }

    public int calculateCountlessArmiesMaximum(int undercut, int max_flasks) {
        return calculateCountlessArmiesMinimum(undercut) * max_flasks;
    }

    public int calculateWhisperedPactMinimum(int undercut) {
        return Math.min(Math.min((starlight_rose_count / 7), (fjarnskaggl_count / 10)), (dreamleaf_count / 10)) * (database.getWhispered_pact_price() - undercut);
    }

    public int calculateWhisperedPactMaximum(int undercut, int max_flasks) {
        return calculateWhisperedPactMinimum(undercut) * max_flasks;
    }

    public int calculateSeventhDemonMinimum(int undercut) {
        return Math.min(Math.min((starlight_rose_count / 7), (fjarnskaggl_count / 10)), (foxflower_count / 10)) * (database.getSeventh_demon_price() - undercut);
    }

    public int calculateSeventhDemonMaximum(int undercut, int max_flasks) {
        return calculateSeventhDemonMinimum(undercut) * max_flasks;
    }

    public int calculateTenThousandScarsMinimum(int undercut) {
        return Math.min(Math.min((starlight_rose_count / 7), (aethril_count / 10)), (dreamleaf_count / 10)) * (database.getSeventh_demon_price() - undercut);
    }

    public int calculateTenThousandScarsMaximum(int undercut, int max_flasks) {
        return calculateTenThousandScarsMinimum(undercut) * max_flasks;
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
