/*
 * Nama : Kayis Shalahuddin
 * NIM : 191524047
 * Pertemuan : Week-2
 */
package MnemonicsTooltipsDisablingButtons;

/**
 *
 * @author Kayis
 */
// ****************************************************************** 
// CirclePanel.java 
// 
// A panel with a circle drawn in the center and buttons on the 
// bottom that move the circle. 
// ****************************************************************** 
import java.awt.*; 
import javax.swing.*; 
import java.awt.event.*; 
public class CirclePanel extends JPanel 
{ 
    private final int CIRCLE_SIZE = 50; 
    private int x,y; 
    private Color c;
    private int getWidth, getHeight;
    JButton left, right, up, down; // Put here so we can use in Move Listener Class
    
    //--------------------------------------------------------------- 
    // Set up circle and buttons to move it. 
    //--------------------------------------------------------------- 
    public CirclePanel(int width, int height) 
    { 
        // Set coordinates so circle starts in middle 
        getHeight = height;
        getWidth = width;
        x = (width/2)-(CIRCLE_SIZE/2); 
        y = (height/2)-(CIRCLE_SIZE/2); 
        c = Color.green; 
        
        // Need a border layout to get the buttons on the bottom 
        this.setLayout(new BorderLayout()); 
        
        // Create buttons to move the circle 
        left = new JButton("Left"); 
        right = new JButton("Right"); 
        up = new JButton("Up"); 
        down = new JButton("Down"); 
        
        // Add listeners to the buttons 
        left.addActionListener(new MoveListener(-20,0)); 
        right.addActionListener(new MoveListener(20,0)); 
        up.addActionListener(new MoveListener(0,-20)); 
        down.addActionListener(new MoveListener(0,20)); 
        
        // Need a panel to put the buttons on or they'll be on 
        // top of each other. 
        JPanel buttonPanel = new JPanel(); 
        buttonPanel.add(left); 
        buttonPanel.add(right); 
        buttonPanel.add(up); 
        buttonPanel.add(down); 
        
        // Add the button panel to the bottom of the main panel 
        this.add(buttonPanel, "South"); 
        
        // Add mnemonics to the buttons so that the user can 
        // move the circle by pressing the 
        // ALT-l, ALT-r, ALT-u, or ALT-d keys.
        left.setMnemonic(KeyEvent.VK_L);
        right.setMnemonic(KeyEvent.VK_R);
        up.setMnemonic(KeyEvent.VK_U);
        down.setMnemonic(KeyEvent.VK_D);
        
        // Add tooltips to the buttons that indicate what happens 
        // when the button is pressed, including how far it is moved.
        left.setToolTipText("Move circle to the left by 20 pixels");
        right.setToolTipText("Move circle to the right by 20 pixels"); 
        up.setToolTipText("Move circle up by 20 pixels");
        down.setToolTipText("Move circle down by 20 pixels");
    } 
    //--------------------------------------------------------------- 
    // Draw circle on CirclePanel 
    //--------------------------------------------------------------- 
    @Override
    public void paintComponent(Graphics page) 
    {
        super.paintComponent(page); 
        page.setColor(c); 
        page.fillOval(x,y,CIRCLE_SIZE,CIRCLE_SIZE); 
    } 
    //--------------------------------------------------------------- 
    // Class to listen for button clicks that move circle. 
    //--------------------------------------------------------------- 
    private class MoveListener implements ActionListener 
    { 
        private int dx; 
        private int dy; 
        
        //--------------------------------------------------------------- 
        // Parameters tell how to move circle at click. 
        //--------------------------------------------------------------- 
        public MoveListener(int dx, int dy) 
        { 
            this.dx = dx; 
            this.dy = dy; 
        } 
        //--------------------------------------------------------------- 
        // Change x and y coordinates and repaint. 
        //--------------------------------------------------------------- 
        public void actionPerformed(ActionEvent e) 
        { 
            x += dx; 
            y += dy; 
            repaint(); 
            
            // When the circle gets all the way to an edge,
            // disable the corresponding button.
            if(x == 0)
                left.setEnabled(false);
            else left.setEnabled(true);
            
            if(x == (getWidth - 60))
                right.setEnabled(false);
            else right.setEnabled(true);
            
            if(y == 0)
                up.setEnabled(false);
            else up.setEnabled(true);
            
            if(y == (getHeight - 120))
                down.setEnabled(false);
            else down.setEnabled(true);
        } 
    } 
}