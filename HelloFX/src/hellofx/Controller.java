package hellofx;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;

public class Controller {

    @FXML AnchorPane MainUpperPanes;
    @FXML AnchorPane LocalNews;
    @FXML AnchorPane upperFire;
    @FXML AnchorPane upperTyphoon;
    @FXML AnchorPane upperEarthquake;
    @FXML AnchorPane MainLowerPanes;
    @FXML AnchorPane WorldNews;
    @FXML AnchorPane lowerFire;
    @FXML AnchorPane lowerTyphoon;
    @FXML AnchorPane lowerEarthquake;
    @FXML AnchorPane SettingsPane;
    @FXML AnchorPane Darkness;
    
    @FXML AnchorPane UpperButtons;
    @FXML AnchorPane LowerButtons;

    @FXML Button Settings;

    @FXML Button localNewsStart;
    @FXML Button upperFireStart;
    @FXML Button upperTyphoonStart;
    @FXML Button upperEarthquakeStart;

    @FXML Button worldNewsStart;
    @FXML Button lowerFireStart;
    @FXML Button lowerTyphoonStart;
    @FXML Button lowerEarthquakeStart;

    @FXML Button localNewsButton;
    @FXML Button upperFireButton;
    @FXML Button upperTyphoonButton;
    @FXML Button upperEarthquakeButton;

    @FXML Button worldNewsButton;
    @FXML Button lowerFireButton;
    @FXML Button lowerTyphoonButton;
    @FXML Button lowerEarthquakeButton;

    public void initialize() {
        MainUpperPanes.setVisible(false);
        MainLowerPanes.setVisible(false);
        UpperButtons.setMouseTransparent(false);
        LowerButtons.setMouseTransparent(false);
        worldNewsStart.setMouseTransparent(false);
        localNewsStart.setMouseTransparent(false);
        localNewsStart.setMouseTransparent(false);
        upperFire.setVisible(false);
        upperTyphoon.setVisible(false);
        upperEarthquake.setVisible(false);
        LocalNews.setVisible(false);
        worldNewsStart.setMouseTransparent(false);
        lowerFire.setVisible(false);
        lowerTyphoon.setVisible(false);
        lowerEarthquake.setVisible(false);
        lowerFire.setVisible(false);
        WorldNews.setVisible(false);
        Darkness.setVisible(false);
        MainUpperPanes.setMouseTransparent(true);
        MainLowerPanes.setMouseTransparent(true);
        Darkness.setMouseTransparent(true);
        SettingsPane.setVisible(false);
    }

    public void UpperRightMenu() {
        System.out.println("Settings opened...");

        if (SettingsPane.isVisible()) {
         SettingsPane.setVisible(false);
         Darkness.setVisible(false);
         initialize();
        }
        else {
         MainUpperPanes.setVisible(false);
         UpperButtons.setMouseTransparent(true);
         LowerButtons.setMouseTransparent(true);
         worldNewsStart.setMouseTransparent(true);
         localNewsStart.setMouseTransparent(true);
         MainUpperPanes.setMouseTransparent(true);
         MainLowerPanes.setMouseTransparent(true);
         MainLowerPanes.setVisible(false);
         SettingsPane.setVisible(true);
         Darkness.setVisible(true);
        }
    }

    public void NewsClicked() {
        System.out.println("News Button Clicked...");
    }

    public void GuidesClicked() {
        System.out.println("Guides Button Clicked...");
    }

    public void MainLocalNews() {
        System.out.println("Local News Clicked...");
         
         MainUpperPanes.setVisible(true);
         MainUpperPanes.setMouseTransparent(false);
         upperFire.setMouseTransparent(true);
         upperTyphoon.setMouseTransparent(true);
         upperEarthquake.setMouseTransparent(true);
         UpperButtons.setMouseTransparent(true);
         LowerButtons.setMouseTransparent(true);
         worldNewsStart.setMouseTransparent(true);
         localNewsStart.setMouseTransparent(true);
         LocalNews.setVisible(true);
         Darkness.setVisible(true);

    }
    
    public void QuickClose() {
        System.out.println("Reset...");
        initialize();
    }

    public void MainWorldNews() {
        System.out.println("World News Clicked...");
        
         MainLowerPanes.setVisible(true);
         MainLowerPanes.setMouseTransparent(false);
         lowerFire.setMouseTransparent(true);
         lowerTyphoon.setMouseTransparent(true);
         lowerEarthquake.setMouseTransparent(true);
         UpperButtons.setMouseTransparent(true);
         LowerButtons.setMouseTransparent(true);
         worldNewsStart.setMouseTransparent(true);
         localNewsStart.setMouseTransparent(true);
         WorldNews.setVisible(true);
         Darkness.setVisible(true);
        
    }

    public void MiddleTopClicked() {
      System.out.println("Center Top Button Clicked...");
      
      MainUpperPanes.setVisible(true);
      MainUpperPanes.setMouseTransparent(false);
      upperFire.setMouseTransparent(true);
      upperTyphoon.setMouseTransparent(false);
      upperEarthquake.setMouseTransparent(true);
      UpperButtons.setMouseTransparent(true);
      LowerButtons.setMouseTransparent(true);
      worldNewsStart.setMouseTransparent(true);
      localNewsStart.setMouseTransparent(true);
      upperTyphoon.setVisible(true);
      Darkness.setVisible(true);
    }

    public void LeftTopClicked() {
      System.out.println("Left Top Button Clicked...");
      
      MainUpperPanes.setVisible(true);
      MainUpperPanes.setMouseTransparent(false);
      upperFire.setMouseTransparent(true);
      upperTyphoon.setMouseTransparent(true);
      upperEarthquake.setMouseTransparent(false);
      UpperButtons.setMouseTransparent(true);
      LowerButtons.setMouseTransparent(true);
      worldNewsStart.setMouseTransparent(true);
      localNewsStart.setMouseTransparent(true);
      upperEarthquake.setVisible(true);
      Darkness.setVisible(true);
    }

    public void RightTopClicked() {
      System.out.println("Right Top Button Clicked...");
      
      MainUpperPanes.setVisible(true);
      MainUpperPanes.setMouseTransparent(false);
      upperFire.setMouseTransparent(false);
      upperTyphoon.setMouseTransparent(true);
      upperEarthquake.setMouseTransparent(true);
      UpperButtons.setMouseTransparent(true);
      LowerButtons.setMouseTransparent(true);
      worldNewsStart.setMouseTransparent(true);
      localNewsStart.setMouseTransparent(true);
      upperFire.setVisible(true);
      Darkness.setVisible(true);
    }

    public void MiddleBottomClicked() {
      System.out.println("Center Bottom Button Clicked...");
      
      MainLowerPanes.setVisible(true);
      MainLowerPanes.setMouseTransparent(false);
      lowerFire.setMouseTransparent(true);
      lowerTyphoon.setMouseTransparent(false);
      lowerEarthquake.setMouseTransparent(true);
      UpperButtons.setMouseTransparent(true);
      LowerButtons.setMouseTransparent(true);
      worldNewsStart.setMouseTransparent(true);
      localNewsStart.setMouseTransparent(true);
      lowerTyphoon.setVisible(true);
      Darkness.setVisible(true);
    }

    public void LeftBottomClicked() {
      System.out.println("Left Bottom Button Clicked...");
      
      MainLowerPanes.setVisible(true);
      MainLowerPanes.setMouseTransparent(false);
      lowerFire.setMouseTransparent(true);
      lowerTyphoon.setMouseTransparent(true);
      lowerEarthquake.setMouseTransparent(false);
      UpperButtons.setMouseTransparent(true);
      LowerButtons.setMouseTransparent(true);
      worldNewsStart.setMouseTransparent(true);
      localNewsStart.setMouseTransparent(true);
      lowerEarthquake.setVisible(true);
      Darkness.setVisible(true);
    }

    public void RightBottomClicked() {
      System.out.println("Right Bottom Button Clicked...");
      
      MainLowerPanes.setVisible(true);
      MainLowerPanes.setMouseTransparent(false);
      lowerFire.setMouseTransparent(false);
      lowerTyphoon.setMouseTransparent(true);
      lowerEarthquake.setMouseTransparent(true);
      UpperButtons.setMouseTransparent(true);
      LowerButtons.setMouseTransparent(true);
      worldNewsStart.setMouseTransparent(true);
      localNewsStart.setMouseTransparent(true);
      lowerFire.setVisible(true);
      Darkness.setVisible(true);
    }

}
