/*********
PasswordTwo.java
Israel David Salinas Lopez
this class this class verifies the password that is entered
******/
import javax.swing.*;
  public class PasswordTwo{
    public static void main(String[] args) {
      PasswordOne contra;
      contra = new PasswordOne();
      String pass;
      pass =JOptionPane.showInputDialog("Enter The Password");

      contra.setPassword(pass);
      if (contra.getNum()>=2 && contra.getMinusculas()>=2 && contra.getMayusculas()>=1){
        JOptionPane.showMessageDialog(null,"**La Contraseña es Correcta** \n Contraseña Guardada");
      }else{
        JOptionPane.showMessageDialog(null,"La contraseña es debil debe tener \n 1. 1 Letra Mayusculas\n 2. Mas de 2 Letras Minusculas\n 3. Y 2 o mas Numeros\n **Intentalo de nuevo**");
      }
    }
}
