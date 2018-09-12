package AH_Helper;

import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

import javax.xml.crypto.Data;

public class MainController {
    public TextField starlight_rose_price;
    public TextField aethril_price;
    public TextField foxflower_price;
    public TextField fjarnskaggl_price;
    public TextField countless_armies_price;
    public TextField whispered_pact_price;
    public TextField seventh_demon_price;
    public TextField ten_thousand_scars_price;
    public TextField obliterum_price;
    public TextField dreamleaf_price;
    public Button btn_update_database;
    public Button btn_check_database;
    public Label database_update_label;
    public TextField starlight_rose_database;
    public TextField aethril_database;
    public TextField foxflower_database;
    public TextField dreamleaf_database;
    public TextField countless_armies_database;
    public TextField whispered_pact_database;
    public TextField seventh_demon_database;
    public TextField ten_thousand_scars_database;
    public TextField obliterum_database;
    public TextField fjarnskaggl_database;
    public TextField starlight_rose_collected;
    public TextField aethril_collected;
    public TextField foxflower_collected;
    public TextField fjarnskaggl_collected;
    public TextField dreamleaf_collected;
    public TextField obliterum_ash_collected;
    public TextField undercut_value;
    public Button btnCalculate;
    public TextField raw_profit;
    public TextField countless_armies_minimum;
    public TextField countless_armies_maximum;
    public TextField whispered_pact_minimum;
    public TextField whispered_pact_maximum;
    public TextField seventh_demon_minimum;
    public TextField seventh_demon_maximum;
    public TextField ten_thousand_scars_minimum;
    public TextField ten_thousand_scars_maximum;
    public TextField obliterum_profit;
    public Button starlight_rose_map_button;
    public Button aethril_map_button;
    public Button foxflower_map_button;
    public Button fjarnskaggl_map_button;
    public Button dreamleaf_map_button;
    public ImageView gather_map;
    public Label zone_map_name;
    public Label fjarnskagg_database;
    public TextField max_flasks_count;


    public void UpdateDatabase(ActionEvent actionEvent) {

        ItemDatabase itemDatabase = new ItemDatabase();

        itemDatabase.setStarlight_rose_price(Integer.parseInt(starlight_rose_price.getText()));
        itemDatabase.setAethril_price(Integer.parseInt(aethril_price.getText()));
        itemDatabase.setFoxflower_price(Integer.parseInt(foxflower_price.getText()));
        itemDatabase.setFjarnskaggl_price(Integer.parseInt(fjarnskaggl_price.getText()));
        itemDatabase.setDreamleaf_price(Integer.parseInt(dreamleaf_price.getText()));

        itemDatabase.setCountless_armies_price(Integer.parseInt(countless_armies_price.getText()));
        itemDatabase.setWhispered_pact_price(Integer.parseInt(whispered_pact_price.getText()));
        itemDatabase.setSeventh_demon_price(Integer.parseInt(seventh_demon_price.getText()));
        itemDatabase.setTen_thousand_scars_price(Integer.parseInt(ten_thousand_scars_price.getText()));

        itemDatabase.setObliterum_price(Integer.parseInt(obliterum_price.getText()));

        DatabaseSerializer databaseSerializer = new DatabaseSerializer();
        databaseSerializer.serialize(itemDatabase, "database.ser");

        database_update_label.setText("Database updated successfully!");

    }

    public void CheckDatabase(ActionEvent actionEvent) {

        DatabaseSerializer databaseSerializer = new DatabaseSerializer();
        ItemDatabase itemDatabase = databaseSerializer.deserialize("database.ser");

        starlight_rose_database.setText(Integer.toString(itemDatabase.getStarlight_rose_price()) + " G");
        aethril_database.setText(Integer.toString(itemDatabase.getAethril_price()) + " G");
        foxflower_database.setText(Integer.toString(itemDatabase.getFoxflower_price()) + " G");
        fjarnskaggl_database.setText(Integer.toString(itemDatabase.getFjarnskaggl_price()) + " G");
        dreamleaf_database.setText(Integer.toString(itemDatabase.getDreamleaf_price()) + " G");

        countless_armies_database.setText(Integer.toString(itemDatabase.getCountless_armies_price()) + " G");
        whispered_pact_database.setText(Integer.toString(itemDatabase.getWhispered_pact_price()) + " G");
        seventh_demon_database.setText(Integer.toString(itemDatabase.getSeventh_demon_price()) + " G");
        ten_thousand_scars_database.setText(Integer.toString(itemDatabase.getTen_thousand_scars_price()) + " G");

        obliterum_database.setText(Integer.toString(itemDatabase.getObliterum_price()) + " G");

    }

    public void Calculate(ActionEvent actionEvent) {

        Materials materials = new Materials();

        materials.setStarlight_rose_count(Integer.parseInt(starlight_rose_collected.getText()));
        materials.setAethril_count(Integer.parseInt(aethril_collected.getText()));
        materials.setFoxflower_count(Integer.parseInt(foxflower_collected.getText()));
        materials.setDreamleaf_count(Integer.parseInt(dreamleaf_collected.getText()));
        materials.setFjarnskaggl_count(Integer.parseInt(fjarnskaggl_collected.getText()));
        materials.setObliterum_ash_count(Integer.parseInt(obliterum_ash_collected.getText()));

        raw_profit.setText(Integer.toString(materials.calculateRawWithUndercut(Integer.parseInt(undercut_value.getText()))) + " G");

        obliterum_profit.setText(Integer.toString(materials.calculateObliterumProfit(Integer.parseInt(undercut_value.getText()))) + " G");

        countless_armies_minimum.setText(Integer.toString(materials.calculateCountlessArmiesMinimum(Integer.parseInt(undercut_value.getText()))) + " G");
        countless_armies_maximum.setText(Integer.toString(materials.calculateCountlessArmiesMaximum(Integer.parseInt(undercut_value.getText()), Integer.parseInt(max_flasks_count.getText()))) + " G");
        whispered_pact_minimum.setText(Integer.toString(materials.calculateWhisperedPactMinimum(Integer.parseInt(undercut_value.getText()))) + " G");
        whispered_pact_maximum.setText(Integer.toString(materials.calculateWhisperedPactMaximum(Integer.parseInt(undercut_value.getText()), Integer.parseInt(max_flasks_count.getText()))) + " G");
        seventh_demon_minimum.setText(Integer.toString(materials.calculateSeventhDemonMinimum(Integer.parseInt(undercut_value.getText()))) + " G");
        seventh_demon_maximum.setText(Integer.toString(materials.calculateSeventhDemonMaximum(Integer.parseInt(undercut_value.getText()), Integer.parseInt(max_flasks_count.getText()))) + " G");
        ten_thousand_scars_minimum.setText(Integer.toString(materials.calculateTenThousandScarsMinimum(Integer.parseInt(undercut_value.getText()))) + " G");
        ten_thousand_scars_maximum.setText(Integer.toString(materials.calculateTenThousandScarsMaximum(Integer.parseInt(undercut_value.getText()), Integer.parseInt(max_flasks_count.getText()))) + " G");

    }


    public void starlightRoseMap(ActionEvent actionEvent) {
        gather_map.setImage(new Image("/Media/starlight_rose_map.jpg"));
        zone_map_name.setText("Suramar");
    }

    public void aethrilMap(ActionEvent actionEvent) {
        gather_map.setImage(new Image("/Media/aethril_map.jpg"));
        zone_map_name.setText("Aszuna");
    }

    public void foxflowerMap(ActionEvent actionEvent) {
        gather_map.setImage(new Image("/Media/foxflower_map.jpg"));
        zone_map_name.setText("Highmountain");
    }

    public void fjarnskagglMap(ActionEvent actionEvent) {
        gather_map.setImage(new Image("/Media/fjarnskaggl_map.jpg"));
        zone_map_name.setText("Stormheim");
    }

    public void dreamleafMap(ActionEvent actionEvent) {
        gather_map.setImage(new Image("/Media/dreamleaf_map.jpg"));
        zone_map_name.setText("Val'sharah");
    }
}
