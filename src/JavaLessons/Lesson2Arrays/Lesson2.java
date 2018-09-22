package JavaLessons.Lesson2Arrays;

/**
 * @author Misha Yevtusenko
 * @theme arrays
 */

public class Lesson2 {

    public  String showOneDimensionalArray(int [] arr){
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<arr.length;i++){
            sb.append(i+"-ый элемент массива - ");
            sb.append(arr[i]);
            sb.append("; ");
        }
        return sb.toString();
    }

    public void oneDimensionalArrayExample(){
        int aar1 [];
        aar1 = new int[]{12, 11, 54, 565, 76, 87, 445, 7, 898, 345, 76542, 565};
        int [] arr2;
        arr2=new int[13];
        for(int i=0; i<arr2.length; i++){
            arr2[i]=arr2.length-i;
        }
        int[] arr3 = new int[11];
        System.out.println(showOneDimensionalArray(aar1));
        System.out.println(showOneDimensionalArray(arr2));
        System.out.println(showOneDimensionalArray(arr3));
    }

    public String showTwoDimensionalArray(int [][] arr){
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                sb.append("["+i+"]["+j+"]-"+arr[i][j]+" ");
            }
            sb.append("\n");
        }
        return sb.toString();
    }


    public void twoDimensionalArrayExample(){
        int[][] arr1;
        arr1= new int[][]{{11,12,13,14,15},{21,22,23,24,25},{31,32,33,34,35},{41,42,43,44,45},{51,52,53,54,55}};

        int arr2 [][]= new int[7][5];

        for (int i = 0; i<arr2.length; i++){

            for (int j =0; j<arr2[i].length;j++){
                arr2[i][j]=(i*10)+j;
            }

        }
        System.out.println(showTwoDimensionalArray(arr1));
        System.out.println(showTwoDimensionalArray(arr2));
    }


    public String game (){          //finish

        return "";
    }

    public static void main(String[] args) {
        Lesson2 lesson2 = new Lesson2();
//        lesson2.twoDimensionalArrayExample();
//        lesson2.oneDimensionalArrayExample();
        int []aar1 = new int[]{12, 11, 54, 565, 76, 87, 445, 7, 898, 345, 76542, 565};
        ArraySorter arraySorter = new ArraySorter();
        arraySorter.bubbleSort(aar1);
        System.out.println(lesson2.showOneDimensionalArray(aar1));


    }
}
