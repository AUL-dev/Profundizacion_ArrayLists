

public class prueba {
    public static void main(String[] args) {
        String[] array = new String[5];
        int[] arrayNum = new int[10];

        array[0] = "Madrid";
        array[1] = "Valencia";
        array[2] = "Valladolid";
        array[3] = "Barcelona";
        array[4] = "Cartagena";
        String[] arrayV = new String[2];
        int v = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i].charAt(0) == 'V') {
                arrayV[v] = array[i];
                v++;
            }
        }
        for (String s : arrayV) {
            System.out.println(s);
        }

        int[] arrayPar = new int[5];
        int j = 0;
        for (int i = 0; i < arrayNum.length; i++) {
            if (arrayNum[i] % 2 == 0) {
                arrayPar[j] = arrayNum[i];
                j++;
            }
        }
        for (int i = 0; i < arrayPar.length; i++) {
            System.out.println(arrayPar[i]);
        }

    }
}