/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rsclient.coregui;

import rsclient.chat.IrcPanel;
import rsclient.notes.NotesPanel;

import javax.swing.*;

import static rsclient.coregui.RSClient.*;

/**
 *
 * @author ben
 */
public class BottomPane extends JTabbedPane {

    public BottomPane() {
        setTabLayoutPolicy(JTabbedPane.SCROLL_TAB_LAYOUT);
        setTabPlacement(RIGHT);

        ImageIcon settingsicon = new ImageIcon(
                getClass().getClassLoader().getResource(String.format("%simage2020.png", resourcePath)));

        ImageIcon notesicon = new ImageIcon(
                getClass().getClassLoader().getResource(String.format("%spencil.png", resourcePath)));

        ImageIcon chaticon = new ImageIcon(
                getClass().getClassLoader().getResource(String.format("%schaticon.png", resourcePath)));

        ImageIcon miscicon = new ImageIcon(
                getClass().getClassLoader().getResource(String.format("%smiscicon.png", resourcePath)));

        
        addTab(null, notesicon, new NotesPanel());
        addTab(null, chaticon, new IrcPanel());
        addTab(null, miscicon, new JPanel());
        addTab(null, settingsicon, new JPanel());

    }

}
