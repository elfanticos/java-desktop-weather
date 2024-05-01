package it.jhomein.components;

import javax.swing.*;
import java.awt.*;

public class SearchTextField extends JTextField {
    public SearchTextField() {
        super();
        // set the location and size of our component
        setBounds(15, 15, 351, 45);

        // change the font style and size
        setFont(new Font("Dialog", Font.PLAIN, 24));
    }
}
