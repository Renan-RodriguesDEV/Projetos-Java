import javax.swing.JOptionPane;

public class OrdenacaoArray {
    public static void main(String[] args) {
        int meuArray[] = new int[4];
        // preenchendo o array
        for (int i = 0; i < meuArray.length; i++) {
            meuArray[i] = Integer.parseInt(JOptionPane.showInputDialog("Valor da posição [" + (i + 1) + "]"));
        }

        for (int i = 0; i < meuArray.length; i++) {
            for (int j = i + 1; j < meuArray.length; j++) {
                if (meuArray[i] > meuArray[j]) {
                    int temp = meuArray[i];
                    meuArray[i] = meuArray[j];
                    meuArray[j] = temp;
                }
            }
        }

        System.out.println("Array ordenado:");
        for (int i = 0; i < meuArray.length; i++) {
            System.out.println(" " + meuArray[i]);
        }

        System.out.println("Foreach");
        // foreach pra printar o array
        for (int i : meuArray) {
            System.out.println(i);
        }
    }
}
