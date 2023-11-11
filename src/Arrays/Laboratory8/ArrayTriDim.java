package Arrays.Laboratory8;

public class ArrayTriDim {
    public static void main(String[] args) {
        /*
        String[] dogs = {"Bure", "Pluto", "Łajka"};
        String[] dogsOwner = {"Ania", "Wojtek", "Dorota"};
        String[][] dogp = {dogs, dogsOwner};
        String[] cat = {"Filemon", "Plamka", "Ryży"};
        String[] catOwners = {"Ania", "Wojtek", "Dorota"};
        String[][] catp = {cat, catOwners};


        String[][][] arr = {dogp, catp};
        for (int i = 0; i < ; i++) {
        }*/


        int[][][] multi = {{{1, 2, 3, 4, 5}},{{1, 2},{2}}};
        for (int i = 0; i < multi.length; i++) {
            for (int j = 0; j < multi[i].length; j++) {
                for (int k = 0; k < multi[i][j].length; k++) {
                    System.out.print("arr[" + i + "][" + j + "][" + k + "] = " );
                    System.out.println(multi[i][j][k]);
                }
            }

        }


    }

}
