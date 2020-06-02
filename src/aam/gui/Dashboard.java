package aam.gui;

import java.awt.Color;
import java.awt.Desktop;
import java.io.IOException;
import java.net.URI;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import aam.services.DateTime;

/**
 *
 * @author Augusto Marrengula
 */
public class Dashboard extends javax.swing.JFrame {
    
    int xMouse;
    int yMouse;
    
    public Dashboard()
    {
        initComponents();
        setTime();
    }
    
    private void setTime()
    {
        new DateTime().setTimeToThis(clock);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents()
    {

        topPanel = new javax.swing.JPanel();
        tittle = new javax.swing.JLabel();
        clock = new javax.swing.JLabel();
        minimize = new javax.swing.JLabel();
        close = new javax.swing.JLabel();
        leftPanel = new javax.swing.JPanel();
        menu = new javax.swing.JLabel();
        create = new javax.swing.JLabel();
        list = new javax.swing.JLabel();
        by = new javax.swing.JLabel();
        background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Dashboard");
        setMaximumSize(new java.awt.Dimension(1200, 700));
        setMinimumSize(new java.awt.Dimension(1200, 700));
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(null);

        topPanel.setBackground(new java.awt.Color(132, 84, 84));
        topPanel.addMouseMotionListener(new java.awt.event.MouseMotionAdapter()
        {
            public void mouseDragged(java.awt.event.MouseEvent evt)
            {
                topPanelMouseDragged(evt);
            }
        });
        topPanel.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mousePressed(java.awt.event.MouseEvent evt)
            {
                topPanelMousePressed(evt);
            }
        });
        topPanel.setLayout(null);

        tittle.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        tittle.setForeground(new java.awt.Color(240, 240, 240));
        tittle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tittle.setText(this.getTitle());
        topPanel.add(tittle);
        tittle.setBounds(20, 6, 170, 26);

        clock.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        clock.setForeground(new java.awt.Color(240, 240, 240));
        clock.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        clock.setText("00:00:00 PM");
        topPanel.add(clock);
        clock.setBounds(590, 6, 200, 26);

        minimize.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        minimize.setForeground(new java.awt.Color(240, 240, 240));
        minimize.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        minimize.setText("_");
        minimize.setToolTipText("");
        minimize.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        minimize.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mouseReleased(java.awt.event.MouseEvent evt)
            {
                minimizeMouseReleased(evt);
            }
        });
        topPanel.add(minimize);
        minimize.setBounds(1140, 0, 24, 26);

        close.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        close.setForeground(new java.awt.Color(240, 240, 240));
        close.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        close.setText("x");
        close.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        close.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mouseReleased(java.awt.event.MouseEvent evt)
            {
                closeMouseReleased(evt);
            }
        });
        topPanel.add(close);
        close.setBounds(1168, 4, 24, 26);

        getContentPane().add(topPanel);
        topPanel.setBounds(0, 0, 1200, 36);

        leftPanel.setBackground(new java.awt.Color(132, 84, 84));
        leftPanel.setLayout(null);

        menu.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        menu.setForeground(new java.awt.Color(240, 240, 240));
        menu.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        menu.setText("Menu");
        leftPanel.add(menu);
        menu.setBounds(20, 60, 170, 26);

        create.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        create.setForeground(new java.awt.Color(240, 240, 240));
        create.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        create.setText("  Criar");
        create.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        create.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mouseEntered(java.awt.event.MouseEvent evt)
            {
                createMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt)
            {
                createMouseExited(evt);
            }
        });
        leftPanel.add(create);
        create.setBounds(0, 100, 210, 40);

        list.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        list.setForeground(new java.awt.Color(240, 240, 240));
        list.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        list.setText("  Listar");
        list.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        list.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mouseEntered(java.awt.event.MouseEvent evt)
            {
                listMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt)
            {
                listMouseExited(evt);
            }
        });
        leftPanel.add(list);
        list.setBounds(0, 142, 210, 40);

        by.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        by.setForeground(new java.awt.Color(240, 240, 240));
        by.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        by.setText("  By albertinodev");
        by.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        by.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mouseEntered(java.awt.event.MouseEvent evt)
            {
                byMouseEntered(evt);
            }
        });
        leftPanel.add(by);
        by.setBounds(0, 670, 210, 20);

        getContentPane().add(leftPanel);
        leftPanel.setBounds(0, 0, 210, 700);

        background.setBackground(new java.awt.Color(255, 255, 255));
        background.setOpaque(true);
        getContentPane().add(background);
        background.setBounds(0, 0, 1200, 700);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void closeMouseReleased(java.awt.event.MouseEvent evt)//GEN-FIRST:event_closeMouseReleased
    {//GEN-HEADEREND:event_closeMouseReleased
        this.dispose();
        System.exit(0);
    }//GEN-LAST:event_closeMouseReleased

    private void minimizeMouseReleased(java.awt.event.MouseEvent evt)//GEN-FIRST:event_minimizeMouseReleased
    {//GEN-HEADEREND:event_minimizeMouseReleased
        this.setState(JFrame.ICONIFIED);
    }//GEN-LAST:event_minimizeMouseReleased

    private void topPanelMousePressed(java.awt.event.MouseEvent evt)//GEN-FIRST:event_topPanelMousePressed
    {//GEN-HEADEREND:event_topPanelMousePressed
        this.xMouse = evt.getX();
        this.yMouse = evt.getY();
    }//GEN-LAST:event_topPanelMousePressed

    private void topPanelMouseDragged(java.awt.event.MouseEvent evt)//GEN-FIRST:event_topPanelMouseDragged
    {//GEN-HEADEREND:event_topPanelMouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        
        this.setLocation(x - xMouse, y - yMouse);
    }//GEN-LAST:event_topPanelMouseDragged

    private void createMouseEntered(java.awt.event.MouseEvent evt)//GEN-FIRST:event_createMouseEntered
    {//GEN-HEADEREND:event_createMouseEntered
        create.setOpaque(true);
        create.setBackground(Color.decode("#422d2d"));
    }//GEN-LAST:event_createMouseEntered

    private void createMouseExited(java.awt.event.MouseEvent evt)//GEN-FIRST:event_createMouseExited
    {//GEN-HEADEREND:event_createMouseExited
        create.setOpaque(false);
        create.setBackground(null);
    }//GEN-LAST:event_createMouseExited

    private void listMouseEntered(java.awt.event.MouseEvent evt)//GEN-FIRST:event_listMouseEntered
    {//GEN-HEADEREND:event_listMouseEntered
        list.setOpaque(true);
        list.setBackground(Color.decode("#422d2d"));
    }//GEN-LAST:event_listMouseEntered

    private void listMouseExited(java.awt.event.MouseEvent evt)//GEN-FIRST:event_listMouseExited
    {//GEN-HEADEREND:event_listMouseExited
        list.setOpaque(false);
        list.setBackground(null);
    }//GEN-LAST:event_listMouseExited

    private void byMouseEntered(java.awt.event.MouseEvent evt)//GEN-FIRST:event_byMouseEntered
    {//GEN-HEADEREND:event_byMouseEntered
        if (Desktop.isDesktopSupported()) {
            try {
                Desktop.getDesktop().browse(URI.create("https://albertino-dev.web.app"));
            }
            catch (IOException ex) {
                Logger.getLogger(Dashboard.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_byMouseEntered


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel background;
    private javax.swing.JLabel by;
    private javax.swing.JLabel clock;
    private javax.swing.JLabel close;
    private javax.swing.JLabel create;
    private javax.swing.JPanel leftPanel;
    private javax.swing.JLabel list;
    private javax.swing.JLabel menu;
    private javax.swing.JLabel minimize;
    private javax.swing.JLabel tittle;
    private javax.swing.JPanel topPanel;
    // End of variables declaration//GEN-END:variables
}
