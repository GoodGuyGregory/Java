## JavaFX Applications

Java has been implemented to adhere to the principle of Write first run anywhere.

The first GUI was `Abstract Window Toolkit`.

**GUIs**

Swing introduced a new GUI elements building foundation and in 2008 JavaFX was introduced and is the foundation for building GUIs for Computer programmers and were included to replace swing. Prior to the introduction of Javafx, there was no defacto way to create Java Graphical User Interfaces in applications except swing.

**JavaFX**

Came from a company called F3, this is basically web coding for the language of Java. With Multi Threading and more. it is a graphics framework for developming GUIS and complex beautiful web applications.

The place where you view the potentially multiple scenes of a JavaFX application is called a `Stage`.
Graphics are build into a `Scene Graph` and each new addition to the scene is known as a `node`. Nodes have child nodes.

Common `Nodes` added to a `Scene Graph`

**UI Controls**

Nodes commonly added to the Scene graph are UI elements such as 
* text fields
* Buttons
* Checkboxes
* Sliders
* File Choosers

**Shapes**

Commonly added to a scene to clarify the UI for the users such as Circles, Squares, rectangles.

**HBox**

Horizontal Box for Horizontal box layouts

**VBox**

Verticle Box for Verticle Box layouts

**BorderPane**

Top, Left, Center, Right, Bottom 

**StackPane**

Stackes items ontop of eachother

**GridPane**

specifies cells for certain layouts

**Markup Languages with Java**

`FXML` - Elements in Strict XML require closing tags
`fx:` is part of a namespace 

**Styling your FX Applications**

use CSS to Style your JavaFX Applications with ease. CSS provides an easy way to provide simple changes to applications. Children also inherit the parent's style in this paradigmn. it is easy for the application to be styled with CSS because of this behavior.

There is a whole [reference](https://docs.oracle.com/javafx/2/api/javafx/scene/doc-files/cssref.html) guide online to assist in styling Javafx applications.

The following is a styled FXML GridPane. Notice that the nameing standard is `dash-case`

```xml
<GridPane fx:controller="sample.Controller"
          xmlns:fx="http://javafx.com/fxml"
    style="-fx-font-family: Papyrus; -fx-alignment: center; -fx-hgap: 10; -fx-vgap: 10;" >
```

**Adding Additional Resources for your applications**

