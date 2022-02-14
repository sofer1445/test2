public class mainThree {
    public static void main(String[] args) {
        ToDo one = new ToDo("ss","shoham",true);
        ToDo two = new ToDo("aa","shoham",false);
        ToDo three = new ToDo("bb","noy",false);
        ToDo four = new ToDo("ff","noy",false);
        ToDo five = new ToDo("dd","noy",true);
        ToDo six = new ToDo("ww","nadav",true);
        ToDo seven = new ToDo("qq","nadav",true);
        ToDo[] todos = {one,two,three,four,five,six,seven};
        System.out.println(blackJob(todos));
        System.out.println(winnerMan(todos));
    }
    public static int toDo(ToDo[] jobs){
        int counter = 0;
        for (int i = 0; i < jobs.length; i++) {
            if(jobs[i].isDone()){
                counter++;
            }
        }
        return counter;

    }
    public static String blackJob(ToDo[] toDos){
        String str = "";
        int counter;
        int max = 0;
        for (int i = 0; i < toDos.length; i++) {
            counter = 0;
            for (int j = 0; j < toDos.length; j++) {
                if(toDos[i].getName() == toDos[j].getName()){
                  counter++;
                }
                if(counter > max){
                    max = counter;
                    str = toDos[i].getName();
                }
            }
        }return str;

    }
    public static String winnerMan(ToDo[] toDos){
        String str = "";
        ToDo[] arr = new ToDo[toDos.length];
        int counter = 0;
        for (int i = 0; i < toDos.length; i++) {
            if(toDos[i].isDone()){
                arr[counter] = toDos[i];
                counter++;
            }

        }
        ToDo[] newArr = new ToDo[counter];
        for (int i = 0; i < newArr.length; i++) {
          newArr[i] = arr[i];
        }
        str = blackJob(newArr);
        return str;
    }
}
