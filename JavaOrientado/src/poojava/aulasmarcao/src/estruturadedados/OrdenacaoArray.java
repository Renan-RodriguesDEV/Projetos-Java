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
                    // Troca os elementos se estiverem fora de ordem Buble sort
                    int temp = meuArray[i];
                    meuArray[i] = meuArray[j];
                    meuArray[j] = temp;
                }
            }
        }

        System.out.println("Array ordenado:");
        // foreach pra printar o array
        for (int passo : meuArray) {
            System.out.print(" " + meuArray[passo]);
        }
    }
}
