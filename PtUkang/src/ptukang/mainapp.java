package ptukang;

import login.LoginPage;
import javax.swing.SwingUtilities;

public class mainapp {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new LoginPage());
    }
}