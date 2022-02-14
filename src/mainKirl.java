public class mainKirl {
    public static void main(String[] args) {
        Element s = new Element('c', 3);
        Element d = new Element('s', 3);
        Element f = new Element('a', 3);
        Element g = new Element('a', 3);
        Element h = new Element('e', 3);
        Element[] newArr = {s, d, f, g, h};
        Element[] dd = arraySort(newArr);
        for (int i = 0; i < dd.length; i++) {
            System.out.println(dd[i].getLetter());
        }
        subArrOfElement(newArr,newArr);

    }

    public static Element[] arraySort(Element[] arr) {
        char temp;
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i].getLetter() > arr[j].getLetter()) {
                    temp = arr[i].getLetter();
                    arr[i].setLetter(arr[j].getLetter());
                    arr[j].setLetter(temp);
                }
            }
        }
        return arr;

    }

    public static Element[] subArrOfElement(Element[] groupA, Element[] groupB) {
        groupA = arraySort(groupA);
        groupB = arraySort(groupB);
        Element[] newElement = new Element[groupA.length + groupB.length];
        int[] arr = arrayInt(groupA);
        int[] arrTwo = arrayInt(groupB);
        for (int i = 0; i < groupA.length; i++) {
            System.out.println(groupA[i].getLetter() +"," + arr[i]);

        }
        return groupA;
    }
    public static int[] arrayInt(Element[] group){
        int counter;
        int[] sum = new int[group.length];
        for (int i = 0; i < group.length; i++) {
            counter = 0;
            for (int j = 0; j < group.length ; j++) {
              if(group[i].getLetter() == group[j].getLetter()){
                  counter++;
              }
              sum[i] = counter;
            }

        }return sum;
    }
}
