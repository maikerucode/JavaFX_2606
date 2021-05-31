package javafxapplication;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;

public class ControllerHomePage {

    @FXML AnchorPane MainUpperPanes;
    @FXML AnchorPane mainNews;
    @FXML AnchorPane leftNews;
    @FXML AnchorPane middleNews;
    @FXML AnchorPane rightNews;
    @FXML AnchorPane MainLowerPanes;
    @FXML AnchorPane SettingsPane;
    @FXML AnchorPane Darkness;
    
    @FXML AnchorPane UpperButtons;
    @FXML AnchorPane LowerButtons;

    @FXML Button Settings;

    @FXML Button mainNewsStart;
    @FXML Button leftNewsStart;
    @FXML Button middleNewsStart;
    @FXML Button rightNewsStart;

    @FXML Button mainNewsButton;
    @FXML Button leftNewsButton;
    @FXML Button middleNewsButton;
    @FXML Button rightNewsButton;

    public void initialize() {
        MainUpperPanes.setVisible(false);
        MainLowerPanes.setVisible(false);
        UpperButtons.setMouseTransparent(false);
        LowerButtons.setMouseTransparent(false);
        mainNewsStart.setMouseTransparent(false);
        mainNewsStart.setMouseTransparent(false);
        leftNews.setVisible(false);
        middleNews.setVisible(false);
        rightNews.setVisible(false);
        mainNews.setVisible(false);
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
         // localNewsStart.setMouseTransparent(true);
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
         leftNews.setMouseTransparent(true);
         middleNews.setMouseTransparent(true);
         rightNews.setMouseTransparent(true);
         UpperButtons.setMouseTransparent(true);
         LowerButtons.setMouseTransparent(true);
         // localNewsStart.setMouseTransparent(true);
         // LocalNews.setVisible(true);
         Darkness.setVisible(true);

    }
    
    public void QuickClose() {
        System.out.println("Reset...");
        initialize();
    }


    public void MiddleTopClicked() {
      System.out.println("Center Top Button Clicked...");
      
      MainUpperPanes.setVisible(true);
      MainUpperPanes.setMouseTransparent(false);
      leftNews.setMouseTransparent(true);
      middleNews.setMouseTransparent(false);
      rightNews.setMouseTransparent(true);
      UpperButtons.setMouseTransparent(true);
      LowerButtons.setMouseTransparent(true);
      mainNewsStart.setMouseTransparent(true);
      middleNews.setVisible(true);
      Darkness.setVisible(true);
    }

    public void LeftTopClicked() {
      System.out.println("Left Top Button Clicked...");
      
      MainUpperPanes.setVisible(true);
      MainUpperPanes.setMouseTransparent(false);
      leftNews.setMouseTransparent(true);
      middleNews.setMouseTransparent(true);
      rightNews.setMouseTransparent(false);
      UpperButtons.setMouseTransparent(true);
      LowerButtons.setMouseTransparent(true);
      mainNewsStart.setMouseTransparent(true);
      leftNews.setVisible(true);
      Darkness.setVisible(true);
    }

    public void RightTopClicked() {
      System.out.println("Right Top Button Clicked...");
      
      MainUpperPanes.setVisible(true);
      MainUpperPanes.setMouseTransparent(false);
      leftNews.setMouseTransparent(false);
      middleNews.setMouseTransparent(true);
      rightNews.setMouseTransparent(true);
      UpperButtons.setMouseTransparent(true);
      LowerButtons.setMouseTransparent(true);
      mainNewsStart.setMouseTransparent(true);
      rightNews.setVisible(true);
      Darkness.setVisible(true);
    }

}