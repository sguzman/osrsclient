/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rsclient.coregui;

import rsclient.hiscores.HiscoresPanel;
import rsclient.market.MarketPanel;
import rsclient.panelplugins.BasePluginPanel;

import javax.swing.*;

import static rsclient.coregui.RSClient.resourcePath;

/**
 *
 * @author ben
 */
public class SidePane extends JTabbedPane {

    public SidePane() {
        setTabLayoutPolicy(JTabbedPane.SCROLL_TAB_LAYOUT);

        ImageIcon statsicon = new ImageIcon(
                getClass().getClassLoader().getResource(String.format("%sstatsicon.png", resourcePath)));

        ImageIcon shopicon = new ImageIcon(
                getClass().getClassLoader().getResource(String.format("%sshopicon.png", resourcePath)));

        ImageIcon graphicon = new ImageIcon(
                getClass().getClassLoader().getResource(String.format("%sgraphicon.png", resourcePath)));

        ImageIcon toolsicon = new ImageIcon(
                getClass().getClassLoader().getResource(String.format("%stoolsicon.png", resourcePath)));

        addTab(null, statsicon, new HiscoresPanel());

        addTab(null, shopicon, new MarketPanel());

        addTab(null, graphicon, new JPanel());

        addTab(null, toolsicon, new BasePluginPanel());

    }
}
