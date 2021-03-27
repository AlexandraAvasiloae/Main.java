package compulsory.app;

import javax.swing.*;
import java.awt.*;

public class MainFrame extends JFrame {

    public static final Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
    public static final int width = screenSize.width - 400;
    public static final int height = screenSize.height - 400;

    ConfigPanel configPanel;
    DrawingPanel drawingPanel;
    ControlPanel controlPanel;

    /**
     * constructor
     */
    public MainFrame() {
        super("My Drawing Application");
        init();
    }

    /**
     * This method:
     *
     * Set the object size
     * Calculate and Set the new frame location
     * create the components
     * arrange the components in the container (frame)
     * invoke the layout manager
     */
    private void init() {
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setLayout(new BorderLayout());
        this.setMinimumSize(new Dimension(950, 600));


        this.setSize(width, height);
        this.setResizable(false);


        int x = (screenSize.width - this.getWidth()) / 2;
        int y = (screenSize.height - this.getHeight()) / 2;
        this.setLocation(x, y);

        configPanel = new ConfigPanel(this);
        drawingPanel = new DrawingPanel(this);
        controlPanel = new ControlPanel(this);


        add(configPanel, BorderLayout.NORTH);
        add(drawingPanel, BorderLayout.CENTER);
        add(controlPanel, BorderLayout.SOUTH);


        pack();
    }
}