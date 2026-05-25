package util;

import ui.LoginPage;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {

        // 🔥 Swing UI thread safe run
        SwingUtilities.invokeLater(() -> {
            new LoginPage();
        });
    }
}