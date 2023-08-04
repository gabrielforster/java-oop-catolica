import javax.swing.JOptionPane;

public class JOptionPaneTest {
    public static void main(String[] args) {
        String name = JOptionPane.showInputDialog("Ur name?");

        String age = JOptionPane.showInputDialog("Ur age?");

        String birthDate = JOptionPane.showInputDialog("Ur birth date?");

        JOptionPane.showMessageDialog(null, name + " is " + age + " years old and was birth in " + birthDate, "Infos", JOptionPane.INFORMATION_MESSAGE);
    }
}
