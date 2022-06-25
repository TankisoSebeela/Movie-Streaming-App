package com.example.group;

import javafx.application.Application;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.concurrent.Worker;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.web.WebEngine;
import javafx.scene.web.WebView;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {





    Label title, description;


    @Override
    public void start(Stage stage) throws IOException {
        BorderPane root = new BorderPane();


        Scene scene = new Scene(root , 1070,600,Color.BEIGE);
        scene.getStylesheets().add("/style.css");



        HBox My_Box = new HBox();
        My_Box.setSpacing(1);
        My_Box.setPadding(new Insets(30,70,30,30));


        Label ACTON= new Label("Action Movies");
        ACTON.setFont(Font.font("Times New Roman",40));
        ACTON.setTextFill(Color.BLUE);

        Label Cartoons= new Label("Cartoons");
        Cartoons.setFont(Font.font("Times New Roman",40));
        Cartoons.setTextFill(Color.BLUE);

        Label horror = new Label("Horror Movies");
        horror.setFont(Font.font("Times New Roman",40));
        horror.setTextFill(Color.BLUE);






        HBox cartecory = new HBox(100);
        // cartecory.setSpacing(10);
        cartecory.setPadding(new Insets(1,1,1,70));
        cartecory.getChildren().addAll(ACTON,Cartoons,horror);
        VBox voBox = new VBox(cartecory);
        voBox.setSpacing(19);





        // Create the VBox
        HBox display = new HBox();
        // Add the WebView to the VBox


        // Set the Style-properties of the VBox
        display.setStyle(
                "-fx-border-style: solid inside;" +
                "-fx-border-width: 3;" +
                "-fx-border-insets: 3;" +
                "-fx-border-radius: 3;" +
                "-fx-border-color:red;");

        // Create the WebView
        WebView webView = new WebView();
        // Create the WebEngine
        final WebEngine webEngine = webView.getEngine();






        VBox My_vBox= new VBox();
        ImageView My_imageView= new ImageView();
        ImageView My_imageView1= new ImageView();
        ImageView My_imageView3= new ImageView();
        ImageView My_imageView4= new ImageView();
        ImageView My_imageView5= new ImageView();
        ImageView My_imageView6= new ImageView();
        ImageView My_imageView7= new ImageView();
        ImageView My_imageView8= new ImageView();



        ImageView imageview1 = new ImageView(getClass().getResource("spike.jpg").toExternalForm());
        imageview1.setFitWidth(110);
        imageview1.setFitHeight(110);

        ImageView imageview2 = new ImageView(getClass().getResource("volley.jpg").toExternalForm());
        imageview2.setFitWidth(110);
        imageview2.setFitHeight(110);

        ImageView imageview3 = new ImageView(getClass().getResource("toss.jpg").toExternalForm());
        imageview3.setFitWidth(110);
        imageview3.setFitHeight(110);


        My_Box.getChildren().addAll(imageview1,imageview2,imageview3);

        //HBox My_hBox = new HBox();

        ACTON.setOnMouseClicked(mouseEvent ->{
            HBox ob = new HBox();
            ob.setBackground(new Background(new BackgroundFill(Color.rgb(83,130,224),CornerRadii.EMPTY,Insets.EMPTY)));
            HBox ob1 = new HBox();
            ob1.setBackground(new Background(new BackgroundFill(Color.rgb(83,130,224),CornerRadii.EMPTY,Insets.EMPTY)));
            HBox ob3 = new HBox();
            ob3.setBackground(new Background(new BackgroundFill(Color.rgb(83,130,224),CornerRadii.EMPTY,Insets.EMPTY)));
            HBox ob4 = new HBox();
            ob4.setBackground(new Background(new BackgroundFill(Color.rgb(83,130,224),CornerRadii.EMPTY,Insets.EMPTY)));
            HBox ob5 = new HBox();
            ob5.setBackground(new Background(new BackgroundFill(Color.rgb(83,130,224),CornerRadii.EMPTY,Insets.EMPTY)));
            HBox ob6 = new HBox();
            ob6.setBackground(new Background(new BackgroundFill(Color.rgb(83,130,224),CornerRadii.EMPTY,Insets.EMPTY)));
            HBox ob7 = new HBox();
            ob7.setBackground(new Background(new BackgroundFill(Color.rgb(83,130,224),CornerRadii.EMPTY,Insets.EMPTY)));
            HBox ob8 = new HBox();
            ob8.setBackground(new Background(new BackgroundFill(Color.rgb(83,130,224),CornerRadii.EMPTY,Insets.EMPTY)));

            String image = getClass().getResource("army.jpeg").toExternalForm();
            My_imageView.setImage(new Image(image));
            My_imageView.setFitWidth(200);
            My_imageView.setFitHeight(170);

            title = new Label("ARMY OF THE DEAD");
            title.setFont(Font.font("Cooper Black",34));
            title.setTextFill(Color.DARKRED);

            description= new Label("Released : May 21, 2021");
            description.setFont(Font.font("Times New Roman",17));
            description.setTextFill(Color.DARKRED);

            HBox release = new HBox();
            release.getChildren().add(description);

            VBox p = new VBox();
            p.setSpacing(50);
            p.getChildren().addAll(title,release);
            p.setPadding(new Insets(30, 1, 1, 1));
            ob.getChildren().addAll(My_imageView,p);

            String image1 = getClass().getResource("code8.jpg").toExternalForm();
            My_imageView1.setImage(new Image(image1));
            My_imageView1.setFitWidth(200);
            My_imageView1.setFitHeight(170);

            title = new Label("CODE 8");
            title.setFont(Font.font("Cooper Black",34));
            title.setTextFill(Color.DARKRED);

            description= new Label("Released : December 13, 2019");
            description.setFont(Font.font("Times New Roman",17));
            description.setTextFill(Color.DARKRED);

            HBox r1 = new HBox();
            r1.getChildren().add(description);

            VBox p1 = new VBox();
            p1.setSpacing(50);
            p1.getChildren().addAll(title,r1);
            p1.setPadding(new Insets(30, 1, 1, 1));

            ob1.getChildren().addAll(My_imageView1,p1);


            String image3 = getClass().getResource("collecter.jpg").toExternalForm();
            My_imageView3.setImage(new Image(image3));
            My_imageView3.setFitWidth(200);
            My_imageView3.setFitHeight(170);

            title = new Label("THE DEBT COLLECTOR ");
            title.setFont(Font.font("Cooper Black",34));
            title.setTextFill(Color.DARKRED);

            description= new Label("Released : September 14, 2018");
            description.setFont(Font.font("Times New Roman",17));
            description.setTextFill(Color.DARKRED);


            HBox r3 = new HBox();
            r3.getChildren().add(description);

            VBox p3 = new VBox();
            p3.setSpacing(50);
            p3.getChildren().addAll(title,r3);
            p3.setPadding(new Insets(30, 1, 1, 1));


            ob3.getChildren().addAll(My_imageView3,p3);



            String image4 = getClass().getResource("extraction.jpeg").toExternalForm();
            My_imageView4.setImage(new Image(image4));
            My_imageView4.setFitWidth(200);
            My_imageView4.setFitHeight(170);

            title = new Label("EXTRACTION");
            title.setFont(Font.font("Cooper Black",34));
            title.setTextFill(Color.DARKRED);

            description= new Label("Released : April 24, 2020");
            description.setFont(Font.font("Times New Roman",17));
            description.setTextFill(Color.DARKRED);

            HBox r4 = new HBox();
            r4.getChildren().add(description);

            VBox p4 = new VBox();
            p4.setSpacing(50);
            p4.getChildren().addAll(title,r4);
            p4.setPadding(new Insets(30, 1, 1, 1));

            ob4.getChildren().addAll(My_imageView4,p4);



            String image5 = getClass().getResource("kat.jpg").toExternalForm();
            My_imageView5.setImage(new Image(image5));
            My_imageView5.setFitWidth(200);
            My_imageView5.setFitHeight(170);

            title = new Label("KATE ");
            title.setFont(Font.font("Cooper Black",34));
            title.setTextFill(Color.DARKRED);

            description= new Label("Released : September 10, 2021");
            description.setFont(Font.font("Times New Roman",17));
            description.setTextFill(Color.DARKRED);

            HBox r5 = new HBox();
            r5.getChildren().add(description);

            VBox p5 = new VBox();
            p5.setSpacing(50);
            p5.getChildren().addAll(title,r5);
            p5.setPadding(new Insets(30, 1, 1, 1));

            ob5.getChildren().addAll(My_imageView5,p5);



            String image6 = getClass().getResource("night.jpg").toExternalForm();
            My_imageView6.setImage(new Image(image6));
            My_imageView6.setFitWidth(200);
            My_imageView6.setFitHeight(170);

            title = new Label("THE NIGHT COMES FOR US ");
            title.setFont(Font.font("Cooper Black",34));
            title.setTextFill(Color.DARKRED);

            description= new Label("Released : September 22, 2018");
            description.setFont(Font.font("Times New Roman",17));
            description.setTextFill(Color.DARKRED);

            HBox r6 = new HBox();
            r6.getChildren().add(description);

            VBox p6 = new VBox();
            p6.setSpacing(50);
            p6.getChildren().addAll(title,r6);
            p6.setPadding(new Insets(30, 1, 1, 1));

            ob6.getChildren().addAll(My_imageView6,p6);



            String image7 = getClass().getResource("oldguard.jpg").toExternalForm();
            My_imageView7.setImage(new Image(image7));
            My_imageView7.setFitWidth(200);
            My_imageView7.setFitHeight(170);

            title = new Label("THE OLD GUARD ");
            title.setFont(Font.font("Cooper Black",34));
            title.setTextFill(Color.DARKRED);

            description= new Label("Released : July 10, 2020");
            description.setFont(Font.font("Times New Roman",17));
            description.setTextFill(Color.DARKRED);

            HBox r7 = new HBox();
            r7.getChildren().add(description);

            VBox p7 = new VBox();
            p7.setSpacing(50);
            p7.getChildren().addAll(title,r7);
            p7.setPadding(new Insets(30, 1, 1, 1));

            ob7.getChildren().addAll(My_imageView7,p7);



            String image8 = getClass().getResource("6.jpg").toExternalForm();
            My_imageView8.setImage(new Image(image8));
            My_imageView8.setFitWidth(200);
            My_imageView8.setFitHeight(170);

            title = new Label("6 UNDERGROUND ");
            title.setFont(Font.font("Cooper Black",34));
            title.setTextFill(Color.DARKRED);

            description= new Label("Released : December 10, 2019");
            description.setFont(Font.font("Times New Roman",17));
            description.setTextFill(Color.DARKRED);

            HBox r8 = new HBox();
            r8.getChildren().add(description);

            VBox p8 = new VBox();
            p8.setSpacing(50);
            p8.getChildren().addAll(title,r8);
            p8.setPadding(new Insets(30, 1, 1, 1));

            ob8.getChildren().addAll(My_imageView8,p8);





            ListView<HBox> listView = new ListView<>();


            ObservableList<HBox> items = FXCollections.observableArrayList(ob,ob1,ob3,ob4,ob5,ob6,ob7,ob8);
            listView.setItems(items);
            listView.setPadding(new Insets(1, 1, 1, 1));



         //  display.setPadding(new Insets(50, 600, 15, 10));

            VBox allInOne = new VBox(voBox,listView);
            allInOne.setSpacing(30);

            root.setTop(allInOne);

           // root.setCenter(listView);


            listView.getSelectionModel().selectedItemProperty().addListener((ObservableValue<? extends HBox> ov, HBox old_val, HBox new_val) -> {
                HBox selectedItem = listView.getSelectionModel().getSelectedItem();
                int index = listView.getSelectionModel().getSelectedIndex();


                switch(index){


                    case 0 :


                       // LOad the Start-Page
                       webEngine.load("https://www.youtube.com/embed/tI1JGPhYBS8");


                       // Update the stage title when a new web page title is available
                       webEngine.getLoadWorker().stateProperty().addListener(new ChangeListener<Worker.State>()
                       {
                           public void changed(ObservableValue<? extends Worker.State> ov, Worker.State oldState, Worker.State newState)
                           {
                               if (newState == Worker.State.SUCCEEDED)
                               {
                                   //stage.setTitle(webEngine.getLocation());
                                   stage.setTitle(webEngine.getTitle());
                               }
                           }

                       });

                        display.getChildren().add(webView);

                        Scene game_over_scene = new Scene(display);
                        Stage stage1 = new Stage();
                        stage1.setScene(game_over_scene);
                        stage1.show();

                        break;
                    case 1:


                        // LOad the Start-Page
                        webEngine.load("https://www.youtube.com/embed/PrX1JJ5dduA");
                        // Update the stage title when a new web page title is available
                        webEngine.getLoadWorker().stateProperty().addListener(new ChangeListener<Worker.State>()
                        {
                            public void changed(ObservableValue<? extends Worker.State> ov, Worker.State oldState, Worker.State newState)
                            {
                                if (newState == Worker.State.SUCCEEDED)
                                {
                                    //stage.setTitle(webEngine.getLocation());
                                    stage.setTitle(webEngine.getTitle());
                                }
                            }
                        });

                        display.getChildren().add(webView);

                        Scene a = new Scene(display);
                        Stage aa = new Stage();
                        aa.setScene(a);
                        aa.show();

                        break;

                    case 3:
                        // LOad the Start-Page
                        webEngine.load("www.youtube.com/embed/ncDJ1NjRlX4");
                        // Update the stage title when a new web page title is available
                        webEngine.getLoadWorker().stateProperty().addListener(new ChangeListener<Worker.State>()
                        {
                            public void changed(ObservableValue<? extends Worker.State> ov, Worker.State oldState, Worker.State newState)
                            {
                                if (newState == Worker.State.SUCCEEDED)
                                {
                                    //stage.setTitle(webEngine.getLocation());
                                    stage.setTitle(webEngine.getTitle());
                                }
                            }
                        });
                        display.getChildren().add(webView);

                        Scene b = new Scene(display);
                        Stage bb = new Stage();
                        bb.setScene(b);
                        bb.show();
                        break;


                    case 4:
                        // LOad the Start-Page
                        webEngine.load("https://www.youtube.com/embed/L6P3nI6VnlY");
                        // Update the stage title when a new web page title is available
                        webEngine.getLoadWorker().stateProperty().addListener(new ChangeListener<Worker.State>()
                        {
                            public void changed(ObservableValue<? extends Worker.State> ov, Worker.State oldState, Worker.State newState)
                            {
                                if (newState == Worker.State.SUCCEEDED)
                                {
                                    //stage.setTitle(webEngine.getLocation());
                                    stage.setTitle(webEngine.getTitle());
                                }
                            }
                        });
                        display.getChildren().add(webView);

                        Scene c = new Scene(display);
                        Stage cc = new Stage();
                        cc.setScene(c);
                        cc.show();
                        break;


                    case 5:
                        // LOad the Start-Page
                        webEngine.load("https://www.youtube.com/embed/MysGjRS9jFU");
                        // Update the stage title when a new web page title is available
                        webEngine.getLoadWorker().stateProperty().addListener(new ChangeListener<Worker.State>()
                        {
                            public void changed(ObservableValue<? extends Worker.State> ov, Worker.State oldState, Worker.State newState)
                            {
                                if (newState == Worker.State.SUCCEEDED)
                                {
                                    //stage.setTitle(webEngine.getLocation());
                                    stage.setTitle(webEngine.getTitle());
                                }
                            }
                        });
                        display.getChildren().add(webView);

                        Scene d = new Scene(display);
                        Stage dd = new Stage();
                        dd.setScene(d);
                        dd.show();

                        break;
                    case 6:
                        // LOad the Start-Page
                        webEngine.load("https://www.youtube.com/embed/HfSisHrUTLM");
                        // Update the stage title when a new web page title is available
                        webEngine.getLoadWorker().stateProperty().addListener(new ChangeListener<Worker.State>()
                        {
                            public void changed(ObservableValue<? extends Worker.State> ov, Worker.State oldState, Worker.State newState)
                            {
                                if (newState == Worker.State.SUCCEEDED)
                                {
                                    //stage.setTitle(webEngine.getLocation());
                                    stage.setTitle(webEngine.getTitle());
                                }
                            }
                        });

                        display.getChildren().add(webView);

                        Scene e = new Scene(display);
                        Stage ee = new Stage();
                        ee.setScene(e);
                        ee.show();

                        break;
                    case 7:
                        // LOad the Start-Page
                        webEngine.load("https://www.youtube.com/embed/aK-X2d0lJ_s");
                        // Update the stage title when a new web page title is available
                        webEngine.getLoadWorker().stateProperty().addListener(new ChangeListener<Worker.State>()
                        {
                            public void changed(ObservableValue<? extends Worker.State> ov, Worker.State oldState, Worker.State newState)
                            {
                                if (newState == Worker.State.SUCCEEDED)
                                {
                                    //stage.setTitle(webEngine.getLocation());
                                    stage.setTitle(webEngine.getTitle());
                                }
                            }
                        });

                        display.getChildren().add(webView);

                        Scene f = new Scene(display);
                        Stage ff = new Stage();
                        ff.setScene(f);
                        ff.show();


                        break;
                    case 8:
                        // LOad the Start-Page
                        webEngine.load("https://www.youtube.com/embed/YLE85olJjp8");
                        // Update the stage title when a new web page title is available
                        webEngine.getLoadWorker().stateProperty().addListener(new ChangeListener<Worker.State>()
                        {
                            public void changed(ObservableValue<? extends Worker.State> ov, Worker.State oldState, Worker.State newState)
                            {
                                if (newState == Worker.State.SUCCEEDED)
                                {
                                    //stage.setTitle(webEngine.getLocation());
                                    stage.setTitle(webEngine.getTitle());
                                }
                            }
                        });
                        display.getChildren().add(webView);

                        Scene g = new Scene(display);
                        Stage gg = new Stage();
                        gg.setScene(g);
                        gg.show();

                        break;

                }
               });

        } );

        Cartoons.setOnMouseClicked(mouseEvent ->{




            HBox ob = new HBox();
            ob.setBackground(new Background(new BackgroundFill(Color.rgb(83,130,224),CornerRadii.EMPTY,Insets.EMPTY)));
            HBox ob1 = new HBox();
            ob1.setBackground(new Background(new BackgroundFill(Color.rgb(83,130,224),CornerRadii.EMPTY,Insets.EMPTY)));
            HBox ob3 = new HBox();
            ob3.setBackground(new Background(new BackgroundFill(Color.rgb(83,130,224),CornerRadii.EMPTY,Insets.EMPTY)));
            HBox ob4 = new HBox();
            ob4.setBackground(new Background(new BackgroundFill(Color.rgb(83,130,224),CornerRadii.EMPTY,Insets.EMPTY)));
            HBox ob5 = new HBox();
            ob5.setBackground(new Background(new BackgroundFill(Color.rgb(83,130,224),CornerRadii.EMPTY,Insets.EMPTY)));
            HBox ob6 = new HBox();
            ob6.setBackground(new Background(new BackgroundFill(Color.rgb(83,130,224),CornerRadii.EMPTY,Insets.EMPTY)));
            HBox ob7 = new HBox();
            ob7.setBackground(new Background(new BackgroundFill(Color.rgb(83,130,224),CornerRadii.EMPTY,Insets.EMPTY)));
            HBox ob8 = new HBox();
            ob8.setBackground(new Background(new BackgroundFill(Color.rgb(83,130,224),CornerRadii.EMPTY,Insets.EMPTY)));





            String image = getClass().getResource("coc.jpg").toExternalForm();
            My_imageView.setImage(new Image(image));
            My_imageView.setFitWidth(200);
            My_imageView.setFitHeight(170);

            title = new Label("COCO");
            title.setFont(Font.font("Cooper Black",34));
            title.setTextFill(Color.DARKRED);

            description= new Label("Released : November 22, 2017");
            description.setFont(Font.font("Times New Roman",17));
            description.setTextFill(Color.DARKRED);

            HBox r = new HBox();
            r.getChildren().add(description);

            VBox p = new VBox();
            p.setSpacing(50);
            p.getChildren().addAll(title,r);
            p.setPadding(new Insets(30, 1, 1, 1));

            ob.getChildren().addAll(My_imageView,p);




            String image1 = getClass().getResource("mononoke.jpg").toExternalForm();
            My_imageView1.setImage(new Image(image1));
            My_imageView1.setFitWidth(200);
            My_imageView1.setFitHeight(170);

            title = new Label("PRINCES MONONOKE");
            title.setFont(Font.font("Cooper Black",34));
            title.setTextFill(Color.DARKRED);

            description= new Label("Released : July 12, 1997");
            description.setFont(Font.font("Times New Roman",17));
            description.setTextFill(Color.DARKRED);

            HBox r1 = new HBox();
            r1.getChildren().add(description);

            VBox p1 = new VBox();
            p1.setSpacing(50);
            p1.getChildren().addAll(title,r1);
            p1.setPadding(new Insets(30, 1, 1, 1));

            ob1.getChildren().addAll(My_imageView1,p1);


            String image3 = getClass().getResource("your_name.jpg").toExternalForm();
            My_imageView3.setImage(new Image(image3));
            My_imageView3.setFitWidth(200);
            My_imageView3.setFitHeight(170);

            title = new Label("YOUR NAME ");
            title.setFont(Font.font("Cooper Black",34));
            title.setTextFill(Color.DARKRED);

            description= new Label("Released : August 26, 2016");
            description.setFont(Font.font("Times New Roman",17));
            description.setTextFill(Color.DARKRED);

            HBox r2 = new HBox();
            r2.getChildren().add(description);

            VBox p2 = new VBox();
            p2.setSpacing(50);
            p2.getChildren().addAll(title,r2);
            p2.setPadding(new Insets(30, 1, 1, 1));

            ob3.getChildren().addAll(My_imageView3,p2);



            String image4 = getClass().getResource("king.jpg").toExternalForm();
            My_imageView4.setImage(new Image(image4));
            My_imageView4.setFitWidth(200);
            My_imageView4.setFitHeight(170);

            title = new Label("THE LION KING");
            title.setFont(Font.font("Cooper Black",34));
            title.setTextFill(Color.DARKRED);

            description= new Label("Released : June 24, 1994");
            description.setFont(Font.font("Times New Roman",17));
            description.setTextFill(Color.DARKRED);

            HBox r3 = new HBox();
            r3.getChildren().add(description);

            VBox p3 = new VBox();
            p3.setSpacing(50);
            p3.getChildren().addAll(title,r3);
            p3.setPadding(new Insets(30, 1, 1, 1));

            ob4.getChildren().addAll(My_imageView4,p3);



            String image5 = getClass().getResource("toystory.jpg").toExternalForm();
            My_imageView5.setImage(new Image(image5));
            My_imageView5.setFitWidth(200);
            My_imageView5.setFitHeight(170);

            title = new Label("TOY STORY 4 ");
            title.setFont(Font.font("Cooper Black",34));
            title.setTextFill(Color.DARKRED);

            description= new Label("Released : June 21, 2019");
            description.setFont(Font.font("Times New Roman",17));
            description.setTextFill(Color.DARKRED);

            HBox r4 = new HBox();
            r4.getChildren().add(description);

            VBox p4 = new VBox();
            p4.setSpacing(50);
            p4.getChildren().addAll(title,r4);
            p4.setPadding(new Insets(30, 1, 1, 1));

            ob5.getChildren().addAll(My_imageView5,p4);



            String image6 = getClass().getResource("up.jpeg").toExternalForm();
            My_imageView6.setImage(new Image(image6));
            My_imageView6.setFitWidth(200);
            My_imageView6.setFitHeight(170);

            title = new Label("UP ");
            title.setFont(Font.font("Cooper Black",34));
            title.setTextFill(Color.DARKRED);

            description= new Label("Released : May 29, 2009");
            description.setFont(Font.font("Times New Roman",17));
            description.setTextFill(Color.DARKRED);

            HBox r5 = new HBox();
            r5.getChildren().add(description);

            VBox p5 = new VBox();
            p5.setSpacing(50);
            p5.getChildren().addAll(title,r5);
            p5.setPadding(new Insets(30, 1, 1, 1));

            ob6.getChildren().addAll(My_imageView6,p5);



            String image7 = getClass().getResource("wall-e.jpg").toExternalForm();
            My_imageView7.setImage(new Image(image7));
            My_imageView7.setFitWidth(200);
            My_imageView7.setFitHeight(170);

            title = new Label("WALL E ");
            title.setFont(Font.font("Cooper Black",34));
            title.setTextFill(Color.DARKRED);

            description= new Label("Released : June 27, 2008");
            description.setFont(Font.font("Times New Roman",17));
            description.setTextFill(Color.DARKRED);

            HBox r6 = new HBox();
            r6.getChildren().add(description);

            VBox p6 = new VBox();
            p6.setSpacing(50);
            p6.getChildren().addAll(title,r6);
            p6.setPadding(new Insets(30, 1, 1, 1));


            ob7.getChildren().addAll(My_imageView7,p6);



            String image8 = getClass().getResource("wolfwalkers.jpg").toExternalForm();
            My_imageView8.setImage(new Image(image8));
            My_imageView8.setFitWidth(200);
            My_imageView8.setFitHeight(170);

            title = new Label("WOLF WALKERS ");
            title.setFont(Font.font("Cooper Black",34));
            title.setTextFill(Color.DARKRED);

            description= new Label("Released : November 13, 2020");
            description.setFont(Font.font("Times New Roman",17));
            description.setTextFill(Color.DARKRED);
            HBox r7 = new HBox();
            r7.getChildren().add(description);

            VBox p7 = new VBox();
            p7.setSpacing(50);
            p7.getChildren().addAll(title,r7);
            p7.setPadding(new Insets(30, 1, 1, 1));

            ob8.getChildren().addAll(My_imageView8,p7);





            ListView<HBox> listView = new ListView<>();
            ObservableList<HBox> items = FXCollections.observableArrayList(ob,ob1,ob3,ob4,ob5,ob6,ob7,ob8);
            listView.setItems(items);


            root.setTop(listView);




            VBox allInOne = new VBox(voBox,listView);
            allInOne.setSpacing(30);
            root.setTop(allInOne);

            listView.getSelectionModel().selectedItemProperty().addListener((ObservableValue<? extends HBox> ov, HBox old_val, HBox new_val) -> {
                HBox selectedItem = listView.getSelectionModel().getSelectedItem();
                int index = listView.getSelectionModel().getSelectedIndex();

                switch(index){


                    case 0 :
                        // LOad the Start-Page
                        webEngine.load(    "www.youtube.com/embed/Ga6RYejo6Hk");
                        // Update the stage title when a new web page title is available
                        webEngine.getLoadWorker().stateProperty().addListener(new ChangeListener<Worker.State>()
                        {
                            public void changed(ObservableValue<? extends Worker.State> ov, Worker.State oldState, Worker.State newState)
                            {
                                if (newState == Worker.State.SUCCEEDED)
                                {
                                    //stage.setTitle(webEngine.getLocation());
                                    stage.setTitle(webEngine.getTitle());
                                }
                            }

                        });
                        display.getChildren().add(webView);

                        Scene q = new Scene(display);
                        Stage qq = new Stage();
                        qq.setScene(q);
                        qq.show();
                        break;
                    case 1:


                        // LOad the Start-Page
                        webEngine.load("www.youtube.com/embed/4OiMOHRDs14");
                        // Update the stage title when a new web page title is available
                        webEngine.getLoadWorker().stateProperty().addListener(new ChangeListener<Worker.State>()
                        {
                            public void changed(ObservableValue<? extends Worker.State> ov, Worker.State oldState, Worker.State newState)
                            {
                                if (newState == Worker.State.SUCCEEDED)
                                {
                                    //stage.setTitle(webEngine.getLocation());
                                    stage.setTitle(webEngine.getTitle());
                                }
                            }
                        });

                        display.getChildren().add(webView);

                        Scene w = new Scene(display);
                        Stage ww = new Stage();
                        ww.setScene(w);
                        ww.show();


                        break;

                    case 3:
                        // LOad the Start-Page
                        webEngine.load("www.youtube.com/embed/xU47nhruN-Q");
                        // Update the stage title when a new web page title is available
                        webEngine.getLoadWorker().stateProperty().addListener(new ChangeListener<Worker.State>()
                        {
                            public void changed(ObservableValue<? extends Worker.State> ov, Worker.State oldState, Worker.State newState)
                            {
                                if (newState == Worker.State.SUCCEEDED)
                                {
                                    //stage.setTitle(webEngine.getLocation());
                                    stage.setTitle(webEngine.getTitle());
                                }
                            }
                        });
                        display.getChildren().add(webView);

                        Scene l = new Scene(display);
                        Stage ll = new Stage();
                        ll.setScene(l);
                        ll.show();
                        break;


                    case 4:
                        // LOad the Start-Page
                        webEngine.load("www.youtube.com/embed/7TavVZMewpY");
                        // Update the stage title when a new web page title is available
                        webEngine.getLoadWorker().stateProperty().addListener(new ChangeListener<Worker.State>()
                        {
                            public void changed(ObservableValue<? extends Worker.State> ov, Worker.State oldState, Worker.State newState)
                            {
                                if (newState == Worker.State.SUCCEEDED)
                                {
                                    //stage.setTitle(webEngine.getLocation());
                                    stage.setTitle(webEngine.getTitle());
                                }
                            }
                        });
                        display.getChildren().add(webView);

                        Scene rb = new Scene(display);
                        Stage rrb = new Stage();
                        rrb.setScene(rb);
                        rrb.show();

                        break;
                    case 5:
                        // LOad the Start-Page
                        webEngine.load("www.youtube.com/embed/wmiIUN-7qhE");
                        // Update the stage title when a new web page title is available
                        webEngine.getLoadWorker().stateProperty().addListener(new ChangeListener<Worker.State>()
                        {
                            public void changed(ObservableValue<? extends Worker.State> ov, Worker.State oldState, Worker.State newState)
                            {
                                if (newState == Worker.State.SUCCEEDED)
                                {
                                    //stage.setTitle(webEngine.getLocation());
                                    stage.setTitle(webEngine.getTitle());
                                }
                            }
                        });

                        display.getChildren().add(webView);

                        Scene t = new Scene(display);
                        Stage tt = new Stage();
                        tt.setScene(t);
                        tt.show();
                        break;
                    case 6:
                        // LOad the Start-Page
                        webEngine.load("www.youtube.com/embed/ORFWdXl_zJ4");
                        // Update the stage title when a new web page title is available
                        webEngine.getLoadWorker().stateProperty().addListener(new ChangeListener<Worker.State>()
                        {
                            public void changed(ObservableValue<? extends Worker.State> ov, Worker.State oldState, Worker.State newState)
                            {
                                if (newState == Worker.State.SUCCEEDED)
                                {
                                    //stage.setTitle(webEngine.getLocation());
                                    stage.setTitle(webEngine.getTitle());
                                }
                            }
                        });
                        display.getChildren().add(webView);

                        Scene y = new Scene(display);
                        Stage yy = new Stage();
                        yy.setScene(y);
                        yy.show();
                        break;
                    case 7:
                        // LOad the Start-Page
                        webEngine.load("www.youtube.com/embed/CZ1CATNbXg0");
                        // Update the stage title when a new web page title is available
                        webEngine.getLoadWorker().stateProperty().addListener(new ChangeListener<Worker.State>()
                        {
                            public void changed(ObservableValue<? extends Worker.State> ov, Worker.State oldState, Worker.State newState)
                            {
                                if (newState == Worker.State.SUCCEEDED)
                                {
                                    //stage.setTitle(webEngine.getLocation());
                                    stage.setTitle(webEngine.getTitle());
                                }
                            }
                        });
                        display.getChildren().add(webView);

                        Scene u = new Scene(display);
                        Stage uu = new Stage();
                        uu.setScene(u);
                        uu.show();
                        break;
                    case 8:
                        // LOad the Start-Page
                        webEngine.load("www.youtube.com/embed/d_Z_tybgPgg");
                        // Update the stage title when a new web page title is available
                        webEngine.getLoadWorker().stateProperty().addListener(new ChangeListener<Worker.State>()
                        {
                            public void changed(ObservableValue<? extends Worker.State> ov, Worker.State oldState, Worker.State newState)
                            {
                                if (newState == Worker.State.SUCCEEDED)
                                {
                                    //stage.setTitle(webEngine.getLocation());
                                    stage.setTitle(webEngine.getTitle());
                                }
                            }
                        });
                        display.getChildren().add(webView);

                        Scene i = new Scene(display);
                        Stage ii = new Stage();
                        ii.setScene(i);
                        ii.show();
                        break;

                }






            });


        } );

        horror.setOnMouseClicked(mouseEvent ->{

          //  root.setCenter(webView); to view


            HBox ob = new HBox();
            ob.setBackground(new Background(new BackgroundFill(Color.rgb(83,130,224),CornerRadii.EMPTY,Insets.EMPTY)));
            HBox ob1 = new HBox();
            ob1.setBackground(new Background(new BackgroundFill(Color.rgb(83,130,224),CornerRadii.EMPTY,Insets.EMPTY)));
            HBox ob3 = new HBox();
            ob3.setBackground(new Background(new BackgroundFill(Color.rgb(83,130,224),CornerRadii.EMPTY,Insets.EMPTY)));
            HBox ob4 = new HBox();
            ob4.setBackground(new Background(new BackgroundFill(Color.rgb(83,130,224),CornerRadii.EMPTY,Insets.EMPTY)));
            HBox ob5 = new HBox();
            ob5.setBackground(new Background(new BackgroundFill(Color.rgb(83,130,224),CornerRadii.EMPTY,Insets.EMPTY)));
            HBox ob6 = new HBox();
            ob6.setBackground(new Background(new BackgroundFill(Color.rgb(83,130,224),CornerRadii.EMPTY,Insets.EMPTY)));
            HBox ob7 = new HBox();
            ob7.setBackground(new Background(new BackgroundFill(Color.rgb(83,130,224),CornerRadii.EMPTY,Insets.EMPTY)));
            HBox ob8 = new HBox();
            ob8.setBackground(new Background(new BackgroundFill(Color.rgb(83,130,224),CornerRadii.EMPTY,Insets.EMPTY)));





            String image = getClass().getResource("wrongturna.jpg").toExternalForm();
            My_imageView.setImage(new Image(image));
            My_imageView.setFitWidth(200);
            My_imageView.setFitHeight(170);

            title = new Label("Wrong Turn");
            title.setFont(Font.font("Cooper Black",34));
            title.setTextFill(Color.DARKRED);

            description= new Label("Released : February 25, 2021");
            description.setFont(Font.font("Times New Roman",17));
            description.setTextFill(Color.DARKRED);

            HBox r = new HBox();
            r.getChildren().add(description);

            VBox p = new VBox();
            p.setSpacing(50);
            p.getChildren().addAll(title,r);
            p.setPadding(new Insets(30, 1, 1, 1));

            ob.getChildren().addAll(My_imageView,p);




            String image1 = getClass().getResource("ex.jpg").toExternalForm();
            My_imageView1.setImage(new Image(image1));
            My_imageView1.setFitWidth(200);
            My_imageView1.setFitHeight(170);

            title = new Label("THE EXORCIST");
            title.setFont(Font.font("Cooper Black",34));
            title.setTextFill(Color.DARKRED);

            description= new Label("Released : December 26, 1973");
            description.setFont(Font.font("Times New Roman",17));
            description.setTextFill(Color.DARKRED);

            HBox r1 = new HBox();
            r1.getChildren().add(description);

            VBox p1 = new VBox();
            p1.setSpacing(50);
            p1.getChildren().addAll(title,r1);
            p1.setPadding(new Insets(30, 1, 1, 1));

            ob1.getChildren().addAll(My_imageView1,p1);


            String image3 = getClass().getResource("conjuring.jpg").toExternalForm();
            My_imageView3.setImage(new Image(image3));
            My_imageView3.setFitWidth(200);
            My_imageView3.setFitHeight(170);

            title = new Label("THE CONJURING");
            title.setFont(Font.font("Cooper Black",34));
            title.setTextFill(Color.DARKRED);

            description= new Label("Released : May 26, 2021");
            description.setFont(Font.font("Times New Roman",17));
            description.setTextFill(Color.DARKRED);

            HBox r2 = new HBox();
            r2.getChildren().add(description);

            VBox p2 = new VBox();
            p2.setSpacing(50);
            p2.getChildren().addAll(title,r2);
            p2.setPadding(new Insets(30, 1, 1, 1));

            ob3.getChildren().addAll(My_imageView3,p2);



            String image4 = getClass().getResource("shining.jpg").toExternalForm();
            My_imageView4.setImage(new Image(image4));
            My_imageView4.setFitWidth(200);
            My_imageView4.setFitHeight(170);

            title = new Label("THE SHINING");
            title.setFont(Font.font("Cooper Black",34));
            title.setTextFill(Color.DARKRED);

            description= new Label("Released : May 23, 1980");
            description.setFont(Font.font("Times New Roman",17));
            description.setTextFill(Color.DARKRED);

            HBox r3 = new HBox();
            r3.getChildren().add(description);

            VBox p3 = new VBox();
            p3.setSpacing(50);
            p3.getChildren().addAll(title,r3);
            p3.setPadding(new Insets(30, 1, 1, 1));

            ob4.getChildren().addAll(My_imageView4,p3);



            String image5 = getClass().getResource("texas.jpg").toExternalForm();
            My_imageView5.setImage(new Image(image5));
            My_imageView5.setFitWidth(200);
            My_imageView5.setFitHeight(170);

            title = new Label("THE TEXAS CHAINSAW MASSACRE");
            title.setFont(Font.font("Cooper Black",34));
            title.setTextFill(Color.DARKRED);

            description= new Label("Released : October 1, 1974");
            description.setFont(Font.font("Times New Roman",17));
            description.setTextFill(Color.DARKRED);

            HBox r4 = new HBox();
            r4.getChildren().add(description);

            VBox p4 = new VBox();
            p4.setSpacing(50);
            p4.getChildren().addAll(title,r4);
            p4.setPadding(new Insets(30, 1, 1, 1));

            ob5.getChildren().addAll(My_imageView5,p4);



            String image6 = getClass().getResource("ring.jpg").toExternalForm();
            My_imageView6.setImage(new Image(image6));
            My_imageView6.setFitWidth(200);
            My_imageView6.setFitHeight(170);

            title = new Label("THE RING");
            title.setFont(Font.font("Cooper Black",34));
            title.setTextFill(Color.DARKRED);

            description= new Label("Released : October 18, 2002");
            description.setFont(Font.font("Times New Roman",17));
            description.setTextFill(Color.DARKRED);

            HBox r5 = new HBox();
            r5.getChildren().add(description);

            VBox p5 = new VBox();
            p5.setSpacing(50);
            p5.getChildren().addAll(title,r5);
            p5.setPadding(new Insets(30, 1, 1, 1));

            ob6.getChildren().addAll(My_imageView6,p5);



            String image7 = getClass().getResource("hal.jpg").toExternalForm();
            My_imageView7.setImage(new Image(image7));
            My_imageView7.setFitWidth(200);
            My_imageView7.setFitHeight(170);

            title = new Label("HALLOWEEN");
            title.setFont(Font.font("Cooper Black",34));
            title.setTextFill(Color.DARKRED);

            description= new Label("Released : October 19, 2018");
            description.setFont(Font.font("Times New Roman",17));
            description.setTextFill(Color.DARKRED);

            HBox r6 = new HBox();
            r6.getChildren().add(description);

            VBox p6 = new VBox();
            p6.setSpacing(50);
            p6.getChildren().addAll(title,r6);
            p6.setPadding(new Insets(30, 1, 1, 1));


            ob7.getChildren().addAll(My_imageView7,p6);



            String image8 = getClass().getResource("sini.jpg").toExternalForm();
            My_imageView8.setImage(new Image(image8));
            My_imageView8.setFitWidth(200);
            My_imageView8.setFitHeight(170);

            title = new Label("SINISTER");
            title.setFont(Font.font("Cooper Black",34));
            title.setTextFill(Color.DARKRED);

            description= new Label("Released : October 12, 2012");
            description.setFont(Font.font("Times New Roman",17));
            description.setTextFill(Color.DARKRED);
            HBox r7 = new HBox();
            r7.getChildren().add(description);

            VBox p7 = new VBox();
            p7.setSpacing(50);
            p7.getChildren().addAll(title,r7);
            p7.setPadding(new Insets(30, 1, 1, 1));

            ob8.getChildren().addAll(My_imageView8,p7);





            ListView<HBox> listView = new ListView<>();
            ObservableList<HBox> items = FXCollections.observableArrayList(ob,ob1,ob3,ob4,ob5,ob6,ob7,ob8);
            listView.setItems(items);


            root.setTop(listView);




            VBox allInOne = new VBox(voBox,listView);
            allInOne.setSpacing(30);
            root.setTop(allInOne);

            listView.getSelectionModel().selectedItemProperty().addListener((ObservableValue<? extends HBox> ov, HBox old_val, HBox new_val) -> {
                HBox selectedItem = listView.getSelectionModel().getSelectedItem();
                int index = listView.getSelectionModel().getSelectedIndex();

                switch(index){


                    case 0 :


                        // LOad the Start-Page
                        webEngine.load("www.youtube.com/embed/ccaNMcPqpQ0");
                        // Update the stage title when a new web page title is available
                        webEngine.getLoadWorker().stateProperty().addListener(new ChangeListener<Worker.State>()
                        {
                            public void changed(ObservableValue<? extends Worker.State> ov, Worker.State oldState, Worker.State newState)
                            {
                                if (newState == Worker.State.SUCCEEDED)
                                {
                                    //stage.setTitle(webEngine.getLocation());
                                    stage.setTitle(webEngine.getTitle());
                                }
                            }

                        });
                        display.getChildren().add(webView);

                        Scene o = new Scene(display);
                        Stage oo = new Stage();
                        oo.setScene(o);
                        oo.show();
                        break;
                    case 1:


                        // LOad the Start-Page
                        webEngine.load("www.youtube.com/embed/0iS59iV2Ffs");
                        // Update the stage title when a new web page title is available
                        webEngine.getLoadWorker().stateProperty().addListener(new ChangeListener<Worker.State>()
                        {
                            public void changed(ObservableValue<? extends Worker.State> ov, Worker.State oldState, Worker.State newState)
                            {
                                if (newState == Worker.State.SUCCEEDED)
                                {
                                    //stage.setTitle(webEngine.getLocation());
                                    stage.setTitle(webEngine.getTitle());
                                }
                            }
                        });

                        display.getChildren().add(webView);

                        Scene pa = new Scene(display);
                        Stage ppa = new Stage();
                        ppa.setScene(pa);
                        ppa.show();


                        break;

                    case 3:
                        // LOad the Start-Page
                        webEngine.load("www.youtube.com/embed/h9Q4zZS2v1k");
                        // Update the stage title when a new web page title is available
                        webEngine.getLoadWorker().stateProperty().addListener(new ChangeListener<Worker.State>()
                        {
                            public void changed(ObservableValue<? extends Worker.State> ov, Worker.State oldState, Worker.State newState)
                            {
                                if (newState == Worker.State.SUCCEEDED)
                                {
                                    //stage.setTitle(webEngine.getLocation());
                                    stage.setTitle(webEngine.getTitle());
                                }
                            }
                        });
                        display.getChildren().add(webView);

                        Scene s = new Scene(display);
                        Stage ss = new Stage();
                        ss.setScene(s);
                        ss.show();
                        break;


                    case 4:
                        // LOad the Start-Page
                        webEngine.load("www.youtube.com/embed/S014oGZiSdI");
                        // Update the stage title when a new web page title is available
                        webEngine.getLoadWorker().stateProperty().addListener(new ChangeListener<Worker.State>()
                        {
                            public void changed(ObservableValue<? extends Worker.State> ov, Worker.State oldState, Worker.State newState)
                            {
                                if (newState == Worker.State.SUCCEEDED)
                                {
                                    //stage.setTitle(webEngine.getLocation());
                                    stage.setTitle(webEngine.getTitle());
                                }
                            }
                        });
                        display.getChildren().add(webView);

                        Scene z = new Scene(display);
                        Stage zz = new Stage();
                        zz.setScene(z);
                        zz.show();

                        break;
                    case 5:
                        // LOad the Start-Page
                        webEngine.load("www.youtube.com/embed/T3TILW0O_C0");
                        // Update the stage title when a new web page title is available
                        webEngine.getLoadWorker().stateProperty().addListener(new ChangeListener<Worker.State>()
                        {
                            public void changed(ObservableValue<? extends Worker.State> ov, Worker.State oldState, Worker.State newState)
                            {
                                if (newState == Worker.State.SUCCEEDED)
                                {
                                    //stage.setTitle(webEngine.getLocation());
                                    stage.setTitle(webEngine.getTitle());
                                }
                            }
                        });

                        display.getChildren().add(webView);

                        Scene k = new Scene(display);
                        Stage kk = new Stage();
                        kk.setScene(k);
                        kk.show();
                        break;
                    case 6:
                        // LOad the Start-Page
                        webEngine.load("www.youtube.com/embed/yzR2GY-ew8I");
                        // Update the stage title when a new web page title is available
                        webEngine.getLoadWorker().stateProperty().addListener(new ChangeListener<Worker.State>()
                        {
                            public void changed(ObservableValue<? extends Worker.State> ov, Worker.State oldState, Worker.State newState)
                            {
                                if (newState == Worker.State.SUCCEEDED)
                                {
                                    //stage.setTitle(webEngine.getLocation());
                                    stage.setTitle(webEngine.getTitle());
                                }
                            }
                        });
                        display.getChildren().add(webView);

                        Scene m = new Scene(display);
                        Stage mm = new Stage();
                        mm.setScene(m);
                        mm.show();
                        break;
                    case 7:
                        // LOad the Start-Page
                        webEngine.load("www.youtube.com/embed/ek1ePFp-nBI");
                        // Update the stage title when a new web page title is available
                        webEngine.getLoadWorker().stateProperty().addListener(new ChangeListener<Worker.State>()
                        {
                            public void changed(ObservableValue<? extends Worker.State> ov, Worker.State oldState, Worker.State newState)
                            {
                                if (newState == Worker.State.SUCCEEDED)
                                {
                                    //stage.setTitle(webEngine.getLocation());
                                    stage.setTitle(webEngine.getTitle());
                                }
                            }
                        });
                        display.getChildren().add(webView);

                        Scene v = new Scene(display);
                        Stage vv = new Stage();
                        vv.setScene(v);
                        vv.show();
                        break;
                    case 8:
                        // LOad the Start-Page
                        webEngine.load("www.youtube.com/embed/_kbQAJR9YWQ");
                        // Update the stage title when a new web page title is available
                        webEngine.getLoadWorker().stateProperty().addListener(new ChangeListener<Worker.State>()
                        {
                            public void changed(ObservableValue<? extends Worker.State> ov, Worker.State oldState, Worker.State newState)
                            {
                                if (newState == Worker.State.SUCCEEDED)
                                {
                                    //stage.setTitle(webEngine.getLocation());
                                    stage.setTitle(webEngine.getTitle());
                                }
                            }
                        });
                        display.getChildren().add(webView);

                        Scene x = new Scene(display);
                        Stage xx = new Stage();
                        xx.setScene(x);
                        xx.show();
                        break;

                }






            });





        } );













            root.setStyle(
                "-fx-background-color: linear-gradient(to right, #fc5c7d, #6a82fb);"+
     //           "-fx-background-color: black;"+
                "-fx-background-radius: 5.0;"+
                "-fx-border-color: blue;"+
                "-fx-border-insets:5;" +
                "-fx-border-style :dashed;" +
                "-fx-border-width: 3;");
       root.setTop(voBox);
       

      //  root.setTop(My_Box); take care kizoo

        


        stage.setTitle("the group assigment");
        stage.setResizable(true);
        stage.setScene(scene);
        stage.show();



    }

    public static void main(String[] args) {
        launch();
    }
}